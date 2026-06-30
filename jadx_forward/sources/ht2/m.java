package ht2;

/* loaded from: classes2.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f366389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f366390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366391f;

    public m(yz5.p pVar, android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f366389d = pVar;
        this.f366390e = textView;
        this.f366391f = c22699x3dcdb352;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f366389d.mo149xb9724478(this.f366390e, this.f366391f);
    }
}
