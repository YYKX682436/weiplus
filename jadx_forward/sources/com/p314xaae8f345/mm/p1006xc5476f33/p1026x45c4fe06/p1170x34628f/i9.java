package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class i9 extends com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 {
    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749
    /* renamed from: onMiscCallBack */
    public java.lang.Object mo52190xdaaffcf0(java.lang.String str, android.os.Bundle bundle) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && bundle != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "onMiscCallBack method = %s", str);
            if ("onJavascriptCloseWindow".equals(str)) {
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }
}
