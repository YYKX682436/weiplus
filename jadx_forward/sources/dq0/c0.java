package dq0;

@j95.b
/* loaded from: classes7.dex */
public final class c0 extends i95.w implements com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040, com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, dq0.i {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f323834g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f323835d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f323836e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f323837f = new java.lang.ref.WeakReference(null);

    public c0() {
        if (!f323834g) {
            fp.d0.n("magic_brush_zidl");
            f323834g = true;
        }
        eq0.b bVar = new eq0.b(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "setPropMagicSclRequest in java");
        com.p314xaae8f345.p3248x6e8731b.C27980x1de85921.m121408x9cf0d20b().m121429x244966bb(bVar);
    }

    public void Ai(java.lang.String bizName, dq0.j handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f323835d.put(bizName, handler);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: attachFrameSet */
    public void mo88772xe590c51a(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            wi6.mo9214xe590c51a(rootId, frameSetId, extra);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: changeFrameSetData */
    public void mo88773xc6a168cf(java.lang.String rootId, java.lang.String data, java.lang.String extInfo) {
        hq0.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f323822e.get(rootId)) == null) {
            return;
        }
        e0Var.a(data, extInfo);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: clickFrameSet */
    public void mo88774xa039a95d(java.lang.String rootId, java.lang.String frameSetId, java.lang.String magicbrushViewId) {
        hq0.i0 t17;
        fq0.x V0;
        hq0.e0 e0Var;
        jz5.f0 f0Var;
        java.lang.Object obj;
        long j17;
        java.lang.String str;
        java.lang.Object str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicbrushViewId, "magicbrushViewId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (t17 = ((dq0.a0) wi6).t()) == null || (V0 = t17.V0(frameSetId)) == null || (e0Var = V0.f347012c) == null) {
            return;
        }
        hq0.i0 i0Var = e0Var.f364521i;
        hq0.k0 k0Var = i0Var.f364531m;
        k0Var.getClass();
        java.util.Collection values = k0Var.f364561a.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((hq0.j0) obj).b(), magicbrushViewId)) {
                    break;
                }
            }
        }
        hq0.j0 j0Var = (hq0.j0) obj;
        if (j0Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() + new java.util.Random().nextInt(1000);
            hq0.l0 l0Var = i0Var.f364527f;
            l0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", e0Var.f364513a);
            jSONObject.put("frameSetRootId", e0Var.f364517e);
            java.lang.String str3 = "0";
            if (currentTimeMillis != 0) {
                if (currentTimeMillis == 0) {
                    j17 = currentTimeMillis;
                    str2 = "0";
                } else if (currentTimeMillis > 0) {
                    str2 = java.lang.Long.toString(currentTimeMillis, 10);
                    j17 = currentTimeMillis;
                } else {
                    char[] cArr = new char[64];
                    long j18 = (currentTimeMillis >>> 1) / 5;
                    long j19 = 10;
                    cArr[63] = java.lang.Character.forDigit((int) (currentTimeMillis - (j18 * j19)), 10);
                    int i17 = 63;
                    while (j18 > 0) {
                        i17--;
                        cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                        j18 /= j19;
                        currentTimeMillis = currentTimeMillis;
                    }
                    j17 = currentTimeMillis;
                    str2 = new java.lang.String(cArr, i17, 64 - i17);
                }
                jSONObject.put("clickId", str2);
            } else {
                j17 = currentTimeMillis;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("frameSetId", V0.f347011b);
            jSONObject2.put("viewId", V0.f347025p);
            jSONObject2.put("frameSetName", V0.f347010a);
            jSONObject2.put("canvasId", j0Var.f364545a);
            jSONArray.put(jSONObject2);
            jSONObject.put("frameSets", jSONArray);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            l0Var.a("surface:frameSet:click", jSONObject3);
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String d17 = e0Var.d();
            java.lang.String s07 = r26.n0.s0(d17, "-", d17);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446 enumC16451x1796f446 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446.f37506xe5cc01ce;
            if (currentTimeMillis != 0) {
                if (currentTimeMillis > 0) {
                    str3 = java.lang.Long.toString(j17, 10);
                } else {
                    long j27 = j17;
                    char[] cArr2 = new char[64];
                    long j28 = (j27 >>> 1) / 5;
                    long j29 = 10;
                    cArr2[63] = java.lang.Character.forDigit((int) (j27 - (j28 * j29)), 10);
                    int i18 = 63;
                    while (j28 > 0) {
                        i18--;
                        cArr2[i18] = java.lang.Character.forDigit((int) (j28 % j29), 10);
                        j28 /= j29;
                    }
                    str = new java.lang.String(cArr2, i18, 64 - i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e enumC16450xc9b86c3e = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e.f37501xc3cfd696;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86 enumC16449xa1a30c86 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86.f37496xda774887;
                    java.lang.String str4 = V0.f347010a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                    je3.i.m180102if(iVar, s07, 0, currentTimeMillis2, str, enumC16451x1796f446, enumC16450xc9b86c3e, enumC16449xa1a30c86, 0, 0, null, str4, ce1.i.f4370x366c91de, null);
                    f0Var = jz5.f0.f384359a;
                }
            }
            str = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e enumC16450xc9b86c3e2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e.f37501xc3cfd696;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86 enumC16449xa1a30c862 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86.f37496xda774887;
            java.lang.String str42 = V0.f347010a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
            je3.i.m180102if(iVar, s07, 0, currentTimeMillis2, str, enumC16451x1796f446, enumC16450xc9b86c3e2, enumC16449xa1a30c862, 0, 0, null, str42, ce1.i.f4370x366c91de, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.m133876xb5887064(), "canvas not found for " + V0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r0 == null) goto L21;
     */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: createFrameSet */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo88775xd4f0d0d1(java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            java.lang.String r0 = "rootId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "name"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.String r0 = "MagicSclFlutterPlugin"
            java.lang.String r1 = "receive create request"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            dq0.j r0 = r5.wi(r6)
            if (r0 == 0) goto La3
            int r1 = (int) r8
            dq0.a0 r0 = (dq0.a0) r0
            java.util.HashMap r2 = r0.f323822e
            java.lang.Object r2 = r2.get(r6)
            hq0.e0 r2 = (hq0.e0) r2
            if (r2 != 0) goto L42
            java.lang.String r0 = "MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "frameSetRoot for "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " not found! create: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
            java.lang.String r0 = ""
            goto La5
        L42:
            java.lang.String r2 = "MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "createFrameSet "
            r3.<init>(r4)
            r3.append(r6)
            r4 = 32
            r3.append(r4)
            r3.append(r7)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            java.util.HashSet r2 = r0.f323828n
            monitor-enter(r2)
            fq0.x r1 = r0.k(r6, r7, r1)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L85
            boolean r3 = r1.f347022m     // Catch: java.lang.Throwable -> La0
            if (r3 != 0) goto L86
            mq0.d1 r3 = mq0.d1.f412079a     // Catch: java.lang.Throwable -> La0
            java.util.HashMap r4 = r0.f323822e     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> La0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)     // Catch: java.lang.Throwable -> La0
            hq0.e0 r4 = (hq0.e0) r4     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r4.d()     // Catch: java.lang.Throwable -> La0
            r3.b(r1, r4)     // Catch: java.lang.Throwable -> La0
            goto L86
        L85:
            r1 = 0
        L86:
            if (r1 == 0) goto L8e
            r0.a(r1)     // Catch: java.lang.Throwable -> La0
            r1.b()     // Catch: java.lang.Throwable -> La0
        L8e:
            monitor-exit(r2)
            if (r1 == 0) goto L9d
            dq0.r r2 = new dq0.r
            r2.<init>(r0, r1)
            d75.b.g(r2)
            java.lang.String r0 = r1.f347011b
            if (r0 != 0) goto La5
        L9d:
            java.lang.String r0 = ""
            goto La5
        La0:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        La3:
            java.lang.String r0 = ""
        La5:
            java.lang.String r1 = "MagicSclFlutterPlugin"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "createFrameSet in root: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = ", name: "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = ", id: "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = " viewId: "
            r2.append(r6)
            r2.append(r8)
            java.lang.String r6 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.c0.mo88775xd4f0d0d1(java.lang.String, java.lang.String, long):java.lang.String");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: createFrameSetRoot */
    public java.lang.String mo88776x5bb0f553(java.lang.String bizName, java.lang.String path, java.lang.String query) {
        jz5.f0 f0Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        dq0.j jVar = (dq0.j) this.f323835d.get(bizName);
        java.lang.String str3 = "";
        if (jVar != null) {
            dq0.a0 a0Var = (dq0.a0) jVar;
            if (a0Var.t() != null) {
                hq0.e0 h17 = a0Var.h(path, query);
                if (h17 != null) {
                    a0Var.f323822e.put(h17.f364517e, h17);
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "no frameSet root");
                    ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandNoFrameSetRoot", 0, null, 1.0f);
                }
                if (h17 != null && (str = h17.f364517e) != null) {
                    str3 = str;
                }
                this.f323836e.put(str3, bizName);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "createFrameSetRoot " + str3 + ",path:" + path + ",query:" + query);
                return str3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicSclFlutterPlugin", "invalid provider for ".concat(bizName));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicSclFlutterPlugin", "createFrameSetRoot for biz " + bizName + " failed...");
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicFlutterCreateFrameSetRootFailed", 0, bizName + ", " + path, 1.0f);
        return "";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: destroyFrameSet */
    public void mo88777xc766f1cf(java.lang.String rootId, java.lang.String frameSetId) {
        hq0.i0 t17;
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null && (t17 = ((dq0.a0) wi6).t()) != null && (V0 = t17.V0(frameSetId)) != null) {
            V0.i();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "destroyFrameSet in root: " + rootId + ", id: " + frameSetId);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: destroyFrameSetRoot */
    public void mo88778xf4126751(java.lang.String rootId) {
        dq0.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "destroyFrameSetRoot, in root: ".concat(rootId));
        java.lang.String str = (java.lang.String) this.f323836e.remove(rootId);
        if (str == null || (jVar = (dq0.j) this.f323835d.get(str)) == null) {
            return;
        }
        ((dq0.a0) jVar).i(rootId);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: detachFrameSet */
    public void mo88779x917cc068(java.lang.String rootId, java.lang.String frameSetId) {
        hq0.i0 t17;
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (t17 = ((dq0.a0) wi6).t()) == null || (V0 = t17.V0(frameSetId)) == null) {
            return;
        }
        V0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if ((!(r10.length == 0)) == true) goto L23;
     */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: getFrameSetCoverPath */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo88780x16a67391(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "rootId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "frameSetId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            java.util.HashMap r0 = r9.f323836e
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = ""
            if (r10 != 0) goto L1a
            r5 = r0
            goto L1b
        L1a:
            r5 = r10
        L1b:
            java.lang.Class<qq0.i> r10 = qq0.i.class
            i95.m r1 = i95.n0.c(r10)
            qq0.i r1 = (qq0.i) r1
            qq0.m r1 = (qq0.m) r1
            boolean r1 = r1.Bi(r5)
            if (r1 != 0) goto L2c
            return r0
        L2c:
            i95.m r1 = i95.n0.c(r10)
            qq0.i r1 = (qq0.i) r1
            qq0.m r1 = (qq0.m) r1
            boolean r1 = r1.Ai(r5, r11)
            if (r1 != 0) goto L88
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            i95.m r10 = i95.n0.c(r10)
            qq0.i r10 = (qq0.i) r10
            qq0.m r10 = (qq0.m) r10
            java.lang.String r10 = r10.wi(r5, r11)
            com.tencent.mm.vfs.z7 r10 = com.p314xaae8f345.mm.vfs.z7.a(r10)
            r1.<init>(r10)
            com.tencent.mm.vfs.r6 r10 = r1.s()
            r1 = 0
            if (r10 == 0) goto L67
            java.lang.String[] r10 = r10.D()
            if (r10 == 0) goto L67
            int r10 = r10.length
            r2 = 1
            if (r10 != 0) goto L62
            r10 = r2
            goto L63
        L62:
            r10 = r1
        L63:
            r10 = r10 ^ r2
            if (r10 != r2) goto L67
            goto L68
        L67:
            r2 = r1
        L68:
            if (r2 == 0) goto L87
            java.lang.Class<mq0.e0> r10 = mq0.e0.class
            i95.m r10 = i95.n0.c(r10)
            mq0.e0 r10 = (mq0.e0) r10
            java.lang.String r2 = "tryShowCover"
            java.lang.String r3 = "noCorrectCover"
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = vq0.a.b(r11)
            java.lang.String[] r8 = new java.lang.String[r1]
            r1 = r10
            mq0.v0 r1 = (mq0.v0) r1
            r1.wi(r2, r3, r4, r5, r6, r7, r8)
        L87:
            return r0
        L88:
            i95.m r10 = i95.n0.c(r10)
            qq0.i r10 = (qq0.i) r10
            qq0.m r10 = (qq0.m) r10
            java.lang.String r10 = r10.wi(r5, r11)
            java.lang.String r11 = "getFrameSetCoverPath: "
            java.lang.String r11 = r11.concat(r10)
            java.lang.String r0 = "MagicSclFlutterPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.c0.mo88780x16a67391(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e
    /* renamed from: invoke */
    public void mo88763xb9724478(java.lang.String bizName, java.lang.String apiName, byte[] bArr, yz5.l callback) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        dq0.j jVar = (dq0.j) this.f323835d.get(bizName);
        if (jVar != null) {
            yz5.q qVar = (yz5.q) ((dq0.a0) jVar).j().get(apiName);
            if (qVar != null) {
                qVar.mo147xb9724478(apiName, bArr, new dq0.w(callback));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new jz5.k(apiName.concat(" is not implemented in host"))))));
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalAccessException("BizName " + bizName + " not found")))));
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f323837f = new java.lang.ref.WeakReference(binding.m137986xf7af55c8());
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040.Companion.m88789x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e.Companion.m88765x97a46f3a(companion2, m137983x3b5b91dc2, this, null, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "onAttachedToEngine, engine: " + this.f323837f.get());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323837f.get(), binding.m137986xf7af55c8())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "onDetachedFromEngine invoke, engine is the last engine, status not clear");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "onDetachedFromEngine, engine: " + this.f323837f.get());
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040.Companion.m88789x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23986xb560636e.Companion.m88765x97a46f3a(companion2, m137983x3b5b91dc2, null, null, 4, null);
        this.f323837f.clear();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: pauseFrameSetRoot */
    public void mo88781x52f1d34d(java.lang.String rootId) {
        hq0.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f323822e.get(rootId)) == null) {
            return;
        }
        e0Var.f();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: preInitFrameSet */
    public void mo88782x2d506b28(java.lang.String rootId, java.lang.String name, java.lang.String data, java.lang.String extInfo, yz5.l callback) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclFlutterPlugin", "preLayout from flutter " + rootId + " frameSet:" + name + " data:" + data.length() + " ext:" + extInfo);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(callback);
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            ((dq0.a0) wi6).l(rootId, name, data, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29655x437ba46, extInfo, new dq0.b0(weakReference));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Double.valueOf(0.0d))));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: redrawFrameSet */
    public void mo88783x1b22eecc(java.lang.String rootId, java.lang.String frameSetId) {
        hq0.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            dq0.a0 a0Var = (dq0.a0) wi6;
            fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(frameSetId);
            if (Ai == null || (e0Var = (hq0.e0) a0Var.f323822e.get(rootId)) == null) {
                return;
            }
            e0Var.h(Ai);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: redrawFrameSetRoot */
    public void mo88784xdf5d9dce(java.lang.String rootId) {
        hq0.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f323822e.get(rootId)) == null) {
            return;
        }
        e0Var.g();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: resizeFrameSet */
    public void mo88785xc0dd9489(java.lang.String rootId, java.lang.String frameSetId, double d17, double d18) {
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            int a17 = a06.d.a(d17);
            int a18 = a06.d.a(d18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeFrameSet " + rootId + ' ' + frameSetId + ' ' + a17 + ' ' + a18);
            hq0.i0 t17 = ((dq0.a0) wi6).t();
            if (t17 == null || (V0 = t17.V0(frameSetId)) == null) {
                return;
            }
            V0.j(a17, a18);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: resumeFrameSetRoot */
    public void mo88786xf5aadb04(java.lang.String rootId) {
        hq0.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f323822e.get(rootId)) == null) {
            return;
        }
        e0Var.j();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23990x50db0040
    /* renamed from: scrollFrameSet */
    public void mo88787xed3ab5a2(java.lang.String rootId, java.lang.String frameSetId, double d17, double d18) {
        hq0.i0 t17;
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (t17 = ((dq0.a0) wi6).t()) == null || (V0 = t17.V0(frameSetId)) == null) {
            return;
        }
        V0.g(d17, d18);
    }

    public final dq0.j wi(java.lang.String str) {
        dq0.j jVar;
        java.lang.String str2 = (java.lang.String) this.f323836e.get(str);
        if (str2 != null && (jVar = (dq0.j) this.f323835d.get(str2)) != null) {
            if (((dq0.a0) jVar).t() != null) {
                return jVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicSclFlutterPlugin", "invalid provider for " + str + ' ' + str2);
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicFlutterGetSclHandlerFailed", 0, str2 + ", " + str, 1.0f);
        }
        return null;
    }
}
