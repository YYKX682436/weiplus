package yo4;

/* loaded from: classes10.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545810d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f) {
        this.f545810d = c18795x62fd7c3f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545810d;
        android.view.ViewParent parent = c18795x62fd7c3f.f257408r.f355945f.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.removeView(c18795x62fd7c3f.f257408r.f355945f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = c18795x62fd7c3f.f257408r.f355945f;
        bp4.k0 m72543x67c60a58 = c18795x62fd7c3f.m72543x67c60a58();
        viewGroup.addView(c18801xf3fcf614, m72543x67c60a58.f104746i.indexOfChild(m72543x67c60a58.f104743f) + 1);
    }
}
