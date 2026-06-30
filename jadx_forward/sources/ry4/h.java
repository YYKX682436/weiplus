package ry4;

/* loaded from: classes.dex */
public abstract class h {
    public static final void a(android.content.Context context, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        intent.putExtra("extra_username", username);
        pf5.j0.a(intent, ry4.c0.class);
        boolean z17 = context instanceof android.app.Activity;
        if (!z17) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandEditUI", "startForNew", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandEditUI", "startForNew", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z17) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }
}
