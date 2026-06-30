package uz0;

/* loaded from: classes5.dex */
public final class c extends uz0.r {

    /* renamed from: a, reason: collision with root package name */
    public final e0.f1 f513642a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f513643b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f513644c;

    public c(e0.f1 lazyListState, yz5.p snapOffsetForItem, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazyListState, "lazyListState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapOffsetForItem, "snapOffsetForItem");
        this.f513642a = lazyListState;
        this.f513643b = snapOffsetForItem;
        this.f513644c = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
    }

    @Override // uz0.r
    public boolean a() {
        e0.f1 f1Var = this.f513642a;
        e0.n nVar = (e0.n) kz5.n0.k0(f1Var.f().b());
        if (nVar != null) {
            e0.q0 q0Var = (e0.q0) nVar;
            if (q0Var.f327212b < f1Var.f().a() - 1 || q0Var.f327211a + q0Var.f327214d > e()) {
                return true;
            }
        }
        return false;
    }

    @Override // uz0.r
    public boolean b() {
        e0.n nVar = (e0.n) kz5.n0.Z(this.f513642a.f().b());
        if (nVar == null) {
            return false;
        }
        e0.q0 q0Var = (e0.q0) nVar;
        return q0Var.f327212b > 0 || q0Var.f327211a < 0;
    }

    @Override // uz0.r
    public int c(int i17) {
        java.lang.Object obj;
        int b17;
        int intValue;
        q26.r0 r0Var = (q26.r0) q26.h0.o(kz5.n0.J(this.f513642a.f().b()), uz0.b.f513641d);
        java.util.Iterator mo144672x467c086e = r0Var.f441423a.mo144672x467c086e();
        while (true) {
            if (!mo144672x467c086e.hasNext()) {
                obj = null;
                break;
            }
            obj = r0Var.f441424b.mo146xb9724478(mo144672x467c086e.next());
            if (((uz0.s) obj).a() == i17) {
                break;
            }
        }
        uz0.s sVar = (uz0.s) obj;
        yz5.p pVar = this.f513643b;
        if (sVar != null) {
            b17 = ((e0.q0) ((uz0.d) sVar).f513645a).f327211a;
            intValue = ((java.lang.Number) pVar.mo149xb9724478(this, sVar)).intValue();
        } else {
            uz0.s d17 = d();
            if (d17 == null) {
                return 0;
            }
            b17 = a06.d.b((i17 - d17.a()) * f()) + ((e0.q0) ((uz0.d) d17).f513645a).f327211a;
            intValue = ((java.lang.Number) pVar.mo149xb9724478(this, d17)).intValue();
        }
        return b17 - intValue;
    }

    @Override // uz0.r
    public uz0.s d() {
        q26.r0 r0Var = (q26.r0) q26.h0.o(kz5.n0.J(this.f513642a.f().b()), uz0.b.f513641d);
        java.util.Iterator mo144672x467c086e = r0Var.f441423a.mo144672x467c086e();
        java.lang.Object obj = null;
        while (mo144672x467c086e.hasNext()) {
            java.lang.Object mo146xb9724478 = r0Var.f441424b.mo146xb9724478(mo144672x467c086e.next());
            uz0.s sVar = (uz0.s) mo146xb9724478;
            if (((e0.q0) ((uz0.d) sVar).f513645a).f327211a <= ((java.lang.Number) this.f513643b.mo149xb9724478(this, sVar)).intValue()) {
                obj = mo146xb9724478;
            }
        }
        return (uz0.s) obj;
    }

    @Override // uz0.r
    public int e() {
        return this.f513642a.f().f() - ((java.lang.Number) ((n0.q4) this.f513644c).mo128745x754a37bb()).intValue();
    }

    public final float f() {
        java.lang.Object next;
        e0.f1 f1Var = this.f513642a;
        e0.h0 f17 = f1Var.f();
        if (f17.b().isEmpty()) {
            return -1.0f;
        }
        java.util.Iterator it = f17.b().iterator();
        java.lang.Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i17 = ((e0.q0) ((e0.n) next)).f327211a;
                do {
                    java.lang.Object next2 = it.next();
                    int i18 = ((e0.q0) ((e0.n) next2)).f327211a;
                    if (i17 > i18) {
                        next = next2;
                        i17 = i18;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        e0.n nVar = (e0.n) next;
        if (nVar == null) {
            return -1.0f;
        }
        java.util.Iterator it6 = f17.b().iterator();
        if (it6.hasNext()) {
            obj = it6.next();
            if (it6.hasNext()) {
                e0.n nVar2 = (e0.n) obj;
                int i19 = ((e0.q0) nVar2).f327211a + ((e0.q0) nVar2).f327214d;
                do {
                    java.lang.Object next3 = it6.next();
                    e0.n nVar3 = (e0.n) next3;
                    int i27 = ((e0.q0) nVar3).f327211a + ((e0.q0) nVar3).f327214d;
                    if (i19 < i27) {
                        obj = next3;
                        i19 = i27;
                    }
                } while (it6.hasNext());
            }
        }
        e0.n nVar4 = (e0.n) obj;
        if (nVar4 == null) {
            return -1.0f;
        }
        e0.q0 q0Var = (e0.q0) nVar;
        e0.q0 q0Var2 = (e0.q0) nVar4;
        int i28 = q0Var.f327211a;
        int i29 = q0Var2.f327211a;
        if (java.lang.Math.max(i28 + q0Var.f327214d, i29 + q0Var2.f327214d) - java.lang.Math.min(i28, i29) == 0) {
            return -1.0f;
        }
        e0.h0 f18 = f1Var.f();
        int i37 = 0;
        if (f18.b().size() >= 2) {
            e0.q0 q0Var3 = (e0.q0) ((e0.n) f18.b().get(0));
            i37 = ((e0.q0) ((e0.n) f18.b().get(1))).f327211a - (q0Var3.f327214d + q0Var3.f327211a);
        }
        return (r2 + i37) / f17.b().size();
    }
}
