package xk3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f536581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f536582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xk3.o f536583f;

    public m(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0, xk3.o oVar) {
        this.f536581d = c22699x3dcdb352;
        this.f536582e = c21405x85fc1ce0;
        this.f536583f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f536581d;
        c22699x3dcdb352.setVisibility(0);
        this.f536582e.setVisibility(8);
        if (this.f536583f.f536587i) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80686x61c578bc);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78565x93b231eb);
        }
    }
}
