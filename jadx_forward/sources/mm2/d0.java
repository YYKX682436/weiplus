package mm2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f410482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f410483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, mm2.e0 e0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410481e = str;
        this.f410482f = e0Var;
        this.f410483g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.d0(this.f410481e, this.f410482f, this.f410483g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        lm2.j0 c17;
        r45.qn qnVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410480d;
        mm2.e0 e0Var = this.f410482f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveBoxSlice prepareBox, groupId:");
            java.lang.String str = this.f410481e;
            sb6.append(str);
            java.lang.String str2 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "str");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str2));
            lm2.h0 h0Var = e0Var.f410509s;
            if (h0Var != null) {
                this.f410480d = 1;
                if (h0Var.f(str, this.f410483g, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        lm2.h0 h0Var2 = e0Var.f410509s;
        if (h0Var2 == null || (c17 = h0Var2.c()) == null || (qnVar = c17.f400944d) == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a;
        o0Var.c("Finder.LiveBoxSlice", "LiveBoxSlice startPollingRedDot, boxContext:" + o0Var.b(qnVar));
        lm2.h0 h0Var3 = e0Var.f410509s;
        if (h0Var3 == null) {
            return null;
        }
        r45.qt2 qt2Var = e0Var.f410510t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "startPollingRedDot");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "stopPollingRedDot");
        km2.m0 m0Var = h0Var3.f400934h;
        if (m0Var != null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = m0Var.f390679d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            m0Var.f390679d = null;
        }
        km2.m0 m0Var2 = new km2.m0(new lm2.x(h0Var3, qnVar, qt2Var), p3325xe03a0797.p3326xc267989b.q1.f392103c, 1000L);
        h0Var3.f400934h = m0Var2;
        m0Var2.f390679d = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(m0Var2.f390677b), null, null, new km2.l0(m0Var2, null), 3, null);
        return jz5.f0.f384359a;
    }
}
