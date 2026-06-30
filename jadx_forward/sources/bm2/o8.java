package bm2;

/* loaded from: classes8.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f103740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103741e;

    public o8(bm2.p8 p8Var, int i17) {
        this.f103740d = p8Var;
        this.f103741e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f103740d.f103767g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f103741e));
        }
    }
}
