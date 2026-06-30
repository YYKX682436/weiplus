package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class fy {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49500a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49501b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49502c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49503d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49504e = 9;

    /* renamed from: f, reason: collision with root package name */
    public static final int f49505f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final float f49506g = 200.0f;

    /* renamed from: h, reason: collision with root package name */
    public static final float f49507h = 60.0f;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f49508i = "color_texture_flat_style.png";

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f49509j = "color_point_texture.png";

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f49510k = "color_texture_line_v2.png";
    public boolean O;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> f49512l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> f49513m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f49514n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f49515o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f49516p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f49517q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f49518r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f49519s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f49520t;

    /* renamed from: u, reason: collision with root package name */
    public float f49521u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49522v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f49523w;

    /* renamed from: x, reason: collision with root package name */
    public float f49524x = 9.0f;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f49525y = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f49526z = true;
    public float A = 1.0f;
    public boolean B = true;
    public int C = 0;
    public boolean D = false;
    public boolean E = false;
    public android.graphics.Rect F = new android.graphics.Rect();
    public int G = 0;
    public java.lang.String H = "";
    public float I = -1.0f;

    /* renamed from: J, reason: collision with root package name */
    public int f49511J = -1;
    public int K = -15248742;
    public java.util.List<java.lang.Integer> L = null;
    public int M = 2;
    public int N = -7829368;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f49527a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f49528b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f49529c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f49530d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f49531e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f49532f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f49533g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f49534h = 7;

        /* renamed from: i, reason: collision with root package name */
        public static final int f49535i = 8;

        /* renamed from: j, reason: collision with root package name */
        public static final int f49536j = 9;

        /* renamed from: k, reason: collision with root package name */
        public static final int f49537k = 33;

        /* renamed from: l, reason: collision with root package name */
        public static final int f49538l = 19;

        /* renamed from: m, reason: collision with root package name */
        public static final int f49539m = 20;
    }

    /* loaded from: classes13.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f49540a;

        /* renamed from: b, reason: collision with root package name */
        public int f49541b;

        public b(int i17, int i18) {
            this.f49541b = i17;
            this.f49540a = i18;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            com.tencent.mapsdk.internal.fy.b bVar = (com.tencent.mapsdk.internal.fy.b) obj;
            return bVar.f49540a == this.f49540a && bVar.f49541b == this.f49541b;
        }
    }

    private com.tencent.mapsdk.internal.fy b(java.lang.String str) {
        this.f49525y = str;
        return this;
    }

    private com.tencent.mapsdk.internal.fy c(float f17) {
        this.f49524x = f17;
        return this;
    }

    private com.tencent.mapsdk.internal.fy d(float f17) {
        this.f49521u = f17;
        return this;
    }

    private com.tencent.mapsdk.internal.fy e(boolean z17) {
        this.E = z17;
        return this;
    }

    private int f() {
        return this.M;
    }

    public final com.tencent.mapsdk.internal.fy a(java.util.List<com.tencent.map.lib.models.GeoPoint> list) {
        if (list != null && list.size() >= 2) {
            java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList = new java.util.ArrayList<>(list.size());
            this.f49513m = arrayList;
            arrayList.addAll(list);
            if (this.f49513m.size() < 2) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c("参数points存在null值");
                return this;
            }
            java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList2 = new java.util.ArrayList<>(list.size());
            this.f49512l = arrayList2;
            arrayList2.addAll(this.f49513m);
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数points不能小于2!");
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.tencent.mapsdk.internal.fy.class == obj.getClass()) {
            com.tencent.mapsdk.internal.fy fyVar = (com.tencent.mapsdk.internal.fy) obj;
            if (java.lang.Float.compare(fyVar.f49521u, this.f49521u) == 0 && this.f49522v == fyVar.f49522v && this.f49523w == fyVar.f49523w && java.lang.Float.compare(fyVar.f49524x, this.f49524x) == 0 && this.f49526z == fyVar.f49526z && java.lang.Float.compare(fyVar.A, this.A) == 0 && this.B == fyVar.B && this.C == fyVar.C && this.D == fyVar.D && this.E == fyVar.E && this.G == fyVar.G && java.lang.Float.compare(fyVar.I, this.I) == 0 && this.f49511J == fyVar.f49511J && this.K == fyVar.K && this.M == fyVar.M && this.N == fyVar.N && this.O == fyVar.O && com.tencent.map.tools.Util.equals(this.f49512l, fyVar.f49512l) && com.tencent.map.tools.Util.equals(this.f49513m, fyVar.f49513m) && java.util.Arrays.equals(this.f49514n, fyVar.f49514n) && java.util.Arrays.equals(this.f49515o, fyVar.f49515o) && java.util.Arrays.equals(this.f49516p, fyVar.f49516p) && java.util.Arrays.equals(this.f49517q, fyVar.f49517q) && java.util.Arrays.equals(this.f49518r, fyVar.f49518r) && java.util.Arrays.equals(this.f49519s, fyVar.f49519s) && java.util.Arrays.equals(this.f49520t, fyVar.f49520t) && com.tencent.map.tools.Util.equals(this.f49525y, fyVar.f49525y) && com.tencent.map.tools.Util.equals(this.F, fyVar.F) && com.tencent.map.tools.Util.equals(this.H, fyVar.H) && com.tencent.map.tools.Util.equals(this.L, fyVar.L)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((com.tencent.map.tools.Util.hash(this.f49512l, this.f49513m, java.lang.Float.valueOf(this.f49521u), java.lang.Boolean.valueOf(this.f49522v), java.lang.Boolean.valueOf(this.f49523w), java.lang.Float.valueOf(this.f49524x), this.f49525y, java.lang.Boolean.valueOf(this.f49526z), java.lang.Float.valueOf(this.A), java.lang.Boolean.valueOf(this.B), java.lang.Integer.valueOf(this.C), java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(this.E), this.F, java.lang.Integer.valueOf(this.G), this.H, java.lang.Float.valueOf(this.I), java.lang.Integer.valueOf(this.f49511J), java.lang.Integer.valueOf(this.K), this.L, java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(this.N), java.lang.Boolean.valueOf(this.O)) * 31) + java.util.Arrays.hashCode(this.f49514n)) * 31) + java.util.Arrays.hashCode(this.f49515o)) * 31) + java.util.Arrays.hashCode(this.f49516p)) * 31) + java.util.Arrays.hashCode(this.f49517q)) * 31) + java.util.Arrays.hashCode(this.f49518r)) * 31) + java.util.Arrays.hashCode(this.f49519s)) * 31) + java.util.Arrays.hashCode(this.f49520t);
    }

    @java.lang.Deprecated
    private void b(float f17) {
        this.A = f17;
    }

    private com.tencent.mapsdk.internal.fy c(boolean z17) {
        this.B = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.fy d(boolean z17) {
        this.D = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.fy e(float f17) {
        this.I = f17;
        return this;
    }

    private int c() {
        return this.C;
    }

    private com.tencent.mapsdk.internal.fy d(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            this.f49515o = iArr;
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数endNums不能为空!");
        return this;
    }

    private float e() {
        return this.I;
    }

    public final com.tencent.mapsdk.internal.fy b(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (!this.f49522v) {
                this.f49518r = iArr;
                return this;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(this.N));
            for (int i17 = 0; i17 < iArr.length; i17++) {
                if (!arrayList.contains(java.lang.Integer.valueOf(iArr[i17]))) {
                    arrayList.add(java.lang.Integer.valueOf(iArr[i17]));
                }
                iArr[i17] = arrayList.indexOf(java.lang.Integer.valueOf(iArr[i17]));
            }
            this.f49518r = iArr;
            int size = arrayList.size();
            this.f49519s = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                this.f49519s[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数colors不能为空!");
        return this;
    }

    private com.tencent.mapsdk.internal.fy c(int i17) {
        this.G = i17;
        return this;
    }

    private com.tencent.mapsdk.internal.fy c(java.lang.String str) {
        this.H = str;
        return this;
    }

    private com.tencent.mapsdk.internal.fy c(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            this.f49514n = iArr;
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数startNums不能为空!");
        return this;
    }

    private int[] d() {
        return new int[]{this.f49511J, this.K};
    }

    private void d(int i17) {
        this.M = i17;
    }

    public final com.tencent.mapsdk.internal.fy a(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            this.f49517q = iArr;
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数startIndexes不能为空!");
        return this;
    }

    private com.tencent.mapsdk.internal.fy a(int i17) {
        this.N = i17;
        return this;
    }

    @java.lang.Deprecated
    private void a(java.lang.String str) {
        this.f49525y = str;
    }

    @java.lang.Deprecated
    private void a(boolean z17) {
        this.f49526z = z17;
    }

    private com.tencent.mapsdk.internal.fy a(float f17) {
        this.A = f17;
        return this;
    }

    public final com.tencent.mapsdk.internal.fy a(int[] iArr, int[] iArr2) {
        if (iArr != null && iArr.length > 0 && iArr2 != null && iArr2.length > 0) {
            if (!this.f49522v) {
                this.f49518r = iArr;
                return this;
            }
            if (iArr2.length < iArr.length) {
                int[] iArr3 = new int[iArr.length];
                for (int i17 = 0; i17 < iArr.length; i17++) {
                    if (i17 < iArr2.length) {
                        iArr3[i17] = iArr2[i17];
                    } else {
                        iArr3[i17] = iArr2[iArr2.length - 1];
                    }
                }
                iArr2 = iArr3;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i18 = this.N;
            arrayList.add(new com.tencent.mapsdk.internal.fy.b(i18, i18));
            this.f49518r = new int[iArr.length];
            for (int i19 = 0; i19 < iArr.length; i19++) {
                com.tencent.mapsdk.internal.fy.b bVar = new com.tencent.mapsdk.internal.fy.b(iArr[i19], iArr2[i19]);
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
                this.f49518r[i19] = arrayList.indexOf(bVar);
            }
            int size = arrayList.size();
            this.f49519s = new int[size];
            this.f49520t = new int[size];
            for (int i27 = 0; i27 < size; i27++) {
                this.f49519s[i27] = ((com.tencent.mapsdk.internal.fy.b) arrayList.get(i27)).f49541b;
                this.f49520t[i27] = ((com.tencent.mapsdk.internal.fy.b) arrayList.get(i27)).f49540a;
            }
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数colors 、borderColors为空，或者两者长度不同");
        return this;
    }

    private com.tencent.mapsdk.internal.fy b() {
        this.f49522v = true;
        return this;
    }

    private com.tencent.mapsdk.internal.fy b(boolean z17) {
        this.f49523w = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.fy b(int i17) {
        this.C = i17;
        return this;
    }

    public final com.tencent.mapsdk.internal.fy b(java.util.List<java.lang.Integer> list) {
        if (list != null && list.size() % 2 != 0) {
            list.add(list.get(list.size() - 1));
        }
        this.L = list;
        return this;
    }

    private com.tencent.mapsdk.internal.fy a(java.lang.String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            this.f49516p = strArr;
            return this;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("参数roadNames不能为空!");
        return this;
    }

    private com.tencent.mapsdk.internal.fy a(int i17, int i18) {
        this.f49511J = i17;
        this.K = i18;
        return this;
    }

    public final boolean a() {
        java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList = this.f49513m;
        if (arrayList != null && arrayList.size() >= 2) {
            int[] iArr = this.f49517q;
            if (iArr != null && iArr.length > 0) {
                int[] iArr2 = this.f49518r;
                if (iArr2 != null && iArr2.length > 0) {
                    return true;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.c("参数colors不能为空!");
                return false;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c("参数startIndexes不能为空!");
            return false;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("LineOptions中点的个数不能小于2");
        return false;
    }
}
