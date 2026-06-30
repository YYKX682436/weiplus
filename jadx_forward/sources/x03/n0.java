package x03;

/* loaded from: classes15.dex */
public final class n0 extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f532610d;

    /* renamed from: e, reason: collision with root package name */
    public long f532611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532612f;

    public n0(x03.u0 u0Var, java.lang.String mediaId, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f532612f = u0Var;
        this.f532610d = mediaId;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.x0 a17 = x03.x0.f532694d.a();
        java.lang.String str2 = a17.f532697b.b(this.f532610d).f532549e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        x03.u0 u0Var = this.f532612f;
        java.lang.String str3 = u0Var.f532666a;
        java.util.Objects.toString(u0Var.f532667b);
        return str2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.x0 a17 = x03.x0.f532694d.a();
        java.lang.Long valueOf = java.lang.Long.valueOf(a17.f532697b.b(this.f532610d).f532547c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        return valueOf.longValue();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getM3U8Content */
    public java.lang.String mo103114x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String mo103114x79c2649a = super.mo103114x79c2649a(i17, str, str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo103114x79c2649a, "getM3U8Content(...)");
        return mo103114x79c2649a;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.u0 u0Var = this.f532612f;
        java.lang.String str2 = u0Var.f532666a;
        java.util.Objects.toString(u0Var.f532667b);
        int i18 = this.f532612f.f532674i;
        if (j18 <= 0) {
            return 0;
        }
        x03.v0 v0Var = x03.x0.f532694d;
        x03.f b17 = v0Var.a().f532697b.b(this.f532610d);
        long j19 = this.f532611e;
        long j27 = b17.f532545a;
        if (j19 != j27) {
            this.f532611e = j27;
            ((ku5.t0) ku5.t0.f394148d).B(new x03.m0(this.f532612f));
        }
        if (b17.f532548d) {
            java.lang.String str3 = this.f532612f.f532666a;
        } else {
            if (this.f532612f.f532674i != 6) {
                boolean m37796x95bf072 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(this.f532610d);
                if (m37796x95bf072 && ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37752x9b94c84e(this.f532610d, j17, j18)) {
                    java.lang.String str4 = this.f532612f.f532666a;
                } else {
                    z17 = m37796x95bf072;
                }
            } else {
                z17 = false;
            }
            x03.u0 u0Var2 = this.f532612f;
            int i19 = u0Var2.f532674i;
            if (i19 != 3 && i19 != 5) {
                return 0;
            }
            if (i19 != 3) {
                if (i19 != 5 || (u0Var2.f532676k == j17 && u0Var2.f532677l == j18)) {
                    return 0;
                }
                x03.j jVar = v0Var.a().f532698c;
                java.lang.String mediaId = this.f532610d;
                jVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
                if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(mediaId, j17, j18, 0) != 0) {
                    java.lang.String str5 = this.f532612f.f532666a;
                    v0Var.a().f532697b.d(false, this.f532612f.f532668c, this.f532610d, java.lang.Long.valueOf(j17 + j18));
                    this.f532612f.f532677l = 0L;
                } else {
                    x03.u0 u0Var3 = this.f532612f;
                    u0Var3.f532676k = j17;
                    u0Var3.f532677l = j18;
                }
                return 0;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(b17.f532546b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            long j28 = j17 + j18;
            if (valueOf.longValue() < j28) {
                if (z17 && b17.f532553i) {
                    x03.u0 u0Var4 = this.f532612f;
                    if (u0Var4.f532676k == j17 && u0Var4.f532677l == j18) {
                        return 0;
                    }
                    x03.j jVar2 = v0Var.a().f532698c;
                    java.lang.String mediaId2 = this.f532610d;
                    jVar2.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId2, "mediaId");
                    boolean z18 = z17;
                    int m37765xff4560f6 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(mediaId2, j17, j18, 0);
                    if (m37765xff4560f6 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f532612f.f532666a, "[key] request video data error " + this.f532610d + ", ret:" + m37765xff4560f6 + " state:" + this.f532612f.f532674i + " exists:" + z18 + ", offset:" + j17 + ", length:" + j18 + ", cache:" + java.lang.Long.valueOf(b17.f532545a));
                        v0Var.a().f532697b.d(false, this.f532612f.f532668c, this.f532610d, java.lang.Long.valueOf(j28));
                        this.f532612f.f532677l = 0L;
                    } else {
                        x03.u0 u0Var5 = this.f532612f;
                        u0Var5.f532676k = j17;
                        u0Var5.f532677l = j18;
                    }
                } else if (!b17.f532551g) {
                    v0Var.a().f532697b.d(false, this.f532612f.f532668c, this.f532610d, java.lang.Long.valueOf(j28));
                }
                java.lang.String str6 = this.f532612f.f532666a;
                return 0;
            }
            java.lang.String str7 = this.f532612f.f532666a;
        }
        return (int) j18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.u0 u0Var = this.f532612f;
        java.lang.String str2 = u0Var.f532666a;
        java.util.Objects.toString(u0Var.f532667b);
        return this.f532610d.hashCode();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.u0 u0Var = this.f532612f;
        java.lang.String str2 = u0Var.f532666a;
        java.util.Objects.toString(u0Var.f532667b);
        return 0;
    }
}
