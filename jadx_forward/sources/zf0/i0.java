package zf0;

/* loaded from: classes12.dex */
public final class i0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f553978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.d0 f553980f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zf0.v0 v0Var, qi3.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f553979e = v0Var;
        this.f553980f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.i0(this.f553979e, this.f553980f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zf0.i0) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Long l17;
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f553978d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        qi3.d0 d0Var = this.f553980f;
        zf0.v0 v0Var = this.f553979e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oi3.h hVar = v0Var.f554096i.f517711e;
            if (hVar == null) {
                d0Var.f445216a = -520009;
                return f0Var;
            }
            java.lang.Integer e17 = qi3.c.e(v0Var, false, 1, null);
            if (e17 != null) {
                d0Var.f445216a = e17.intValue();
                return f0Var;
            }
            t21.v2 e18 = vf0.m3.e(hVar);
            if (e18 == null) {
                d0Var.f445216a = -520009;
                return f0Var;
            }
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, e18.d(), false));
            r45.lr lrVar = new r45.lr();
            y15.c n17 = v0Var.f554096i.f517712f.n();
            java.lang.String m75945x2fec8307 = n17.m75945x2fec8307(n17.f540455d + 0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            lrVar.f461298d = m75945x2fec8307;
            vf0.h3 h3Var = v0Var.f554096i;
            y15.c n18 = h3Var.f517712f.n();
            java.lang.String m75945x2fec83072 = n18.m75945x2fec8307(n18.f540455d + 1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            lrVar.f461299e = m75945x2fec83072;
            lrVar.f461300f = 43;
            y15.c n19 = h3Var.f517712f.n();
            lrVar.f461301g = n19.m75939xb282bd08(n19.f540455d + 8);
            y15.c n27 = h3Var.f517712f.n();
            lrVar.f461302h = n27.m75939xb282bd08(n27.f540455d + 10);
            y15.c n28 = h3Var.f517712f.n();
            java.lang.String m75945x2fec83073 = n28.m75945x2fec8307(n28.f540455d + 0);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            lrVar.f461303i = m75945x2fec83073;
            y15.c n29 = h3Var.f517712f.n();
            java.lang.String m75945x2fec83074 = n29.m75945x2fec8307(n29.f540455d + 3);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            lrVar.f461304m = m75945x2fec83074;
            y15.c n37 = h3Var.f517712f.n();
            lrVar.f461305n = n37.m75939xb282bd08(n37.f540455d + 11);
            lrVar.f461306o = n07 != null ? n07.outWidth : 0;
            lrVar.f461307p = n07 != null ? n07.outHeight : 0;
            y15.c n38 = h3Var.f517712f.n();
            java.lang.String m75945x2fec83075 = n38.m75945x2fec8307(n38.f540455d + 18);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            lrVar.f461308q = m75945x2fec83075;
            y15.c n39 = h3Var.f517712f.n();
            java.lang.String m75945x2fec83076 = n39.m75945x2fec8307(n39.f540455d + 19);
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            lrVar.f461310s = m75945x2fec83076;
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            vf0.h3 h3Var2 = v0Var.f554096i;
            java.lang.String str2 = h3Var2.f517707a;
            oi3.h hVar2 = h3Var2.f517711e;
            java.lang.String a17 = c01.ia.a(hVar2 != null ? hVar2.m75945x2fec8307(hVar2.f427150d + 12) : null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(v0Var.f554096i.f517707a);
            oi3.h hVar3 = v0Var.f554096i.f517711e;
            if (hVar3 != null) {
                str = str2;
                l17 = new java.lang.Long(hVar3.m75942xfb822ef2(hVar3.f427150d + 0));
            } else {
                str = str2;
                l17 = null;
            }
            sb6.append(l17);
            sb6.append('T');
            oi3.h hVar4 = v0Var.f554096i.f517711e;
            sb6.append(hVar4 != null ? new java.lang.Long(hVar4.m75942xfb822ef2(hVar4.f427150d + 2)) : null);
            com.p314xaae8f345.mm.p944x882e457a.i b18 = qi3.m.f445280a.a(new qi3.n(r17, str, str, 0, a17, sb6.toString(), e18.d(), 8, null), 43, new qi3.i(lrVar)).b();
            this.f553978d = 1;
            b17 = rm0.h.b(b18, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        d0Var.f445218c = fVar.f152148a;
        d0Var.f445219d = fVar.f152149b;
        java.lang.String str3 = fVar.f152150c;
        java.lang.String str4 = str3 != null ? str3 : "";
        d0Var.getClass();
        d0Var.f445220e = str4;
        d0Var.f445222g = (r45.ny3) fVar.f152151d;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = fVar.f152152e;
        d0Var.f445221f = m1Var != null ? m1Var.mo808xfb85f7b0() : 0;
        if (!fVar.b()) {
            d0Var.f445216a = -520004;
            d0Var.f445217b.put("send_cgi_err_type", new java.lang.Integer(fVar.f152148a));
            d0Var.f445217b.put("send_cgi_err_code", new java.lang.Integer(fVar.f152149b));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " sendBypCgi err " + fVar);
        }
        return f0Var;
    }
}
