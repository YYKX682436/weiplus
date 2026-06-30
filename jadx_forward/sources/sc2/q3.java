package sc2;

/* loaded from: classes2.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f487696d;

    /* renamed from: e, reason: collision with root package name */
    public int f487697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.u3 f487698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f487699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f487700h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f487701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(sc2.u3 u3Var, int i17, r45.wf6 wf6Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487698f = u3Var;
        this.f487699g = i17;
        this.f487700h = wf6Var;
        this.f487701i = c22789xd23e9a9b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sc2.q3(this.f487698f, this.f487699g, this.f487700h, this.f487701i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.q3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object h17;
        java.lang.String str3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f487697e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i18 = this.f487699g;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f487701i;
        sc2.u3 u3Var = this.f487698f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Object a07 = kz5.n0.a0(u3Var.B, i18);
            r45.wf6 wf6Var = this.f487700h;
            r45.v35 v35Var = (r45.v35) wf6Var.m75936x14adae67(44);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a07, v35Var != null ? v35Var.m75945x2fec8307(0) : null) || i18 > u3Var.B.size()) {
                java.lang.String str4 = u3Var.f487812w;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("index ");
                sb6.append(i18);
                sb6.append(' ');
                r45.v35 v35Var2 = (r45.v35) wf6Var.m75936x14adae67(44);
                sb6.append(v35Var2 != null ? v35Var2.m75945x2fec8307(0) : null);
                sb6.append(" has loading finish or null");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb6.toString());
                return f0Var;
            }
            java.util.List list = u3Var.B;
            r45.v35 v35Var3 = (r45.v35) wf6Var.m75936x14adae67(44);
            if (v35Var3 == null || (str = v35Var3.m75945x2fec8307(0)) == null) {
                str = "";
            }
            list.set(i18, str);
            r45.v35 v35Var4 = (r45.v35) wf6Var.m75936x14adae67(44);
            if (v35Var4 == null || (str2 = v35Var4.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            if (c22789xd23e9a9b.getUseRfx()) {
                rj.j a17 = nn2.d.f420204a.a();
                java.lang.String str5 = u3Var.f487812w;
                this.f487696d = str2;
                this.f487697e = 1;
                h17 = ((b51.m) a17).j(str2, str5, this);
                if (h17 == aVar) {
                    return aVar;
                }
            } else {
                rj.j a18 = nn2.d.f420204a.a();
                java.lang.String str6 = u3Var.f487812w;
                this.f487696d = str2;
                this.f487697e = 2;
                h17 = ((b51.m) a18).h(str2, str6, this);
                if (h17 == aVar) {
                    return aVar;
                }
            }
            str3 = str2;
            obj = h17;
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) this.f487696d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u3Var.f487812w, str3 + " loading finish. " + obj);
        if (obj != null) {
            if (c22789xd23e9a9b.getUseRfx()) {
                c22789xd23e9a9b.mo82566x3e3ac3e8(obj instanceof com.p314xaae8f345.mm.rfx.C20942x379cf5ee ? (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj : null);
            } else {
                c22789xd23e9a9b.mo82568x3e3ac3e8(obj instanceof org.p3363xbe4143f1.C29690xfae77312 ? (org.p3363xbe4143f1.C29690xfae77312) obj : null);
            }
            if (c22789xd23e9a9b.c() / 1000 != 0) {
                c22789xd23e9a9b.m82582x3ae760af(u3Var.f487815z / r0);
                u3Var.D.set(i18, new java.lang.Double(c22789xd23e9a9b.m82577x402effa3()));
                c22789xd23e9a9b.d();
            }
        }
        return f0Var;
    }
}
