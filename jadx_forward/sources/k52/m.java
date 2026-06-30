package k52;

/* loaded from: classes15.dex */
public final class m implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k52.o f385848a;

    public m(k52.o oVar) {
        this.f385848a = oVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
        k52.o oVar = this.f385848a;
        if (oVar.f385855f && obj != null && (obj instanceof android.view.View) && obj2 != null && (obj2 instanceof java.lang.Boolean) && ((java.lang.Boolean) obj2).booleanValue()) {
            oVar.f385855f = false;
            k52.o.a(oVar, (android.view.View) obj, str, obj, k52.g.f385827e);
        }
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr != null) {
            if (objArr.length == 0) {
                return;
            }
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof android.view.MotionEvent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.view.MotionEvent");
                this.f385848a.f385855f = ((android.view.MotionEvent) obj2).getAction() == 0;
            }
        }
    }
}
