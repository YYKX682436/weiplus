package pe2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh2.i f435152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.i30 f435153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435154g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pe2.h f435155h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435156i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mm2.j0 f435157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wh2.i iVar, r45.i30 i30Var, java.lang.String str, pe2.h hVar, java.lang.String str2, mm2.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435152e = iVar;
        this.f435153f = i30Var;
        this.f435154g = str;
        this.f435155h = hVar;
        this.f435156i = str2;
        this.f435157m = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe2.f(this.f435152e, this.f435153f, this.f435154g, this.f435155h, this.f435156i, this.f435157m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pe2.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f435151d;
        mm2.j0 j0Var = this.f435157m;
        pe2.h hVar2 = this.f435155h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            wh2.i iVar = this.f435152e;
            if (iVar instanceof wh2.h) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f435153f.m75945x2fec8307(1), this.f435154g)) {
                    hVar2.f435163p.m82584xebcf33cb(1);
                    boolean a17 = ae2.in.f85221a.a(ym5.f6.Y1);
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = hVar2.f435163p;
                    java.lang.String str = this.f435156i;
                    if (a17) {
                        com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(str);
                        m77391x243906.m77412xae5a7879(1);
                        hVar = hVar2;
                        double d17 = 1000;
                        long m75942xfb822ef2 = (long) (r7.m75942xfb822ef2(2) * j0Var.f410686c * d17 * d17);
                        m77391x243906.m77410xffd6ec16(m75942xfb822ef2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation playing data.speed: " + j0Var.f410686c + " duration: " + m75942xfb822ef2);
                        c22789xd23e9a9b.mo82566x3e3ac3e8(m77391x243906);
                    } else {
                        hVar = hVar2;
                        org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str);
                        m154716x243906.m154738xae5a7879(1);
                        double m75942xfb822ef22 = r7.m75942xfb822ef2(2) * j0Var.f410686c;
                        double d18 = 1000;
                        long j17 = (long) (m75942xfb822ef22 * d18 * d18);
                        m154716x243906.m154737xffd6ec16(j17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation playing data.speed: " + j0Var.f410686c + " duration: " + j17);
                        c22789xd23e9a9b.mo82568x3e3ac3e8(m154716x243906);
                    }
                    c22789xd23e9a9b.m82583xcde73672(-1);
                    c22789xd23e9a9b.g();
                    hVar2 = hVar;
                    boolean z17 = c22789xd23e9a9b.getVisibility() == 8;
                    hVar2.K0(0);
                    c22789xd23e9a9b.setVisibility(0);
                    if (((mm2.w) hVar2.P0(mm2.w.class)).O6()) {
                        c22789xd23e9a9b.setAlpha(0.0f);
                    } else if (z17) {
                        c22789xd23e9a9b.setAlpha(0.0f);
                        c22789xd23e9a9b.animate().alpha(1.0f).setDuration(1000L).setListener(null).start();
                    } else {
                        c22789xd23e9a9b.setAlpha(1.0f);
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 1);
                    jSONObject.put("fluorescent_sea_id", j0Var.f410687d);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "reportExpose json: " + jSONObject);
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0.hj((ml2.r0) c17, ml2.b4.G1, t17, 0L, null, null, null, null, null, 252, null);
                    if (!zl2.r4.f555483a.w1()) {
                        mm2.l0 l0Var = (mm2.l0) hVar2.P0(mm2.l0.class);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCheerAnimationSlice", "notifyCheerBtnAnimationShow");
                        l0Var.f410745n.mo7808x76db6cb1(l0Var.f410743i.mo3195x754a37bb());
                        return jz5.f0.f384359a;
                    }
                    ((mm2.l0) hVar2.P0(mm2.l0.class)).f410747p.mo7808x76db6cb1(new mm2.j0(j0Var.f410684a, true, j0Var.f410686c, j0Var.f410687d));
                    long m75942xfb822ef23 = j0Var.f410684a.m75942xfb822ef2(7) * 1000;
                    this.f435151d = 1;
                    if (p3325xe03a0797.p3326xc267989b.k1.b(m75942xfb822ef23, this) == aVar) {
                        return aVar;
                    }
                }
            }
            j0Var.f410685b = false;
            hVar2.t1(true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCheerAnimation load pag error, errCode:");
            wh2.g gVar = iVar instanceof wh2.g ? (wh2.g) iVar : null;
            sb6.append(gVar != null ? new java.lang.Integer(gVar.f527484a) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveCheerAnimationPlugin", sb6.toString());
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((mm2.l0) hVar2.P0(mm2.l0.class)).f410747p.mo7808x76db6cb1(new mm2.j0(j0Var.f410684a, false, j0Var.f410686c, j0Var.f410687d));
        hVar2.t1(true);
        return jz5.f0.f384359a;
    }
}
