package df2;

/* loaded from: classes3.dex */
public final class d8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311480d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311481e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311482f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f311483g;

    /* renamed from: h, reason: collision with root package name */
    public int f311484h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f311485i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f311486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f311487n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(r45.d42 d42Var, r45.ch1 ch1Var, df2.s8 s8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311485i = d42Var;
        this.f311486m = ch1Var;
        this.f311487n = s8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.d8(this.f311485i, this.f311486m, this.f311487n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.d8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        java.lang.Object c17;
        ug2.a aVar;
        java.lang.String str;
        java.lang.Object d17;
        ug2.a aVar2;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2;
        r45.q53 q53Var;
        java.lang.Object Lc;
        df2.s8 s8Var;
        ug2.a aVar3;
        r45.q53 q53Var2;
        pz5.a aVar4 = pz5.a.f440719d;
        int i17 = this.f311484h;
        r45.d42 d42Var = this.f311485i;
        df2.s8 s8Var2 = this.f311487n;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            am2.p.f90258c.a(d42Var);
            ug2.a aVar5 = new ug2.a(this.f311486m);
            java.lang.String str2 = (!s8Var2.U6() ? (m75945x2fec8307 = d42Var.m75945x2fec8307(0)) == null : (m75945x2fec8307 = d42Var.m75945x2fec8307(4)) == null) ? m75945x2fec8307 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var2.f312832m, "[onStatusFundingSuc] start download url:" + str2 + ", isLandscape:" + s8Var2.U6());
            boolean a17 = ae2.in.f85221a.a(ym5.f6.D1);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b3.o(a17);
            if (a17) {
                rj.j c18 = nn2.d.f420204a.c();
                this.f311480d = aVar5;
                this.f311481e = str2;
                this.f311482f = c22789xd23e9a9b3;
                this.f311484h = 1;
                c22789xd23e9a9b = c22789xd23e9a9b3;
                d17 = rj.j.d(c18, str2, null, this, 2, null);
                if (d17 == aVar4) {
                    return aVar4;
                }
                aVar = aVar5;
                str = str2;
                c22789xd23e9a9b.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) d17);
            } else {
                c22789xd23e9a9b = c22789xd23e9a9b3;
                rj.j c19 = nn2.d.f420204a.c();
                this.f311480d = aVar5;
                this.f311481e = str2;
                this.f311482f = c22789xd23e9a9b;
                this.f311484h = 2;
                c17 = rj.j.c(c19, str2, null, this, 2, null);
                if (c17 == aVar4) {
                    return aVar4;
                }
                aVar = aVar5;
                str = str2;
                c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) c17);
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311482f;
            str = (java.lang.String) this.f311481e;
            aVar = (ug2.a) this.f311480d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c22789xd23e9a9b = c22789xd23e9a9b4;
            d17 = obj;
            c22789xd23e9a9b.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) d17);
        } else {
            if (i17 != 2) {
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r45.q53 q53Var3 = (r45.q53) this.f311483g;
                df2.s8 s8Var3 = (df2.s8) this.f311482f;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311481e;
                aVar3 = (ug2.a) this.f311480d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c22789xd23e9a9b2 = c22789xd23e9a9b5;
                s8Var = s8Var3;
                q53Var2 = q53Var3;
                Lc = obj;
                jz5.o oVar = (jz5.o) Lc;
                boolean booleanValue = ((java.lang.Boolean) oVar.f384374d).booleanValue();
                java.lang.String str3 = (java.lang.String) oVar.f384375e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "music url:" + q53Var2.m75945x2fec8307(0) + ", succ:" + booleanValue + ", path:" + str3);
                aVar2 = aVar3;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) s8Var2.m56788xbba4bfc0(mm2.c1.class)).f410339g).b(aVar2);
                s8Var2.f312831l1 = c22789xd23e9a9b2.c();
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b6 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311482f;
            str = (java.lang.String) this.f311481e;
            aVar = (ug2.a) this.f311480d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c22789xd23e9a9b = c22789xd23e9a9b6;
            c17 = obj;
            c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) c17);
        }
        aVar2 = aVar;
        c22789xd23e9a9b2 = c22789xd23e9a9b;
        aVar2.f509045b = new java.lang.Long(c22789xd23e9a9b2.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var2.f312832m, "[onStatusFundingSuc] get duration suc, url = " + str + ", duration = " + aVar2.f509045b);
        r45.a8 a8Var = s8Var2.U6() ? (r45.a8) d42Var.m75936x14adae67(7) : (r45.a8) d42Var.m75936x14adae67(6);
        if (a8Var == null || (q53Var = (r45.q53) a8Var.m75936x14adae67(0)) == null) {
            aVar2 = aVar2;
        } else {
            java.lang.String m75945x2fec83072 = q53Var.m75945x2fec8307(0);
            if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                i95.m c27 = i95.n0.c(zy.u.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                zy.w p37 = zy.u.p3((zy.u) c27, null, 1, null);
                java.lang.String m75945x2fec83073 = q53Var.m75945x2fec8307(0);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                this.f311480d = aVar2;
                this.f311481e = c22789xd23e9a9b2;
                this.f311482f = s8Var2;
                this.f311483g = q53Var;
                this.f311484h = 3;
                Lc = zy.w.Lc(p37, m75945x2fec83073, false, null, 0, 0, null, null, this, 126, null);
                if (Lc == aVar4) {
                    return aVar4;
                }
                s8Var = s8Var2;
                aVar3 = aVar2;
                q53Var2 = q53Var;
                jz5.o oVar2 = (jz5.o) Lc;
                boolean booleanValue2 = ((java.lang.Boolean) oVar2.f384374d).booleanValue();
                java.lang.String str32 = (java.lang.String) oVar2.f384375e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "music url:" + q53Var2.m75945x2fec8307(0) + ", succ:" + booleanValue2 + ", path:" + str32);
                aVar2 = aVar3;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) s8Var2.m56788xbba4bfc0(mm2.c1.class)).f410339g).b(aVar2);
        s8Var2.f312831l1 = c22789xd23e9a9b2.c();
        return jz5.f0.f384359a;
    }
}
