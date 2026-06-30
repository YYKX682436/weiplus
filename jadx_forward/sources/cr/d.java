package cr;

/* loaded from: classes12.dex */
public final class d implements cr.h {

    /* renamed from: a, reason: collision with root package name */
    public cr.i f303090a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f303091b;

    /* renamed from: c, reason: collision with root package name */
    public long f303092c;

    /* renamed from: d, reason: collision with root package name */
    public int f303093d;

    /* renamed from: e, reason: collision with root package name */
    public int f303094e;

    /* renamed from: f, reason: collision with root package name */
    public final cr.c f303095f = new cr.c(this);

    @Override // cr.h
    public void a(cr.i fetcherConfig, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetcherConfig, "fetcherConfig");
        this.f303090a = fetcherConfig;
        this.f303091b = lVar;
        java.lang.String str = fetcherConfig.f303103c;
        com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(str).s();
        if (s17 != null) {
            s17.J();
        }
        this.f303093d = fetcherConfig.f303105e == 2 ? 20403 : 20401;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f303092c = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17821x8c50294f = 60;
        c2CDownloadRequest.f17841x86986d5f = 60;
        c2CDownloadRequest.f17840xf3a4da4a = this.f303092c;
        c2CDownloadRequest.f17793xd428dad6 = this.f303093d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downemoji_");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = fetcherConfig.f303101a;
        sb6.append(c21053xdbf1e5f4.mo42933xb5885648());
        c2CDownloadRequest.f17792xcd096f43 = sb6.toString();
        java.lang.String str2 = fetcherConfig.f303102b;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.m37861xfb0731c4(str);
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        this.f303094e = c4446x11b6e6e0 != null ? c4446x11b6e6e0.m37788x8bc93551(c2CDownloadRequest, this.f303095f) : com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29003x43b77590;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCdnHttpsFetcher", "fetch: start " + c21053xdbf1e5f4.mo42933xb5885648() + ' ' + this.f303094e + ", url:" + str2 + ", path:" + str + " [" + com.p314xaae8f345.mm.vfs.w6.i(str, true) + ']');
        h12.f.a(20L, 1L);
        cr.i iVar = this.f303090a;
        if (iVar != null) {
            int i17 = iVar.f303105e;
            if (i17 == 0) {
                h12.f.a(1L, 1L);
            } else if (i17 == 1) {
                h12.f.a(6L, 1L);
            } else if (i17 == 2) {
                h12.f.a(10L, 1L);
            }
        }
        if (this.f303094e != 0) {
            yz5.l lVar2 = this.f303091b;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            b(false);
        }
    }

    public final void b(boolean z17) {
        cr.i iVar = this.f303090a;
        if (iVar != null) {
            if (z17) {
                h12.f.a(21L, 1L);
                h12.f.a(2L, 1L);
                return;
            }
            h12.f.a(22L, 1L);
            h12.f.a(3L, 1L);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = iVar.f303101a;
            int i17 = iVar.f303105e;
            if (i17 == 0) {
                h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 1, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
            } else if (i17 == 1) {
                h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 2, 1, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
            } else {
                if (i17 != 2) {
                    return;
                }
                h12.f.b(c21053xdbf1e5f4.mo42933xb5885648(), 4, 1, 1, c21053xdbf1e5f4.f68663x861009b5, 1, c21053xdbf1e5f4.f68657xb76d85ab);
            }
        }
    }
}
