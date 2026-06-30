package nu0;

/* loaded from: classes5.dex */
public final class w0 extends hw0.z {

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f421659w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f421659w = jz5.h.b(new nu0.v0(this));
    }

    @Override // hw0.z
    public du0.o A7() {
        return (du0.o) T6(nu0.b1.class);
    }

    @Override // hw0.z
    public gx0.hf B7() {
        return (gx0.hf) T6(nu0.i4.class);
    }

    @Override // hw0.z
    public java.lang.Object D7(java.lang.String text, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        bu0.a aVar = (bu0.a) ((java.util.LinkedHashMap) H7().f421607q).get(c3971x241f78.m32425x6ac9171());
        mu0.a aVar2 = aVar instanceof mu0.a ? (mu0.a) aVar : null;
        if (aVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            aVar2.f412866a.g(text);
        }
        nu0.q0.Y6(H7(), false, null, 3, null);
        return jz5.f0.f384359a;
    }

    public final nu0.q0 H7() {
        return (nu0.q0) ((jz5.n) this.f421659w).mo141623x754a37bb();
    }

    @Override // hw0.z
    public void s7() {
        nu0.q0.Y6(H7(), false, null, 3, null);
    }

    @Override // hw0.z
    public void t7() {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 c4058x7a492233;
        bu0.a u76 = u7();
        mu0.a aVar = u76 instanceof mu0.a ? (mu0.a) u76 : null;
        if (aVar == null || (c4058x7a492233 = aVar.f412866a) == null) {
            return;
        }
        java.lang.String m33059x7531c8a2 = c4058x7a492233.m33059x7531c8a2();
        boolean z17 = true;
        if (m33059x7531c8a2 == null || m33059x7531c8a2.length() == 0) {
            java.lang.String m33056x109898e = c4058x7a492233.m33056x109898e();
            if (m33056x109898e != null && m33056x109898e.length() != 0) {
                z17 = false;
            }
            if (z17) {
                nu0.q0 H7 = H7();
                java.lang.String m33049x3b4d09f6 = c4058x7a492233.m33049x3b4d09f6();
                if (m33049x3b4d09f6 == null) {
                    H7.getClass();
                    return;
                }
                H7.f7(m33049x3b4d09f6);
                nu0.q0.Y6(H7, false, null, 3, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(H7.f421607q).remove(m33049x3b4d09f6);
            }
        }
    }

    @Override // hw0.z
    public bu0.a u7() {
        nu0.q0 H7 = H7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367031u;
        return (bu0.a) ((java.util.LinkedHashMap) H7.f421607q).get(c3971x241f78 != null ? c3971x241f78.m32425x6ac9171() : null);
    }

    @Override // hw0.z
    public void w7() {
        hw0.p pVar = (hw0.p) this.f150773i;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = pVar != null ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(pVar, "key_mj_id", null, 2, null) : null;
        if (c3971x241f78 == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b76 = H7().b7(c3971x241f78.m32425x6ac9171());
        if (b76 == null) {
            super.w7();
            return;
        }
        this.f367031u = c3971x241f78;
        java.lang.String m33059x7531c8a2 = b76.m33059x7531c8a2();
        if (m33059x7531c8a2 == null) {
            m33059x7531c8a2 = "";
        }
        this.f367032v = m33059x7531c8a2;
        q7(m33059x7531c8a2);
        G7();
        hw0.p pVar2 = (hw0.p) this.f150773i;
        if (pVar2 != null) {
            pVar2.m47107x79e29ffe(new hw0.v(this, c3971x241f78));
        }
    }

    @Override // hw0.z
    public ow0.a0 y7() {
        return (ow0.a0) T6(nu0.s.class);
    }

    @Override // hw0.z
    public gx0.w z7() {
        return (gx0.w) T6(nu0.u0.class);
    }
}
