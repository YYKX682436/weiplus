package x03;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x03.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532517e = i0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x03.a0(this.f532517e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x03.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        x03.f fVar;
        java.lang.Object a17;
        dn.o oVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532516d;
        x03.i0 i0Var = this.f532517e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x03.v0 v0Var = x03.x0.f532694d;
            x03.x0 a18 = v0Var.a();
            java.lang.String url = i0Var.f532582f;
            java.lang.String mediaId = i0Var.f532583g;
            x03.i iVar = a18.f532697b;
            iVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(iVar.f532572e + '-' + mediaId + "-hls").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            java.util.Map map = iVar.f532574g;
            if (map.get(mediaId) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj2 = map.get(mediaId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj2;
            }
            if (!fVar.f532551g) {
                if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(mediaId)) {
                    v0Var.a().f532698c.b(mediaId);
                    fVar.f532552h = 0L;
                    fVar.f532551g = false;
                }
                java.lang.String concat = "[startPreviewMetaTask]preview download hls meta data: ".concat(o17);
                java.lang.String str = iVar.f532571d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, concat);
                x03.z1 z1Var = x03.z1.f532711a;
                try {
                    android.net.Uri parse = android.net.Uri.parse(url);
                    java.lang.String host = parse.getHost();
                    java.lang.String queryParameter = parse.getQueryParameter("aesKey");
                    java.lang.String str2 = o17 + '/' + mediaId + "_m3u8";
                    java.lang.String queryParameter2 = parse.getQueryParameter("fileExt");
                    if (queryParameter2 == null) {
                        queryParameter2 = "mp4";
                    }
                    oVar = dn.e.b(mediaId, host, queryParameter, str2, queryParameter2);
                } catch (java.lang.Exception unused) {
                    oVar = null;
                }
                if (oVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[startPreviewMetaTask] create task failed, mediaId: ".concat(mediaId));
                } else {
                    oVar.f323348c2 = iVar;
                    java.lang.String field_fullpath = oVar.f69595x6d25b0d9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
                    fVar.f532549e = field_fullpath;
                    fVar.f532550f = true;
                    fVar.f532552h = java.lang.System.currentTimeMillis();
                    fVar.f532551g = true;
                    x03.j jVar = v0Var.a().f532698c;
                    jVar.getClass();
                    java.lang.String str3 = oVar.f69595x6d25b0d9;
                    java.lang.String str4 = oVar.f69595x6d25b0d9 + "_temp";
                    oVar.f69595x6d25b0d9 = str4;
                    com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest b17 = x03.z1.f532711a.b(oVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(b17, jVar, new x03.w1(jVar, str4, str3), 0) == 0) {
                        java.util.HashMap hashMap = jVar.f532593d;
                        java.lang.String field_mediaId = oVar.f69601xaca5bdda;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                        hashMap.put(field_mediaId, oVar);
                    }
                    map.put(mediaId, fVar);
                }
            }
            java.lang.String str5 = i0Var.f532577a;
            java.lang.String str6 = i0Var.f532583g;
            x03.x0 a19 = v0Var.a();
            java.lang.String str7 = i0Var.f532583g;
            this.f532516d = 1;
            a17 = a19.f532697b.a(str7, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        i0Var.f532586j = (java.lang.String) ((jz5.l) a17).f384367e;
        java.lang.String str8 = i0Var.f532577a;
        java.lang.String str9 = i0Var.f532583g;
        if (i0Var.f532584h < 3) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder builder = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder();
            builder.m101226xb4088fb7(i0Var.f532583g);
            builder.m101224x10a74e5(new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(18));
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = i0Var.f532578b;
            if (interfaceC26164x73fc6bc6 != null) {
                interfaceC26164x73fc6bc6.mo100974xab2f6987(builder.m101222x59bc66e());
            }
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = i0Var.f532578b;
            if (interfaceC26164x73fc6bc62 != null) {
                interfaceC26164x73fc6bc62.mo100945x683d6267("http://127.0.0.1:1234/mock_url");
            }
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = i0Var.f532578b;
            if (interfaceC26164x73fc6bc63 != null) {
                interfaceC26164x73fc6bc63.mo100932x857611b5();
            }
        }
        return jz5.f0.f384359a;
    }
}
