package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes.dex */
public final class q1 implements zy2.gc {
    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (ret.m75939xb282bd08(1) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MenuItemCreateListener", "comment black list succ");
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7g), 0).show();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MenuItemCreateListener", "comment black list failed:" + ret.m75939xb282bd08(1));
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7h), 0).show();
        }
    }
}
