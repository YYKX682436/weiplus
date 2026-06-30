package qq;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final qq.k f447408d = new qq.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.feature.ecs.test.EcsTestUIRichText.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ecs/test/EcsTestService$getAllConfig$3", "invoke", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ecs/test/EcsTestService$getAllConfig$3", "invoke", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
