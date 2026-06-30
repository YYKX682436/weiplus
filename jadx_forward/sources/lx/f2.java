package lx;

/* loaded from: classes.dex */
public final class f2 implements rv.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f403287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f403288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403289c;

    public f2(android.content.Context context, lx.i2 i2Var, yz5.l lVar) {
        this.f403287a = context;
        this.f403288b = i2Var;
        this.f403289c = lVar;
    }

    @Override // rv.i3
    public final void a(android.content.Intent intent) {
        if (intent == null) {
            lx.i2.a(this.f403288b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "editTextCover: failed to create intent");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f403289c.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("Failed to create text cover editor intent")))));
            return;
        }
        android.content.Context context = this.f403287a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizMediaPlugin$editTextCover$2", "onResult", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizMediaPlugin$editTextCover$2", "onResult", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
