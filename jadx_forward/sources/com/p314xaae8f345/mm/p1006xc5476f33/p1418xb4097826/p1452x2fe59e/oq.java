package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class oq implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f190207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f190208e;

    public oq(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar) {
        this.f190207d = activity;
        this.f190208e = krVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        android.app.Activity activity = this.f190207d;
        if (m75939xb282bd08 == 0) {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.cwh, 0).show();
            return;
        }
        db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.cwg, 0).show();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190208e.f188776t, "finder_feed_open_comment_no_ok " + ret.m75939xb282bd08(1));
    }
}
