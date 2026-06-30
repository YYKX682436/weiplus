package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.PolylineOptions */
/* loaded from: classes13.dex */
public final class C4415x1291dc9e {

    /* renamed from: LINE_TYPE_DOTTEDLINE */
    public static final int f17484x2f793cf8 = 2;

    /* renamed from: LINE_TYPE_MULTICOLORLINE */
    public static final int f17485x863a5398 = 0;

    /* renamed from: arrowTexture */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e f17487xa2ea0cd2;

    /* renamed from: enableGradient */
    private boolean f17492x19d74dd3;

    /* renamed from: mIndoorInfo */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1 f17502xb5585ee;

    /* renamed from: reviseArrowTexture */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e f17504x6d3ea5ea;

    /* renamed from: segmentTexts */
    private java.util.List<vc1.a2> f17505x1f3d5973;

    /* renamed from: textStyle */
    private vc1.b2 f17506xc17f1c84;

    /* renamed from: isDottedLine */
    private boolean f17497xf4214608 = false;

    /* renamed from: isGeodesic */
    private boolean f17498x3e40d745 = false;

    /* renamed from: isVisible */
    private boolean f17499xf94337e8 = true;

    /* renamed from: color */
    private int f17488x5a72f63 = -16777216;

    /* renamed from: eraseColor */
    private int f17493x376f645d = -7829368;

    /* renamed from: width */
    private float f17507x6be2dc6 = 10.0f;

    /* renamed from: zIndex */
    private float f17508xd4677478 = 0.0f;

    /* renamed from: edgeWidth */
    private float f17491xcebde09 = 0.0f;

    /* renamed from: edgeColor */
    private int f17490xbd4dfa6 = -983041;

    /* renamed from: arrowGap */
    private float f17486xb3b43a0d = 90.0f;

    /* renamed from: lineType */
    private int f17501x46d9994e = 0;

    /* renamed from: colorTexture */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e f17489x3280b838 = null;

    /* renamed from: iColors */
    private int[] f17494x2b11f739 = null;

    /* renamed from: iIndexs */
    private int[] f17495x353d2baa = null;

    /* renamed from: iLevel */
    private int f17496xb78b849b = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17475xe09ee40a;

    /* renamed from: lineCap */
    private boolean f17500xa8ae33e = false;

    /* renamed from: points */
    private final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> f17503xc56c5ce3 = new java.util.ArrayList();

    /* renamed from: com.tencent.mapsdk.raster.model.PolylineOptions$Colors */
    /* loaded from: classes13.dex */
    public static final class Colors {

        /* renamed from: DARK_BLUE */
        public static final int f17509x396e3383 = 6;

        /* renamed from: GRAYBLUE */
        public static final int f17510x3522c13d = 8;

        /* renamed from: GREEN */
        public static final int f17511x40ed6e3 = 4;

        /* renamed from: GREY */
        public static final int f17512x2182df = 0;

        /* renamed from: LIGHT_BLUE */
        public static final int f17513x12364e03 = 1;

        /* renamed from: LIVER_RED */
        public static final int f17514xe34cfd98 = 9;

        /* renamed from: MID_BLUE */
        public static final int f17515xcdc4d011 = 5;
        public static final int RED = 2;

        /* renamed from: TRANSPARENT */
        public static final int f17516x196ff132 = 7;

        /* renamed from: YELLOW */
        public static final int f17517x9bcf5874 = 3;
    }

    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e add(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        if (c4406x873d1d26 == null) {
            return this;
        }
        this.f17503xc56c5ce3.add(c4406x873d1d26);
        return this;
    }

    /* renamed from: addAll */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37367xab35b940(java.lang.Iterable<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> iterable) {
        if (iterable == null) {
            return this;
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> it = iterable.iterator();
        while (it.hasNext()) {
            this.f17503xc56c5ce3.add(it.next());
        }
        return this;
    }

    /* renamed from: arrowGap */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37368xb3b43a0d(float f17) {
        if (f17 > 0.0f) {
            this.f17486xb3b43a0d = f17;
        }
        return this;
    }

    /* renamed from: arrowTexture */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37369xa2ea0cd2(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e c4392x4177761e) {
        if (c4392x4177761e != null) {
            this.f17487xa2ea0cd2 = c4392x4177761e;
        }
        return this;
    }

    /* renamed from: color */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37370x5a72f63(int i17) {
        this.f17488x5a72f63 = i17;
        return this;
    }

    /* renamed from: colorTexture */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37371x3280b838(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e c4392x4177761e) {
        this.f17489x3280b838 = c4392x4177761e;
        return this;
    }

    /* renamed from: colors */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37372xaf3ebd70(int[] iArr, int[] iArr2) {
        this.f17494x2b11f739 = iArr;
        this.f17495x353d2baa = iArr2;
        return this;
    }

    /* renamed from: edgeColor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37373xbd4dfa6(int i17) {
        this.f17490xbd4dfa6 = i17;
        return this;
    }

    /* renamed from: edgeWidth */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37374xcebde09(float f17) {
        if (f17 > 0.0f) {
            this.f17491xcebde09 = f17;
        }
        return this;
    }

    /* renamed from: eraseColor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37375x376f645d(int i17) {
        this.f17493x376f645d = i17;
        return this;
    }

    /* renamed from: geodesic */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37376x6d892ffb(boolean z17) {
        this.f17498x3e40d745 = z17;
        return this;
    }

    /* renamed from: getArrowGap */
    public float m37377x2f8e7783() {
        return this.f17486xb3b43a0d;
    }

    /* renamed from: getArrowTexture */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37378x3dc9f48() {
        return this.f17487xa2ea0cd2;
    }

    /* renamed from: getColor */
    public int m37379x7444d5ad() {
        return this.f17488x5a72f63;
    }

    /* renamed from: getColorTexture */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37380x93734aae() {
        return this.f17489x3280b838;
    }

    /* renamed from: getColors */
    public int[][] m37381x1455e066() {
        int[] iArr;
        int[] iArr2 = this.f17494x2b11f739;
        if (iArr2 == null || (iArr = this.f17495x353d2baa) == null || iArr2.length != iArr.length) {
            return null;
        }
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 2, iArr2.length);
        iArr3[0] = this.f17494x2b11f739;
        iArr3[1] = this.f17495x353d2baa;
        return iArr3;
    }

    /* renamed from: getEdgeColor */
    public int m37382xb4250f0() {
        return this.f17490xbd4dfa6;
    }

    /* renamed from: getEdgeWidth */
    public float m37383xc594f53() {
        return this.f17491xcebde09;
    }

    /* renamed from: getEraseColor */
    public int m37384x25b01c53() {
        return this.f17493x376f645d;
    }

    /* renamed from: getIndoorInfo */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1 m37385x1d644597() {
        return this.f17502xb5585ee;
    }

    /* renamed from: getLevel */
    public int m37386x74bf41ce() {
        return this.f17496xb78b849b;
    }

    /* renamed from: getLineType */
    public int m37387xc2b3d6c4() {
        return this.f17501x46d9994e;
    }

    /* renamed from: getPoints */
    public java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> m37388x2a837fd9() {
        return this.f17503xc56c5ce3;
    }

    /* renamed from: getReviseArrowTexture */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37389x809b07e0() {
        return this.f17504x6d3ea5ea;
    }

    /* renamed from: getSegmentTexts */
    public java.util.List<vc1.a2> m37390x802febe9() {
        return this.f17505x1f3d5973;
    }

    /* renamed from: getTextStyle */
    public vc1.b2 m37391xc0ec8dce() {
        return this.f17506xc17f1c84;
    }

    /* renamed from: getWidth */
    public float m37392x755bd410() {
        return this.f17507x6be2dc6;
    }

    /* renamed from: getZIndex */
    public float m37393x397e976e() {
        return this.f17508xd4677478;
    }

    /* renamed from: indoorInfo */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37394x2f238da1(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1 c4402xa5f569c1) {
        this.f17502xb5585ee = c4402xa5f569c1;
        return this;
    }

    /* renamed from: isDottedLine */
    public boolean m37395xf4214608() {
        return this.f17497xf4214608;
    }

    /* renamed from: isGeodesic */
    public boolean m37396x3e40d745() {
        return this.f17498x3e40d745;
    }

    /* renamed from: isGradientEnable */
    public boolean m37397x99136c9d() {
        return this.f17492x19d74dd3;
    }

    /* renamed from: isVisible */
    public boolean m37398xf94337e8() {
        return this.f17499xf94337e8;
    }

    /* renamed from: level */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37399x6219b84(int i17) {
        if (i17 >= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17475xe09ee40a && i17 <= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828) {
            this.f17496xb78b849b = i17;
        }
        return this;
    }

    /* renamed from: lineCap */
    public void m37400xa8ae33e(boolean z17) {
        this.f17500xa8ae33e = z17;
    }

    /* renamed from: lineType */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37402x46d9994e(int i17) {
        this.f17501x46d9994e = i17;
        return this;
    }

    /* renamed from: reviseArrowTexture */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37403x6d3ea5ea(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e c4392x4177761e) {
        if (c4392x4177761e != null) {
            this.f17504x6d3ea5ea = c4392x4177761e;
        }
        return this;
    }

    /* renamed from: setDottedLine */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37404x8f1b4f40(boolean z17) {
        this.f17497xf4214608 = z17;
        return this;
    }

    /* renamed from: setEnableGradient */
    public void m37405xd06582d5(boolean z17) {
        this.f17492x19d74dd3 = z17;
    }

    /* renamed from: setSegmentTexts */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37406xb678e6f5(java.util.List<vc1.a2> list) {
        this.f17505x1f3d5973 = list;
        return this;
    }

    /* renamed from: setTextStyle */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37407x1d404e42(vc1.b2 b2Var) {
        this.f17506xc17f1c84 = b2Var;
        return this;
    }

    /* renamed from: visible */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37408x1bd1f072(boolean z17) {
        this.f17499xf94337e8 = z17;
        return this;
    }

    /* renamed from: width */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37409x6be2dc6(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.f17507x6be2dc6 = f17;
        return this;
    }

    /* renamed from: zIndex */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e m37410xd4677478(float f17) {
        this.f17508xd4677478 = f17;
        return this;
    }

    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e add(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26... c4406x873d1d26Arr) {
        if (c4406x873d1d26Arr == null) {
            return this;
        }
        this.f17503xc56c5ce3.addAll(java.util.Arrays.asList(c4406x873d1d26Arr));
        return this;
    }

    /* renamed from: lineCap */
    public boolean m37401xa8ae33e() {
        return this.f17500xa8ae33e;
    }
}
