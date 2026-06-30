package i70;

@j95.b
/* loaded from: classes12.dex */
public final class g extends i95.w implements e70.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f370936f = com.p314xaae8f345.mm.vfs.q7.c("ilinkStream");

    /* renamed from: d, reason: collision with root package name */
    public final i70.f f370937d = new i70.f(this);

    /* renamed from: e, reason: collision with root package name */
    public final i70.e f370938e = new i70.e();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.equals("5G") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeCellular;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r0.equals("4G") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r0.equals("3G") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r0.equals("2G") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w Ai() {
        /*
            r4 = this;
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(r0)
            java.lang.String r1 = bm5.f1.a()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r2 = "MicroMsg.IILinkStreamFeatureService"
            java.lang.String r3 = "process: %s on network changed: %s"
            rk0.c.c(r2, r3, r1)
            if (r0 == 0) goto L65
            int r1 = r0.hashCode()
            r2 = 1621(0x655, float:2.272E-42)
            if (r1 == r2) goto L59
            r2 = 1652(0x674, float:2.315E-42)
            if (r1 == r2) goto L50
            r2 = 1683(0x693, float:2.358E-42)
            if (r1 == r2) goto L47
            r2 = 1714(0x6b2, float:2.402E-42)
            if (r1 == r2) goto L3e
            r2 = 2664213(0x28a715, float:3.733358E-39)
            if (r1 == r2) goto L32
            goto L65
        L32:
            java.lang.String r1 = "WIFI"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L65
        L3b:
            com.tencent.wechat.aff.ilink_stream.w r0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeWiFi
            goto L67
        L3e:
            java.lang.String r1 = "5G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L65
        L47:
            java.lang.String r1 = "4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L65
        L50:
            java.lang.String r1 = "3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L65
        L59:
            java.lang.String r1 = "2G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L65
        L62:
            com.tencent.wechat.aff.ilink_stream.w r0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeCellular
            goto L67
        L65:
            com.tencent.wechat.aff.ilink_stream.w r0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeUnknown
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.g.Ai():com.tencent.wechat.aff.ilink_stream.w");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        gm0.j1.n().a(this.f370937d);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f370938e);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        gm0.j1.n().d(this.f370937d);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f370938e);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    @Override // i95.w
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8845x3e5a77bb(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.g.mo8845x3e5a77bb(android.content.Context):void");
    }

    public e70.a0 wi(boolean z17) {
        rk0.c.c("MicroMsg.IILinkStreamFeatureService", "createStreamController", new java.lang.Object[0]);
        return new d83.t0(z17);
    }
}
