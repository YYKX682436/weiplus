package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class ri extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "project_id")
    java.lang.String f132693a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "min_level")
    int f132694b;

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "max_level")
    int f132695c;

    /* renamed from: d, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "marker_width")
    int f132696d;

    /* renamed from: e, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "marker_height")
    int f132697e;

    /* renamed from: f, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "day_pic_url")
    java.lang.String f132698f;

    /* renamed from: g, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "offline_time")
    java.lang.String f132699g;

    /* renamed from: h, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "online_time")
    java.lang.String f132700h;

    /* renamed from: i, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "latitude")
    private double f132701i;

    /* renamed from: j, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "longitude")
    private double f132702j;

    /* renamed from: k, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "marker_anchor_x")
    private float f132703k;

    /* renamed from: l, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "marker_anchor_y")
    private float f132704l;

    /* renamed from: m, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "night_pic_url")
    private java.lang.String f132705m;

    /* renamed from: n, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "rank")
    private int f132706n;

    /* renamed from: o, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    private com.tencent.mapsdk.internal.cc.a f132707o = com.tencent.mapsdk.internal.cc.a.IDLE;

    /* renamed from: p, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f132708p;

    /* renamed from: q, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f132709q;

    /* renamed from: com.tencent.mapsdk.internal.ri$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132710a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.cc.a.m36671xcee59d22().length];
            f132710a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.cc.a.IDLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.PREPARING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.WILL_ADD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.WILL_UPDATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.WILL_REMOVE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.ADD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.SHOWING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f132710a[com.tencent.mapsdk.internal.cc.a.REMOVE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final java.lang.String a() {
        return this.f132693a;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f132701i, this.f132702j);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final int c() {
        return this.f132706n;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar2 = ccVar;
        if (this.f132693a == null) {
            this.f132693a = "";
        }
        return this.f132693a.compareTo(ccVar2.a());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge d() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ge.a(this.f132694b, this.f132695c);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> e() {
        return new android.util.Pair<>(java.lang.Integer.valueOf(this.f132696d), java.lang.Integer.valueOf(this.f132697e));
    }

    /* renamed from: equals */
    public boolean m36947xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri riVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri) obj;
            if (java.lang.Double.compare(riVar.f132701i, this.f132701i) == 0 && java.lang.Double.compare(riVar.f132702j, this.f132702j) == 0 && this.f132694b == riVar.f132694b && this.f132695c == riVar.f132695c && this.f132696d == riVar.f132696d && this.f132697e == riVar.f132697e && java.lang.Float.compare(riVar.f132703k, this.f132703k) == 0 && java.lang.Float.compare(riVar.f132704l, this.f132704l) == 0 && this.f132706n == riVar.f132706n && java.util.Objects.equals(this.f132693a, riVar.f132693a) && java.util.Objects.equals(this.f132698f, riVar.f132698f) && java.util.Objects.equals(this.f132705m, riVar.f132705m) && java.util.Objects.equals(this.f132699g, riVar.f132699g) && java.util.Objects.equals(this.f132700h, riVar.f132700h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final android.util.Pair<java.lang.Float, java.lang.Float> f() {
        return new android.util.Pair<>(java.lang.Float.valueOf(this.f132703k), java.lang.Float.valueOf(this.f132704l));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final com.tencent.mapsdk.internal.cc.a g() {
        return this.f132707o;
    }

    /* renamed from: hashCode */
    public int m36948x8cdac1b() {
        return java.util.Objects.hash(this.f132693a, java.lang.Double.valueOf(this.f132701i), java.lang.Double.valueOf(this.f132702j), java.lang.Integer.valueOf(this.f132694b), java.lang.Integer.valueOf(this.f132695c), java.lang.Integer.valueOf(this.f132696d), java.lang.Integer.valueOf(this.f132697e), java.lang.Float.valueOf(this.f132703k), java.lang.Float.valueOf(this.f132704l), this.f132698f, this.f132705m, this.f132699g, this.f132700h, java.lang.Integer.valueOf(this.f132706n));
    }

    /* renamed from: toString */
    public java.lang.String m36949x9616526c() {
        return "PromoteImageImpl{id='" + this.f132693a + "', latitude=" + this.f132701i + ", longitude=" + this.f132702j + ", minLevel=" + this.f132694b + ", maxLevel=" + this.f132695c + ", width=" + this.f132696d + ", height=" + this.f132697e + ", anchorX=" + this.f132703k + ", anchorY=" + this.f132704l + ", dayPicUrl='" + this.f132698f + "', nightPicUrl='" + this.f132705m + "', offlineTime='" + this.f132699g + "', onlineTime='" + this.f132700h + "', rank=" + this.f132706n + ", thisImageStatus=" + this.f132707o + '}';
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final java.lang.String a(boolean z17) {
        return z17 ? "" : this.f132698f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b(boolean z17) {
        return z17 ? this.f132709q : this.f132708p;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final boolean a(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        return b().f49501xaa2bac6c != 0.0d && b().f49502x83009af != 0.0d && java.lang.Integer.parseInt(this.f132699g) >= java.lang.Integer.parseInt(this.f132700h) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.f132693a) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.f132698f) && (i19 = this.f132696d) > 0 && (i27 = this.f132697e) > 0 && i19 <= 32 && i27 <= 32 && i19 % 4 == 0 && i27 % 4 == 0 && (i28 = this.f132694b) <= (i29 = this.f132695c) && i29 <= i18 && i28 >= i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.WILL_UPDATE) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.SHOWING) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.SHOWING) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.SHOWING) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.PREPARING) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.WILL_UPDATE) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0074, code lost:
    
        if (r0 != com.tencent.mapsdk.internal.cc.a.PREPARING) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r3.f132707o != com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.tencent.mapsdk.internal.cc.a r4) {
        /*
            r3 = this;
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            if (r0 == r4) goto L77
            int[] r0 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri.AnonymousClass1.f132710a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L6c;
                case 2: goto L5d;
                case 3: goto L52;
                case 4: goto L43;
                case 5: goto L38;
                case 6: goto L29;
                case 7: goto L1a;
                case 8: goto L12;
                default: goto L10;
            }
        L10:
            goto L77
        L12:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_REMOVE
            if (r0 == r2) goto L77
            goto L78
        L1a:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_UPDATE
            if (r0 == r2) goto L77
            goto L78
        L29:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_UPDATE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.SHOWING
            if (r0 == r2) goto L77
            goto L78
        L38:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.SHOWING
            if (r0 == r2) goto L77
            goto L78
        L43:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.PREPARING
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.SHOWING
            if (r0 == r2) goto L77
            goto L78
        L52:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.IDLE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.PREPARING
            if (r0 == r2) goto L77
            goto L78
        L5d:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.IDLE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_UPDATE
            if (r0 == r2) goto L77
            goto L78
        L6c:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f132707o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.REMOVE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.PREPARING
            if (r0 == r2) goto L77
            goto L78
        L77:
            r1 = 1
        L78:
            if (r1 == 0) goto L7d
            r3.f132707o = r4
            goto L9f
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "setStatus ["
            r0.<init>(r2)
            com.tencent.mapsdk.internal.cc$a r2 = r3.f132707o
            r0.append(r2)
            java.lang.String r2 = "] => ["
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "] fail."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "PromoteImage"
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(r0, r4)
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri.a(com.tencent.mapsdk.internal.cc$a):boolean");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e, boolean z17) {
        if (z17) {
            this.f132709q = c26010x4177761e;
        } else {
            this.f132708p = c26010x4177761e;
        }
    }

    private int a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
        if (this.f132693a == null) {
            this.f132693a = "";
        }
        return this.f132693a.compareTo(ccVar.a());
    }
}
