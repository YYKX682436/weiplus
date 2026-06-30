package v2;

/* loaded from: classes15.dex */
public class o extends v2.q {

    /* renamed from: c, reason: collision with root package name */
    public final v2.g f514250c;

    /* renamed from: d, reason: collision with root package name */
    public v2.o f514251d;

    /* renamed from: e, reason: collision with root package name */
    public float f514252e;

    /* renamed from: f, reason: collision with root package name */
    public v2.o f514253f;

    /* renamed from: g, reason: collision with root package name */
    public float f514254g;

    /* renamed from: i, reason: collision with root package name */
    public v2.o f514256i;

    /* renamed from: h, reason: collision with root package name */
    public int f514255h = 0;

    /* renamed from: j, reason: collision with root package name */
    public v2.p f514257j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f514258k = 1;

    /* renamed from: l, reason: collision with root package name */
    public v2.p f514259l = null;

    public o(v2.g gVar) {
        this.f514250c = gVar;
    }

    @Override // v2.q
    public void e() {
        int i17;
        v2.o oVar;
        v2.o oVar2;
        v2.o oVar3;
        v2.o oVar4;
        v2.o oVar5;
        v2.o oVar6;
        float l17;
        float f17;
        v2.o oVar7;
        boolean z17 = true;
        if (this.f514262b == 1 || (i17 = this.f514255h) == 4) {
            return;
        }
        v2.p pVar = this.f514257j;
        if (pVar != null) {
            if (pVar.f514262b != 1) {
                return;
            } else {
                this.f514252e = this.f514258k * pVar.f514260c;
            }
        }
        v2.p pVar2 = this.f514259l;
        if (pVar2 != null) {
            if (pVar2.f514262b != 1) {
                return;
            } else {
                float f18 = pVar2.f514260c;
            }
        }
        if (i17 == 1 && ((oVar7 = this.f514251d) == null || oVar7.f514262b == 1)) {
            if (oVar7 == null) {
                this.f514253f = this;
                this.f514254g = this.f514252e;
            } else {
                this.f514253f = oVar7.f514253f;
                this.f514254g = oVar7.f514254g + this.f514252e;
            }
            b();
            return;
        }
        v2.g gVar = this.f514250c;
        if (i17 != 2 || (oVar4 = this.f514251d) == null || oVar4.f514262b != 1 || (oVar5 = this.f514256i) == null || (oVar6 = oVar5.f514251d) == null || oVar6.f514262b != 1) {
            if (i17 != 3 || (oVar = this.f514251d) == null || oVar.f514262b != 1 || (oVar2 = this.f514256i) == null || (oVar3 = oVar2.f514251d) == null || oVar3.f514262b != 1) {
                if (i17 == 5) {
                    gVar.f514168b.s();
                    return;
                }
                return;
            } else {
                this.f514253f = oVar.f514253f;
                oVar2.f514253f = oVar3.f514253f;
                this.f514254g = oVar.f514254g + this.f514252e;
                oVar2.f514254g = oVar3.f514254g + oVar2.f514252e;
                b();
                this.f514256i.b();
                return;
            }
        }
        this.f514253f = oVar4.f514253f;
        oVar5.f514253f = oVar6.f514253f;
        v2.f fVar = gVar.f514169c;
        v2.f fVar2 = v2.f.RIGHT;
        int i18 = 0;
        if (fVar != fVar2 && fVar != v2.f.BOTTOM) {
            z17 = false;
        }
        float f19 = z17 ? oVar4.f514254g - oVar6.f514254g : oVar6.f514254g - oVar4.f514254g;
        if (fVar == v2.f.LEFT || fVar == fVar2) {
            l17 = f19 - gVar.f514168b.l();
            f17 = gVar.f514168b.V;
        } else {
            l17 = f19 - gVar.f514168b.h();
            f17 = gVar.f514168b.W;
        }
        int b17 = gVar.b();
        int b18 = this.f514256i.f514250c.b();
        v2.g gVar2 = gVar.f514170d;
        v2.o oVar8 = this.f514256i;
        if (gVar2 == oVar8.f514250c.f514170d) {
            f17 = 0.5f;
            b18 = 0;
        } else {
            i18 = b17;
        }
        float f27 = i18;
        float f28 = b18;
        float f29 = (l17 - f27) - f28;
        if (z17) {
            oVar8.f514254g = oVar8.f514251d.f514254g + f28 + (f29 * f17);
            this.f514254g = (this.f514251d.f514254g - f27) - (f29 * (1.0f - f17));
        } else {
            this.f514254g = this.f514251d.f514254g + f27 + (f29 * f17);
            oVar8.f514254g = (oVar8.f514251d.f514254g - f28) - (f29 * (1.0f - f17));
        }
        b();
        this.f514256i.b();
    }

    public void f(u2.f fVar) {
        u2.j jVar = this.f514250c.f514175i;
        v2.o oVar = this.f514253f;
        if (oVar == null) {
            fVar.e(jVar, (int) (this.f514254g + 0.5f));
        } else {
            fVar.d(jVar, fVar.j(oVar.f514250c), (int) (this.f514254g + 0.5f), 6);
        }
    }

    public void g(int i17, v2.o oVar, int i18) {
        this.f514255h = i17;
        this.f514251d = oVar;
        this.f514252e = i18;
        oVar.a(this);
    }

    public void h(v2.o oVar, int i17) {
        this.f514251d = oVar;
        this.f514252e = i17;
        oVar.a(this);
    }

    public void i(v2.o oVar, int i17, v2.p pVar) {
        this.f514251d = oVar;
        oVar.a(this);
        this.f514257j = pVar;
        this.f514258k = i17;
        pVar.a(this);
    }

    public void j() {
        this.f514262b = 0;
        this.f514261a.clear();
        this.f514251d = null;
        this.f514252e = 0.0f;
        this.f514257j = null;
        this.f514258k = 1;
        this.f514259l = null;
        this.f514253f = null;
        this.f514254g = 0.0f;
        this.f514256i = null;
        this.f514255h = 0;
    }

    public void k(v2.o oVar, float f17) {
        int i17 = this.f514262b;
        if (i17 == 0 || !(this.f514253f == oVar || this.f514254g == f17)) {
            this.f514253f = oVar;
            this.f514254g = f17;
            if (i17 == 1) {
                c();
            }
            b();
        }
    }

    public java.lang.String l(int i17) {
        return i17 == 1 ? "DIRECT" : i17 == 2 ? "CENTER" : i17 == 3 ? "MATCH" : i17 == 4 ? "CHAIN" : i17 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: toString */
    public java.lang.String m170993x9616526c() {
        int i17 = this.f514262b;
        v2.g gVar = this.f514250c;
        if (i17 != 1) {
            return "{ " + gVar + " UNRESOLVED} type: " + l(this.f514255h);
        }
        if (this.f514253f == this) {
            return "[" + gVar + ", RESOLVED: " + this.f514254g + "]  type: " + l(this.f514255h);
        }
        return "[" + gVar + ", RESOLVED: " + this.f514253f + ":" + this.f514254g + "] type: " + l(this.f514255h);
    }
}
