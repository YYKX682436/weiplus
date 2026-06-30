package yt3;

/* loaded from: classes10.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.q2 f547012d;

    public h2(yt3.q2 q2Var) {
        this.f547012d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c c17027xff3f401c = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c) this.f547012d.f547141e;
        c17027xff3f401c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "report Favorite");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b c7138x4892e88b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b();
        c7138x4892e88b.f144480e = 4L;
        c7138x4892e88b.f144482g = 1L;
        yt3.b2 b2Var = c17027xff3f401c.editPhotoWrapper;
        qk.o9 o9Var = b2Var.f546893i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        c7138x4892e88b.f144481f = (((f65.r) b17).g() && b2Var.b()) ? 1L : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c17027xff3f401c.configProvider;
        c7138x4892e88b.p(c16993xacc19624 != null ? c16993xacc19624.W : null);
        c7138x4892e88b.k();
        b2Var.a(true, new ju3.n2(c17027xff3f401c));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
