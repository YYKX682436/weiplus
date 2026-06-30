package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes14.dex */
public final class v extends wm3.a implements wm3.m {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f257006d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f257007e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f257008f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f257009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f257006d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.u(activity));
        this.f257007e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.s(activity));
        this.f257008f = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enb;
    }

    @Override // wm3.m
    public boolean i() {
        return !(this.f257009g != null ? r0.canScrollVertically(-1) : true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String[] strArr;
        java.lang.String[] stringArray;
        java.lang.String[] stringArray2;
        int i17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) m158354x19263085 : null;
        if (abstractActivityC16711x120e7ae0 != null) {
            abstractActivityC16711x120e7ae0.mo54450xbf7c1df6(abstractActivityC16711x120e7ae0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575383pc4));
            abstractActivityC16711x120e7ae0.mo64405x4dab7448(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
            abstractActivityC16711x120e7ae0.mo78578x8b18f126(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
            ul5.k m78511x9f88d943 = abstractActivityC16711x120e7ae0.m78511x9f88d943();
            if (m78511x9f88d943 != null) {
                m78511x9f88d943.mo82163x4e0f6657(false);
            }
            if (fp.h.c(23)) {
                int e17 = com.p314xaae8f345.mm.ui.zk.e(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                abstractActivityC16711x120e7ae0.mo78514x143f1b92().Q0(com.p314xaae8f345.mm.ui.uk.c(m158354x19263085(), com.p314xaae8f345.mm.R.raw.f80008xda567a70, m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d), e17, 0.5f * e17));
            }
            abstractActivityC16711x120e7ae0.mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.t(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.c()) {
            strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274352b;
            stringArray = m158354x19263085().getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559542bg);
            stringArray2 = m158354x19263085().getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559541w);
        } else {
            strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274353c;
            stringArray = m158354x19263085().getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559565bi);
            stringArray2 = m158354x19263085().getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559564bh);
        }
        java.util.ArrayList arrayList = this.f257008f;
        if (stringArray == null || stringArray2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectLanguageUIC", "Language arrays are null");
        } else if (strArr.length == stringArray.length && strArr.length == stringArray2.length) {
            int length = strArr.length;
            for (0; i17 < length; i17 + 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.o();
                java.lang.String str = stringArray[i17];
                if (str == null) {
                    str = "";
                }
                oVar.f256981a = str;
                java.lang.String str2 = stringArray2[i17];
                if (str2 == null) {
                    str2 = "";
                }
                oVar.f256982b = str2;
                java.lang.String str3 = strArr[i17];
                if (str3 == null) {
                    str3 = "";
                }
                oVar.f256983c = str3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.k(str3)) {
                    java.lang.String str4 = (java.lang.String) ((jz5.n) this.f257007e).mo141623x754a37bb();
                    if (str4 == null) {
                        str4 = "";
                    }
                    oVar.f256981a = str4;
                    oVar.f256982b = "";
                }
                if (oVar.f256981a.length() == 0) {
                    i17 = oVar.f256982b.length() == 0 ? i17 + 1 : 0;
                }
                if (oVar.f256981a.equals(oVar.f256982b)) {
                    oVar.f256982b = "";
                }
                java.lang.String str5 = (java.lang.String) ((jz5.n) this.f257006d).mo141623x754a37bb();
                if (str5 != null && str5.equals(oVar.f256981a)) {
                    oVar.f256984d = true;
                } else {
                    oVar.f256984d = false;
                }
                if (i17 == 1) {
                    oVar.f256985e = true;
                }
                if (i17 == strArr.length - 1) {
                    oVar.f256986f = true;
                }
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.p(this, i17, oVar));
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("languageCodes not paired with languageNames, languageCodes: ");
            java.lang.String arrays = java.util.Arrays.toString(strArr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            sb6.append(", languageNames: ");
            java.lang.String arrays2 = java.util.Arrays.toString(stringArray);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
            sb6.append(arrays2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectLanguageUIC", sb6.toString());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u8o);
        this.f257009g = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m158354x19263085(), 1, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f257009g;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.transvoice.ui.SelectLanguageUIC$buildItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return type == 1 ? new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.n(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v.this) : new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.r(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v.this);
                }
            }, arrayList, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f257009g;
        if (c22849x81a93d253 == null) {
            return;
        }
        c22849x81a93d253.setClipToPadding(false);
    }
}
