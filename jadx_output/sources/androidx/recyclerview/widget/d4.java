package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final x.b f12000a = new x.b();

    /* renamed from: b, reason: collision with root package name */
    public final x.f f12001b = new x.f();

    public void a(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var) {
        x.b bVar = this.f12000a;
        androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) bVar.getOrDefault(k3Var, null);
        if (b4Var == null) {
            b4Var = androidx.recyclerview.widget.b4.a();
            bVar.put(k3Var, b4Var);
        }
        b4Var.f11969c = m2Var;
        b4Var.f11967a |= 8;
    }

    public final androidx.recyclerview.widget.m2 b(androidx.recyclerview.widget.k3 k3Var, int i17) {
        androidx.recyclerview.widget.b4 b4Var;
        androidx.recyclerview.widget.m2 m2Var;
        x.b bVar = this.f12000a;
        int e17 = bVar.e(k3Var);
        if (e17 >= 0 && (b4Var = (androidx.recyclerview.widget.b4) bVar.l(e17)) != null) {
            int i18 = b4Var.f11967a;
            if ((i18 & i17) != 0) {
                int i19 = i18 & (~i17);
                b4Var.f11967a = i19;
                if (i17 == 4) {
                    m2Var = b4Var.f11968b;
                } else {
                    if (i17 != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    m2Var = b4Var.f11969c;
                }
                if ((i19 & 12) == 0) {
                    bVar.j(e17);
                    b4Var.f11967a = 0;
                    b4Var.f11968b = null;
                    b4Var.f11969c = null;
                    ((m3.f) androidx.recyclerview.widget.b4.f11966d).b(b4Var);
                }
                return m2Var;
            }
        }
        return null;
    }

    public void c(androidx.recyclerview.widget.k3 k3Var) {
        androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) this.f12000a.getOrDefault(k3Var, null);
        if (b4Var == null) {
            return;
        }
        b4Var.f11967a &= -2;
    }

    public void d(androidx.recyclerview.widget.k3 k3Var) {
        x.f fVar = this.f12001b;
        int e17 = fVar.e();
        while (true) {
            e17--;
            if (e17 < 0) {
                break;
            }
            if (k3Var == fVar.f(e17)) {
                java.lang.Object[] objArr = fVar.f450823f;
                java.lang.Object obj = objArr[e17];
                java.lang.Object obj2 = x.f.f450820h;
                if (obj != obj2) {
                    objArr[e17] = obj2;
                    fVar.f450821d = true;
                }
            }
        }
        androidx.recyclerview.widget.b4 b4Var = (androidx.recyclerview.widget.b4) this.f12000a.remove(k3Var);
        if (b4Var != null) {
            b4Var.f11967a = 0;
            b4Var.f11968b = null;
            b4Var.f11969c = null;
            ((m3.f) androidx.recyclerview.widget.b4.f11966d).b(b4Var);
        }
    }
}
