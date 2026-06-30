package ug5;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f509185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f509187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, ug5.v vVar, long j17) {
        super(0);
        this.f509185d = context;
        this.f509186e = vVar;
        this.f509187f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ug5.v vVar = this.f509186e;
        java.lang.Class cls = vVar.f509191a.f509140u;
        android.content.Context context = this.f509185d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("intent_key_view_performer_builder", vVar.toString());
        java.util.HashMap hashMap = ug5.v.f509189h;
        java.lang.String obj = vVar.toString();
        ug5.g gVar = vVar.f509191a;
        hashMap.put(obj, gVar);
        gVar.f509128i.put("intent_key_cost", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "startTransparentActivity real startActivity, post cost: " + (java.lang.System.currentTimeMillis() - this.f509187f));
        android.content.Context context2 = this.f509185d;
        if (context2 instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(7701);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformer$startTransparentActivity$call$1", "invoke", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformer$startTransparentActivity$call$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/fluent/ViewFluentPerformer$startTransparentActivity$call$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
