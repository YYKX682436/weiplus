package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class z7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272306d;

    public z7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f272306d = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$voiceInputRecording$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatFooterKt", "voiceInputRecording clicked");
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8.B;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f272306d;
        c8Var.k().setVisibility(0);
        c8Var.m();
        if (c8Var.f271753b.m75444x92b2a53() != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) c8Var.e().f542241c.a(sb5.i0.class))).P0(2);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$voiceInputRecording$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
