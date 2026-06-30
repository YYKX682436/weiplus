package vh4;

/* loaded from: classes.dex */
public class h2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f518612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f518614c;

    public h2(vh4.t1 t1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, android.content.Context context) {
        this.f518614c = t1Var;
        this.f518612a = u3Var;
        this.f518613b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f518612a.dismiss();
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            return null;
        }
        r45.m20 m20Var = (r45.m20) fVar.f152151d;
        boolean z17 = m20Var.f461620d;
        android.content.Context context = this.f518613b;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
            intent.putExtra("intent_process", 1);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(context, intent, (c01.e2.a0() && this.f518614c.df() == null) ? new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822.class) : new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.class));
            return null;
        }
        if (!m20Var.f461621e) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(context, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b.class), new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.class));
            return null;
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
        intent2.putExtra("intent_process", 3);
        android.content.Context context2 = this.f518613b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$7", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/teenmode/model/TeenModeService$7", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
