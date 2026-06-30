package fw4;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348632d;

    public g(java.lang.String str) {
        this.f348632d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if ((r9 == null || r9.length() == 0) == false) goto L48;
     */
    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo1034xf5bc2045(int r6, int r7, java.lang.String r8, com.p314xaae8f345.mm.p944x882e457a.o r9, com.p314xaae8f345.mm.p944x882e457a.m1 r10) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getDownloadAppInfo callback errType: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", errCode: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", errMsg: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.GetDownloadAppInfoManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.util.concurrent.ConcurrentHashMap r0 = fw4.h.f348633a
            r1 = 0
            if (r10 == 0) goto L2d
            int r10 = r10.hashCode()
            goto L2e
        L2d:
            r10 = r1
        L2e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.remove(r10)
            fw4.f r10 = (fw4.f) r10
            if (r10 == 0) goto Lbe
            fw4.e r10 = r10.f348631b
            java.lang.String r0 = r5.f348632d
            if (r6 != 0) goto Lb9
            if (r7 != 0) goto Lb9
            r2 = 0
            if (r9 == 0) goto L4a
            com.tencent.mm.modelbase.n r9 = r9.f152244b
            com.tencent.mm.protobuf.f r9 = r9.f152233a
            goto L4b
        L4a:
            r9 = r2
        L4b:
            boolean r3 = r9 instanceof r45.ke3
            if (r3 == 0) goto L52
            r2 = r9
            r45.ke3 r2 = (r45.ke3) r2
        L52:
            if (r2 == 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap r9 = fw4.h.f348633a
            r45.pf0 r9 = r2.f460157d
            if (r9 != 0) goto L5b
            goto L8d
        L5b:
            java.lang.String r3 = r9.f464531i
            r4 = 1
            if (r3 == 0) goto L69
            int r3 = r3.length()
            if (r3 != 0) goto L67
            goto L69
        L67:
            r3 = r1
            goto L6a
        L69:
            r3 = r4
        L6a:
            if (r3 != 0) goto L8d
            java.lang.String r3 = r9.f464527e
            if (r3 == 0) goto L79
            int r3 = r3.length()
            if (r3 != 0) goto L77
            goto L79
        L77:
            r3 = r1
            goto L7a
        L79:
            r3 = r4
        L7a:
            if (r3 != 0) goto L8d
            java.lang.String r9 = r9.f464530h
            if (r9 == 0) goto L89
            int r9 = r9.length()
            if (r9 != 0) goto L87
            goto L89
        L87:
            r9 = r1
            goto L8a
        L89:
            r9 = r4
        L8a:
            if (r9 != 0) goto L8d
            goto L8e
        L8d:
            r4 = r1
        L8e:
            if (r4 == 0) goto Lb3
            r45.pf0 r6 = r2.f460157d
            java.lang.String r7 = "download_app_info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
            com.tencent.mm.plugin.webview.ui.tools.k4 r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k4) r10
            r10.getClass()
            java.lang.String r7 = r6.f464527e
            java.lang.String r8 = r10.f267136a
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7}
            java.lang.String r8 = "MicroMsg.WebViewDownloadUI"
            java.lang.String r9 = "getDownloadAppInfo onSuccess downloadAppId: %s, name: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r9, r7)
            java.util.List r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.K
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI r7 = r10.f267137b
            r7.a7(r6)
            goto Lbe
        Lb3:
            com.tencent.mm.plugin.webview.ui.tools.k4 r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k4) r10
            r10.a(r0, r6, r7, r8)
            goto Lbe
        Lb9:
            com.tencent.mm.plugin.webview.ui.tools.k4 r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k4) r10
            r10.a(r0, r6, r7, r8)
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fw4.g.mo1034xf5bc2045(int, int, java.lang.String, com.tencent.mm.modelbase.o, com.tencent.mm.modelbase.m1):int");
    }
}
