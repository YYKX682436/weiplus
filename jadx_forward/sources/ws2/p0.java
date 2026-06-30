package ws2;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 f530650a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f530651b;

    /* renamed from: c, reason: collision with root package name */
    public gk2.e f530652c;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f530650a = layout;
        this.f530651b = "FinderLiveReplayPluginLayoutHelper";
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ws2.p0 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.p0.a(ws2.p0, boolean, boolean):void");
    }

    public final p012xc85e97e9.p093xedfae76a.c1 b(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        gk2.e eVar = this.f530652c;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        return null;
    }

    public final void c(gk2.e liveBuContext, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.dm2 m76806xdef68064;
        km2.r rVar;
        km2.r rVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveBuContext, "liveBuContext");
        this.f530652c = liveBuContext;
        r45.qt2 qt2Var = new r45.qt2();
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        int i17 = 0;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 != null && (rVar = nVar2.f390684c) != null) {
            i17 = rVar.f390739k;
        }
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFinderObject liveBuContext:");
        sb6.append(liveBuContext.hashCode());
        sb6.append(",objectId:");
        ct2.j jVar = (ct2.j) b(ct2.j.class);
        java.lang.String str = null;
        sb6.append(jVar != null ? java.lang.Long.valueOf(jVar.Q6()) : null);
        sb6.append(",forRestar:");
        sb6.append(z17);
        sb6.append(",playTransition:");
        sb6.append(z18);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f530651b;
        r4Var.M2(str2, sb7);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = this.f530650a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        ct2.j jVar2 = (ct2.j) b(ct2.j.class);
        long Q6 = jVar2 != null ? jVar2.Q6() : 0L;
        ct2.j jVar3 = (ct2.j) b(ct2.j.class);
        java.lang.String str3 = "";
        if (jVar3 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) jVar3.m147920xbba4bfc0(mm2.c1.class)).f410379n;
            java.lang.String m76803x6c285d75 = c19792x256d27252 != null ? c19792x256d27252.m76803x6c285d75() : null;
            if (m76803x6c285d75 != null) {
                str3 = m76803x6c285d75;
            }
        }
        ct2.j jVar4 = (ct2.j) b(ct2.j.class);
        if (jVar4 != null && (c19792x256d2725 = ((mm2.c1) jVar4.m147920xbba4bfc0(mm2.c1.class)).f410379n) != null && (m76806xdef68064 = c19792x256d2725.m76806xdef68064()) != null) {
            str = m76806xdef68064.m75945x2fec8307(62);
        }
        c61.yb.Gh(ybVar, abstractActivityC21394xb3d2c0cf, Q6, str3, 0, 2, "", true, null, null, 0L, null, false, false, null, qt2Var, false, 0, str, new ws2.l0(new java.lang.ref.WeakReference(this), str2, z17, z18), 114560, null);
    }
}
