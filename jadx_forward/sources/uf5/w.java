package uf5;

/* loaded from: classes8.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f508845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al5.q f508846e;

    public w(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, al5.q qVar) {
        this.f508845d = abstractActivityC21394xb3d2c0cf;
        this.f508846e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup m78528x3c38ee5b = this.f508845d.m78528x3c38ee5b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = m78528x3c38ee5b instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) m78528x3c38ee5b : null;
        if (c22602x8bae1c88 != null) {
            c22602x8bae1c88.m81261xdefc8eb0(this.f508846e);
            c22602x8bae1c88.M();
        }
    }
}
