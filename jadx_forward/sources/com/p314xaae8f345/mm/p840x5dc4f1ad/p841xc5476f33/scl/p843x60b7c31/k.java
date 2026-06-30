package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31;

@j95.b
/* loaded from: classes.dex */
public final class k extends i95.w implements com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.i {
    public void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!(env instanceof jc3.p0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBJsApiAdapterService", "only support fake app brand component");
            callback.mo146xb9724478(null);
            return;
        }
        lc3.e y17 = ((jc3.p0) env).y();
        if (y17 instanceof hq0.i) {
            ((hq0.b0) ((hq0.i) y17)).O1("getAppBrandService", null, new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.j(callback));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBJsApiAdapterService", "only support starter biz");
            callback.mo146xb9724478(null);
        }
    }
}
