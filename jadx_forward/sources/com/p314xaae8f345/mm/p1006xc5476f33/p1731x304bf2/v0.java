package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m33.k1 f223446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m33.i1 f223447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f223448f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var, m33.k1 k1Var, m33.i1 i1Var, android.content.Context context) {
        this.f223446d = k1Var;
        this.f223447e = i1Var;
        this.f223448f = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0097  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            i53.l4 r0 = new i53.l4
            r0.<init>()
            r1 = 1
            r2 = 0
            m33.k1 r3 = r8.f223446d
            if (r3 != 0) goto Le
        Lb:
            r0 = r2
            goto L93
        Le:
            java.lang.String r4 = "gameCenterVideos"
            java.lang.String r4 = com.p314xaae8f345.mm.vfs.q7.c(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = r3.f404838c
            boolean r6 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            if (r6 != 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "gamelog.saveToGameCenterLocal, GameExternalService, file not exist path= "
            r0.<init>(r4)
            java.lang.String r4 = r3.f404838c
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.MiniGameVideoProcessor"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)
            goto Lb
        L37:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = java.io.File.separator
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r3.f404836a
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r7 != 0) goto L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = r3.f404836a
            r7.append(r6)
            r7.append(r4)
            java.lang.String r6 = r7.toString()
        L64:
            gm0.m r4 = gm0.j1.b()
            java.lang.String r4 = r4.j()
            java.lang.String r7 = "getUinString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r7)
            p43.a r4 = r0.a(r3, r6, r4)
            if (r4 != 0) goto L78
            goto Lb
        L78:
            r5.add(r4)
            java.lang.Class<m33.s1> r6 = m33.s1.class
            i95.m r6 = i95.n0.c(r6)
            m33.s1 r6 = (m33.s1) r6
            com.tencent.mm.plugin.game.s1 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) r6
            p43.b r6 = r6.Bi()
            p43.d r6 = (p43.d) r6
            r6.D0(r5)
            r0.b(r5, r1)
            java.lang.String r0 = r4.f67902xf9dbbe9c
        L93:
            m33.i1 r4 = r8.f223447e
            if (r0 != 0) goto La0
            if (r4 == 0) goto Lc0
            java.lang.String r0 = "videoId is null save local failed"
            r4.a(r0)
            goto Lc0
        La0:
            g53.f.f350444a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "https://game.weixin.qq.com/cgi-bin/h5/static/appcenter/publish.html?wechat_pkgid=appcenter_publish&MiniGamePublish=1&needDelAfterPost=1&ssid=30&s_uia=1004&s_pid=1&s_cid="
            r4.<init>(r5)
            java.lang.String r3 = r3.f404836a
            r4.append(r3)
            java.lang.String r3 = "&videoId="
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3 = -1
            android.content.Context r4 = r8.f223448f
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.b(r4, r0, r3, r1, r2)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.v0.run():void");
    }
}
