package k52;

/* loaded from: classes13.dex */
public final class a implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k52.c f385815a;

    public a(k52.c cVar) {
        this.f385815a = cVar;
    }

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        if (this.f385815a.f385819b == 0) {
            java.lang.Boolean bool = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
            if (bool != null) {
                bool.booleanValue();
                k52.c.f385817e = bool.booleanValue();
            }
        }
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        boolean z17 = false;
        java.lang.Object obj2 = objArr != null ? objArr[0] : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.view.MotionEvent");
        int action = ((android.view.MotionEvent) obj2).getAction();
        k52.c cVar = this.f385815a;
        cVar.f385819b = action;
        if (cVar.f385819b == 0) {
            cVar.getClass();
            java.lang.Boolean valueOf = str != null ? java.lang.Boolean.valueOf(r26.n0.B(str, "$OnTouchListener", false)) : null;
            if (valueOf != null && valueOf.booleanValue() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onTouch") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z")) {
                z17 = true;
            }
            k52.c.f385817e = z17;
        }
    }
}
