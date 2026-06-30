package o22;

/* loaded from: classes5.dex */
public class h implements o22.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f423942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f423943c;

    public h(android.content.Context context, android.content.Intent intent, int i17) {
        this.f423941a = context;
        this.f423942b = intent;
        this.f423943c = i17;
    }

    public void a(boolean z17) {
        if (z17) {
            android.content.Context context = this.f423941a;
            boolean z18 = context instanceof android.app.Activity;
            int i17 = this.f423943c;
            android.content.Intent intent = this.f423942b;
            if (z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            if (!(context instanceof android.view.ContextThemeWrapper)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            android.content.Context baseContext = ((android.view.ContextThemeWrapper) context).getBaseContext();
            if (baseContext instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) baseContext;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(java.lang.Integer.valueOf(i17));
                arrayList3.add(intent);
                java.util.Collections.reverse(arrayList3);
                yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            android.content.Context context2 = this.f423941a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context2, arrayList4.toArray(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
