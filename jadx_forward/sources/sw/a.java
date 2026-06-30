package sw;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(android.content.Context context, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, tw.i.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (lVar != null) {
            lVar.mo146xb9724478(intent);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandecs/ui/BrandEcsNotifySettingLauncher", "start", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/brandecs/ui/BrandEcsNotifySettingLauncher", "start", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
