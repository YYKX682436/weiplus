package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaNodeJNIBase */
/* loaded from: classes15.dex */
public abstract class AbstractC1578x115d8704 extends com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 implements java.lang.Cloneable {

    /* renamed from: BORDER */
    private static final byte f5161x751f682c = 4;

    /* renamed from: DOES_LEGACY_STRETCH_BEHAVIOUR */
    private static final byte f5162xf7604fd3 = 8;

    /* renamed from: HAS_NEW_LAYOUT */
    private static final byte f5163xae52ddae = 16;

    /* renamed from: LAYOUT_BORDER_START_INDEX */
    private static final byte f5164x39a2ae17 = 14;

    /* renamed from: LAYOUT_DIRECTION_INDEX */
    private static final byte f5165x8c7018bd = 5;

    /* renamed from: LAYOUT_EDGE_SET_FLAG_INDEX */
    private static final byte f5166x57e17c69 = 0;

    /* renamed from: LAYOUT_HEIGHT_INDEX */
    private static final byte f5167x609d4e8f = 2;

    /* renamed from: LAYOUT_LEFT_INDEX */
    private static final byte f5168x77cf2af = 3;

    /* renamed from: LAYOUT_MARGIN_START_INDEX */
    private static final byte f5169x1d9a8c99 = 6;

    /* renamed from: LAYOUT_PADDING_START_INDEX */
    private static final byte f5170xb466ae92 = 10;

    /* renamed from: LAYOUT_TOP_INDEX */
    private static final byte f5171xdbfeda53 = 4;

    /* renamed from: LAYOUT_WIDTH_INDEX */
    private static final byte f5172x5b2b5344 = 1;

    /* renamed from: MARGIN */
    private static final byte f5173x871f79ae = 1;

    /* renamed from: PADDING */
    private static final byte f5174xfabbc7f1 = 2;
    private float[] arr;

    /* renamed from: mBaselineFunction */
    private com.p166x1da19ac6.p169x38ae70.InterfaceC1555x3cbbefed f5175x39dc73ca;

    /* renamed from: mChildren */
    private java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> f5176x87e8058c;

    /* renamed from: mData */
    private java.lang.Object f5177x62065b7;

    /* renamed from: mHasNewLayout */
    private boolean f5178x265bcc7d;

    /* renamed from: mLayoutDirection */
    private int f5179x5b1c4b48;

    /* renamed from: mMeasureFunction */
    private com.p166x1da19ac6.p169x38ae70.InterfaceC1571x4a7062a6 f5180xad716f29;

    /* renamed from: mNativePointer */
    protected long f5181xa2496b9;

    /* renamed from: mOwner */
    private com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 f5182xbe913e46;

    /* renamed from: com.facebook.yoga.YogaNodeJNIBase$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$facebook$yoga$YogaEdge */
        static final /* synthetic */ int[] f5183x23ff9426;

        static {
            int[] iArr = new int[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.m16791xcee59d22().length];
            f5183x23ff9426 = iArr;
            try {
                iArr[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f5183x23ff9426[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f5183x23ff9426[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f5183x23ff9426[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f5183x23ff9426[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f5183x23ff9426[com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private AbstractC1578x115d8704(long j17) {
        this.arr = null;
        this.f5179x5b1c4b48 = 0;
        this.f5178x265bcc7d = true;
        if (j17 != 0) {
            this.f5181xa2496b9 = j17;
            return;
        }
        throw new java.lang.IllegalStateException("Failed to allocate native memory");
    }

    /* renamed from: clearChildren */
    private void m17027x36e9db6c() {
        this.f5176x87e8058c = null;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16844x3ade50c3(this.f5181xa2496b9);
    }

    /* renamed from: replaceChild */
    private final long m17028x19ebe2c8(com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 abstractC1578x115d8704, int i17) {
        java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> list = this.f5176x87e8058c;
        if (list == null) {
            throw new java.lang.IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i17);
        this.f5176x87e8058c.add(i17, abstractC1578x115d8704);
        abstractC1578x115d8704.f5182xbe913e46 = this;
        return abstractC1578x115d8704.f5181xa2496b9;
    }

    /* renamed from: valueFromLong */
    private static com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 m17029x896761d7(long j17) {
        return new com.p166x1da19ac6.p169x38ae70.C1586x897e98c1(java.lang.Float.intBitsToFloat((int) j17), (int) (j17 >> 32));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: addChildAt */
    public void mo16927x9e387e8e(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2, int i17) {
        com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 abstractC1578x115d8704 = (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704) abstractC1575xc25b7cb2;
        if (abstractC1578x115d8704.f5182xbe913e46 != null) {
            throw new java.lang.IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if (this.f5176x87e8058c == null) {
            this.f5176x87e8058c = new java.util.ArrayList(4);
        }
        this.f5176x87e8058c.add(i17, abstractC1578x115d8704);
        abstractC1578x115d8704.f5182xbe913e46 = this;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16848x89c9f96c(this.f5181xa2496b9, abstractC1578x115d8704.f5181xa2496b9, i17);
    }

    /* renamed from: baseline */
    public final float m17030x996ee645(float f17, float f18) {
        return this.f5175x39dc73ca.m16753x996ee645(this, f17, f18);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: calculateLayout */
    public void mo16928xaf6a4630(float f17, float f18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> list = ((com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704) arrayList.get(i17)).f5176x87e8058c;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704[] abstractC1578x115d8704Arr = (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704[]) arrayList.toArray(new com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704[arrayList.size()]);
        long[] jArr = new long[abstractC1578x115d8704Arr.length];
        for (int i18 = 0; i18 < abstractC1578x115d8704Arr.length; i18++) {
            jArr[i18] = abstractC1578x115d8704Arr[i18].f5181xa2496b9;
        }
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16843x18425cff(this.f5181xa2496b9, f17, f18, jArr, abstractC1578x115d8704Arr);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: copyStyle */
    public void mo16931x5915df3c(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16846x2d829ff3(this.f5181xa2496b9, ((com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704) abstractC1575xc25b7cb2).f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: dirty */
    public void mo16932x5b2a3d2() {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16852xbb37d98a(this.f5181xa2496b9);
    }

    /* renamed from: dirtyAllDescendants */
    public void m17031x1d23fb27() {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16851x389e1a05(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getAlignContent */
    public com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 mo16933x3416c82a() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55.m16749xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16862xd62aa742(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getAlignItems */
    public com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 mo16934xaee0b3b1() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55.m16749xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16863xd180181b(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getAlignSelf */
    public com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 mo16935x68c1413b() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55.m16749xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16864x48d921a3(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getAspectRatio */
    public float mo16936x1aef895d() {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16865xc475e401(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getBorder */
    public float mo16937x12a39722(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16866xd5aebe8a(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getChildCount */
    public int mo16939x3d79f549() {
        java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> list = this.f5176x87e8058c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getData */
    public java.lang.Object mo16940xfb7e5820() {
        return this.f5177x62065b7;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getDisplay */
    public com.p166x1da19ac6.p169x38ae70.EnumC1563x7a128c12 mo16941xa172548c() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1563x7a128c12.m16783xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16868x3ce4faf2(this.f5181xa2496b9));
    }

    /* renamed from: getDoesLegacyStretchFlagAffectsLayout */
    public boolean m17032x51c757ef() {
        float[] fArr = this.arr;
        return fArr != null && (((int) fArr[0]) & 8) == 8;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getFlex */
    public float mo16942xfb7f686f() {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16872x1def7bdd(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getFlexBasis */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16943x951b690f() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16869x9859f94f(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getFlexDirection */
    public com.p166x1da19ac6.p169x38ae70.EnumC1566x8b1dc6d6 mo16944x833fcbd0() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1566x8b1dc6d6.m16801xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16870x4e4cce6e(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getFlexGrow */
    public float mo16945xe3c99922() {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16871xeebeca(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getFlexShrink */
    public float mo16946x2bb64b58() {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16873xed7b0b14(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getHeight */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16947x1c4fb41d() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16875x69af3baf(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getJustifyContent */
    public com.p166x1da19ac6.p169x38ae70.EnumC1567xcbf3dde0 mo16948x5d7f2cbf() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1567xcbf3dde0.m16807xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16876xc9ce10cd(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutBorder */
    public float mo16949xb41c666c(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f17 = fArr[0];
        if ((((int) f17) & 4) != 4) {
            return 0.0f;
        }
        int i17 = (14 - ((((int) f17) & 1) == 1 ? 0 : 4)) - ((((int) f17) & 2) != 2 ? 4 : 0);
        switch (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704.AnonymousClass1.f5183x23ff9426[enumC1564xc2573c6d.ordinal()]) {
            case 1:
                return this.arr[i17];
            case 2:
                return this.arr[i17 + 1];
            case 3:
                return this.arr[i17 + 2];
            case 4:
                return this.arr[i17 + 3];
            case 5:
                return mo16950x6fcfed3f() == com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL ? this.arr[i17 + 2] : this.arr[i17];
            case 6:
                return mo16950x6fcfed3f() == com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL ? this.arr[i17] : this.arr[i17 + 2];
            default:
                throw new java.lang.IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutDirection */
    public com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf mo16950x6fcfed3f() {
        float[] fArr = this.arr;
        return com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.m16777xdc92efe5(fArr != null ? (int) fArr[5] : this.f5179x5b1c4b48);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutHeight */
    public float mo16951xbdc88367() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutMargin */
    public float mo16952xc61c77ee(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        switch (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704.AnonymousClass1.f5183x23ff9426[enumC1564xc2573c6d.ordinal()]) {
            case 1:
                return this.arr[6];
            case 2:
                return this.arr[7];
            case 3:
                return this.arr[8];
            case 4:
                return this.arr[9];
            case 5:
                return mo16950x6fcfed3f() == com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL ? this.arr[8] : this.arr[6];
            case 6:
                return mo16950x6fcfed3f() == com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL ? this.arr[6] : this.arr[8];
            default:
                throw new java.lang.IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutPadding */
    public float mo16953x9b5e91d1(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f17 = fArr[0];
        if ((((int) f17) & 2) != 2) {
            return 0.0f;
        }
        int i17 = 10 - ((((int) f17) & 1) != 1 ? 4 : 0);
        switch (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704.AnonymousClass1.f5183x23ff9426[enumC1564xc2573c6d.ordinal()]) {
            case 1:
                return this.arr[i17];
            case 2:
                return this.arr[i17 + 1];
            case 3:
                return this.arr[i17 + 2];
            case 4:
                return this.arr[i17 + 3];
            case 5:
                return mo16950x6fcfed3f() == com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL ? this.arr[i17 + 2] : this.arr[i17];
            case 6:
                return mo16950x6fcfed3f() == com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL ? this.arr[i17] : this.arr[i17 + 2];
            default:
                throw new java.lang.IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutWidth */
    public float mo16954x5146f386() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutX */
    public float mo16955x3b51a638() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getLayoutY */
    public float mo16956x3b51a639() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getMargin */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16957x24a3a8a4(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16877x8ba425c8(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2()));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getMaxHeight */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16958xc96bf8f5() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16878x837397a9(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getMaxWidth */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16959x93b79438() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16879x2004e3f4(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getMinHeight */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16960xf7770f63() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16880x9fbac27b(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getMinWidth */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16961x29d8f80a() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16881xf7a416e2(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getOverflow */
    public com.p166x1da19ac6.p169x38ae70.EnumC1581xd6d2aab2 mo16962x9b6bf178() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1581xd6d2aab2.m17046xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16882xb6347eb4(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getPadding */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16964xdbd77db(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16883x78c6e143(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2()));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getPosition */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16966xa86cd69f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16884xf15f342d(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2()));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getPositionType */
    public com.p166x1da19ac6.p169x38ae70.EnumC1582xad8dfeb3 mo16967x62fa7279() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1582xad8dfeb3.m17052xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16885x65d2a693(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getStyleDirection */
    public com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf mo16968x8b16adc4() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.m16777xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16867x714e1755(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getWidth */
    public com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 mo16969x755bd410() {
        return m17029x896761d7(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16886xe561a72e(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getWrap */
    public com.p166x1da19ac6.p169x38ae70.EnumC1587xc25f9efa mo16970xfb8738c0() {
        return com.p166x1da19ac6.p169x38ae70.EnumC1587xc25f9efa.m17076xdc92efe5(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16874x4e89fb33(this.f5181xa2496b9));
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: hasNewLayout */
    public boolean mo16971x8ec6b370() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f5178x265bcc7d;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: indexOf */
    public int mo16972x73d44649(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2) {
        java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> list = this.f5176x87e8058c;
        if (list == null) {
            return -1;
        }
        return list.indexOf(abstractC1575xc25b7cb2);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: isBaselineDefined */
    public boolean mo16973xcae8d97a() {
        return this.f5175x39dc73ca != null;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: isDirty */
    public boolean mo16974x7a9b50c8() {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16849x81bb7567(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: isMeasureDefined */
    public boolean mo16975x2008b295() {
        return this.f5180xad716f29 != null;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: isReferenceBaseline */
    public boolean mo16976x35b0faa6() {
        return com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16850x7e7fe7c9(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: markLayoutSeen */
    public void mo16977xbef51f72() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f5178x265bcc7d = false;
    }

    /* renamed from: measure */
    public final long m17033x37eda55e(float f17, int i17, float f18, int i18) {
        if (mo16975x2008b295()) {
            return this.f5180xad716f29.mo16823x37eda55e(this, f17, com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71.m16826xdc92efe5(i17), f18, com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71.m16826xdc92efe5(i18));
        }
        throw new java.lang.RuntimeException("Measure function isn't defined!");
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: print */
    public void mo16978x65fb2ad() {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16855x28666fe2(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: reset */
    public void mo16980x6761d4f() {
        this.f5180xad716f29 = null;
        this.f5175x39dc73ca = null;
        this.f5177x62065b7 = null;
        this.arr = null;
        this.f5178x265bcc7d = true;
        this.f5179x5b1c4b48 = 0;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16857x59096a00(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setAlignContent */
    public void mo16981x6a5fc336(com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 enumC1554x885b9e55) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16887xd0140b6(this.f5181xa2496b9, enumC1554x885b9e55.m16752x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setAlignItems */
    public void mo16982xdd0501bd(com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 enumC1554x885b9e55) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16888x64567e8f(this.f5181xa2496b9, enumC1554x885b9e55.m16752x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setAlignSelf */
    public void mo16983xc51501af(com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 enumC1554x885b9e55) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16889x7f221caf(this.f5181xa2496b9, enumC1554x885b9e55.m16752x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setAspectRatio */
    public void mo16984xb154fcd1(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16890x8c6c4c0d(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setBaselineFunction */
    public void mo16985x5f99a5bf(com.p166x1da19ac6.p169x38ae70.InterfaceC1555x3cbbefed interfaceC1555x3cbbefed) {
        this.f5175x39dc73ca = interfaceC1555x3cbbefed;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16858x9b5585a(this.f5181xa2496b9, interfaceC1555x3cbbefed != null);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setBorder */
    public void mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16891x32027efe(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setData */
    public void mo16987x76491f2c(java.lang.Object obj) {
        this.f5177x62065b7 = obj;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setDirection */
    public void mo16988x2261393d(com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf enumC1562xf77de6cf) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16892xa7971261(this.f5181xa2496b9, enumC1562xf77de6cf.m16780x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setDisplay */
    public void mo16989x14e3a200(com.p166x1da19ac6.p169x38ae70.EnumC1563x7a128c12 enumC1563x7a128c12) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16893x6b0948fe(this.f5181xa2496b9, enumC1563x7a128c12.m16786x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlex */
    public void mo16990x764a2f7b(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16899x9160c951(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlexBasis */
    public void mo16991xf16f2983(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16895xcea2f45b(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlexBasisAuto */
    public void mo16992xeb0801d2() {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16894x8a11c12c(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlexBasisPercent */
    public void mo16993xd6dba942(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16896x3982a3aa(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlexDirection */
    public void mo16994x16163244(com.p166x1da19ac6.p169x38ae70.EnumC1566x8b1dc6d6 enumC1566x8b1dc6d6) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16897xf249637a(this.f5181xa2496b9, enumC1566x8b1dc6d6.m16804x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlexGrow */
    public void mo16995xde81fa2e(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16898x9754323e(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setFlexShrink */
    public void mo16996x59da9964(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16900x80517188(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setHeight */
    public void mo16997xf84e829(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16903xc602fc23(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setHeightAuto */
    public void mo16998x7531fd78() {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16902x3f18a4f4(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setHeightPercent */
    public void mo16999x227743dc(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16904x8647cae2(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setIsReferenceBaseline */
    public void mo17000xdc2596e4(boolean z17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16860xc946a937(this.f5181xa2496b9, z17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setJustifyContent */
    public void mo17001x257594cb(com.p166x1da19ac6.p169x38ae70.EnumC1567xcbf3dde0 enumC1567xcbf3dde0) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16905xa5641d41(this.f5181xa2496b9, enumC1567xcbf3dde0.m16810x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMargin */
    public void mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16907xe7f7e63c(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMarginAuto */
    public void mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16906x29e8da8d(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMarginPercent */
    public void mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16908x1d502a9(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMaxHeight */
    public void mo17005x25bfb969(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16909xb9bc92b5(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMaxHeightPercent */
    public void mo17006x44ea8a9c(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16910xcf250c10(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMaxWidth */
    public void mo17007x8e6ff544(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16911xb66a5768(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMaxWidthPercent */
    public void mo17008x79335261(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16912xaea527fd(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMeasureFunction */
    public void mo17009xf8fbaa94(com.p166x1da19ac6.p169x38ae70.InterfaceC1571x4a7062a6 interfaceC1571x4a7062a6) {
        this.f5180xad716f29 = interfaceC1571x4a7062a6;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16859x71bbaf25(this.f5181xa2496b9, interfaceC1571x4a7062a6 != null);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMinHeight */
    public void mo17010x53cacfd7(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16913xd603bd87(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMinHeightPercent */
    public void mo17011x411bfc6e(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16914xcd1170fe(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMinWidth */
    public void mo17012x24915916(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16915x8e098a56(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setMinWidthPercent */
    public void mo17013x37035e4f(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16916x64416d4f(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setOverflow */
    public void mo17014x96245284(com.p166x1da19ac6.p169x38ae70.EnumC1581xd6d2aab2 enumC1581xd6d2aab2) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16917x4c99f228(this.f5181xa2496b9, enumC1581xd6d2aab2.m17049x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setPadding */
    public void mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16918xa6eb2f4f(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setPaddingPercent */
    public void mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16919x703ee36(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setPosition */
    public void mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16920x87c4a7a1(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setPositionPercent */
    public void mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d enumC1564xc2573c6d, float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16921x333d5a4(this.f5181xa2496b9, enumC1564xc2573c6d.m16792x2124a6c2(), f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setPositionType */
    public void mo17019x99436d85(com.p166x1da19ac6.p169x38ae70.EnumC1582xad8dfeb3 enumC1582xad8dfeb3) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16922x9ca94007(this.f5181xa2496b9, enumC1582xad8dfeb3.m17055x2124a6c2());
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setWidth */
    public void mo17020x53e9ee84(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16924xe01a083a(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setWidthAuto */
    public void mo17021x58a65e53() {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16923x200dcd8b(this.f5181xa2496b9);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setWidthPercent */
    public void mo17022x468a7121(float f17) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16925x17a646eb(this.f5181xa2496b9, f17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: setWrap */
    public void mo17023x7651ffcc(com.p166x1da19ac6.p169x38ae70.EnumC1587xc25f9efa enumC1587xc25f9efa) {
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16901xe4ef6ea7(this.f5181xa2496b9, enumC1587xc25f9efa.m17079x2124a6c2());
    }

    /* renamed from: swapChildAt */
    public void m17034xa105515c(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2, int i17) {
        com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 abstractC1578x115d8704 = (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704) abstractC1575xc25b7cb2;
        this.f5176x87e8058c.remove(i17);
        this.f5176x87e8058c.add(i17, abstractC1578x115d8704);
        abstractC1578x115d8704.f5182xbe913e46 = this;
        com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16926xb4e170c6(this.f5181xa2496b9, abstractC1578x115d8704.f5181xa2496b9, i17);
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: cloneWithChildren */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 mo16929x7b615ae2() {
        try {
            com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 abstractC1578x115d8704 = (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704) super.clone();
            long m16845xaec80732 = com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16845xaec80732(this.f5181xa2496b9);
            abstractC1578x115d8704.f5182xbe913e46 = null;
            abstractC1578x115d8704.f5181xa2496b9 = m16845xaec80732;
            for (int i17 = 0; i17 < abstractC1578x115d8704.mo16939x3d79f549(); i17++) {
                abstractC1578x115d8704.m17034xa105515c(abstractC1578x115d8704.mo16938x6a486239(i17).mo16929x7b615ae2(), i17);
            }
            return abstractC1578x115d8704;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: cloneWithoutChildren */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 mo16930x65d64fca() {
        try {
            com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 abstractC1578x115d8704 = (com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704) super.clone();
            long m16845xaec80732 = com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16845xaec80732(this.f5181xa2496b9);
            abstractC1578x115d8704.f5182xbe913e46 = null;
            abstractC1578x115d8704.f5181xa2496b9 = m16845xaec80732;
            abstractC1578x115d8704.m17027x36e9db6c();
            return abstractC1578x115d8704;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getChildAt */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 mo16938x6a486239(int i17) {
        java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> list = this.f5176x87e8058c;
        if (list != null) {
            return list.get(i17);
        }
        throw new java.lang.IllegalStateException("YogaNode does not have children");
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: getOwner */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 mo16963x74f198fd() {
        return this.f5182xbe913e46;
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    @java.lang.Deprecated
    /* renamed from: getParent */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 mo16965x29c22ba0() {
        return mo16963x74f198fd();
    }

    @Override // com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2
    /* renamed from: removeChildAt */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 mo16979x73bce94b(int i17) {
        java.util.List<com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704> list = this.f5176x87e8058c;
        if (list != null) {
            com.p166x1da19ac6.p169x38ae70.AbstractC1578x115d8704 remove = list.remove(i17);
            remove.f5182xbe913e46 = null;
            com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16856xdbe33437(this.f5181xa2496b9, remove.f5181xa2496b9);
            return remove;
        }
        throw new java.lang.IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public AbstractC1578x115d8704() {
        this(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16853xd72cb28f());
    }

    public AbstractC1578x115d8704(com.p166x1da19ac6.p169x38ae70.AbstractC1556x86ae65f2 abstractC1556x86ae65f2) {
        this(com.p166x1da19ac6.p169x38ae70.C1574x98b132c7.m16854x7458a947(((com.p166x1da19ac6.p169x38ae70.AbstractC1558x16edb5c4) abstractC1556x86ae65f2).f5105xa2496b9));
    }
}
