package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fg extends com.tencent.mm.ui.component.UIComponent implements zy2.b8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106741d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f106742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f106741d = "FinderLiveFeedUIC";
        this.f106742e = new java.util.HashMap();
    }

    public static final void O6(com.tencent.mm.plugin.finder.feed.fg fgVar, long j17, r45.dl2 dl2Var) {
        fgVar.getClass();
        com.tencent.mars.xlog.Log.i(fgVar.f106741d, "updateLiveInfo objectId=" + j17 + " liveInfo=" + dl2Var.hashCode());
        fgVar.f106742e.put(java.lang.Long.valueOf(j17), dl2Var);
    }

    public r45.kc1 P6(long j17) {
        r45.j42 j42Var;
        r45.dl2 dl2Var = (r45.dl2) this.f106742e.get(java.lang.Long.valueOf(j17));
        if (dl2Var == null || (j42Var = (r45.j42) dl2Var.getCustom(6)) == null) {
            return null;
        }
        return (r45.kc1) j42Var.getCustom(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q6(long r34, java.lang.String r36, long r37, java.lang.String r39, android.content.Context r40, kotlin.coroutines.Continuation r41) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.fg.Q6(long, java.lang.String, long, java.lang.String, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void R6(long j17, java.lang.String str, long j18, java.lang.String str2, android.content.Context context) {
        com.tencent.mars.xlog.Log.i(this.f106741d, "tryFetchPreloadInfo objectId:" + j17 + " nonceId:" + str + " context:" + context);
        if (P6(j17) == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.in2 in2Var = new r45.in2();
            in2Var.set(0, java.lang.Long.valueOf(j17));
            in2Var.set(1, str == null ? "" : str);
            in2Var.set(5, java.lang.Long.valueOf(j18));
            arrayList.add(in2Var);
            r45.pl2 pl2Var = new r45.pl2();
            pl2Var.getList(0).add(java.lang.Long.valueOf(j17));
            pl2Var.getList(1).add(str2);
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            km5.d T = pm0.v.T(c61.zb.Xh((c61.zb) c17, arrayList, 3, 0, 0, null, null, null, null, 0, null, null, null, null, context != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context) : null, null, pl2Var, null, 90108, null).l(), new com.tencent.mm.plugin.finder.feed.eg(this, j17, str));
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                T.f(mMActivity);
            }
        }
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f106742e.clear();
    }
}
