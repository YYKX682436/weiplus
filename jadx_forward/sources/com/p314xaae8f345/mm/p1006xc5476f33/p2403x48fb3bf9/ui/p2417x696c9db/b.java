package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19306x770da1bc f265450a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19306x770da1bc activityC19306x770da1bc) {
        this.f265450a = activityC19306x770da1bc;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (str.startsWith("weixin://viewimage/")) {
            this.f265450a.m9(str);
            c27816xac2547f9.mo120194xc77ccada();
        } else if (!str.startsWith("weixinping://iframe") && !str.startsWith("weixinpreinject://iframe")) {
            c27816xac2547f9.mo32265x141096a9(str);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        boolean startsWith = str.startsWith("weixin://viewimage/");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19306x770da1bc activityC19306x770da1bc = this.f265450a;
        if (startsWith) {
            activityC19306x770da1bc.m9(str);
            c27816xac2547f9.mo120194xc77ccada();
        } else if (str.equals(activityC19306x770da1bc.C3)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b1(activityC19306x770da1bc, str);
            c27816xac2547f9.mo120194xc77ccada();
        }
    }
}
