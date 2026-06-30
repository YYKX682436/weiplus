package zy2;

/* loaded from: classes4.dex */
public final class e extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.mv2 f558905b = new r45.mv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.e eVar = new zy2.e();
        eVar.f558905b = this.f558905b;
        return eVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        int b17 = zy2.d5.b(qVar != null ? qVar.G2 : null, qVar != null ? qVar.D2 : 0);
        if (b17 == 3) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            sb6.append(zy2.d5.a(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209166c4).mo141623x754a37bb()).r()).intValue(), zy2.d5.h(this.f558905b)));
        } else if (b17 == 4) {
            sb6.append(zy2.d5.a(4, zy2.d5.h(this.f558905b)));
        } else if (b17 == 5) {
            sb6.append(zy2.d5.a(5, zy2.d5.h(this.f558905b)));
        } else {
            if (b17 != 6) {
                return;
            }
            sb6.append(zy2.d5.a(6, zy2.d5.h(this.f558905b)));
        }
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f558905b = zy2.d5.o(".msg.appmsg.finder.detail", values);
    }

    public final r45.mv2 f() {
        return this.f558905b;
    }
}
