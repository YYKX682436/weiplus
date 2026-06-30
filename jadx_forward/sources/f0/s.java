package f0;

/* loaded from: classes5.dex */
public final class s implements f0.q {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f339759a;

    public s(n0.e5 itemsSnapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemsSnapshot, "itemsSnapshot");
        this.f339759a = itemsSnapshot;
    }

    @Override // p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l
    public java.lang.Object a(int i17) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b17 = ((f0.b0) this.f339759a.mo128745x754a37bb()).b(i17);
        return ((f0.j) b17.f91929c).f339654c.mo146xb9724478(java.lang.Integer.valueOf(i17 - b17.f91927a));
    }

    @Override // p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l
    public java.util.Map b() {
        return ((f0.b0) this.f339759a.mo128745x754a37bb()).f339543d;
    }

    @Override // p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l
    public java.lang.Object c(int i17) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b17 = ((f0.b0) this.f339759a.mo128745x754a37bb()).b(i17);
        int i18 = i17 - b17.f91927a;
        yz5.l lVar = ((f0.j) b17.f91929c).f339652a;
        java.lang.Object mo146xb9724478 = lVar != null ? lVar.mo146xb9724478(java.lang.Integer.valueOf(i18)) : null;
        return mo146xb9724478 == null ? p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.a0.a(i17) : mo146xb9724478;
    }

    @Override // p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l
    public void d(int i17, n0.o oVar, int i18) {
        int i19;
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1959480708);
        if ((i18 & 14) == 0) {
            i19 = (y0Var.c(i17) ? 4 : 2) | i18;
        } else {
            i19 = i18;
        }
        if ((i18 & 112) == 0) {
            i19 |= y0Var.e(this) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            ((f0.b0) this.f339759a.mo128745x754a37bb()).a(i17, y0Var, (i19 & 14) | 64);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new f0.r(this, i17, i18);
    }

    @Override // p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l
    public int e() {
        return ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) ((f0.b0) this.f339759a.mo128745x754a37bb()).f339540a).f91926c;
    }
}
