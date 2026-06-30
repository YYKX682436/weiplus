package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.ColorUtil */
/* loaded from: classes9.dex */
public class C3364xed8549e5 {

    /* renamed from: com.tencent.kinda.framework.widget.tools.ColorUtil$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType */
        static final /* synthetic */ int[] f13282xdc1cdb08;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.m27201xcee59d22().length];
            f13282xdc1cdb08 = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.MMKButtonText.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f13282xdc1cdb08[com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.MMKRichLabelView.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f13282xdc1cdb08[com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.MMKLabelViewText.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tencent.kinda.framework.widget.tools.ColorUtil$MMViewType */
    /* loaded from: classes9.dex */
    public enum MMViewType {
        NONE,
        MMKButtonText,
        MMKEditText,
        MMKImageView,
        MMKLabelViewText,
        MMKRichLabelView
    }

    /* renamed from: MergeColors */
    public static long m27183x534eeba8(long j17, long j18) {
        long m27184x64963e11 = j17 < 0 ? m27184x64963e11(j17) : j17;
        long m27184x64963e112 = j18 < 0 ? m27184x64963e11(j18) : j18;
        long m27187x742757a8 = m27187x742757a8(m27184x64963e11);
        if (m27187x742757a8 == 0) {
            m27187x742757a8 = 255;
        }
        long m27195xb588695b = m27195xb588695b(m27184x64963e11);
        long m27194x747e754d = m27194x747e754d(m27184x64963e11);
        long m27188xfb7d98d0 = m27188xfb7d98d0(m27184x64963e11);
        long m27187x742757a82 = m27187x742757a8(m27184x64963e112);
        double d17 = ((float) m27187x742757a82) / 255.0f;
        double d18 = 1.0d - d17;
        return (((long) ((m27195xb588695b(m27184x64963e112) * d17) + (m27195xb588695b * d18))) << 16) | (((long) (m27187x742757a82 + (m27187x742757a8 * d18))) << 24) | (((long) ((m27194x747e754d(m27184x64963e112) * d17) + (m27194x747e754d * d18))) << 8) | ((long) ((m27188xfb7d98d0(m27184x64963e112) * d17) + (d18 * m27188xfb7d98d0)));
    }

    /* renamed from: absColor */
    public static long m27184x64963e11(long j17) {
        long j18 = 0;
        if (j17 >= 0) {
            return j17;
        }
        long abs = java.lang.Math.abs(j17 + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (abs > 16) {
            long j19 = abs >> 4;
            arrayList.add(java.lang.Integer.valueOf((int) (abs - (j19 << 4))));
            abs = j19;
        }
        arrayList.add(java.lang.Integer.valueOf((int) abs));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(15 - ((java.lang.Integer) it.next()).intValue()));
        }
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            j18 = (j18 * 16) + ((java.lang.Integer) arrayList2.get(size)).intValue();
        }
        return j18;
    }

    /* renamed from: compatKindaDarkMode */
    public static com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 m27185x39ac3044(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType mMViewType) {
        if (c3392x2ae78284 == null || c3392x2ae78284.m27432xc8b8c186() == c3392x2ae78284.m27431xc15a6514()) {
            return c3392x2ae78284;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_kinda_dark_mode_sw, 1) == 1) {
            int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.AnonymousClass1.f13282xdc1cdb08[mMViewType.ordinal()];
            android.util.Pair<java.lang.Boolean, java.lang.Long> pair = i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.util.Pair<>(java.lang.Boolean.FALSE, 0L) : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3363xfb4c2a47.m27181x96c0d88f(c3392x2ae78284.m27432xc8b8c186()) : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3363xfb4c2a47.m27182x585a9246(c3392x2ae78284.m27432xc8b8c186()) : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3363xfb4c2a47.m27180x4f170c16(c3392x2ae78284.m27432xc8b8c186());
            if (((java.lang.Boolean) pair.first).booleanValue()) {
                c3392x2ae78284.f13481x5f08b15d = ((java.lang.Long) pair.second).longValue();
            } else if (c3392x2ae78284.m27431xc15a6514() == -1 || c3392x2ae78284.m27432xc8b8c186() == c3392x2ae78284.m27431xc15a6514()) {
                c3392x2ae78284.f13481x5f08b15d = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3363xfb4c2a47.m27179x38cc84f4(c3392x2ae78284.m27432xc8b8c186(), c3392x2ae78284.m27431xc15a6514());
            } else if (c3392x2ae78284.m27432xc8b8c186() == -1 && c3392x2ae78284.m27431xc15a6514() == 0) {
                c3392x2ae78284.f13481x5f08b15d = java.lang.Long.parseLong("ffFFFFFF", 16);
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return c3392x2ae78284;
    }

    /* renamed from: compatKindaDarkModeDefaultColorSw */
    private static boolean m27186x5334890a() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_kinda_dark_mode_default_color_sw, 1) == 1;
    }

    /* renamed from: getAlpha */
    private static long m27187x742757a8(long j17) {
        return j17 >> 24;
    }

    /* renamed from: getBlue */
    private static long m27188xfb7d98d0(long j17) {
        return j17 - ((j17 >> 8) << 8);
    }

    /* renamed from: getColorByMode */
    public static long m27192xf794c2a7(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284();
        c3392x2ae78284.f13482x98ef8c0f = java.lang.Long.parseLong(str, 16);
        c3392x2ae78284.f13481x5f08b15d = java.lang.Long.parseLong(str, 16);
        return m27189xf794c2a7(c3392x2ae78284);
    }

    /* renamed from: getColorByModeNoCompat */
    public static long m27193xc76aa86a(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (c3392x2ae78284 != null) {
            return com.p314xaae8f345.mm.ui.bk.C() ? c3392x2ae78284.m27431xc15a6514() : c3392x2ae78284.m27432xc8b8c186();
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return 0L;
    }

    /* renamed from: getGreen */
    private static long m27194x747e754d(long j17) {
        return (j17 >> 8) - ((j17 >> 16) << 8);
    }

    /* renamed from: getRed */
    private static long m27195xb588695b(long j17) {
        return (j17 >> 16) - ((j17 >> 24) << 8);
    }

    /* renamed from: ifCompatKindaDarkModeDefaultColor */
    public static boolean m27196x28caef29() {
        return com.p314xaae8f345.mm.ui.bk.C() && m27186x5334890a();
    }

    /* renamed from: getColorByMode */
    public static long m27191xf794c2a7(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284, boolean z17) {
        long m27190xf794c2a7 = m27190xf794c2a7(c3392x2ae78284, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.NONE);
        return (z17 && m27190xf794c2a7 == -1 && com.p314xaae8f345.mm.ui.bk.C()) ? com.p314xaae8f345.mm.ui.bk.d((int) c3392x2ae78284.f13482x98ef8c0f) : m27190xf794c2a7;
    }

    /* renamed from: getColorByMode */
    public static long m27189xf794c2a7(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        return m27191xf794c2a7(c3392x2ae78284, true);
    }

    /* renamed from: getColorByMode */
    public static long m27190xf794c2a7(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType mMViewType) {
        if (c3392x2ae78284 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return 0L;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            return m27185x39ac3044(c3392x2ae78284, mMViewType).m27431xc15a6514();
        }
        return c3392x2ae78284.f13482x98ef8c0f;
    }
}
