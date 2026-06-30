package ha3;

/* loaded from: classes15.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f361422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha3.v f361423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ha3.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f361423e = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ha3.k(this.f361423e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ha3.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ha3.e0 e0Var;
        dn.o oVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f361422d;
        ha3.v vVar = this.f361423e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ha3.i0 i0Var = ha3.j0.f361419a;
            ha3.h0 h0Var = ha3.j0.f361420b;
            java.lang.String str = vVar.f361472a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            h0Var.getClass();
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(h0Var.f361402d + (b17 + "_liteapp") + "-hls").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewMetaTask] try start: mediaId: " + b17 + " url:" + str);
            java.util.Map map = h0Var.f361403e;
            if (map.get(b17) == null) {
                e0Var = new ha3.e0();
            } else {
                java.lang.Object obj2 = map.get(b17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.media.video.LiteAppVideoPlayerCdnDownloadMgr.LiteAppVideoPlayerTaskInfo");
                e0Var = (ha3.e0) obj2;
            }
            if (!e0Var.f361372g) {
                if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(b17)) {
                    ha3.i0 i0Var2 = ha3.j0.f361419a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                    i0Var2.b(b17);
                    e0Var.f361373h = 0L;
                    e0Var.f361372g = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewMetaTask]preview download hls meta data: ".concat(o17));
                ha3.r0 r0Var = ha3.r0.f361463a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                try {
                    android.net.Uri parse = android.net.Uri.parse(str);
                    java.lang.String host = parse.getHost();
                    java.lang.String queryParameter = parse.getQueryParameter("aesKey");
                    java.lang.String str2 = o17 + '/' + b17 + "_m3u8";
                    java.lang.String queryParameter2 = parse.getQueryParameter("fileExt");
                    if (queryParameter2 == null) {
                        queryParameter2 = "mp4";
                    }
                    oVar = dn.e.b(b17, host, queryParameter, str2, queryParameter2);
                } catch (java.lang.Exception unused) {
                    oVar = null;
                }
                if (oVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewMetaTask] create task failed, mediaId: ".concat(b17));
                } else {
                    oVar.f323348c2 = h0Var;
                    java.lang.String field_fullpath = oVar.f69595x6d25b0d9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
                    e0Var.f361370e = field_fullpath;
                    e0Var.f361371f = true;
                    e0Var.f361373h = java.lang.System.currentTimeMillis();
                    e0Var.f361372g = true;
                    ha3.i0 i0Var3 = ha3.j0.f361419a;
                    i0Var3.getClass();
                    java.lang.String str3 = oVar.f69595x6d25b0d9;
                    java.lang.String str4 = oVar.f69595x6d25b0d9 + "_temp";
                    oVar.f69595x6d25b0d9 = str4;
                    com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest b18 = ha3.r0.f361463a.b(oVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(b18, i0Var3, new ha3.o0(i0Var3, str4, str3), 0) == 0) {
                        java.util.HashMap hashMap = i0Var3.f361406d;
                        java.lang.String field_mediaId = oVar.f69601xaca5bdda;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                        hashMap.put(field_mediaId, oVar);
                    }
                    map.put(b17, e0Var);
                }
            }
            ha3.i0 i0Var4 = ha3.j0.f361419a;
            ha3.h0 h0Var2 = ha3.j0.f361420b;
            java.lang.String str5 = vVar.f361489r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            this.f361422d = 1;
            obj = h0Var2.a(str5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        vVar.f361474c = (java.lang.String) ((jz5.l) obj).f384367e;
        com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder builder = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder();
        java.lang.String str6 = vVar.f361489r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
        builder.m101226xb4088fb7(str6);
        builder.m101224x10a74e5(new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(18));
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = vVar.f361473b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100974xab2f6987(builder.m101222x59bc66e());
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = vVar.f361473b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100945x683d6267("http://127.0.0.1:1234/mock_url");
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = vVar.f361473b;
        if (interfaceC26164x73fc6bc63 != null) {
            interfaceC26164x73fc6bc63.mo100932x857611b5();
        }
        return jz5.f0.f384359a;
    }
}
