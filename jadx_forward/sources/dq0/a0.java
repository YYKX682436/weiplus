package dq0;

/* loaded from: classes7.dex */
public abstract class a0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, dq0.j, hq0.f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public final dq0.q f323821d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f323822e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23982x7ca626c2 f323823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f323824g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323825h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f323826i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f323827m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f323828n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f323829o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f323830p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f323831q;

    public a0(dq0.q mbPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
        this.f323821d = mbPlugin;
        this.f323822e = new java.util.HashMap();
        this.f323824g = new java.lang.ref.WeakReference(null);
        this.f323826i = new java.util.LinkedList();
        this.f323827m = new java.util.HashMap();
        this.f323828n = new java.util.HashSet();
        this.f323829o = new java.util.HashSet();
        this.f323831q = kz5.q0.f395534d;
    }

    public void a(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
    }

    /* renamed from: attachFrameSet */
    public void mo9214xe590c51a(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        hq0.i0 t17 = t();
        if (t17 == null || (V0 = t17.V0(frameSetId)) == null) {
            return;
        }
        V0.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:39|(5:41|(5:105|106|(1:118)(1:110)|(1:112)(1:117)|(1:114)(2:(1:116)|104))(2:43|(1:45)(2:103|104))|(10:47|48|(1:50)(1:98)|51|52|53|(3:61|(1:63)(1:95)|(8:65|66|67|68|(1:70)(1:91)|(2:72|(2:75|(8:77|78|79|80|81|82|83|57)))|56|57))|55|56|57)|99|100)(5:121|(1:143)(1:129)|(12:131|(1:(2:134|(3:136|(1:138)|100)(11:139|102|48|(0)(0)|51|52|53|(4:58|61|(0)(0)|(0))|55|56|57))(1:140))(1:142)|141|48|(0)(0)|51|52|53|(0)|55|56|57)|99|100)|101|102|48|(0)(0)|51|52|53|(0)|55|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03c2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03c3, code lost:
    
        r21 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c8 A[Catch: Exception -> 0x03c2, TryCatch #5 {Exception -> 0x03c2, blocks: (B:53:0x02b1, B:58:0x02c8, B:61:0x02cf, B:63:0x02ed, B:65:0x02f3), top: B:52:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ed A[Catch: Exception -> 0x03c2, TryCatch #5 {Exception -> 0x03c2, blocks: (B:53:0x02b1, B:58:0x02c8, B:61:0x02cf, B:63:0x02ed, B:65:0x02f3), top: B:52:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f3 A[Catch: Exception -> 0x03c2, TRY_LEAVE, TryCatch #5 {Exception -> 0x03c2, blocks: (B:53:0x02b1, B:58:0x02c8, B:61:0x02cf, B:63:0x02ed, B:65:0x02f3), top: B:52:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.a0.b():int");
    }

    @Override // jc3.r
    public void c(int i17, boolean z17) {
        hq0.k0 k0Var;
        hq0.j0 a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewFirstFrameRendered id[" + i17 + "] " + z17);
        hq0.i0 t17 = t();
        jz5.f0 f0Var = null;
        fq0.x S0 = t17 != null ? t17.S0(i17) : null;
        hq0.i0 t18 = t();
        if (t18 == null || (k0Var = t18.f364531m) == null || (a17 = k0Var.a(i17)) == null) {
            return;
        }
        a17.f364556l = true;
        if (!z17 && a17.f364557m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "draw on off screen and surfaceAvailable! redraw now " + i17 + ' ' + S0);
            if (S0 != null) {
                S0.f();
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                a17.f364554j = true;
            }
        }
        if (!(a17.f364546b.length() > 0)) {
            a17.f364553i = true;
            return;
        }
        this.f323821d.a(a17.b());
        if (S0 != null) {
            boolean z18 = a17.f364559o;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("preCreateCanvas", z18);
            w(S0, jSONObject);
        }
    }

    @Override // jc3.r
    public boolean d(int i17, cf3.d view) {
        hq0.k0 k0Var;
        hq0.k0 k0Var2;
        hq0.j0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewDestroy id[" + i17 + ']');
        hq0.i0 t17 = t();
        if (t17 != null && (k0Var2 = t17.f364531m) != null && (a17 = k0Var2.a(i17)) != null) {
            q(a17);
        }
        hq0.i0 t18 = t();
        if (t18 == null || (k0Var = t18.f364531m) == null) {
            return false;
        }
        return false;
    }

    @Override // jc3.r
    public void e(int i17, cf3.d view) {
        hq0.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewCreated id[" + i17 + ']');
        hq0.i0 t17 = t();
        if (t17 == null || (k0Var = t17.f364531m) == null) {
            return;
        }
        hq0.j0 b17 = k0Var.b(i17, null, null, view);
        if (b17.f364546b.length() > 0) {
            r(b17);
        }
    }

    @Override // jc3.r
    public void f(int i17, cf3.d view, int i18, int i19, int i27, int i28) {
        jz5.f0 f0Var;
        hq0.k0 k0Var;
        hq0.j0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewLayout id[" + i17 + "] " + i18 + ' ' + i19 + ' ' + i27 + ' ' + i28, new java.lang.Object[0]);
        hq0.i0 t17 = t();
        if (t17 == null || (k0Var = t17.f364531m) == null || (a17 = k0Var.a(i17)) == null) {
            f0Var = null;
        } else {
            a17.f364552h = view;
            a17.f364547c = i18;
            a17.f364548d = i19;
            a17.f364549e = i27;
            a17.f364550f = i28;
            a17.a();
            if (a17.f364546b.length() > 0) {
                synchronized (this.f323828n) {
                    if (o(a17)) {
                        this.f323821d.d(a17.b(), i18, i19, g(i27, a17.f364546b), i28);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "frame set not created. pending layout " + a17);
                        this.f323829o.add(a17.f364546b);
                    }
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "try layout no " + i17 + " found");
        }
    }

    public final int g(int i17, java.lang.String str) {
        java.lang.String str2;
        hq0.i0 t17 = t();
        fq0.x V0 = t17 != null ? t17.V0(str) : null;
        if (V0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "clampCanvasWidth: frameSet not found for id=" + str + ", skip clamp, width=" + i17);
            return i17;
        }
        int b17 = vp0.b.b(java.lang.Integer.valueOf(V0.f347015f));
        int i18 = i17 > b17 ? b17 : i17;
        if (i18 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "clampCanvasWidth: canvas=" + i17 + " frameSet=" + V0.f347015f + " maxPx=" + b17 + " clamped=" + i18 + " frameSetId=" + str);
            try {
                je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
                if (iVar != null) {
                    hq0.i0 t18 = t();
                    if (t18 == null || (str2 = t18.O0()) == null) {
                        str2 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                    }
                    je3.i.t8(iVar, str2, "canvas-width-overflow-frameset", "canvasWidth=" + i17 + " frameSetMaxPx=" + b17 + " clampedWidth=" + i18 + " frameSetId=" + str + " frameSetDp=" + V0.f347015f, null, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37609x7a9310ab.getValue(), 8, null);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "clampCanvasWidth: report error", e17);
            }
        }
        return i18;
    }

    public hq0.e0 h(java.lang.String path, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        hq0.i0 t17 = t();
        if (t17 != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            return t17.H0(this, context, t17.O0(), path, query, true);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "request frameSetRoot but biz not start yet");
        return null;
    }

    public void i(java.lang.String rootId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        this.f323822e.remove(rootId);
        hq0.i0 t17 = t();
        if (t17 != null) {
            t17.F1(rootId);
        }
    }

    public abstract java.util.Map j();

    public final fq0.x k(java.lang.String str, java.lang.String str2, int i17) {
        hq0.e0 e0Var = (hq0.e0) this.f323822e.get(str);
        if (e0Var == null) {
            return null;
        }
        jz5.l e17 = e0Var.e(str2);
        fq0.x xVar = (fq0.x) e17.f384366d;
        java.lang.Boolean bool = (java.lang.Boolean) e17.f384367e;
        if (bool.booleanValue() && i17 != 0) {
            xVar.f347025p = i17;
        }
        if (xVar.f347025p == 0) {
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f149537o.mo20599xaaa148a0();
            hq0.i0 t17 = t();
            java.lang.Integer valueOf = t17 != null ? java.lang.Integer.valueOf(t17.C0(new sp0.d(mo20599xaaa148a0, new java.lang.ref.WeakReference(this)))) : null;
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            mo20599xaaa148a0.f149529d |= 1;
            mo20599xaaa148a0.f149530e = intValue;
            mo20599xaaa148a0.m20881x7bb163d5();
            xVar.f347025p = valueOf != null ? valueOf.intValue() : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "this.viewId is changed to " + valueOf + ", name:" + str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "this.viewId is " + xVar.f347025p + ",so no addCustomView, name:" + str2);
        }
        int b17 = b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "getOrCreateFrameSet: name=" + str2 + " safeWidth=" + b17);
        xVar.f347015f = b17;
        if (bool.booleanValue()) {
            s(xVar);
        }
        return xVar;
    }

    public void l(java.lang.String rootId, java.lang.String name, java.lang.String data, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e preloadScene, java.lang.String str, yz5.l callback) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadScene, "preloadScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        hq0.e0 e0Var = (hq0.e0) this.f323822e.get(rootId);
        if (e0Var != null) {
            fq0.x k17 = k(rootId, name, 0);
            if (k17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "initFrameSet " + rootId + ' ' + name + ' ' + preloadScene + ' ' + str + ' ' + k17);
                if (k17.f347023n || k17.f347022m) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "preLayout existed " + k17);
                    callback.mo146xb9724478(java.lang.Double.valueOf((double) vp0.b.b(java.lang.Integer.valueOf(k17.f347016g))));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclFrameSet.SCL", "preloadScene from " + k17.f347020k + " to " + preloadScene + ", " + k17);
                k17.f347020k = preloadScene;
                mq0.d1 d1Var = mq0.d1.f412079a;
                java.lang.String frameSetId = k17.f347011b;
                synchronized (d1Var) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
                    mq0.b1 a17 = d1Var.a(frameSetId);
                    a17.f412073a = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "markInitTime " + frameSetId + ' ' + a17.f412073a);
                }
                k17.f347017h = new dq0.s(k17, callback, this);
                e0Var.a(data, str);
                k17.d();
                f0Var2 = jz5.f0.f384359a;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                callback.mo146xb9724478(null);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "frameSetRoot for " + rootId + " not found! " + name);
            callback.mo146xb9724478(null);
        }
    }

    public void m(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f323823f = null;
        synchronized (this) {
            this.f323825h = false;
        }
        this.f323824g.clear();
    }

    public final void n(java.lang.String apiName, byte[] bArr, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        hq0.i0 t17 = t();
        if (t17 != null) {
            com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23982x7ca626c2 c23982x7ca626c2 = this.f323823f;
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (c23982x7ca626c2 != null) {
                c23982x7ca626c2.m88758xb9724478(t17.O0(), apiName, bArr, new dq0.t(lVar, this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "invoke " + apiName + " failed because no flutter Api");
                if (lVar != null) {
                    lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297(4097, "no flutter Api", null, 4, null));
                } else {
                    f0Var = null;
                }
            }
            if (f0Var != null) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "invoke " + apiName + " failed because no biz");
        if (lVar != null) {
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297(4098, "no biz", null, 4, null));
        }
    }

    public final boolean o(hq0.j0 j0Var) {
        if (j0Var.f364546b.length() > 0) {
            fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(j0Var.f364546b);
            if (Ai != null && Ai.f347022m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onAttachedToActivity: ".concat(binding.mo137508x19263085().getClass().getSimpleName()));
        this.f323830p = new java.lang.ref.WeakReference(binding.mo137508x19263085());
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public synchronized void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        boolean z17 = this.f323824g.get() != null;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onAttachToEngine, current engine not null, recreate biz");
            u();
        }
        this.f323824g = new java.lang.ref.WeakReference(binding.m137986xf7af55c8());
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        this.f323823f = new com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23982x7ca626c2(m137983x3b5b91dc, null, 2, 0 == true ? 1 : 0);
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onAttachedToEngine " + this.f323826i.size() + ", engine: " + this.f323824g + ", isEngineSwitching: " + z17);
            this.f323825h = true;
            java.util.Iterator it = this.f323826i.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            this.f323826i.clear();
        }
    }

    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f323830p = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f323830p = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public final void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323824g.get(), binding.m137986xf7af55c8())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onDetachedFromEngine, engine is the last engine, status not clear");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onDetachedFromEngine, engine: " + this.f323824g.get());
        m(binding);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f323830p = new java.lang.ref.WeakReference(binding.mo137508x19263085());
        x();
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297 p(byte[] bArr) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297(0L, "", bArr);
    }

    public final void q(hq0.j0 j0Var) {
        fq0.x S0;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        synchronized (this.f323828n) {
            if (this.f323828n.contains(j0Var.f364546b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "canvas destroyed before created!");
                hq0.i0 t17 = t();
                if (t17 != null && (S0 = t17.S0(j0Var.f364545a)) != null && (copyOnWriteArraySet = S0.f347014e) != null) {
                    copyOnWriteArraySet.remove(java.lang.Integer.valueOf(j0Var.f364545a));
                }
                j0Var.f364546b = "";
            } else {
                if ((j0Var.f364546b.length() > 0) && j0Var.f364558n) {
                    this.f323821d.c(j0Var.b());
                    j0Var.f364558n = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "canvas not created or not having frameset id: " + j0Var.f364546b + ", created: " + j0Var.f364558n);
                }
            }
        }
    }

    public void r(hq0.j0 sclCanvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sclCanvas, "sclCanvas");
        synchronized (this.f323828n) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try notifyFlutterCanvasViewCreated ");
            sb6.append(sclCanvas);
            sb6.append(", and is created? ");
            sb6.append(((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(sclCanvas.f364546b) != null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", sb6.toString(), new java.lang.Object[0]);
            if (!o(sclCanvas)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "frame set not created. pending create " + sclCanvas);
                this.f323828n.add(sclCanvas.f364546b);
                sclCanvas.f364559o = true;
            } else if (sclCanvas.f364552h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "not provide external view when notify! " + sclCanvas);
            } else if (sclCanvas.f364558n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "scl canvas already created!!");
            } else {
                sclCanvas.f364558n = true;
                dq0.q qVar = this.f323821d;
                java.lang.String str = sclCanvas.f364546b;
                java.lang.String b17 = sclCanvas.b();
                cf3.d dVar = sclCanvas.f364552h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                qVar.b(str, b17, dVar);
                this.f323828n.remove(sclCanvas.f364546b);
            }
        }
    }

    public void s(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
    }

    public abstract hq0.i0 t();

    public void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "recreateBizForEngineChangeStatus - engine switching detected");
    }

    public void v(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
    }

    public void w(fq0.x frameSet, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g0 j17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.h0.j();
        java.lang.String str = frameSet.f347010a;
        str.getClass();
        j17.f149499d |= 1;
        j17.f149500e = str;
        j17.m20881x7bb163d5();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        j17.f149499d |= 2;
        j17.f149501f = currentTimeMillis;
        j17.m20881x7bb163d5();
        n("onRenderFinish", j17.mo20556x59bc66e().mo20648x5f01b1f6(), null);
    }

    public final void x() {
        java.util.HashMap hashMap;
        hq0.i0 t17 = t();
        if (t17 == null || (hashMap = t17.f364532n) == null || hashMap.isEmpty()) {
            return;
        }
        int b17 = b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeAllFrameSetsIfNeeded: checking " + hashMap.size() + " frameSets, currentSafeWidth=" + b17);
        if (b17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeAllFrameSetsIfNeeded: safeWidth=" + b17 + " invalid, skip resize");
            return;
        }
        java.util.Collection<fq0.x> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        int i17 = 0;
        for (fq0.x xVar : values) {
            int i18 = xVar.f347015f;
            if (i18 > 0 && i18 != b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeStaleFrameSet " + xVar.f347010a + " from " + xVar.f347015f + " to " + b17);
                xVar.j(b17, 0);
                i17++;
            }
        }
        if (i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeAllFrameSetsIfNeeded resized " + i17 + " frameSets to safeWidth=" + b17);
        }
    }
}
