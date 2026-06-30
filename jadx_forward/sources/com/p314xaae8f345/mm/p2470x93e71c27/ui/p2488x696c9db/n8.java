package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public abstract class n8 {
    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 a(android.content.Context context) {
        java.lang.String str = wo.v1.f529366m.D;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals("surface")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoViewFactory", "match full type surface");
            return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997(context, null);
        }
        if (fp.f0.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoViewFactory", "IS MTK platform");
            return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoViewFactory", "default settings, use sightview");
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7(context);
    }
}
