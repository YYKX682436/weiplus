package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final x.b f93533a = new x.b();

    /* renamed from: b, reason: collision with root package name */
    public final x.f f93534b = new x.f();

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var) {
        x.b bVar = this.f93533a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(k3Var, null);
        if (b4Var == null) {
            b4Var = p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.a();
            bVar.put(k3Var, b4Var);
        }
        b4Var.f93502c = m2Var;
        b4Var.f93500a |= 8;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var;
        x.b bVar = this.f93533a;
        int e17 = bVar.e(k3Var);
        if (e17 >= 0 && (b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.l(e17)) != null) {
            int i18 = b4Var.f93500a;
            if ((i18 & i17) != 0) {
                int i19 = i18 & (~i17);
                b4Var.f93500a = i19;
                if (i17 == 4) {
                    m2Var = b4Var.f93501b;
                } else {
                    if (i17 != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    m2Var = b4Var.f93502c;
                }
                if ((i19 & 12) == 0) {
                    bVar.j(e17);
                    b4Var.f93500a = 0;
                    b4Var.f93501b = null;
                    b4Var.f93502c = null;
                    ((m3.f) p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.f93499d).b(b4Var);
                }
                return m2Var;
            }
        }
        return null;
    }

    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) this.f93533a.m174751x4aabfc28(k3Var, null);
        if (b4Var == null) {
            return;
        }
        b4Var.f93500a &= -2;
    }

    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        x.f fVar = this.f93534b;
        int e17 = fVar.e();
        while (true) {
            e17--;
            if (e17 < 0) {
                break;
            }
            if (k3Var == fVar.f(e17)) {
                java.lang.Object[] objArr = fVar.f532356f;
                java.lang.Object obj = objArr[e17];
                java.lang.Object obj2 = x.f.f532353h;
                if (obj != obj2) {
                    objArr[e17] = obj2;
                    fVar.f532354d = true;
                }
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) this.f93533a.m174754xc84af884(k3Var);
        if (b4Var != null) {
            b4Var.f93500a = 0;
            b4Var.f93501b = null;
            b4Var.f93502c = null;
            ((m3.f) p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.f93499d).b(b4Var);
        }
    }
}
