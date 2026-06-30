package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ri extends com.tencent.map.tools.json.JsonComposer implements com.tencent.mapsdk.internal.cc {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "project_id")
    java.lang.String f51160a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "min_level")
    int f51161b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "max_level")
    int f51162c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "marker_width")
    int f51163d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "marker_height")
    int f51164e;

    /* renamed from: f, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "day_pic_url")
    java.lang.String f51165f;

    /* renamed from: g, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "offline_time")
    java.lang.String f51166g;

    /* renamed from: h, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "online_time")
    java.lang.String f51167h;

    /* renamed from: i, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "latitude")
    private double f51168i;

    /* renamed from: j, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "longitude")
    private double f51169j;

    /* renamed from: k, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "marker_anchor_x")
    private float f51170k;

    /* renamed from: l, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "marker_anchor_y")
    private float f51171l;

    /* renamed from: m, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "night_pic_url")
    private java.lang.String f51172m;

    /* renamed from: n, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "rank")
    private int f51173n;

    /* renamed from: o, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    private com.tencent.mapsdk.internal.cc.a f51174o = com.tencent.mapsdk.internal.cc.a.IDLE;

    /* renamed from: p, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f51175p;

    /* renamed from: q, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f51176q;

    /* renamed from: com.tencent.mapsdk.internal.ri$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51177a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.cc.a.values().length];
            f51177a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.cc.a.IDLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.PREPARING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.WILL_ADD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.WILL_UPDATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.WILL_REMOVE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.ADD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.SHOWING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f51177a[com.tencent.mapsdk.internal.cc.a.REMOVE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final java.lang.String a() {
        return this.f51160a;
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng b() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.f51168i, this.f51169j);
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final int c() {
        return this.f51173n;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.tencent.mapsdk.internal.cc ccVar) {
        com.tencent.mapsdk.internal.cc ccVar2 = ccVar;
        if (this.f51160a == null) {
            this.f51160a = "";
        }
        return this.f51160a.compareTo(ccVar2.a());
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final com.tencent.mapsdk.internal.ge d() {
        return com.tencent.mapsdk.internal.ge.a(this.f51161b, this.f51162c);
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> e() {
        return new android.util.Pair<>(java.lang.Integer.valueOf(this.f51163d), java.lang.Integer.valueOf(this.f51164e));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.tencent.mapsdk.internal.ri riVar = (com.tencent.mapsdk.internal.ri) obj;
            if (java.lang.Double.compare(riVar.f51168i, this.f51168i) == 0 && java.lang.Double.compare(riVar.f51169j, this.f51169j) == 0 && this.f51161b == riVar.f51161b && this.f51162c == riVar.f51162c && this.f51163d == riVar.f51163d && this.f51164e == riVar.f51164e && java.lang.Float.compare(riVar.f51170k, this.f51170k) == 0 && java.lang.Float.compare(riVar.f51171l, this.f51171l) == 0 && this.f51173n == riVar.f51173n && java.util.Objects.equals(this.f51160a, riVar.f51160a) && java.util.Objects.equals(this.f51165f, riVar.f51165f) && java.util.Objects.equals(this.f51172m, riVar.f51172m) && java.util.Objects.equals(this.f51166g, riVar.f51166g) && java.util.Objects.equals(this.f51167h, riVar.f51167h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final android.util.Pair<java.lang.Float, java.lang.Float> f() {
        return new android.util.Pair<>(java.lang.Float.valueOf(this.f51170k), java.lang.Float.valueOf(this.f51171l));
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final com.tencent.mapsdk.internal.cc.a g() {
        return this.f51174o;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f51160a, java.lang.Double.valueOf(this.f51168i), java.lang.Double.valueOf(this.f51169j), java.lang.Integer.valueOf(this.f51161b), java.lang.Integer.valueOf(this.f51162c), java.lang.Integer.valueOf(this.f51163d), java.lang.Integer.valueOf(this.f51164e), java.lang.Float.valueOf(this.f51170k), java.lang.Float.valueOf(this.f51171l), this.f51165f, this.f51172m, this.f51166g, this.f51167h, java.lang.Integer.valueOf(this.f51173n));
    }

    public java.lang.String toString() {
        return "PromoteImageImpl{id='" + this.f51160a + "', latitude=" + this.f51168i + ", longitude=" + this.f51169j + ", minLevel=" + this.f51161b + ", maxLevel=" + this.f51162c + ", width=" + this.f51163d + ", height=" + this.f51164e + ", anchorX=" + this.f51170k + ", anchorY=" + this.f51171l + ", dayPicUrl='" + this.f51165f + "', nightPicUrl='" + this.f51172m + "', offlineTime='" + this.f51166g + "', onlineTime='" + this.f51167h + "', rank=" + this.f51173n + ", thisImageStatus=" + this.f51174o + '}';
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final java.lang.String a(boolean z17) {
        return z17 ? "" : this.f51165f;
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b(boolean z17) {
        return z17 ? this.f51176q : this.f51175p;
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final boolean a(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        return b().latitude != 0.0d && b().longitude != 0.0d && java.lang.Integer.parseInt(this.f51166g) >= java.lang.Integer.parseInt(this.f51167h) && !com.tencent.mapsdk.internal.hr.a(this.f51160a) && !com.tencent.mapsdk.internal.hr.a(this.f51165f) && (i19 = this.f51163d) > 0 && (i27 = this.f51164e) > 0 && i19 <= 32 && i27 <= 32 && i19 % 4 == 0 && i27 % 4 == 0 && (i28 = this.f51161b) <= (i29 = this.f51162c) && i29 <= i18 && i28 >= i17;
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
    
        if (r3.f51174o != com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    @Override // com.tencent.mapsdk.internal.cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.tencent.mapsdk.internal.cc.a r4) {
        /*
            r3 = this;
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            if (r0 == r4) goto L77
            int[] r0 = com.tencent.mapsdk.internal.ri.AnonymousClass1.f51177a
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
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_REMOVE
            if (r0 == r2) goto L77
            goto L78
        L1a:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_UPDATE
            if (r0 == r2) goto L77
            goto L78
        L29:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_UPDATE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.SHOWING
            if (r0 == r2) goto L77
            goto L78
        L38:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.SHOWING
            if (r0 == r2) goto L77
            goto L78
        L43:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.PREPARING
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.SHOWING
            if (r0 == r2) goto L77
            goto L78
        L52:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.IDLE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.PREPARING
            if (r0 == r2) goto L77
            goto L78
        L5d:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.IDLE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_ADD
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.WILL_UPDATE
            if (r0 == r2) goto L77
            goto L78
        L6c:
            com.tencent.mapsdk.internal.cc$a r0 = r3.f51174o
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.REMOVE
            if (r0 == r2) goto L77
            com.tencent.mapsdk.internal.cc$a r2 = com.tencent.mapsdk.internal.cc.a.PREPARING
            if (r0 == r2) goto L77
            goto L78
        L77:
            r1 = 1
        L78:
            if (r1 == 0) goto L7d
            r3.f51174o = r4
            goto L9f
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "setStatus ["
            r0.<init>(r2)
            com.tencent.mapsdk.internal.cc$a r2 = r3.f51174o
            r0.append(r2)
            java.lang.String r2 = "] => ["
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "] fail."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "PromoteImage"
            com.tencent.mapsdk.core.utils.log.LogUtil.e(r0, r4)
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ri.a(com.tencent.mapsdk.internal.cc$a):boolean");
    }

    @Override // com.tencent.mapsdk.internal.cc
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, boolean z17) {
        if (z17) {
            this.f51176q = bitmapDescriptor;
        } else {
            this.f51175p = bitmapDescriptor;
        }
    }

    private int a(com.tencent.mapsdk.internal.cc ccVar) {
        if (this.f51160a == null) {
            this.f51160a = "";
        }
        return this.f51160a.compareTo(ccVar.a());
    }
}
