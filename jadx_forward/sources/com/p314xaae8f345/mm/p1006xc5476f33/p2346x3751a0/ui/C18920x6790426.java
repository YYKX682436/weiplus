package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* renamed from: com.tencent.mm.plugin.voip.ui.t0$$b */
/* loaded from: classes.dex */
public final /* synthetic */ class C18920x6790426 implements yz5.l {
    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add((android.content.Intent) obj);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$routToFlutterVoip$0", "(Landroid/content/Intent;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$routToFlutterVoip$0", "(Landroid/content/Intent;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
