package sc2;

/* loaded from: classes2.dex */
public final class x7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(java.lang.String str) {
        super(1);
        this.f487902d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        android.view.View view = observer.f84676d;
        if (p0Var != null && view != null) {
            java.lang.String activityName = this.f487902d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
            xc2.z2 z2Var = observer.f84684o;
            if (z2Var != null) {
                z2Var.c(activityName, p0Var, view);
            }
        }
        return jz5.f0.f384359a;
    }
}
