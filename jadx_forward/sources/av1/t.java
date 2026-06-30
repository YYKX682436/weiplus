package av1;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a f95726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f95727e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a, int i17) {
        this.f95726d = activityC13090x679cb21a;
        this.f95727e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a.f177020q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a = this.f95726d;
        activityC13090x679cb21a.U6();
        switch (this.f95727e) {
            case 1:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(8);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb3523 != null) {
                    c22699x3dcdb3523.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80362xebdc046d, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.m82040x7541828(android.graphics.Color.parseColor("#1AAD19"));
                }
                android.widget.ProgressBar progressBar = activityC13090x679cb21a.f177026i;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                android.widget.TextView textView = activityC13090x679cb21a.f177023f;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = activityC13090x679cb21a.f177023f;
                if (textView2 != null) {
                    textView2.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awu));
                }
                android.widget.Button button = activityC13090x679cb21a.f177021d;
                if (button != null) {
                    button.setVisibility(8);
                }
                android.view.View view = activityC13090x679cb21a.f177022e;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetConnectSucc");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 11L, 1L);
                return;
            case 2:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb3525 != null) {
                    c22699x3dcdb3525.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb3526 != null) {
                    c22699x3dcdb3526.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80789x5b8486e5, android.graphics.Color.parseColor("#FA5151")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb3527 != null) {
                    c22699x3dcdb3527.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb3528 != null) {
                    c22699x3dcdb3528.setVisibility(8);
                }
                android.widget.ProgressBar progressBar2 = activityC13090x679cb21a.f177026i;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                android.widget.TextView textView3 = activityC13090x679cb21a.f177023f;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.widget.TextView textView4 = activityC13090x679cb21a.f177023f;
                if (textView4 != null) {
                    textView4.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awq));
                }
                android.widget.Button button2 = activityC13090x679cb21a.f177021d;
                if (button2 != null) {
                    button2.setVisibility(0);
                }
                android.view.View view2 = activityC13090x679cb21a.f177022e;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button3 = activityC13090x679cb21a.f177021d;
                if (button3 != null) {
                    button3.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2_));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetSdkConnectTimeOut");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 10L, 1L);
                return;
            case 3:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3529 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb3529 != null) {
                    c22699x3dcdb3529.setVisibility(8);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35210 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35210 != null) {
                    c22699x3dcdb35210.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35211 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35211 != null) {
                    c22699x3dcdb35211.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80362xebdc046d, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35212 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35212 != null) {
                    c22699x3dcdb35212.m82040x7541828(android.graphics.Color.parseColor("#1AAD19"));
                }
                android.widget.ProgressBar progressBar3 = activityC13090x679cb21a.f177026i;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(8);
                }
                android.widget.TextView textView5 = activityC13090x679cb21a.f177023f;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                android.widget.TextView textView6 = activityC13090x679cb21a.f177023f;
                if (textView6 != null) {
                    textView6.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibw));
                }
                android.widget.Button button4 = activityC13090x679cb21a.f177021d;
                if (button4 != null) {
                    button4.setVisibility(0);
                }
                android.view.View view3 = activityC13090x679cb21a.f177022e;
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button5 = activityC13090x679cb21a.f177021d;
                if (button5 != null) {
                    button5.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjv));
                }
                android.widget.Button button6 = activityC13090x679cb21a.f177021d;
                if (button6 != null) {
                    button6.setTextColor(activityC13090x679cb21a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
                }
                android.widget.Button button7 = activityC13090x679cb21a.f177021d;
                if (button7 == null) {
                    return;
                }
                button7.setBackground(activityC13090x679cb21a.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
                return;
            case 4:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35213 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35213 != null) {
                    c22699x3dcdb35213.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35214 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35214 != null) {
                    c22699x3dcdb35214.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80824x9d782b43, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35215 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35215 != null) {
                    c22699x3dcdb35215.m82040x7541828(android.graphics.Color.parseColor("#1AAD19"));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35216 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35216 != null) {
                    c22699x3dcdb35216.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35217 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35217 != null) {
                    c22699x3dcdb35217.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80362xebdc046d, android.graphics.Color.parseColor("#1AAD19")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35218 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35218 != null) {
                    c22699x3dcdb35218.m82040x7541828(android.graphics.Color.parseColor("#1AAD19"));
                }
                android.widget.ProgressBar progressBar4 = activityC13090x679cb21a.f177026i;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(8);
                }
                android.widget.TextView textView7 = activityC13090x679cb21a.f177023f;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
                android.widget.TextView textView8 = activityC13090x679cb21a.f177023f;
                if (textView8 != null) {
                    textView8.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ib9));
                }
                android.widget.Button button8 = activityC13090x679cb21a.f177021d;
                if (button8 != null) {
                    button8.setVisibility(0);
                }
                android.view.View view4 = activityC13090x679cb21a.f177022e;
                if (view4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button9 = activityC13090x679cb21a.f177021d;
                if (button9 != null) {
                    button9.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlc));
                }
                android.widget.Button button10 = activityC13090x679cb21a.f177021d;
                if (button10 != null) {
                    button10.setTextColor(activityC13090x679cb21a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                }
                android.widget.Button button11 = activityC13090x679cb21a.f177021d;
                if (button11 == null) {
                    return;
                }
                button11.setBackground(activityC13090x679cb21a.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy));
                return;
            case 5:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35219 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35219 != null) {
                    c22699x3dcdb35219.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35220 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35220 != null) {
                    c22699x3dcdb35220.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80789x5b8486e5, android.graphics.Color.parseColor("#FA5151")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35221 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35221 != null) {
                    c22699x3dcdb35221.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35222 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35222 != null) {
                    c22699x3dcdb35222.setVisibility(8);
                }
                android.widget.ProgressBar progressBar5 = activityC13090x679cb21a.f177026i;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(8);
                }
                android.widget.TextView textView9 = activityC13090x679cb21a.f177023f;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
                android.widget.TextView textView10 = activityC13090x679cb21a.f177023f;
                if (textView10 != null) {
                    textView10.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awo));
                }
                android.widget.Button button12 = activityC13090x679cb21a.f177021d;
                if (button12 != null) {
                    button12.setVisibility(0);
                }
                android.view.View view5 = activityC13090x679cb21a.f177022e;
                if (view5 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.Button button13 = activityC13090x679cb21a.f177021d;
                if (button13 != null) {
                    button13.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2_));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetSdkConnectFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 9L, 1L);
                return;
            case 6:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35223 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35223 != null) {
                    c22699x3dcdb35223.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35224 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35224 != null) {
                    c22699x3dcdb35224.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80789x5b8486e5, android.graphics.Color.parseColor("#FA5151")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35225 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35225 != null) {
                    c22699x3dcdb35225.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35226 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35226 != null) {
                    c22699x3dcdb35226.setVisibility(8);
                }
                android.widget.ProgressBar progressBar6 = activityC13090x679cb21a.f177026i;
                if (progressBar6 != null) {
                    progressBar6.setVisibility(8);
                }
                android.widget.TextView textView11 = activityC13090x679cb21a.f177023f;
                if (textView11 != null) {
                    textView11.setVisibility(0);
                }
                android.widget.TextView textView12 = activityC13090x679cb21a.f177023f;
                if (textView12 != null) {
                    textView12.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awp));
                }
                android.widget.Button button14 = activityC13090x679cb21a.f177021d;
                if (button14 != null) {
                    button14.setVisibility(8);
                }
                android.view.View view6 = activityC13090x679cb21a.f177022e;
                if (view6 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastDiffNetWork");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 8L, 1L);
                return;
            case 7:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35227 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35227 != null) {
                    c22699x3dcdb35227.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35228 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35228 != null) {
                    c22699x3dcdb35228.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80789x5b8486e5, android.graphics.Color.parseColor("#FA5151")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35229 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35229 != null) {
                    c22699x3dcdb35229.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35230 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35230 != null) {
                    c22699x3dcdb35230.setVisibility(8);
                }
                android.widget.ProgressBar progressBar7 = activityC13090x679cb21a.f177026i;
                if (progressBar7 != null) {
                    progressBar7.setVisibility(8);
                }
                android.widget.TextView textView13 = activityC13090x679cb21a.f177023f;
                if (textView13 != null) {
                    textView13.setVisibility(0);
                }
                android.widget.TextView textView14 = activityC13090x679cb21a.f177023f;
                if (textView14 != null) {
                    textView14.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awv));
                }
                android.widget.Button button15 = activityC13090x679cb21a.f177021d;
                if (button15 != null) {
                    button15.setVisibility(0);
                }
                android.view.View view7 = activityC13090x679cb21a.f177022e;
                if (view7 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 34L, 1L);
                android.widget.Button button16 = activityC13090x679cb21a.f177021d;
                if (button16 != null) {
                    button16.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2a));
                }
                android.widget.Button button17 = activityC13090x679cb21a.f177021d;
                if (button17 != null) {
                    button17.setOnClickListener(new av1.r(activityC13090x679cb21a));
                    return;
                }
                return;
            case 8:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35231 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35231 != null) {
                    c22699x3dcdb35231.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35232 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35232 != null) {
                    c22699x3dcdb35232.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(activityC13090x679cb21a.mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80789x5b8486e5, android.graphics.Color.parseColor("#FA5151")));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35233 = activityC13090x679cb21a.f177024g;
                if (c22699x3dcdb35233 != null) {
                    c22699x3dcdb35233.m82040x7541828(android.graphics.Color.parseColor("#FA5151"));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35234 = activityC13090x679cb21a.f177025h;
                if (c22699x3dcdb35234 != null) {
                    c22699x3dcdb35234.setVisibility(8);
                }
                android.widget.ProgressBar progressBar8 = activityC13090x679cb21a.f177026i;
                if (progressBar8 != null) {
                    progressBar8.setVisibility(8);
                }
                android.widget.TextView textView15 = activityC13090x679cb21a.f177023f;
                if (textView15 != null) {
                    textView15.setVisibility(0);
                }
                android.widget.TextView textView16 = activityC13090x679cb21a.f177023f;
                if (textView16 != null) {
                    textView16.setText(activityC13090x679cb21a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aww));
                }
                android.widget.Button button18 = activityC13090x679cb21a.f177021d;
                if (button18 != null) {
                    button18.setVisibility(0);
                }
                android.view.View view8 = activityC13090x679cb21a.f177022e;
                if (view8 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 34L, 1L);
                android.widget.Button button19 = activityC13090x679cb21a.f177021d;
                if (button19 != null) {
                    button19.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2a));
                }
                android.widget.Button button20 = activityC13090x679cb21a.f177021d;
                if (button20 != null) {
                    button20.setOnClickListener(new av1.s(activityC13090x679cb21a));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
