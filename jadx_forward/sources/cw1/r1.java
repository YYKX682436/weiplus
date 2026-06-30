package cw1;

/* loaded from: classes12.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a f304814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f304815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f304816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f304817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f304818h;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a activityC13109x1b5b413a, long j17, long j18, boolean z17, boolean z18) {
        this.f304814d = activityC13109x1b5b413a;
        this.f304815e = j17;
        this.f304816f = j18;
        this.f304817g = z17;
        this.f304818h = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a activityC13109x1b5b413a = this.f304814d;
        if (activityC13109x1b5b413a.isDestroyed()) {
            return;
        }
        android.view.View view = activityC13109x1b5b413a.f177211h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            long j17 = this.f304815e;
            activityC13109x1b5b413a.f177214n = j17;
            long j18 = this.f304816f;
            activityC13109x1b5b413a.f177215o = j18;
            android.widget.ProgressBar progressBar = activityC13109x1b5b413a.f177209f;
            if (progressBar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressBar");
                throw null;
            }
            progressBar.setProgress(j18 > 0 ? (int) ((100 * j17) / j18) : 0);
            android.widget.TextView textView = activityC13109x1b5b413a.f177210g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sizeTV");
                throw null;
            }
            textView.setText(activityC13109x1b5b413a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8o, fp.n0.a(j17), fp.n0.a(j18)));
            if (this.f304817g) {
                activityC13109x1b5b413a.m78560xe21cbbf(false);
                android.view.View view2 = activityC13109x1b5b413a.f177211h;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById = activityC13109x1b5b413a.findViewById(com.p314xaae8f345.mm.R.id.t4q);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) activityC13109x1b5b413a.findViewById(com.p314xaae8f345.mm.R.id.m9e)).setText(activityC13109x1b5b413a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8r, fp.n0.a(j17)));
                ((android.widget.TextView) activityC13109x1b5b413a.findViewById(com.p314xaae8f345.mm.R.id.t4p)).setText(this.f304818h ? com.p314xaae8f345.mm.R.C30867xcad56011.n8p : com.p314xaae8f345.mm.R.C30867xcad56011.n8q);
                activityC13109x1b5b413a.f177207d.bj();
                jz5.l Di = activityC13109x1b5b413a.f177207d.Di();
                java.lang.String str = (java.lang.String) Di.f384366d;
                java.lang.String str2 = (java.lang.String) Di.f384367e;
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                iy1.c cVar = iy1.c.MainUI;
                jz5.l[] lVarArr = new jz5.l[9];
                lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(activityC13109x1b5b413a.U6() ? 2 : 1));
                lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(activityC13109x1b5b413a.f177216p));
                lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(j17));
                yv1.g1 a17 = yv1.g1.f547573p.a(activityC13109x1b5b413a.f177212i);
                lVarArr[3] = new jz5.l("storage_manage_sessionid", a17 != null ? a17.f547576b : null);
                lVarArr[4] = new jz5.l("cache_remove_sessionid", activityC13109x1b5b413a.f177213m);
                lVarArr[5] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(j17));
                lVarArr[6] = new jz5.l("cache_remove_size", java.lang.Long.valueOf(j18));
                lVarArr[7] = new jz5.l("cache_removed_content", str);
                lVarArr[8] = new jz5.l("cache_remove_content", str2);
                ((cy1.a) rVar).Gj(50162, "page_in", kz5.c1.k(lVarArr), 32903);
            }
        }
    }
}
