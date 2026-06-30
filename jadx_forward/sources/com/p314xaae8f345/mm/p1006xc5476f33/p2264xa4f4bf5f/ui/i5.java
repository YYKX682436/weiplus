package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes9.dex */
public final class i5 {
    public i5(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5 i5Var, android.content.Context context, int i17, java.lang.String userName, java.lang.String str, java.lang.Boolean bool, java.lang.Long l17, int i18, int i19, int i27, java.lang.Object obj) {
        int i28 = (i27 & 2) != 0 ? 0 : i17;
        java.lang.Boolean bool2 = (i27 & 16) != 0 ? java.lang.Boolean.FALSE : bool;
        java.io.Serializable serializable = (i27 & 32) != 0 ? 0L : l17;
        int i29 = (i27 & 64) != 0 ? 0 : i18;
        int i37 = (i27 & 128) != 0 ? 2 : i19;
        i5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentTransparentActivity", "start() called with: context = " + context + ", userName = " + userName + ", statusId = " + str + " isExpired:" + bool2 + " currScene:" + i29);
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1.class);
        intent.putExtra("KEY_USER_NAME", userName);
        intent.putExtra("KEY_STATUS_ID", str == null ? "" : str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.TRUE)) {
            intent.putExtra("KEY_IS_EXPIRED", bool2.booleanValue());
        } else {
            mj4.h t17 = ai4.m0.f86706a.G().t(str);
            intent.putExtra("KEY_IS_EXPIRED", t17 != null ? ((mj4.k) t17).w() : true);
        }
        if (serializable == null) {
            serializable = "";
        }
        intent.putExtra("KEY_REF_COMMENT_ID", serializable);
        intent.putExtra("KEY_ACTION", i28);
        intent.putExtra("KEY_CURRENT_SCENE", i29);
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent2 = z17 ? ((android.app.Activity) context).getIntent() : null;
        int intExtra = intent2 != null ? intent2.getIntExtra("CONTACT_INFO_UI_SOURCE", 0) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "profileReferPath:" + intExtra);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i37));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCommentTransparentActivity$Companion", "start", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;II)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCommentTransparentActivity$Companion", "start", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusCommentTransparentActivity$Companion", "start", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
