package k85;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.l lVar, d85.g0 g0Var, d85.f0 f0Var) {
        super(0);
        this.f386937d = lVar;
        this.f386938e = g0Var;
        this.f386939f = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        java.lang.ref.WeakReference i17 = com.p314xaae8f345.mm.app.w.INSTANCE.i();
        if (i17 == null || (context = (android.app.Activity) i17.get()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Intent intent = new android.content.Intent();
        yz5.l lVar = com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21020xdc947ceb.f274725d;
        intent.putExtra("KEY_PERMISSION", this.f386938e.f308725d);
        intent.putExtra("KEY_BUSINESS", this.f386939f.f308709d);
        if (((context instanceof android.app.Activity) ^ true ? context : null) != null) {
            intent.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21020xdc947ceb.class);
        com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21020xdc947ceb.f274725d = this.f386937d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
