package com.p166x1da19ac6.p169x38ae70.p170xcca8366f;

/* renamed from: com.facebook.yoga.android.YogaLayout */
/* loaded from: classes15.dex */
public class C1589x9549ddda extends android.view.ViewGroup {

    /* renamed from: mYogaNode */
    private final com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 f5262xe37ec01f;

    /* renamed from: mYogaNodes */
    private final java.util.Map<android.view.View, com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2> f5263x8c594434;

    /* renamed from: com.facebook.yoga.android.YogaLayout$ViewMeasureFunction */
    /* loaded from: classes15.dex */
    public static class ViewMeasureFunction implements com.p166x1da19ac6.p169x38ae70.InterfaceC1571x4a7062a6 {
        /* renamed from: viewMeasureSpecFromYogaMeasureMode */
        private int m17091x22818793(com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71 enumC1572x4c7bf71) {
            if (enumC1572x4c7bf71 == com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return enumC1572x4c7bf71 == com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71.EXACTLY ? 1073741824 : 0;
        }

        @Override // com.p166x1da19ac6.p169x38ae70.InterfaceC1571x4a7062a6
        /* renamed from: measure */
        public long mo16823x37eda55e(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2, float f17, com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71 enumC1572x4c7bf71, float f18, com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71 enumC1572x4c7bf712) {
            android.view.View view = (android.view.View) abstractC1575xc25b7cb2.mo16940xfb7e5820();
            if (view == null || (view instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
                return com.p166x1da19ac6.p169x38ae70.C1573xf59b634f.m16833x3305ee(0, 0);
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) f17, m17091x22818793(enumC1572x4c7bf71)), android.view.View.MeasureSpec.makeMeasureSpec((int) f18, m17091x22818793(enumC1572x4c7bf712)));
            return com.p166x1da19ac6.p169x38ae70.C1573xf59b634f.m16833x3305ee(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public C1589x9549ddda(android.content.Context context) {
        this(context, null, 0);
    }

    /* renamed from: applyLayoutParams */
    public static void m17083x9bf7bde(com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams layoutParams, com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2, android.view.View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            abstractC1575xc25b7cb2.mo16988x2261393d(com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.RTL);
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new android.graphics.Rect())) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, r0.left);
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, r0.top);
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, r0.right);
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, r0.bottom);
            }
        }
        for (int i17 = 0; i17 < layoutParams.f5264xa13af444.size(); i17++) {
            int keyAt = layoutParams.f5264xa13af444.keyAt(i17);
            float floatValue = layoutParams.f5264xa13af444.valueAt(i17).floatValue();
            if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11387xb3441b76) {
                abstractC1575xc25b7cb2.mo16981x6a5fc336(com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55.m16749xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11388x57a269fd) {
                abstractC1575xc25b7cb2.mo16982xdd0501bd(com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55.m16749xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11389xc909916f) {
                abstractC1575xc25b7cb2.mo16983xc51501af(com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55.m16749xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11390x8a649c91) {
                abstractC1575xc25b7cb2.mo16984xb154fcd1(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11395x3c50095) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11398x6b7a1707) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11396x7531734e) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11392x160a0f39) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11397x75447594) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11393x6b79de8d) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11394x8eb4ca32) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11399xc4efd104) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11391x6b79cf53) {
                abstractC1575xc25b7cb2.mo16986x5d8cb2e(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11400x2655c8fd) {
                abstractC1575xc25b7cb2.mo16988x2261393d(com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf.m16777xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11401x983921c0) {
                abstractC1575xc25b7cb2.mo16989x14e3a200(com.p166x1da19ac6.p169x38ae70.EnumC1563x7a128c12.m16783xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11402xec2ac7bb) {
                abstractC1575xc25b7cb2.mo16990x764a2f7b(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11403xf563b943) {
                abstractC1575xc25b7cb2.mo16991xf16f2983(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11404xe9bce204) {
                abstractC1575xc25b7cb2.mo16994x16163244(com.p166x1da19ac6.p169x38ae70.EnumC1566x8b1dc6d6.m16801xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11405xc5dc726e) {
                abstractC1575xc25b7cb2.mo16995xde81fa2e(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11406xd47801a4) {
                abstractC1575xc25b7cb2.mo16996x59da9964(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11407x8fa07069) {
                abstractC1575xc25b7cb2.mo16997xf84e829(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11413xc7c8117) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11408xc6a4dd0b) {
                abstractC1575xc25b7cb2.mo17001x257594cb(com.p166x1da19ac6.p169x38ae70.EnumC1567xcbf3dde0.m16807xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11416x216f7e45) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11414x836a030c) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11410xcee3773b) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11415x837d0552) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11411x216f45cb) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11412xecb66134) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11417xad0f4086) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11409x216f3691) {
                abstractC1575xc25b7cb2.mo17002x17d8dcb0(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11418x29b44929) {
                abstractC1575xc25b7cb2.mo17005x25bfb969(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11419x75ca6d84) {
                abstractC1575xc25b7cb2.mo17007x8e6ff544(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11420x57bf5f97) {
                abstractC1575xc25b7cb2.mo17010x53cacfd7(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11421xbebd156) {
                abstractC1575xc25b7cb2.mo17012x24915916(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11422x7d7ecac4) {
                abstractC1575xc25b7cb2.mo17014x96245284(com.p166x1da19ac6.p169x38ae70.EnumC1581xd6d2aab2.m17046xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11427xefd139b6) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11430x9c61b5c6) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11428xaac5e4d) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11424x2fec841a) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11429xabf6093) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11425x9c617d4c) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11426x569fe693) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11431xf00891a5) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11423x9c616e12) {
                abstractC1575xc25b7cb2.mo17015x812ec54f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11436xe223d692) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11439x411a0d6a) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11437x62ad5cf1) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11433xd80b59f6) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11438x62c05f37) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11434x4119d4f0) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11435x85686e6f) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11441xbc96081) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11432x4119c5b6) {
                abstractC1575xc25b7cb2.mo17017xa32537ab(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11440xe227c5c5) {
                abstractC1575xc25b7cb2.mo17019x99436d85(com.p166x1da19ac6.p169x38ae70.EnumC1582xad8dfeb3.m17052xdc92efe5(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11442x9a1c5e44) {
                abstractC1575xc25b7cb2.mo17020x53e9ee84(floatValue);
            } else if (keyAt == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11443xec32980c) {
                abstractC1575xc25b7cb2.mo17023x7651ffcc(com.p166x1da19ac6.p169x38ae70.EnumC1587xc25f9efa.m17076xdc92efe5(java.lang.Math.round(floatValue)));
            }
        }
        for (int i18 = 0; i18 < layoutParams.f5265x39ccc448.size(); i18++) {
            int keyAt2 = layoutParams.f5265x39ccc448.keyAt(i18);
            java.lang.String valueAt = layoutParams.f5265x39ccc448.valueAt(i18);
            if (valueAt.equals("auto")) {
                if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11413xc7c8117) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11416x216f7e45) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11414x836a030c) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11410xcee3773b) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11415x837d0552) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11411x216f45cb) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11412xecb66134) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11417xad0f4086) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11409x216f3691) {
                    abstractC1575xc25b7cb2.mo17003x91da567f(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL);
                }
            }
            if (valueAt.endsWith("%")) {
                float parseFloat = java.lang.Float.parseFloat(valueAt.substring(0, valueAt.length() - 1));
                if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11403xf563b943) {
                    abstractC1575xc25b7cb2.mo16993xd6dba942(parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11407x8fa07069) {
                    abstractC1575xc25b7cb2.mo16999x227743dc(parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11413xc7c8117) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11416x216f7e45) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11414x836a030c) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11410xcee3773b) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11415x837d0552) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11411x216f45cb) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11412xecb66134) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11417xad0f4086) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11409x216f3691) {
                    abstractC1575xc25b7cb2.mo17004xd477975(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11418x29b44929) {
                    abstractC1575xc25b7cb2.mo17006x44ea8a9c(parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11419x75ca6d84) {
                    abstractC1575xc25b7cb2.mo17008x79335261(parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11420x57bf5f97) {
                    abstractC1575xc25b7cb2.mo17011x411bfc6e(parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11421xbebd156) {
                    abstractC1575xc25b7cb2.mo17013x37035e4f(parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11427xefd139b6) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11430x9c61b5c6) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11428xaac5e4d) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11424x2fec841a) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11429xabf6093) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11425x9c617d4c) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11426x569fe693) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11431xf00891a5) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11423x9c616e12) {
                    abstractC1575xc25b7cb2.mo17016xffd76ff6(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11436xe223d692) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.LEFT, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11439x411a0d6a) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.TOP, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11437x62ad5cf1) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.RIGHT, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11433xd80b59f6) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.BOTTOM, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11438x62c05f37) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.START, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11434x4119d4f0) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.END, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11435x85686e6f) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.HORIZONTAL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11441xbc96081) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.VERTICAL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11432x4119c5b6) {
                    abstractC1575xc25b7cb2.mo17018x7808de1a(com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d.ALL, parseFloat);
                } else if (keyAt2 == com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11442x9a1c5e44) {
                    abstractC1575xc25b7cb2.mo17022x468a7121(parseFloat);
                }
            }
        }
    }

    /* renamed from: applyLayoutRecursive */
    private void m17084x3328a2da(com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2, float f17, float f18) {
        android.view.View view = (android.view.View) abstractC1575xc25b7cb2.mo16940xfb7e5820();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int round = java.lang.Math.round(abstractC1575xc25b7cb2.mo16955x3b51a638() + f17);
            int round2 = java.lang.Math.round(abstractC1575xc25b7cb2.mo16956x3b51a639() + f18);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(abstractC1575xc25b7cb2.mo16954x5146f386()), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(abstractC1575xc25b7cb2.mo16951xbdc88367()), 1073741824));
            view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
        }
        int mo16939x3d79f549 = abstractC1575xc25b7cb2.mo16939x3d79f549();
        for (int i17 = 0; i17 < mo16939x3d79f549; i17++) {
            if (equals(view)) {
                m17084x3328a2da(abstractC1575xc25b7cb2.mo16938x6a486239(i17), f17, f18);
            } else if (!(view instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
                m17084x3328a2da(abstractC1575xc25b7cb2.mo16938x6a486239(i17), abstractC1575xc25b7cb2.mo16955x3b51a638() + f17, abstractC1575xc25b7cb2.mo16956x3b51a639() + f18);
            }
        }
    }

    /* renamed from: createLayout */
    private void m17085x4e8fdb46(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        if (mode2 == 1073741824) {
            this.f5262xe37ec01f.mo16997xf84e829(size2);
        }
        if (mode == 1073741824) {
            this.f5262xe37ec01f.mo17020x53e9ee84(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f5262xe37ec01f.mo17005x25bfb969(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f5262xe37ec01f.mo17007x8e6ff544(size);
        }
        if (mode2 == 0) {
            this.f5262xe37ec01f.mo16998x7531fd78();
        }
        this.f5262xe37ec01f.mo16928xaf6a4630(Float.NaN, Float.NaN);
    }

    /* renamed from: removeViewFromYogaTree */
    private void m17086xf01d83e1(android.view.View view, boolean z17) {
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2 = this.f5263x8c594434.get(view);
        if (abstractC1575xc25b7cb2 == null) {
            return;
        }
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 mo16963x74f198fd = abstractC1575xc25b7cb2.mo16963x74f198fd();
        int i17 = 0;
        while (true) {
            if (i17 >= mo16963x74f198fd.mo16939x3d79f549()) {
                break;
            }
            if (mo16963x74f198fd.mo16938x6a486239(i17).equals(abstractC1575xc25b7cb2)) {
                mo16963x74f198fd.mo16979x73bce94b(i17);
                break;
            }
            i17++;
        }
        abstractC1575xc25b7cb2.mo16987x76491f2c(null);
        this.f5263x8c594434.remove(view);
        if (z17) {
            this.f5262xe37ec01f.mo16928xaf6a4630(Float.NaN, Float.NaN);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17025xaf65a0fc;
        this.f5262xe37ec01f.mo17009xf8fbaa94(null);
        if (view instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05) {
            com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05 c1588x4c102b05 = (com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1588x4c102b05) view;
            c1588x4c102b05.m17082xe1485f0a(this);
            com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17081x3a5b5608 = c1588x4c102b05.m17081x3a5b5608();
            com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2 = this.f5262xe37ec01f;
            abstractC1575xc25b7cb2.mo16927x9e387e8e(m17081x3a5b5608, abstractC1575xc25b7cb2.mo16939x3d79f549());
            return;
        }
        super.addView(view, i17, layoutParams);
        if (this.f5263x8c594434.containsKey(view)) {
            return;
        }
        if (view instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) {
            m17025xaf65a0fc = ((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) view).m17088x3a5b5608();
        } else {
            if (this.f5263x8c594434.containsKey(view)) {
                m17025xaf65a0fc = this.f5263x8c594434.get(view);
            } else {
                m17025xaf65a0fc = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();
            }
            m17025xaf65a0fc.mo16987x76491f2c(view);
            m17025xaf65a0fc.mo17009xf8fbaa94(new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.ViewMeasureFunction());
        }
        m17083x9bf7bde((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams) view.getLayoutParams(), m17025xaf65a0fc, view);
        this.f5263x8c594434.put(view, m17025xaf65a0fc);
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb22 = this.f5262xe37ec01f;
        abstractC1575xc25b7cb22.mo16927x9e387e8e(m17025xaf65a0fc, abstractC1575xc25b7cb22.mo16939x3d79f549());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getYogaNode */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17088x3a5b5608() {
        return this.f5262xe37ec01f;
    }

    /* renamed from: getYogaNodeForView */
    public com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17089x982e97e6(android.view.View view) {
        return this.f5263x8c594434.get(view);
    }

    /* renamed from: invalidate */
    public void m17090x92d0313b(android.view.View view) {
        if (this.f5263x8c594434.containsKey(view)) {
            this.f5263x8c594434.get(view).mo16932x5b2a3d2();
            return;
        }
        int mo16939x3d79f549 = this.f5262xe37ec01f.mo16939x3d79f549();
        for (int i17 = 0; i17 < mo16939x3d79f549; i17++) {
            com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 mo16938x6a486239 = this.f5262xe37ec01f.mo16938x6a486239(i17);
            if (mo16938x6a486239.mo16940xfb7e5820() instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) {
                ((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) mo16938x6a486239.mo16940xfb7e5820()).m17090x92d0313b(view);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (!(getParent() instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
            m17085x4e8fdb46(android.view.View.MeasureSpec.makeMeasureSpec(i19 - i17, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i27 - i18, 1073741824));
        }
        m17084x3328a2da(this.f5262xe37ec01f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (!(getParent() instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
            m17085x4e8fdb46(i17, i18);
        }
        setMeasuredDimension(java.lang.Math.round(this.f5262xe37ec01f.mo16954x5146f386()), java.lang.Math.round(this.f5262xe37ec01f.mo16951xbdc88367()));
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            m17086xf01d83e1(getChildAt(i17), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            m17086xf01d83e1(getChildAt(i17), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        m17086xf01d83e1(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i17) {
        m17086xf01d83e1(getChildAt(i17), false);
        super.removeViewAt(i17);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        m17086xf01d83e1(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i17, int i18) {
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            m17086xf01d83e1(getChildAt(i19), false);
        }
        super.removeViews(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i17, int i18) {
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            m17086xf01d83e1(getChildAt(i19), true);
        }
        super.removeViewsInLayout(i17, i18);
    }

    public C1589x9549ddda(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(layoutParams);
    }

    public C1589x9549ddda(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams layoutParams;
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 m17025xaf65a0fc = com.p166x1da19ac6.p169x38ae70.AbstractC1577x5fb5fff8.m17025xaf65a0fc();
        this.f5262xe37ec01f = m17025xaf65a0fc;
        this.f5263x8c594434 = new java.util.HashMap();
        m17025xaf65a0fc.mo16987x76491f2c(this);
        m17025xaf65a0fc.mo17009xf8fbaa94(new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.ViewMeasureFunction());
        if (attributeSet != null) {
            layoutParams = new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(context, attributeSet);
        } else {
            layoutParams = (com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams) generateDefaultLayoutParams();
        }
        m17083x9bf7bde(layoutParams, m17025xaf65a0fc, this);
    }

    /* renamed from: com.facebook.yoga.android.YogaLayout$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: numericAttributes */
        android.util.SparseArray<java.lang.Float> f5264xa13af444;

        /* renamed from: stringAttributes */
        android.util.SparseArray<java.lang.String> f5265x39ccc448;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams) {
                com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams layoutParams2 = (com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams) layoutParams;
                this.f5264xa13af444 = layoutParams2.f5264xa13af444.clone();
                this.f5265x39ccc448 = layoutParams2.f5265x39ccc448.clone();
                return;
            }
            this.f5264xa13af444 = new android.util.SparseArray<>();
            this.f5265x39ccc448 = new android.util.SparseArray<>();
            if (layoutParams.width >= 0) {
                this.f5264xa13af444.put(com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11442x9a1c5e44, java.lang.Float.valueOf(((android.view.ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.f5264xa13af444.put(com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11407x8fa07069, java.lang.Float.valueOf(((android.view.ViewGroup.LayoutParams) this).height));
            }
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f5264xa13af444 = new android.util.SparseArray<>();
            this.f5265x39ccc448 = new android.util.SparseArray<>();
            if (i17 >= 0) {
                this.f5264xa13af444.put(com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11442x9a1c5e44, java.lang.Float.valueOf(i17));
            }
            if (i18 >= 0) {
                this.f5264xa13af444.put(com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11407x8fa07069, java.lang.Float.valueOf(i18));
            }
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5264xa13af444 = new android.util.SparseArray<>();
            this.f5265x39ccc448 = new android.util.SparseArray<>();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11386x38ae70);
            int i17 = ((android.view.ViewGroup.LayoutParams) this).width;
            if (i17 >= 0) {
                this.f5264xa13af444.put(com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11442x9a1c5e44, java.lang.Float.valueOf(i17));
            }
            int i18 = ((android.view.ViewGroup.LayoutParams) this).height;
            if (i18 >= 0) {
                this.f5264xa13af444.put(com.p314xaae8f345.p347x615374d.R.C3079x6ba0728b.f11407x8fa07069, java.lang.Float.valueOf(i18));
            }
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i19 = 0; i19 < indexCount; i19++) {
                int index = obtainStyledAttributes.getIndex(i19);
                android.util.TypedValue typedValue = new android.util.TypedValue();
                obtainStyledAttributes.getValue(index, typedValue);
                int i27 = typedValue.type;
                if (i27 == 5) {
                    this.f5264xa13af444.put(index, java.lang.Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0)));
                } else if (i27 == 3) {
                    this.f5265x39ccc448.put(index, obtainStyledAttributes.getString(index));
                } else {
                    this.f5264xa13af444.put(index, java.lang.Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f)));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: addView */
    public void m17087xbb8aeee6(android.view.View view, com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb2) {
        this.f5262xe37ec01f.mo17009xf8fbaa94(null);
        if (!(view instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
            abstractC1575xc25b7cb2.mo16987x76491f2c(view);
            abstractC1575xc25b7cb2.mo17009xf8fbaa94(new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.ViewMeasureFunction());
        }
        this.f5263x8c594434.put(view, abstractC1575xc25b7cb2);
        com.p166x1da19ac6.p169x38ae70.AbstractC1575xc25b7cb2 abstractC1575xc25b7cb22 = this.f5262xe37ec01f;
        abstractC1575xc25b7cb22.mo16927x9e387e8e(abstractC1575xc25b7cb2, abstractC1575xc25b7cb22.mo16939x3d79f549());
        super.addView(view, getChildCount(), new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda.LayoutParams(-1, -1));
    }
}
