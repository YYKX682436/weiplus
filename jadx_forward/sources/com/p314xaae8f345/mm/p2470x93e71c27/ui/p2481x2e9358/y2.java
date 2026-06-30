package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class y2 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272291d;

    public y2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272291d = c19666xfd6e2f33;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272291d;
        if (c19666xfd6e2f33.f271501c6 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_TRANS && c19666xfd6e2f33.X4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "dismiss from keyback, need cancelRecording");
            c19666xfd6e2f33.N3.b(6);
            c19666xfd6e2f33.f271623x0.o();
        }
        c19666xfd6e2f33.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "newVoice2txt, resetNewVoice2txt.");
        c19666xfd6e2f33.Z3.setBackground(c19666xfd6e2f33.s0(c19666xfd6e2f33.Y5, c19666xfd6e2f33.Z5));
        c19666xfd6e2f33.X4 = true;
        c19666xfd6e2f33.P5 = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5 b5Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_VOICE;
        c19666xfd6e2f33.f271501c6 = b5Var;
        c19666xfd6e2f33.f271507d6 = b5Var;
        ((java.util.HashMap) c19666xfd6e2f33.f271513e6).clear();
        ((java.util.ArrayList) c19666xfd6e2f33.f271591r6).clear();
        c19666xfd6e2f33.f271559m6 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = c19666xfd6e2f33.f271571o6;
        if (cVar != null) {
            cVar.a(false, true);
        }
        c19666xfd6e2f33.f271571o6 = null;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
        if (k5Var != null && c19666xfd6e2f33.T3) {
            k5Var.r();
        }
        c19666xfd6e2f33.f271628x5 = c19666xfd6e2f33.f271590r5;
        c19666xfd6e2f33.C5 = java.lang.Math.round(com.p314xaae8f345.mm.ui.gk.a(com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), 176)));
        c19666xfd6e2f33.D5 = 60;
        c19666xfd6e2f33.q();
        c19666xfd6e2f33.E0();
        c19666xfd6e2f33.F0();
        c19666xfd6e2f33.f271619w4.setVisibility(8);
        c19666xfd6e2f33.f271627x4.setVisibility(8);
        android.view.View view = c19666xfd6e2f33.D4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19666xfd6e2f33.E4.setVisibility(8);
        c19666xfd6e2f33.G4.topMargin = java.lang.Math.round(com.p314xaae8f345.mm.ui.gk.a(c19666xfd6e2f33.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561199c3)));
        c19666xfd6e2f33.F4.setLayoutParams(c19666xfd6e2f33.G4);
        c19666xfd6e2f33.F4.setAlpha(1.0f);
        c19666xfd6e2f33.F4.setVisibility(0);
        android.view.View view2 = c19666xfd6e2f33.I4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = c19666xfd6e2f33.J4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19666xfd6e2f33.f271577p4.setVisibility(0);
        c19666xfd6e2f33.K4.setAlpha(1.0f);
        c19666xfd6e2f33.K4.m78265x3ae760af(97.8f);
        c19666xfd6e2f33.K4.m78268xbcf73793(274.0f);
        c19666xfd6e2f33.L4.setAlpha(1.0f);
        c19666xfd6e2f33.L4.m78265x3ae760af(4.4f);
        c19666xfd6e2f33.L4.m78268xbcf73793(274.4f);
        c19666xfd6e2f33.f271627x4.setVisibility(8);
        c19666xfd6e2f33.f271619w4.setVisibility(8);
        c19666xfd6e2f33.f271494b4.setText("");
        c19666xfd6e2f33.f271494b4.removeTextChangedListener(c19666xfd6e2f33.f271546k5);
        android.view.View view4 = c19666xfd6e2f33.T4;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19666xfd6e2f33.M5 = 0;
        c19666xfd6e2f33.f271609u6 = false;
        c19666xfd6e2f33.f271494b4.setFocusable(false);
        c19666xfd6e2f33.f271494b4.setFocusableInTouchMode(false);
        android.view.View view5 = c19666xfd6e2f33.Z3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = c19666xfd6e2f33.Y3;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19666xfd6e2f33.f271505d4.setVisibility(8);
        c19666xfd6e2f33.f271499c4.setVisibility(0);
        c19666xfd6e2f33.f271597s6.d();
        c19666xfd6e2f33.f271603t6.mo50303x856b99f0(5000);
        ((java.util.HashMap) c19666xfd6e2f33.f271519f6).clear();
        c19666xfd6e2f33.O5 = false;
        c19666xfd6e2f33.C1();
        c19666xfd6e2f33.f271542j6 = "";
        c19666xfd6e2f33.f271547k6 = "";
        c19666xfd6e2f33.f271565n6 = "";
        c19666xfd6e2f33.f271525g6 = "";
        c19666xfd6e2f33.f271537i6 = "";
        c19666xfd6e2f33.f271490a5 = false;
        c19666xfd6e2f33.f271531h6 = false;
        c19666xfd6e2f33.T1(false, false);
        c19666xfd6e2f33.E1(0, true, -1);
        c19666xfd6e2f33.o0();
    }
}
