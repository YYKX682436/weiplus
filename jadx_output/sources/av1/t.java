package av1;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14194e;

    public t(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity, int i17) {
        this.f14193d = screenCastActivity;
        this.f14194e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.cast.ui.ScreenCastActivity.f95487q;
        com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity = this.f14193d;
        screenCastActivity.U6();
        switch (this.f14194e) {
            case 1:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = screenCastActivity.f95491g;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = screenCastActivity.f95492h;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = screenCastActivity.f95492h;
                if (weImageView3 != null) {
                    weImageView3.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.icons_outlined_wifi, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = screenCastActivity.f95492h;
                if (weImageView4 != null) {
                    weImageView4.setIconColor(android.graphics.Color.parseColor("#1AAD19"));
                }
                android.widget.ProgressBar progressBar = screenCastActivity.f95493i;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                android.widget.TextView textView = screenCastActivity.f95490f;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = screenCastActivity.f95490f;
                if (textView2 != null) {
                    textView2.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.awu));
                }
                android.widget.Button button = screenCastActivity.f95488d;
                if (button != null) {
                    button.setVisibility(8);
                }
                android.view.View view = screenCastActivity.f95489e;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetConnectSucc");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 11L, 1L);
                return;
            case 2:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = screenCastActivity.f95491g;
                if (weImageView5 != null) {
                    weImageView5.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = screenCastActivity.f95491g;
                if (weImageView6 != null) {
                    weImageView6.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.on_error_info, android.graphics.Color.parseColor("#FA5151")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = screenCastActivity.f95491g;
                if (weImageView7 != null) {
                    weImageView7.setIconColor(android.graphics.Color.parseColor("#FA5151"));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = screenCastActivity.f95492h;
                if (weImageView8 != null) {
                    weImageView8.setVisibility(8);
                }
                android.widget.ProgressBar progressBar2 = screenCastActivity.f95493i;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                android.widget.TextView textView3 = screenCastActivity.f95490f;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.widget.TextView textView4 = screenCastActivity.f95490f;
                if (textView4 != null) {
                    textView4.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.awq));
                }
                android.widget.Button button2 = screenCastActivity.f95488d;
                if (button2 != null) {
                    button2.setVisibility(0);
                }
                android.view.View view2 = screenCastActivity.f95489e;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button3 = screenCastActivity.f95488d;
                if (button3 != null) {
                    button3.setText(screenCastActivity.getString(com.tencent.mm.R.string.i2_));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetSdkConnectTimeOut");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 10L, 1L);
                return;
            case 3:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView9 = screenCastActivity.f95491g;
                if (weImageView9 != null) {
                    weImageView9.setVisibility(8);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView10 = screenCastActivity.f95492h;
                if (weImageView10 != null) {
                    weImageView10.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView11 = screenCastActivity.f95492h;
                if (weImageView11 != null) {
                    weImageView11.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.icons_outlined_wifi, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView12 = screenCastActivity.f95492h;
                if (weImageView12 != null) {
                    weImageView12.setIconColor(android.graphics.Color.parseColor("#1AAD19"));
                }
                android.widget.ProgressBar progressBar3 = screenCastActivity.f95493i;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(8);
                }
                android.widget.TextView textView5 = screenCastActivity.f95490f;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                android.widget.TextView textView6 = screenCastActivity.f95490f;
                if (textView6 != null) {
                    textView6.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.ibw));
                }
                android.widget.Button button4 = screenCastActivity.f95488d;
                if (button4 != null) {
                    button4.setVisibility(0);
                }
                android.view.View view3 = screenCastActivity.f95489e;
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button5 = screenCastActivity.f95488d;
                if (button5 != null) {
                    button5.setText(screenCastActivity.getString(com.tencent.mm.R.string.jjv));
                }
                android.widget.Button button6 = screenCastActivity.f95488d;
                if (button6 != null) {
                    button6.setTextColor(screenCastActivity.getResources().getColor(com.tencent.mm.R.color.f478489a));
                }
                android.widget.Button button7 = screenCastActivity.f95488d;
                if (button7 == null) {
                    return;
                }
                button7.setBackground(screenCastActivity.getDrawable(com.tencent.mm.R.drawable.f481057jk));
                return;
            case 4:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView13 = screenCastActivity.f95491g;
                if (weImageView13 != null) {
                    weImageView13.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView14 = screenCastActivity.f95491g;
                if (weImageView14 != null) {
                    weImageView14.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.pc_connect_succ, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView15 = screenCastActivity.f95491g;
                if (weImageView15 != null) {
                    weImageView15.setIconColor(android.graphics.Color.parseColor("#1AAD19"));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView16 = screenCastActivity.f95492h;
                if (weImageView16 != null) {
                    weImageView16.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView17 = screenCastActivity.f95492h;
                if (weImageView17 != null) {
                    weImageView17.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.icons_outlined_wifi, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView18 = screenCastActivity.f95492h;
                if (weImageView18 != null) {
                    weImageView18.setIconColor(android.graphics.Color.parseColor("#1AAD19"));
                }
                android.widget.ProgressBar progressBar4 = screenCastActivity.f95493i;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(8);
                }
                android.widget.TextView textView7 = screenCastActivity.f95490f;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
                android.widget.TextView textView8 = screenCastActivity.f95490f;
                if (textView8 != null) {
                    textView8.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.ib9));
                }
                android.widget.Button button8 = screenCastActivity.f95488d;
                if (button8 != null) {
                    button8.setVisibility(0);
                }
                android.view.View view4 = screenCastActivity.f95489e;
                if (view4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button9 = screenCastActivity.f95488d;
                if (button9 != null) {
                    button9.setText(screenCastActivity.getString(com.tencent.mm.R.string.jlc));
                }
                android.widget.Button button10 = screenCastActivity.f95488d;
                if (button10 != null) {
                    button10.setTextColor(screenCastActivity.getResources().getColor(com.tencent.mm.R.color.f478502m));
                }
                android.widget.Button button11 = screenCastActivity.f95488d;
                if (button11 == null) {
                    return;
                }
                button11.setBackground(screenCastActivity.getDrawable(com.tencent.mm.R.drawable.f481068jy));
                return;
            case 5:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView19 = screenCastActivity.f95491g;
                if (weImageView19 != null) {
                    weImageView19.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView20 = screenCastActivity.f95491g;
                if (weImageView20 != null) {
                    weImageView20.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.on_error_info, android.graphics.Color.parseColor("#FA5151")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView21 = screenCastActivity.f95491g;
                if (weImageView21 != null) {
                    weImageView21.setIconColor(android.graphics.Color.parseColor("#FA5151"));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView22 = screenCastActivity.f95492h;
                if (weImageView22 != null) {
                    weImageView22.setVisibility(8);
                }
                android.widget.ProgressBar progressBar5 = screenCastActivity.f95493i;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(8);
                }
                android.widget.TextView textView9 = screenCastActivity.f95490f;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
                android.widget.TextView textView10 = screenCastActivity.f95490f;
                if (textView10 != null) {
                    textView10.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.awo));
                }
                android.widget.Button button12 = screenCastActivity.f95488d;
                if (button12 != null) {
                    button12.setVisibility(0);
                }
                android.view.View view5 = screenCastActivity.f95489e;
                if (view5 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button13 = screenCastActivity.f95488d;
                if (button13 != null) {
                    button13.setText(screenCastActivity.getString(com.tencent.mm.R.string.i2_));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetSdkConnectFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 9L, 1L);
                return;
            case 6:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView23 = screenCastActivity.f95491g;
                if (weImageView23 != null) {
                    weImageView23.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView24 = screenCastActivity.f95491g;
                if (weImageView24 != null) {
                    weImageView24.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.on_error_info, android.graphics.Color.parseColor("#FA5151")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView25 = screenCastActivity.f95491g;
                if (weImageView25 != null) {
                    weImageView25.setIconColor(android.graphics.Color.parseColor("#FA5151"));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView26 = screenCastActivity.f95492h;
                if (weImageView26 != null) {
                    weImageView26.setVisibility(8);
                }
                android.widget.ProgressBar progressBar6 = screenCastActivity.f95493i;
                if (progressBar6 != null) {
                    progressBar6.setVisibility(8);
                }
                android.widget.TextView textView11 = screenCastActivity.f95490f;
                if (textView11 != null) {
                    textView11.setVisibility(0);
                }
                android.widget.TextView textView12 = screenCastActivity.f95490f;
                if (textView12 != null) {
                    textView12.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.awp));
                }
                android.widget.Button button14 = screenCastActivity.f95488d;
                if (button14 != null) {
                    button14.setVisibility(8);
                }
                android.view.View view6 = screenCastActivity.f95489e;
                if (view6 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastDiffNetWork");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 8L, 1L);
                return;
            case 7:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView27 = screenCastActivity.f95491g;
                if (weImageView27 != null) {
                    weImageView27.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView28 = screenCastActivity.f95491g;
                if (weImageView28 != null) {
                    weImageView28.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.on_error_info, android.graphics.Color.parseColor("#FA5151")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView29 = screenCastActivity.f95491g;
                if (weImageView29 != null) {
                    weImageView29.setIconColor(android.graphics.Color.parseColor("#FA5151"));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView30 = screenCastActivity.f95492h;
                if (weImageView30 != null) {
                    weImageView30.setVisibility(8);
                }
                android.widget.ProgressBar progressBar7 = screenCastActivity.f95493i;
                if (progressBar7 != null) {
                    progressBar7.setVisibility(8);
                }
                android.widget.TextView textView13 = screenCastActivity.f95490f;
                if (textView13 != null) {
                    textView13.setVisibility(0);
                }
                android.widget.TextView textView14 = screenCastActivity.f95490f;
                if (textView14 != null) {
                    textView14.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.awv));
                }
                android.widget.Button button15 = screenCastActivity.f95488d;
                if (button15 != null) {
                    button15.setVisibility(0);
                }
                android.view.View view7 = screenCastActivity.f95489e;
                if (view7 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 34L, 1L);
                android.widget.Button button16 = screenCastActivity.f95488d;
                if (button16 != null) {
                    button16.setText(screenCastActivity.getString(com.tencent.mm.R.string.i2a));
                }
                android.widget.Button button17 = screenCastActivity.f95488d;
                if (button17 != null) {
                    button17.setOnClickListener(new av1.r(screenCastActivity));
                    return;
                }
                return;
            case 8:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView31 = screenCastActivity.f95491g;
                if (weImageView31 != null) {
                    weImageView31.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView32 = screenCastActivity.f95491g;
                if (weImageView32 != null) {
                    weImageView32.setImageDrawable(com.tencent.mm.ui.uk.e(screenCastActivity.getContext(), com.tencent.mm.R.raw.on_error_info, android.graphics.Color.parseColor("#FA5151")));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView33 = screenCastActivity.f95491g;
                if (weImageView33 != null) {
                    weImageView33.setIconColor(android.graphics.Color.parseColor("#FA5151"));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView34 = screenCastActivity.f95492h;
                if (weImageView34 != null) {
                    weImageView34.setVisibility(8);
                }
                android.widget.ProgressBar progressBar8 = screenCastActivity.f95493i;
                if (progressBar8 != null) {
                    progressBar8.setVisibility(8);
                }
                android.widget.TextView textView15 = screenCastActivity.f95490f;
                if (textView15 != null) {
                    textView15.setVisibility(0);
                }
                android.widget.TextView textView16 = screenCastActivity.f95490f;
                if (textView16 != null) {
                    textView16.setText(screenCastActivity.getResources().getString(com.tencent.mm.R.string.aww));
                }
                android.widget.Button button18 = screenCastActivity.f95488d;
                if (button18 != null) {
                    button18.setVisibility(0);
                }
                android.view.View view8 = screenCastActivity.f95489e;
                if (view8 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 34L, 1L);
                android.widget.Button button19 = screenCastActivity.f95488d;
                if (button19 != null) {
                    button19.setText(screenCastActivity.getString(com.tencent.mm.R.string.i2a));
                }
                android.widget.Button button20 = screenCastActivity.f95488d;
                if (button20 != null) {
                    button20.setOnClickListener(new av1.s(screenCastActivity));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
