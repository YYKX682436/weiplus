package jb0;

/* loaded from: classes8.dex */
public final class f implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 f380215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb0.g f380216b;

    public f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var, jb0.g gVar) {
        this.f380215a = g2Var;
        this.f380216b = gVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0
    public void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var = this.f380215a.f270851k;
        jz5.f0 f0Var = null;
        android.content.Intent intent = f2Var != null ? f2Var.f270833d : null;
        if (intent != null) {
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obd));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/openway/OpenWayFeatureService$shareChattingToOtherApp$1$2$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/openway/OpenWayFeatureService$shareChattingToOtherApp$1$2$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f380216b.f380217d, "launch chooser but intent is null");
        }
    }
}
