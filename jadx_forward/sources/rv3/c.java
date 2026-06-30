package rv3;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv3.e f481912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f481913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv3.h f481914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rv3.e eVar, in5.s0 s0Var, rv3.h hVar) {
        super(1);
        this.f481912d = eVar;
        this.f481913e = s0Var;
        this.f481914f = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView it = (android.widget.TextView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ev3.b bVar = this.f481912d.f481918f;
        if (bVar != null) {
            in5.s0 s0Var = this.f481913e;
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            bVar.X(itemView, this.f481914f, s0Var.m8183xf806b362());
        }
        return jz5.f0.f384359a;
    }
}
