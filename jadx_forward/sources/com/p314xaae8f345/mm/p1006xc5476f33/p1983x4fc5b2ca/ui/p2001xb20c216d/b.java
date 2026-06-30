package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f237654d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e) {
        this.f237654d = c17040x9d8b708e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f237654d;
        c17040x9d8b708e.K.z(null);
        c17040x9d8b708e.j(true);
        c17040x9d8b708e.m68174x710f87ad(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a callback = c17040x9d8b708e.getCallback();
        if (callback != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
            c16997xb0aa383a.f237251o = 2;
            callback.m(c16997xb0aa383a);
        }
        wt3.u uVar = wt3.v.f531037h;
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            r45.lh4 lh4Var = new r45.lh4();
            lh4Var.f461014e = 14;
            lh4Var.f461016g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            vVar.f531046g.add(lh4Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioReporter", "record enter search " + wt3.w.a(lh4Var));
        }
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.f421754d.f142420v = 1L;
        nu3.i.f421757g.f142490q = 1L;
        iVar.d(17);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
