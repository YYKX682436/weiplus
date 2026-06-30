package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b;

/* renamed from: com.tencent.tinker.loader.hotplug.ActivityStubManager */
/* loaded from: classes13.dex */
public class C26614x27d36c70 {

    /* renamed from: NOTRANSPARENT_SLOT_INDEX */
    private static final int f55540xefa6635f = 0;
    private static final java.lang.String TAG = "Tinker.ActivityStubManager";

    /* renamed from: TRANSPARENT_SLOT_INDEX */
    private static final int f55545x41de905e = 1;

    /* renamed from: sTargetToStubClassNameMap */
    private static java.util.Map<java.lang.String, java.lang.String> f55546xa7645a6 = new java.util.HashMap();

    /* renamed from: STANDARD_STUB_COUNT_SLOTS */
    private static final int[] f55544xc27039f6 = {10, 3};

    /* renamed from: SINGLETOP_STUB_COUNT_SLOTS */
    private static final int[] f55543x58b46c6 = {10, 3};

    /* renamed from: SINGLETASK_STUB_COUNT_SLOTS */
    private static final int[] f55542xea5088e6 = {10, 3};

    /* renamed from: SINGLEINSTANCE_STUB_COUNT_SLOTS */
    private static final int[] f55541x40d117d6 = {10, 3};

    /* renamed from: NEXT_STANDARD_STUB_IDX_SLOTS */
    private static final int[] f55539xc10b3818 = {0, 0};

    /* renamed from: NEXT_SINGLETOP_STUB_IDX_SLOTS */
    private static final int[] f55538x6c3fd200 = {0, 0};

    /* renamed from: NEXT_SINGLETASK_STUB_IDX_SLOTS */
    private static final int[] f55537x3125a608 = {0, 0};

    /* renamed from: NEXT_SINGLEINSTANCE_STUB_IDX_SLOTS */
    private static final int[] f55536x11fd36f8 = {0, 0};

    private C26614x27d36c70() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: assignStub */
    public static java.lang.String m104559x3d1fee3d(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        int[] iArr;
        int[] iArr2;
        java.lang.String str3 = f55546xa7645a6.get(str);
        if (str3 != null) {
            return str3;
        }
        char c17 = 1;
        if (i17 == 1) {
            str2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26615xf133eb96.f55553x15bb9872;
            iArr = f55538x6c3fd200;
            iArr2 = f55543x58b46c6;
        } else if (i17 == 2) {
            str2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26615xf133eb96.f55550x3a8aaa52;
            iArr = f55537x3125a608;
            iArr2 = f55542xea5088e6;
        } else if (i17 != 3) {
            str2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26615xf133eb96.f55558xa8236646;
            iArr = f55539xc10b3818;
            iArr2 = f55544xc27039f6;
        } else {
            str2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26615xf133eb96.f55547xddbdf162;
            iArr = f55536x11fd36f8;
            iArr2 = f55541x40d117d6;
        }
        int i18 = 0;
        if (z17) {
            str2 = str2 + "_T";
        } else {
            c17 = 0;
        }
        int i19 = iArr[c17];
        iArr[c17] = i19 + 1;
        if (i19 >= iArr2[c17]) {
            iArr[c17] = 0;
        } else {
            i18 = i19;
        }
        java.lang.String format = java.lang.String.format(str2, java.lang.Integer.valueOf(i18));
        f55546xa7645a6.put(str, format);
        return format;
    }
}
