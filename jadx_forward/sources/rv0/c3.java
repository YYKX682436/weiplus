package rv0;

/* loaded from: classes5.dex */
public final class c3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f481487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f481488h;

    public c3(ex0.a0 a0Var, rv0.n1 n1Var, rv0.o7 o7Var, float f17, boolean z17) {
        this.f481484d = a0Var;
        this.f481485e = n1Var;
        this.f481486f = o7Var;
        this.f481487g = f17;
        this.f481488h = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.a0 a0Var = this.f481484d;
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f338630g.f338710e).iterator();
        while (true) {
            if (!it.hasNext()) {
                rv0.n1 n1Var = this.f481485e;
                rv0.a4.a(a0Var, n1Var);
                n1Var.p7().c7();
                gx0.kh q76 = n1Var.q7();
                rv0.o7 o7Var = this.f481486f;
                java.lang.String string = o7Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1v);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                q76.r7(string, null);
                o7Var.D = false;
                o7Var.e(true, true);
                return;
            }
            ex0.r rVar = (ex0.r) it.next();
            ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
            if (cVar != null) {
                cVar.E(this.f481487g);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = cVar.f338652p;
                c4181x2248e1a3.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                if (D != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.I0(c4181x2248e1a3, this.f481488h, D);
                }
            }
        }
    }
}
