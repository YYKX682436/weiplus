package df2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312351d;

    /* renamed from: e, reason: collision with root package name */
    public int f312352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.o f312353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(df2.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312353f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.n(this.f312353f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312352e;
        df2.o oVar = this.f312353f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            r45.hx0 f17 = ek2.r1.f335057u.f(true);
            f0Var2.f391649d = f17.m75939xb282bd08(0);
            this.f312351d = f0Var2;
            this.f312352e = 1;
            oVar.getClass();
            ek2.r1 r1Var = new ek2.r1(((mm2.e1) oVar.getStore().m56796xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) oVar.getStore().m56796xbba4bfc0(mm2.e1.class)).f410516m, 23, f17);
            az2.j.u(r1Var, oVar.O6(), null, 0L, 6, null);
            b17 = rm0.h.b(r1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.f0) this.f312351d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        r45.m02 m02Var = (r45.m02) fVar.f152151d;
        java.lang.Integer num = null;
        if (m02Var != null && (m75941xfb821914 = m02Var.m75941xfb821914(1)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.ix0) obj2).m75939xb282bd08(0) == f0Var.f391649d) {
                    break;
                }
            }
            r45.ix0 ix0Var = (r45.ix0) obj2;
            if (ix0Var != null) {
                num = new java.lang.Integer(ix0Var.m75939xb282bd08(1));
            }
        }
        if (fVar.b() && num != null && num.intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f312432p, "do cgi success, retCmdId = " + f0Var.f391649d);
            oVar.o7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f312432p, "do cgi failed, errCode =" + fVar.f152149b + ", errMsg =" + fVar.f152150c + ", retCmdId = " + f0Var.f391649d);
            android.content.Context O6 = oVar.O6();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
            e4Var.f293309c = oVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwg);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
