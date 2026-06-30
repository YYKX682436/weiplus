package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class xo implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro f281796a;

    public xo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar) {
        this.f281796a = roVar;
    }

    public void a(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = this.f281796a;
        if (booleanValue) {
            if (roVar.D == null) {
                roVar.D = ((android.view.ViewStub) roVar.f280113d.c(com.p314xaae8f345.mm.R.id.p3g)).inflate();
            }
            android.view.View view = roVar.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = roVar.D;
        if (view2 == null || view2.getVisibility() != 0) {
            return;
        }
        android.view.View view3 = roVar.D;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
