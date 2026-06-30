package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class b0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView f91940d;

    public b0(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView appBrandRecentTaskView) {
        this.f91940d = appBrandRecentTaskView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f91940d.f91877g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.widget.recent.d0 d0Var = (com.tencent.mm.plugin.appbrand.widget.recent.d0) k3Var;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView appBrandRecentTaskView = this.f91940d;
        java.util.ArrayList arrayList = appBrandRecentTaskView.f91877g;
        com.tencent.mm.plugin.appbrand.widget.recent.z0 z0Var = i17 >= arrayList.size() ? null : (com.tencent.mm.plugin.appbrand.widget.recent.z0) arrayList.get(i17);
        if (z0Var == null) {
            return;
        }
        d0Var.f91963d = z0Var;
        com.tencent.mm.plugin.appbrand.widget.recent.h1 taskViewListener = appBrandRecentTaskView.getTaskViewListener();
        com.tencent.mm.plugin.appbrand.widget.recent.g1 appBrandTaskReport = appBrandRecentTaskView.getAppBrandTaskReport();
        com.tencent.mm.plugin.appbrand.widget.recent.c1 c1Var = com.tencent.mm.plugin.appbrand.widget.recent.d1.f91969a;
        int f17 = (int) (i65.a.f(r7, com.tencent.mm.R.dimen.f480091ao2) * cl1.k.a(d0Var.itemView.getContext()));
        d0Var.itemView.getLayoutParams().width = (int) c1Var.b(d0Var.itemView.getContext());
        android.widget.RelativeLayout relativeLayout = d0Var.f91964e;
        relativeLayout.getLayoutParams().width = f17;
        relativeLayout.getLayoutParams().height = f17;
        android.widget.ImageView imageView = d0Var.f91965f;
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        android.view.View view = d0Var.itemView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentIconItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentIconItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = d0Var.f91966g;
        textView.setVisibility(0);
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = d0Var.f91963d.f92092a;
        android.widget.TextView textView2 = d0Var.f91967h;
        if (localUsageInfo == null) {
            l01.d0.f314761a.b(imageView, "", l01.a.h(), com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView.f91876o);
            textView2.setVisibility(8);
            textView.setText("");
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "item info is null!");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76367m)) {
            textView.setText(d0Var.f91963d.f92092a.f76367m);
            textView.setVisibility(0);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f91963d.f92092a.f76365h)) {
            textView.setText(d0Var.f91963d.f92092a.f76365h);
            textView.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f91963d.f92092a.f76361d)) {
            textView.setVisibility(0);
            textView.setText("");
        } else {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = d0Var.f91963d.f92092a;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", localUsageInfo2.f76361d, localUsageInfo2.f76362e);
            textView.setVisibility(0);
            textView.setText(d0Var.f91963d.f92092a.f76361d);
        }
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo3 = d0Var.f91963d.f92092a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "[onBindViewHolder] name=%s iconUrl=%s", localUsageInfo3.f76365h, localUsageInfo3.f76368n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f91963d.f92092a.f76368n)) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f314761a.b(imageView, d0Var.f91963d.f92092a.f76368n, l01.a.h(), com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView.f91876o);
        }
        ft.k kVar = (ft.k) i95.n0.c(ft.k.class);
        textView2.setVisibility(8);
        android.widget.ImageView imageView2 = d0Var.f91968i;
        imageView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f91963d.f92092a.f76374t)) {
            int i18 = d0Var.f91963d.f92092a.f76363f;
            ((com.tencent.mm.feature.appbrand.support.e0) kVar).getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.appcache.p.a(i18))) {
                textView2.setVisibility(0);
                textView2.setText(com.tencent.mm.plugin.appbrand.appcache.p.a(d0Var.f91963d.f92092a.f76363f));
            } else if (d0Var.f91963d.f92092a.f76372r) {
                imageView2.setVisibility(0);
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
                if (com.tencent.mm.ui.bk.C()) {
                    shapeDrawable.getPaint().setColor(-14935012);
                } else {
                    shapeDrawable.getPaint().setColor(-15263959);
                }
                imageView2.setBackground(shapeDrawable);
                imageView2.setImageResource(com.tencent.mm.R.raw.app_brand_destop_view_third_party_running_flag);
            }
        } else {
            textView2.setVisibility(0);
            textView2.setText(d0Var.f91963d.f92092a.f76374t);
        }
        android.view.View view2 = d0Var.itemView;
        view2.setTag(com.tencent.mm.R.id.cvq, new rl5.r(view2.getContext(), d0Var.itemView));
        d0Var.itemView.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.c0(d0Var, taskViewListener, appBrandTaskReport, i17));
        d0Var.itemView.setHapticFeedbackEnabled(false);
        android.view.View view3 = d0Var.itemView;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = textView.getText().toString();
        objArr[1] = textView2.getVisibility() == 0 ? textView2.getText().toString() : "";
        view3.setContentDescription(java.lang.String.format("%s,%s", objArr));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.appbrand.widget.recent.d0(com.tencent.mm.ui.id.b(this.f91940d.getContext()).inflate(com.tencent.mm.R.layout.dyy, viewGroup, false));
    }
}
