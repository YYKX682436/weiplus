package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class w implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be f233883a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be) {
        this.f233883a = activityC16731xe258a4be;
    }

    @Override // u60.e
    /* renamed from: onLocationAddr */
    public void mo24721x71c058c5(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        java.lang.String str = c11121x1f1011.f152747g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = c11121x1f1011.f152749i;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String concat = str.concat(str2);
        java.lang.String str3 = c11121x1f1011.f152750m;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = c11121x1f1011.f152751n;
        java.lang.String concat2 = str3.concat(str4 != null ? str4 : "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be = this.f233883a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16731xe258a4be.f233806n.getText().toString())) {
            activityC16731xe258a4be.f233806n.setText(concat);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16731xe258a4be.f233805m.getText().toString()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat2)) {
            activityC16731xe258a4be.f233805m.setText(concat2);
        }
        activityC16731xe258a4be.f233802g = c11121x1f1011;
    }
}
