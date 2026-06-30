package ac2;

/* loaded from: classes2.dex */
public final class u extends p012xc85e97e9.p103xe821e364.p104xd1075a44.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f84592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f84593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ac2.y f84594f;

    public u(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, ac2.y yVar) {
        this.f84592d = e0Var;
        this.f84593e = c0Var;
        this.f84594f = yVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int action = e17.getAction();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f84592d;
        ac2.y yVar = this.f84594f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f84593e;
        if (action == 0) {
            e0Var.f391648d = e17.getY();
            c0Var.f391645d = yVar.f84602u != null;
        } else if (action == 2 && c0Var.f391645d) {
            float y17 = e0Var.f391648d - e17.getY();
            if (y17 > 0.0f && y17 >= i65.a.b(yVar.f188501d, 32)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = yVar.f84602u;
                if (abstractC14490x69736cb5 != null) {
                    yVar.f84599r.D0(abstractC14490x69736cb5);
                }
                c0Var.f391645d = false;
            }
        }
        return false;
    }
}
