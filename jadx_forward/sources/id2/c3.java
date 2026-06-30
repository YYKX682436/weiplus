package id2;

/* loaded from: classes3.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f372042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f372045h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f372046i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372047m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, az2.f fVar, id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372041d = hVar;
        this.f372042e = fVar;
        this.f372043f = u3Var;
        this.f372044g = context;
        this.f372045h = j17;
        this.f372046i = j18;
        this.f372047m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.c3(this.f372041d, interfaceC29045xdcb5ca57, this.f372042e, this.f372043f, this.f372044g, this.f372045h, this.f372046i, this.f372047m);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.c3 c3Var = (id2.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        long j17;
        java.lang.String m75945x2fec8307;
        r45.o52 o52Var;
        r45.i72 i72Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f372041d).f535926b;
        this.f372042e.b();
        if (((r45.nw1) l71Var.m75936x14adae67(1)) != null) {
            id2.u3 u3Var = this.f372043f;
            u3Var.getClass();
            int e17 = c01.id.e();
            r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
            int m75939xb282bd08 = nw1Var != null ? nw1Var.m75939xb282bd08(6) : 0;
            if (m75939xb282bd08 == 0) {
                m75939xb282bd08 = e17;
            }
            r45.nw1 nw1Var2 = (r45.nw1) l71Var.m75936x14adae67(1);
            int m75939xb282bd082 = nw1Var2 != null ? nw1Var2.m75939xb282bd08(4) : 0;
            if (m75939xb282bd082 != 0) {
                e17 = m75939xb282bd082;
            }
            int i17 = m75939xb282bd08 - e17;
            r45.nw1 nw1Var3 = (r45.nw1) l71Var.m75936x14adae67(1);
            int m75939xb282bd083 = nw1Var3 != null ? nw1Var3.m75939xb282bd08(1) : 0;
            r45.nw1 nw1Var4 = (r45.nw1) l71Var.m75936x14adae67(1);
            long m75942xfb822ef2 = nw1Var4 != null ? nw1Var4.m75942xfb822ef2(19) : 0L;
            int m75939xb282bd084 = l71Var.m75939xb282bd08(2);
            long F0 = zl2.r4.f555483a.F0((r45.nw1) l71Var.m75936x14adae67(1));
            r45.nw1 nw1Var5 = (r45.nw1) l71Var.m75936x14adae67(1);
            int m75939xb282bd085 = nw1Var5 != null ? nw1Var5.m75939xb282bd08(36) : 0;
            r45.nw1 nw1Var6 = (r45.nw1) l71Var.m75936x14adae67(1);
            int m75939xb282bd086 = nw1Var6 != null ? nw1Var6.m75939xb282bd08(35) : 0;
            r45.nw1 nw1Var7 = (r45.nw1) l71Var.m75936x14adae67(1);
            long m75942xfb822ef22 = nw1Var7 != null ? nw1Var7.m75942xfb822ef2(50) : 0L;
            int m75939xb282bd087 = l71Var.m75939xb282bd08(5);
            r45.nw1 nw1Var8 = (r45.nw1) l71Var.m75936x14adae67(1);
            long m75942xfb822ef23 = nw1Var8 != null ? nw1Var8.m75942xfb822ef2(62) : 0L;
            r45.nw1 nw1Var9 = (r45.nw1) l71Var.m75936x14adae67(1);
            long m75942xfb822ef24 = nw1Var9 != null ? nw1Var9.m75942xfb822ef2(63) : 0L;
            r45.nw1 nw1Var10 = (r45.nw1) l71Var.m75936x14adae67(1);
            if (nw1Var10 != null) {
                j17 = nw1Var10.m75942xfb822ef2(32);
                str = "FinderLivePersonalCente";
            } else {
                str = "FinderLivePersonalCente";
                j17 = 0;
            }
            boolean A = pm0.v.A(j17, 16L);
            r45.nw1 nw1Var11 = (r45.nw1) l71Var.m75936x14adae67(1);
            long m75942xfb822ef25 = nw1Var11 != null ? nw1Var11.m75942xfb822ef2(65) : 0L;
            r45.nw1 nw1Var12 = (r45.nw1) l71Var.m75936x14adae67(1);
            long m75942xfb822ef26 = nw1Var12 != null ? nw1Var12.m75942xfb822ef2(64) : 0L;
            java.util.LinkedList m75941xfb821914 = l71Var.m75941xfb821914(7);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) l71Var.m75936x14adae67(12);
            int m75939xb282bd088 = l71Var.m75939xb282bd08(14);
            r45.nw1 nw1Var13 = (r45.nw1) l71Var.m75936x14adae67(1);
            int m75939xb282bd089 = (nw1Var13 == null || (i72Var = (r45.i72) nw1Var13.m75936x14adae67(44)) == null) ? 0 : i72Var.m75939xb282bd08(3);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) l71Var.m75936x14adae67(16);
            r45.nw1 nw1Var14 = (r45.nw1) l71Var.m75936x14adae67(1);
            r45.sl1 sl1Var = (r45.sl1) l71Var.m75936x14adae67(36);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
            java.lang.String str2 = str;
            km2.b bVar = new km2.b(i17, m75939xb282bd083, m75942xfb822ef2, m75939xb282bd084, F0, m75939xb282bd086, m75939xb282bd085, m75942xfb822ef22, m75939xb282bd087, m75942xfb822ef23, m75942xfb822ef24, A, m75942xfb822ef25, m75942xfb822ef26, m75941xfb821914, m75939xb282bd088, c19786x6a1e2862, m75939xb282bd089, c19786x6a1e28622, nw1Var14, sl1Var, l71Var, null, 4194304, null);
            r45.d84 d84Var = (r45.d84) l71Var.m75936x14adae67(9);
            java.lang.String m75945x2fec83072 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            r45.d84 d84Var2 = (r45.d84) l71Var.m75936x14adae67(9);
            boolean z17 = true;
            java.lang.String m75945x2fec83073 = d84Var2 != null ? d84Var2.m75945x2fec8307(1) : null;
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            java.lang.String concat = m75945x2fec83072.concat(m75945x2fec83073);
            android.content.Context context = this.f372044g;
            long j18 = this.f372045h;
            long j19 = this.f372046i;
            yz5.l lVar = this.f372047m;
            u3Var.getClass();
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class);
            r45.nw1 nw1Var15 = bVar.f390603t;
            boolean aj6 = v4Var.aj(nw1Var15 != null ? nw1Var15.m75939xb282bd08(37) : 0);
            int i18 = qs5.g.f447965a;
            r45.nw1 nw1Var16 = bVar.f390603t;
            int m75939xb282bd0810 = (nw1Var16 == null || (o52Var = (r45.o52) nw1Var16.m75936x14adae67(28)) == null) ? 0 : o52Var.m75939xb282bd08(0);
            boolean z18 = m75939xb282bd0810 == 2 || m75939xb282bd0810 == 8 || m75939xb282bd0810 == 16;
            r45.nw1 nw1Var17 = bVar.f390603t;
            boolean z19 = ((nw1Var17 != null ? nw1Var17.m75939xb282bd08(37) : 0) & 1048576) > 0;
            boolean z27 = z18 || !aj6;
            if (!z27) {
                r45.sl1 sl1Var2 = bVar.f390604u;
                if ((sl1Var2 != null ? sl1Var2.m75939xb282bd08(0) : 0) != 0) {
                    if ((sl1Var2 != null ? sl1Var2.m75939xb282bd08(1) : 0) != 0) {
                        z17 = false;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showGenReplayPanel cantShowDanmuEntrance: " + z27 + "，cantShowHighLightLayout: " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pu puVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pu(context, v65.m.b(u3Var.m158354x19263085()), false, null, 12, null);
            puVar.f200964m = z27;
            puVar.f200963i = z17;
            r45.l71 l71Var2 = bVar.f390605v;
            if (l71Var2 == null || (m75945x2fec8307 = l71Var2.m75945x2fec8307(34)) == null) {
                r45.pf2 pf2Var = bVar.f390606w;
                m75945x2fec8307 = pf2Var != null ? pf2Var.m75945x2fec8307(12) : null;
            }
            puVar.f200965n = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            u3Var.f372356h = puVar;
            puVar.f200966o = new id2.p3(u3Var, context, j18, j19, bVar, lVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "replayGenWidget show");
            java.lang.String string = z19 ? u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3q) : z18 ? u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3p) : u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pu puVar2 = u3Var.f372356h;
            if (puVar2 != null) {
                puVar2.z(concat, string);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePersonalCente", "get live info success, but liveInfo is null");
        }
        return jz5.f0.f384359a;
    }
}
