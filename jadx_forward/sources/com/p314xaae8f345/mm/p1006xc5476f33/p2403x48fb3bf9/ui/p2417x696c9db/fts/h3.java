package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes15.dex */
public final class h3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 f265963d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var) {
        this.f265963d = j3Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var = this.f265963d;
        z21.e eVar = j3Var.A;
        if (eVar != null) {
            eVar.mo48299x360802(true);
        }
        j3Var.B.mo50303x856b99f0(1);
        j3Var.B.mo50311x7ab51103(j3Var.B.mo50290x733c63a2(1, 99, 0), 500);
        j3Var.c();
        j3Var.d();
        android.view.ViewGroup viewGroup = j3Var.f266000q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        viewGroup.setVisibility(0);
        android.view.View view = j3Var.f266007x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = j3Var.f265996m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
