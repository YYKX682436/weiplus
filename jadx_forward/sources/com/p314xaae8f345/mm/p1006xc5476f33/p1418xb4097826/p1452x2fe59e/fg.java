package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class fg extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.b8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188274d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f188275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f188274d = "FinderLiveFeedUIC";
        this.f188275e = new java.util.HashMap();
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg fgVar, long j17, r45.dl2 dl2Var) {
        fgVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fgVar.f188274d, "updateLiveInfo objectId=" + j17 + " liveInfo=" + dl2Var.hashCode());
        fgVar.f188275e.put(java.lang.Long.valueOf(j17), dl2Var);
    }

    public r45.kc1 P6(long j17) {
        r45.j42 j42Var;
        r45.dl2 dl2Var = (r45.dl2) this.f188275e.get(java.lang.Long.valueOf(j17));
        if (dl2Var == null || (j42Var = (r45.j42) dl2Var.m75936x14adae67(6)) == null) {
            return null;
        }
        return (r45.kc1) j42Var.m75936x14adae67(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q6(long r34, java.lang.String r36, long r37, java.lang.String r39, android.content.Context r40, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r41) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg.Q6(long, java.lang.String, long, java.lang.String, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void R6(long j17, java.lang.String str, long j18, java.lang.String str2, android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188274d, "tryFetchPreloadInfo objectId:" + j17 + " nonceId:" + str + " context:" + context);
        if (P6(j17) == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.in2 in2Var = new r45.in2();
            in2Var.set(0, java.lang.Long.valueOf(j17));
            in2Var.set(1, str == null ? "" : str);
            in2Var.set(5, java.lang.Long.valueOf(j18));
            arrayList.add(in2Var);
            r45.pl2 pl2Var = new r45.pl2();
            pl2Var.m75941xfb821914(0).add(java.lang.Long.valueOf(j17));
            pl2Var.m75941xfb821914(1).add(str2);
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            km5.d T = pm0.v.T(c61.zb.Xh((c61.zb) c17, arrayList, 3, 0, 0, null, null, null, null, 0, null, null, null, null, context != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context) : null, null, pl2Var, null, 90108, null).l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.eg(this, j17, str));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                T.f(abstractActivityC21394xb3d2c0cf);
            }
        }
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f188275e.clear();
    }
}
