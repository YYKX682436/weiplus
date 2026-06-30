package b3;

/* loaded from: classes11.dex */
public abstract class b {
    public static void a(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle);
        arrayList.add(intentArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "androidx/core/content/ContextCompat$Api16Impl", "startActivities", "(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivities", "([Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivities((android.content.Intent[]) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(context, "androidx/core/content/ContextCompat$Api16Impl", "startActivities", "(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivities", "([Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    public static void b(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "androidx/core/content/ContextCompat$Api16Impl", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(context, "androidx/core/content/ContextCompat$Api16Impl", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }
}
