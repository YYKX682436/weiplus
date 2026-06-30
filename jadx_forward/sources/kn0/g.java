package kn0;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f391067a;

    /* renamed from: b, reason: collision with root package name */
    public long f391068b;

    /* renamed from: c, reason: collision with root package name */
    public int f391069c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391070d;

    /* renamed from: e, reason: collision with root package name */
    public long f391071e;

    /* renamed from: f, reason: collision with root package name */
    public long f391072f;

    /* renamed from: g, reason: collision with root package name */
    public kn0.a f391073g;

    /* renamed from: h, reason: collision with root package name */
    public int f391074h;

    /* renamed from: i, reason: collision with root package name */
    public int f391075i;

    /* renamed from: j, reason: collision with root package name */
    public int f391076j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.HashMap f391077k;

    /* renamed from: l, reason: collision with root package name */
    public int f391078l;

    /* renamed from: m, reason: collision with root package name */
    public final long f391079m;

    /* renamed from: n, reason: collision with root package name */
    public int f391080n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ka4 f391081o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391082p;

    /* renamed from: q, reason: collision with root package name */
    public long f391083q;

    /* renamed from: r, reason: collision with root package name */
    public long f391084r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f391085s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f391086t;

    public g(java.lang.String str, long j17, int i17, java.lang.String str2, long j18, long j19, kn0.a aVar, int i18, int i19, int i27, java.util.HashMap hashMap, int i28, long j27, int i29, r45.ka4 ka4Var, java.lang.String str3, long j28, long j29, boolean z17, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i38;
        java.lang.String nickName;
        java.lang.String liveName = (i37 & 1) != 0 ? "" : str;
        long j37 = (i37 & 2) != 0 ? -1L : j17;
        int i39 = (i37 & 4) != 0 ? 0 : i17;
        java.lang.String str4 = (i37 & 8) != 0 ? "" : str2;
        long j38 = (i37 & 16) != 0 ? -1L : j18;
        long j39 = (i37 & 32) == 0 ? j19 : -1L;
        kn0.a cdnSwitchMode = (i37 & 64) != 0 ? kn0.a.f391027e : aVar;
        int i47 = (i37 & 128) != 0 ? 0 : i18;
        int i48 = (i37 & 256) != 0 ? 0 : i19;
        int i49 = (i37 & 512) != 0 ? -1 : i27;
        java.util.HashMap cdnUrlMap = (i37 & 1024) != 0 ? new java.util.LinkedHashMap() : hashMap;
        int i57 = i49;
        int i58 = (i37 & 2048) != 0 ? 0 : i28;
        long currentTimeMillis = (i37 & 4096) != 0 ? java.lang.System.currentTimeMillis() : j27;
        int i59 = (i37 & 8192) != 0 ? 0 : i29;
        r45.ka4 channelParams = (i37 & 16384) != 0 ? new r45.ka4() : ka4Var;
        if ((i37 & 32768) != 0) {
            i38 = i48;
            nickName = "";
        } else {
            i38 = i48;
            nickName = str3;
        }
        long j47 = (i37 & 65536) != 0 ? 0L : j28;
        long j48 = (i37 & 131072) != 0 ? 0L : j29;
        boolean z18 = (i37 & 262144) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveName, "liveName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnSwitchMode, "cdnSwitchMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnUrlMap, "cdnUrlMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelParams, "channelParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f391067a = liveName;
        this.f391068b = j37;
        this.f391069c = i39;
        this.f391070d = str4;
        this.f391071e = j38;
        this.f391072f = j39;
        this.f391073g = cdnSwitchMode;
        this.f391074h = i47;
        this.f391075i = i38;
        this.f391076j = i57;
        this.f391077k = cdnUrlMap;
        this.f391078l = i58;
        this.f391079m = currentTimeMillis;
        this.f391080n = i59;
        this.f391081o = channelParams;
        this.f391082p = nickName;
        this.f391083q = j47;
        this.f391084r = j48;
        this.f391085s = z18;
        this.f391086t = "LiveRoomInfo_" + m143740x8cdac1b();
    }

    public final int a() {
        if (b()) {
            return this.f391076j;
        }
        kn0.r g17 = g(this.f391074h);
        if (g17 != null) {
            return g17.f391130b;
        }
        return 0;
    }

    public final boolean b() {
        java.lang.Object obj;
        int i17 = this.f391076j;
        if (i17 < 0) {
            return false;
        }
        java.util.Collection values = this.f391077k.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((kn0.r) obj).f391130b == i17) {
                break;
            }
        }
        return ((kn0.r) obj) != null;
    }

    public final java.lang.String c(int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18 = this.f391078l;
        java.lang.Object obj = null;
        java.lang.String str3 = this.f391086t;
        if (i18 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "getCdnBackUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f391077k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f391074h + ",cdnCustomerSwitchCfg:" + this.f391076j);
            kn0.r rVar = (kn0.r) this.f391077k.get(java.lang.Integer.valueOf(i17));
            if (rVar != null && (str = rVar.f391132d) != null) {
                return str;
            }
            kn0.r rVar2 = (kn0.r) this.f391077k.get(0);
            if (rVar2 != null) {
                return rVar2.f391132d;
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "getCdnBackUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f391077k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f391074h + ",cdnCustomerSwitchCfg:" + this.f391076j);
        java.util.LinkedList cdn_trans_info = this.f391081o.f460073m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdn_trans_info, "cdn_trans_info");
        java.util.Iterator it = cdn_trans_info.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.gv) next).f457077o == 1) {
                obj = next;
                break;
            }
        }
        r45.gv gvVar = (r45.gv) obj;
        return (gvVar == null || (str2 = gvVar.f457078p) == null) ? "" : str2;
    }

    public final int d(int i17) {
        kn0.r rVar = (kn0.r) this.f391077k.get(java.lang.Integer.valueOf(i17));
        if (rVar == null && (rVar = (kn0.r) this.f391077k.get(0)) == null) {
            return 0;
        }
        return rVar.f391130b;
    }

    public final java.lang.String e(int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.String str3;
        int i18 = this.f391078l;
        java.lang.String str4 = this.f391086t;
        java.lang.Object obj2 = null;
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "getCdnUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f391077k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f391074h + ",cdnCustomerSwitchCfg:" + this.f391076j);
            java.util.LinkedList cdn_trans_info = this.f391081o.f460073m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdn_trans_info, "cdn_trans_info");
            java.util.Iterator it = cdn_trans_info.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.gv) next).f457077o == 1) {
                    obj2 = next;
                    break;
                }
            }
            r45.gv gvVar = (r45.gv) obj2;
            return (gvVar == null || (str3 = gvVar.f457070e) == null) ? "" : str3;
        }
        java.util.Set keySet = this.f391077k.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        int b07 = kz5.n0.b0(keySet, java.lang.Integer.valueOf(i17));
        r45.ah5 ah5Var = this.f391081o.f460078p1;
        if (ah5Var != null && (linkedList = ah5Var.f451546d) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (((r45.bh5) obj).f452300d == b07) {
                    break;
                }
            }
            r45.bh5 bh5Var = (r45.bh5) obj;
            if (bh5Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "getCdnUrl cdnQualityTag:" + i17 + " urlIndex: " + b07 + " blockFlag: " + bh5Var.f452301e);
                if (bh5Var.f452301e == 1) {
                    return c(i17);
                }
                kn0.r rVar = (kn0.r) this.f391077k.get(java.lang.Integer.valueOf(i17));
                if (rVar != null && (str2 = rVar.f391129a) != null) {
                    return str2;
                }
                kn0.r rVar2 = (kn0.r) this.f391077k.get(0);
                if (rVar2 != null) {
                    return rVar2.f391129a;
                }
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "getCdnUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f391077k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f391074h + ",cdnCustomerSwitchCfg:" + this.f391076j);
        kn0.r rVar3 = (kn0.r) this.f391077k.get(java.lang.Integer.valueOf(i17));
        if (rVar3 != null && (str = rVar3.f391129a) != null) {
            return str;
        }
        kn0.r rVar4 = (kn0.r) this.f391077k.get(0);
        if (rVar4 != null) {
            return rVar4.f391129a;
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m143739xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.g)) {
            return false;
        }
        kn0.g gVar = (kn0.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391067a, gVar.f391067a) && this.f391068b == gVar.f391068b && this.f391069c == gVar.f391069c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391070d, gVar.f391070d) && this.f391071e == gVar.f391071e && this.f391072f == gVar.f391072f && this.f391073g == gVar.f391073g && this.f391074h == gVar.f391074h && this.f391075i == gVar.f391075i && this.f391076j == gVar.f391076j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391077k, gVar.f391077k) && this.f391078l == gVar.f391078l && this.f391079m == gVar.f391079m && this.f391080n == gVar.f391080n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391081o, gVar.f391081o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391082p, gVar.f391082p) && this.f391083q == gVar.f391083q && this.f391084r == gVar.f391084r && this.f391085s == gVar.f391085s;
    }

    public final r45.gv f(int i17) {
        java.lang.Object obj;
        java.util.LinkedList cdn_trans_info = this.f391081o.f460073m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdn_trans_info, "cdn_trans_info");
        java.util.Iterator it = cdn_trans_info.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.gv) obj).f457071f == i17) {
                break;
            }
        }
        return (r45.gv) obj;
    }

    public final kn0.r g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f391086t, "getLiveVideoInfo cdnQualityTag:" + i17 + ", liveInfo:" + this.f391077k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f391074h + ",cdnCustomerSwitchCfg:" + this.f391076j);
        return (kn0.r) this.f391077k.get(java.lang.Integer.valueOf(i17));
    }

    public final int h() {
        return this.f391080n;
    }

    /* renamed from: hashCode */
    public int m143740x8cdac1b() {
        int hashCode = ((((this.f391067a.hashCode() * 31) + java.lang.Long.hashCode(this.f391068b)) * 31) + java.lang.Integer.hashCode(this.f391069c)) * 31;
        java.lang.String str = this.f391070d;
        return ((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f391071e)) * 31) + java.lang.Long.hashCode(this.f391072f)) * 31) + this.f391073g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f391074h)) * 31) + java.lang.Integer.hashCode(this.f391075i)) * 31) + java.lang.Integer.hashCode(this.f391076j)) * 31) + this.f391077k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f391078l)) * 31) + java.lang.Long.hashCode(this.f391079m)) * 31) + java.lang.Integer.hashCode(this.f391080n)) * 31) + this.f391081o.hashCode()) * 31) + this.f391082p.hashCode()) * 31) + java.lang.Long.hashCode(this.f391083q)) * 31) + java.lang.Long.hashCode(this.f391084r)) * 31) + java.lang.Boolean.hashCode(this.f391085s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r3.f391130b != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r7 = ko0.t.f391436a;
        r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(int r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = r6.f391077k
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r0.next()
            if (r2 < 0) goto L42
            kn0.r r3 = (kn0.r) r3
            int r4 = r3.f391130b
            if (r4 != r7) goto L3b
            java.lang.String r4 = r3.f391131c
            r5 = 1
            if (r4 == 0) goto L33
            int r4 = r4.length()
            if (r4 != 0) goto L31
            goto L33
        L31:
            r4 = r1
            goto L34
        L33:
            r4 = r5
        L34:
            if (r4 != 0) goto L3b
            int r3 = r3.f391130b
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 == 0) goto L3f
            goto L48
        L3f:
            int r2 = r2 + 1
            goto L13
        L42:
            kz5.c0.p()
            r7 = 0
            throw r7
        L47:
            r2 = -1
        L48:
            ko0.t r7 = ko0.t.f391436a
            java.lang.String r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.g.i(int):int");
    }

    /* renamed from: toString */
    public java.lang.String m143741x9616526c() {
        return "LiveRoomInfo(liveName=" + this.f391067a + ", liveId=" + this.f391068b + ", audienceMode=" + this.f391069c + ", anchorUserId=" + this.f391070d + ", appId=" + this.f391071e + ", bizId=" + this.f391072f + ", cdnSwitchMode=" + this.f391073g + ", cdnQualitySvrcfg=" + this.f391074h + ", cdnH265BackCfg=" + this.f391075i + ", cdnCustomerSwitchLevel=" + this.f391076j + ", cdnUrlMap=" + this.f391077k + ", cdnAudioMode=" + this.f391078l + ", startTime=" + this.f391079m + ", seiMode=" + this.f391080n + ", channelParams=" + this.f391081o + ", nickName=" + this.f391082p + ", useTXLivePlayerCustomRender=" + this.f391083q + ", customRenderInfo=" + this.f391084r + ", enableP2P=" + this.f391085s + ')';
    }
}
