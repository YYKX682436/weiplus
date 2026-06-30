package gi;

/* loaded from: classes12.dex */
public class u1 implements ou5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi.v1 f353716a;

    public u1(gi.v1 v1Var) {
        this.f353716a = v1Var;
    }

    @Override // su5.a
    public void a(wu5.l lVar, long j17, long j18) {
        gi.v1 v1Var = this.f353716a;
        v1Var.f353733a.a(lVar, j17, j18);
        v1Var.f353734b.w(i(lVar), lVar.hashCode());
    }

    @Override // su5.a
    public void b(wu5.l lVar) {
        gi.v1 v1Var = this.f353716a;
        v1Var.f353733a.b(lVar);
        v1Var.f353734b.w(i(lVar), lVar.hashCode());
    }

    @Override // su5.a
    public void c(wu5.l lVar) {
        gi.v1 v1Var = this.f353716a;
        v1Var.f353733a.c(lVar);
        v1Var.f353734b.x(i(lVar), lVar.hashCode());
    }

    @Override // su5.a
    public void d(wu5.l lVar) {
        this.f353716a.f353733a.d(lVar);
    }

    @Override // su5.a
    public void e(wu5.l lVar) {
        this.f353716a.f353733a.e(lVar);
    }

    @Override // su5.a
    public void f(wu5.l lVar) {
        gi.v1 v1Var = this.f353716a;
        v1Var.f353733a.f(lVar);
        gi.y1 y1Var = v1Var.f353734b;
        lVar.hashCode();
        y1Var.getClass();
    }

    @Override // su5.a
    public void g(wu5.l lVar) {
        this.f353716a.f353733a.g(lVar);
    }

    @Override // wu5.a
    public boolean h(java.lang.String str) {
        return this.f353716a.f353733a.h(str);
    }

    public final java.lang.String i(wu5.l lVar) {
        rh.f fVar = (rh.f) ((java.util.concurrent.ConcurrentHashMap) this.f353716a.f353734b.f476924c).get(java.lang.Integer.valueOf(lVar.hashCode()));
        if (fVar != null) {
            return fVar.f476908e;
        }
        java.lang.Object obj = lVar.f531387o;
        if (obj instanceof lu5.g) {
            obj = ((lu5.g) obj).f402998d;
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.n1)) {
                java.lang.String name = obj.getClass().getName();
                l("ERR2", name);
                return "ERR2-".concat(name);
            }
        }
        if (obj == null || !(obj instanceof p3325xe03a0797.p3326xc267989b.n1)) {
            return lVar.mo1867xb5884f29();
        }
        java.lang.String k17 = k(obj);
        if (k17 != null) {
            return k17;
        }
        java.lang.String name2 = obj.getClass().getName();
        l("ERR1", name2);
        return "ERR1-".concat(name2);
    }

    @Override // ou5.g
    public void j() {
        this.f353716a.f353733a.j();
    }

    public final java.lang.String k(java.lang.Object obj) {
        qz5.e mo144028x366976c;
        if ((obj instanceof qz5.e) && (mo144028x366976c = ((qz5.e) obj).mo144028x366976c()) != null) {
            return k(mo144028x366976c);
        }
        if (obj instanceof p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) {
            return obj.getClass().getName();
        }
        return null;
    }

    public final java.lang.String l(java.lang.String str, java.lang.String str2) {
        if (str2.contains(".DispatchedContinuation") && mm.o.k(10)) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            java.lang.String str3 = "";
            for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
                if (!stackTraceElement.getClassName().contains(gi.y1.class.getName())) {
                    str3 = stackTraceElement.toString();
                }
            }
            ap.a.a(1, "statTask", th6, null, "coroutineName", str, str2, str3);
        }
        return str2;
    }
}
