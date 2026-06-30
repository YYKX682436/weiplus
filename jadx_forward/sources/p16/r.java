package p16;

/* loaded from: classes16.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Iterator f432873a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map.Entry f432874b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f432875c;

    public r(p16.s sVar, boolean z17, p16.o oVar) {
        p16.n nVar = sVar.f432876d;
        boolean z18 = nVar.f432859c;
        p16.w0 w0Var = nVar.f432857a;
        java.util.Iterator a0Var = z18 ? new p16.a0(((p16.v0) w0Var.entrySet()).iterator()) : ((p16.v0) w0Var.entrySet()).iterator();
        this.f432873a = a0Var;
        if (a0Var.hasNext()) {
            this.f432874b = (java.util.Map.Entry) a0Var.next();
        }
        this.f432875c = z17;
    }

    public void a(int i17, p16.j jVar) {
        while (true) {
            java.util.Map.Entry entry = this.f432874b;
            if (entry == null || ((p16.t) entry.getKey()).f432879d >= i17) {
                return;
            }
            p16.t tVar = (p16.t) this.f432874b.getKey();
            int i18 = 0;
            if (this.f432875c && tVar.f432880e.f432823d == p16.h1.MESSAGE && !tVar.f432881f) {
                p16.h0 h0Var = (p16.h0) this.f432874b.getValue();
                jVar.x(1, 3);
                jVar.x(2, 0);
                jVar.v(tVar.f432879d);
                jVar.o(3, h0Var);
                jVar.x(1, 4);
            } else {
                java.lang.Object value = this.f432874b.getValue();
                p16.n nVar = p16.n.f432856d;
                p16.g1 g1Var = tVar.f432880e;
                int i19 = tVar.f432879d;
                if (tVar.f432881f) {
                    java.util.List list = (java.util.List) value;
                    if (tVar.f432882g) {
                        jVar.x(i19, 2);
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            i18 += p16.n.c(g1Var, it.next());
                        }
                        jVar.v(i18);
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            p16.n.m(jVar, g1Var, it6.next());
                        }
                    } else {
                        java.util.Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            p16.n.l(jVar, g1Var, i19, it7.next());
                        }
                    }
                } else {
                    p16.n.l(jVar, g1Var, i19, value);
                }
            }
            java.util.Iterator it8 = this.f432873a;
            if (it8.hasNext()) {
                this.f432874b = (java.util.Map.Entry) it8.next();
            } else {
                this.f432874b = null;
            }
        }
    }
}
