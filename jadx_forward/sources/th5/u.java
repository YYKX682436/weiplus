package th5;

/* loaded from: classes12.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.o f500995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f500996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(th5.o oVar, android.view.View view) {
        super(1);
        this.f500995d = oVar;
        this.f500996e = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "$this$visibility");
        android.view.View view = this.f500996e;
        th5.o oVar = this.f500995d;
        if (oVar != null && oVar.d()) {
            if (oVar.f500956h.length() == 0) {
                visibility.c(view);
                return jz5.f0.f384359a;
            }
        }
        visibility.b(view);
        return jz5.f0.f384359a;
    }
}
