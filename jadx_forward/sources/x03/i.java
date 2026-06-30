package x03;

/* loaded from: classes15.dex */
public final class i implements dn.n, dn.k, dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f532571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f532572e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f532573f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f532574g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f532575h;

    public i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f532571d = "MicroMsg.FlutterVideoPlayerMgr";
        this.f532574g = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f532572e = context.getCacheDir() + "/flutter/FTVideo/";
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x03.g
            if (r0 == 0) goto L13
            r0 = r6
            x03.g r0 = (x03.g) r0
            int r1 = r0.f532562h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f532562h = r1
            goto L18
        L13:
            x03.g r0 = new x03.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f532560f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f532562h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f532559e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f532558d
            x03.i r5 = (x03.i) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L72
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            x03.z1 r6 = x03.z1.f532711a
            java.util.Map r6 = x03.z1.f532712b
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            jz5.l r0 = new jz5.l
            r0.<init>(r5, r6)
            return r0
        L4e:
            r0.f532558d = r4
            r0.f532559e = r5
            r0.f532562h = r3
            kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r5.<init>(r6, r3)
            r5.k()
            r4.f532575h = r5
            x03.h r6 = new x03.h
            r6.<init>(r4)
            r5.m(r6)
            java.lang.Object r6 = r5.j()
            if (r6 != r1) goto L71
            return r1
        L71:
            r5 = r4
        L72:
            jz5.l r6 = (jz5.l) r6
            r0 = 0
            r5.f532575h = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.i.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final x03.f b(java.lang.String str) {
        java.util.Map map = this.f532574g;
        if (map.get(str) == null) {
            return new x03.f();
        }
        java.lang.Object obj = map.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
        return (x03.f) obj;
    }

    public final int c(java.lang.String str, int i17) {
        x03.f fVar;
        int i18;
        if (str == null) {
            return 0;
        }
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(this.f532572e + '-' + str.hashCode() + ".mp4").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        if (r26.i0.p(g17, this.f532573f, true)) {
            return 0;
        }
        java.util.Map map = this.f532574g;
        if (map.get(g17) == null) {
            fVar = new x03.f();
        } else {
            java.lang.Object obj = map.get(g17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            fVar = (x03.f) obj;
        }
        if (fVar.f532554j && fVar.f532545a < (fVar.f532547c * i17) / 100) {
            fVar.f532554j = false;
        }
        if (!fVar.f532548d && !fVar.f532554j && !fVar.f532551g) {
            dn.o oVar = new dn.o();
            oVar.f323318d = "task_FlutterCdnDownloadMgr_1";
            oVar.f69601xaca5bdda = g17;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.Y = 2;
            oVar.H1 = 2;
            oVar.Z = 3;
            oVar.f69610x4f5245a8 = 0;
            oVar.f69595x6d25b0d9 = o17;
            oVar.f323342y0 = 8;
            oVar.f323339x0 = 1;
            oVar.f323348c2 = this;
            oVar.f323320f = this;
            oVar.f323329p0 = this;
            oVar.f69608x6ac8fea7 = i17;
            if (!((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(g17)) {
                i18 = x03.x0.f532694d.a().f532698c.a(oVar);
                fVar.f532551g = true;
                fVar.f532553i = false;
                int i19 = i18;
                fVar.f532549e = o17;
                map.put(g17, fVar);
                return i19;
            }
        }
        i18 = -1;
        int i192 = i18;
        fVar.f532549e = o17;
        map.put(g17, fVar);
        return i192;
    }

    public final void d(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Long l17) {
        x03.f b17 = b(str2);
        if (z17) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17.f532551g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            if (valueOf.booleanValue()) {
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(b17.f532553i);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
                if (valueOf2.booleanValue()) {
                    return;
                }
            }
            e(str, str2);
            return;
        }
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(b17.f532551g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf3);
        if (valueOf3.booleanValue()) {
            return;
        }
        if ((b17.f532554j && (l17 == null || l17.longValue() == 0 || b17.f532546b >= l17.longValue())) || l17 == null) {
            return;
        }
        c(str, (int) (((l17.longValue() * 1.0d) / b17.f532547c) * 100));
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        x03.f fVar;
        if (str == null || !r26.i0.y(str, "preview://", false)) {
            boolean m37796x95bf072 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(str2);
            java.lang.String str3 = this.f532571d;
            java.util.Map map = this.f532574g;
            if (!m37796x95bf072) {
                boolean z17 = map.get(str2) == null;
                x03.f fVar2 = (x03.f) map.get(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "testtest task not in preload, in info cache:" + z17 + ", completed:" + (fVar2 != null ? java.lang.Boolean.valueOf(fVar2.f532548d) : null));
            }
            if (str != null) {
                bArr = str.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
            } else {
                bArr = null;
            }
            java.lang.String g17 = kk.k.g(bArr);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f532572e);
            sb6.append('-');
            sb6.append(str != null ? str.hashCode() : 0);
            sb6.append(".mp4");
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(sb6.toString()).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            if (map.get(g17) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj = map.get(g17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj;
            }
            if (r26.i0.q(this.f532573f, g17, false, 2, null) && fVar.f532551g && fVar.f532553i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "playmode is downloading:" + g17);
                return;
            }
            if (!fVar.f532548d) {
                dn.o oVar = new dn.o();
                oVar.f323318d = "task_FlutterCdnDownloadMgr_2";
                oVar.f69601xaca5bdda = g17;
                oVar.M1 = str;
                oVar.A = 60;
                oVar.B = 60;
                oVar.Y = 1;
                oVar.H1 = 1;
                oVar.Z = 3;
                oVar.f69610x4f5245a8 = 0;
                oVar.f69595x6d25b0d9 = o17;
                oVar.f323342y0 = 8;
                oVar.f323348c2 = this;
                java.lang.String str4 = this.f532573f;
                x03.v0 v0Var = x03.x0.f532694d;
                if (str4 != null && !r26.i0.q(str4, g17, false, 2, null) && ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(this.f532573f)) {
                    v0Var.a().f532698c.b(this.f532573f);
                    fVar.f532551g = false;
                }
                if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(g17) && !fVar.f532553i) {
                    v0Var.a().f532698c.b(g17);
                    fVar.f532551g = false;
                }
                v0Var.a().f532698c.a(oVar);
                fVar.f532551g = true;
                fVar.f532553i = true;
            }
            this.f532573f = g17;
            fVar.f532549e = o17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(g17, fVar);
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        x03.f fVar;
        if (str != null) {
            java.util.Map map = this.f532574g;
            if (map.get(str) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj = map.get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj;
            }
            fVar.f532545a = j17;
            fVar.f532547c = j18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(str, fVar);
            if (j17 != j18 || fVar.f532548d) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f532571d, "onprogress cdntask end id:".concat(str));
            fVar.f532548d = true;
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        x03.f fVar;
        java.util.Map map = this.f532574g;
        if (str == null || hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f532571d, "onfinish but id not found:" + str);
        } else {
            if (map.get(str) == null) {
                fVar = new x03.f();
            } else {
                java.lang.Object obj = map.get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar = (x03.f) obj;
            }
            long j17 = hVar.f69523x17c343e7;
            fVar.f532545a = j17;
            fVar.f532547c = j17;
            fVar.f532548d = true;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(str, fVar);
            this.f532573f = null;
        }
        x03.f fVar2 = (x03.f) map.get(str);
        if (fVar2 == null) {
            return;
        }
        fVar2.f532551g = false;
    }

    public final int h(java.lang.String str, boolean z17) {
        int b17 = x03.x0.f532694d.a().f532698c.b(str);
        java.util.Map map = this.f532574g;
        x03.f fVar = (x03.f) map.get(str);
        if (fVar != null) {
            fVar.f532551g = false;
        }
        if (z17 && map.containsKey(str)) {
            map.remove(str);
        }
        if (r26.i0.p(this.f532573f, str, true)) {
            this.f532573f = null;
        }
        return b17;
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String mediaId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (str != null) {
            x03.z1 z1Var = x03.z1.f532711a;
            x03.z1.f532712b.put(mediaId, str);
            jz5.l lVar = new jz5.l(mediaId, str);
            p3325xe03a0797.p3326xc267989b.q qVar = this.f532575h;
            if (qVar != null) {
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lVar));
            }
            this.f532575h = null;
        }
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = this.f532574g;
        java.lang.Object obj = map.get(str);
        java.lang.String str2 = this.f532571d;
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "preload completed, but task not found, mediaId:".concat(str));
            return;
        }
        java.lang.Object obj2 = map.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
        x03.f fVar = (x03.f) obj2;
        fVar.f532547c = hVar.f69523x17c343e7;
        fVar.f532546b = hVar.f69548xe026fea1;
        fVar.f532554j = true;
        fVar.f532551g = false;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        map.put(str, fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "preload completed mediaId:".concat(str));
    }
}
