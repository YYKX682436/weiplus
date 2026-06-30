package k52;

/* loaded from: classes15.dex */
public final class d implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k52.e f385822a;

    public d(k52.e eVar) {
        this.f385822a = eVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (obj == null || !(obj instanceof android.view.View) || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj2 = objArr[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj2).intValue();
        java.lang.Object obj3 = objArr[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        ((java.lang.Boolean) obj3).booleanValue();
        k52.e eVar = this.f385822a;
        if (intValue > 0 || eVar.f385824b != -1) {
            eVar.f385824b = intValue;
            r45.a07 a07Var = new r45.a07();
            java.lang.String str4 = "Horizontal-Scroll-" + intValue;
            a07Var.f451134d = str4;
            a07Var.f451135e = str4;
            a07Var.f451136f = str4;
            java.lang.ref.WeakReference weakReference = b52.a.a().f99612c;
            java.lang.Object obj4 = weakReference == null ? null : weakReference.get();
            java.lang.String name = obj4 != null ? obj4.getClass().getName() : null;
            if (name != null) {
                str = name;
            }
            a07Var.f451137g = str;
            a07Var.f451138h = obj.getClass().getName();
            k52.g gVar = k52.g.f385827e;
            a07Var.f451139i = 10;
            android.view.View view = (android.view.View) obj;
            a07Var.f451140m = view.hashCode();
            a07Var.f451141n = view.hashCode();
            a07Var.f451142o = java.lang.System.currentTimeMillis();
            a07Var.f451148u = 1;
            a07Var.f451144q = intValue;
            k52.f fVar = eVar.f385823a;
            if (fVar != null) {
                ((k52.j) fVar).a(view, a07Var);
            }
        }
    }
}
