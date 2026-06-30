package zo1;

/* loaded from: classes5.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f556334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f556336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, long j17) {
        super(0);
        this.f556333d = z17;
        this.f556334e = i17;
        this.f556335f = activityC12873xf94c39e;
        this.f556336g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f556333d;
        int i17 = this.f556334e;
        long j17 = this.f556336g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556335f;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Delete backup record complete for pkgId=" + j17 + ", errorCode=" + i17);
            if (i17 != 0) {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12873xf94c39e);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574399my4);
                e4Var.c();
            }
        } else if (i17 == 0 || i17 == -2) {
            java.util.Iterator it = activityC12873xf94c39e.f174402h.f556207e.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == j17) {
                    break;
                }
                i19++;
            }
            if (i19 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", "Fail to get position by pkgId=" + j17);
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC12873xf94c39e.f174400f;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("packageRecyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(i19);
                if (p07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", "Fail to get viewHolder by position=" + i19 + ", pkgId=" + j17);
                    zo1.k4 k4Var = activityC12873xf94c39e.f174402h;
                    k4Var.z(j17);
                    if (k4Var.mo1894x7e414b06() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.Z6(activityC12873xf94c39e, true);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "start delete animation for pkgId=" + j17);
                    android.view.View itemView = p07.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                    zo1.u4 u4Var = new zo1.u4(j17, p07, activityC12873xf94c39e);
                    int i27 = itemView.getLayoutParams().height;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils", "animCollapseGone", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    itemView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils", "animCollapseGone", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(itemView.getHeight(), 0);
                    ofInt.addUpdateListener(new vo1.a(itemView));
                    ofInt.addListener(new vo1.b(itemView, i27, u4Var));
                    ofInt.setDuration(600L);
                    ofInt.start();
                }
            }
        } else {
            int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12873xf94c39e);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574399my4);
            e4Var2.c();
        }
        return jz5.f0.f384359a;
    }
}
