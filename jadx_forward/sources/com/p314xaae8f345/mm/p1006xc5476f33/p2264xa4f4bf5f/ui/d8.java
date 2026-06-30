package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class d8 {
    public d8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, bi4.d1 params, boolean z17, boolean z18, android.os.ResultReceiver resultReceiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.class);
        if (z17) {
            intent.addFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
        }
        intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", z18);
        intent.putExtra("SET_TEXT_PARAMS", params.mo14344x5f01b1f6());
        intent.putExtra("CALLBACK", resultReceiver);
        intent.putExtra("KEY_IS_FROM_RECENT_STATUS", params.H);
        intent.putExtra("KEY_IS_FROM_CUSTOM_ICON_RECOMMEND", params.I);
        intent.putExtra("KEY_LAST_CUSTOM_ICON_RECOMMEND_LIST", params.f436469J);
        boolean z19 = context instanceof android.app.Activity;
        if (!z19) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;ZZLandroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;ZZLandroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = z19 ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }
}
