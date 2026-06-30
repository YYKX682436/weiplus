package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a f291982d;

    public h(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a) {
        this.f291982d = c22496x54525e2a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ActionBarSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar = com.p314xaae8f345.mm.ui.p2740x696c9db.r.CLEAR;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a = this.f291982d;
        if (rVar == c22496x54525e2a.f291497g) {
            c22496x54525e2a.g(true);
            com.p314xaae8f345.mm.ui.p2740x696c9db.q qVar = c22496x54525e2a.f291501n;
            if (qVar != null) {
                qVar.v();
            }
        } else {
            c22496x54525e2a.j(com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH);
            com.p314xaae8f345.mm.ui.p2740x696c9db.q qVar2 = c22496x54525e2a.f291501n;
            if (qVar2 != null) {
                qVar2.w();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/ActionBarSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
