package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes9.dex */
public final class gg {
    public gg(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String userName, mj4.h hVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255227g = hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255229i = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255228h = userName;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.class);
        intent.putExtra("KEY_ACTION", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowComment", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowComment", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(android.content.Context context, java.lang.String userName, mj4.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255227g = hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255229i = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255229i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255228h = userName;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.class);
        intent.putExtra("KEY_ACTION", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowLikeHistory", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowLikeHistory", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
