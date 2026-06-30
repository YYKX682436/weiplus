package yt3;

/* loaded from: classes10.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.q2 f547029d;

    public i2(yt3.q2 q2Var) {
        this.f547029d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c c17027xff3f401c = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c) this.f547029d.f547141e;
        c17027xff3f401c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "report Save");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b c7138x4892e88b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b();
        c7138x4892e88b.f144480e = 5L;
        c7138x4892e88b.f144482g = 1L;
        yt3.b2 b2Var = c17027xff3f401c.editPhotoWrapper;
        qk.o9 o9Var = b2Var.f546893i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        c7138x4892e88b.f144481f = (((f65.r) b17).g() && b2Var.b()) ? 1L : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c17027xff3f401c.configProvider;
        c7138x4892e88b.p(c16993xacc19624 != null ? c16993xacc19624.W : null);
        c7138x4892e88b.k();
        b2Var.a(false, new ju3.p2(db5.e1.Q(c17027xff3f401c.getContext(), c17027xff3f401c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c17027xff3f401c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcr), true, true, ju3.q2.f383533d), c17027xff3f401c));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
