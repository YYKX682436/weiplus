package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class r extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView f92041d;

    public r(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView) {
        this.f92041d = appBrandCommonUsedTaskView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f92041d.f91860g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.widget.recent.t tVar = (com.tencent.mm.plugin.appbrand.widget.recent.t) k3Var;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView = this.f92041d;
        java.util.ArrayList arrayList = appBrandCommonUsedTaskView.f91860g;
        com.tencent.mm.plugin.appbrand.widget.recent.z0 z0Var = i17 >= arrayList.size() ? null : (com.tencent.mm.plugin.appbrand.widget.recent.z0) arrayList.get(i17);
        if (z0Var == null) {
            return;
        }
        tVar.f92055d = z0Var;
        com.tencent.mm.plugin.appbrand.widget.recent.h1 taskViewListener = appBrandCommonUsedTaskView.getTaskViewListener();
        com.tencent.mm.plugin.appbrand.widget.recent.g1 appBrandTaskReport = appBrandCommonUsedTaskView.getAppBrandTaskReport();
        com.tencent.mm.plugin.appbrand.widget.recent.c1 c1Var = com.tencent.mm.plugin.appbrand.widget.recent.d1.f91969a;
        int f17 = (int) (i65.a.f(r7, com.tencent.mm.R.dimen.f480091ao2) * cl1.k.a(tVar.itemView.getContext()));
        tVar.itemView.getLayoutParams().width = (int) c1Var.b(tVar.itemView.getContext());
        android.widget.RelativeLayout relativeLayout = tVar.f92056e;
        relativeLayout.getLayoutParams().width = f17;
        relativeLayout.getLayoutParams().height = f17;
        android.widget.ImageView imageView = tVar.f92057f;
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        android.view.View view = tVar.itemView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCommonUsedTaskView$AppBrandCommonUsedItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCommonUsedTaskView$AppBrandCommonUsedItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = tVar.f92058g;
        textView.setVisibility(0);
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = tVar.f92055d.f92092a;
        android.widget.TextView textView2 = tVar.f92059h;
        if (localUsageInfo == null) {
            l01.d0.f314761a.b(imageView, "", l01.a.h(), com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.f91859v);
            textView2.setVisibility(8);
            textView.setText("");
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "item info is null!");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(localUsageInfo.f76367m)) {
            textView.setText(tVar.f92055d.f92092a.f76367m);
            textView.setVisibility(0);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(tVar.f92055d.f92092a.f76365h)) {
            textView.setText(tVar.f92055d.f92092a.f76365h);
            textView.setVisibility(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f92055d.f92092a.f76361d)) {
            textView.setVisibility(0);
            textView.setText("");
        } else {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = tVar.f92055d.f92092a;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", localUsageInfo2.f76361d, localUsageInfo2.f76362e);
            textView.setVisibility(0);
            textView.setText(tVar.f92055d.f92092a.f76361d);
        }
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo3 = tVar.f92055d.f92092a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "[onBindViewHolder] name=%s iconUrl=%s", localUsageInfo3.f76365h, localUsageInfo3.f76368n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f92055d.f92092a.f76368n)) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f314761a.b(imageView, tVar.f92055d.f92092a.f76368n, l01.a.h(), com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.f91859v);
        }
        ft.k kVar = (ft.k) i95.n0.c(ft.k.class);
        textView2.setVisibility(8);
        android.widget.ImageView imageView2 = tVar.f92060i;
        imageView2.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f92055d.f92092a.f76374t)) {
            int i18 = tVar.f92055d.f92092a.f76363f;
            ((com.tencent.mm.feature.appbrand.support.e0) kVar).getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.appcache.p.a(i18))) {
                textView2.setVisibility(0);
                textView2.setText(com.tencent.mm.plugin.appbrand.appcache.p.a(tVar.f92055d.f92092a.f76363f));
            } else if (tVar.f92055d.f92092a.f76372r) {
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
            textView2.setText(tVar.f92055d.f92092a.f76374t);
        }
        android.view.View view2 = tVar.itemView;
        view2.setTag(com.tencent.mm.R.id.cvq, new rl5.r(view2.getContext(), tVar.itemView));
        tVar.itemView.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.s(tVar, taskViewListener, appBrandTaskReport, i17));
        tVar.itemView.setHapticFeedbackEnabled(false);
        android.view.View view3 = tVar.itemView;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = textView.getText().toString();
        objArr[1] = textView2.getVisibility() == 0 ? textView2.getText().toString() : "";
        view3.setContentDescription(java.lang.String.format("%s,%s", objArr));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.appbrand.widget.recent.t(com.tencent.mm.ui.id.b(this.f92041d.getContext()).inflate(com.tencent.mm.R.layout.dyy, viewGroup, false));
    }
}
