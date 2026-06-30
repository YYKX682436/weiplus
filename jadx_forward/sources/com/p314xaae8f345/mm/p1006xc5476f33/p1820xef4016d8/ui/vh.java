package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class vh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f229084e;

    public vh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd, int i17) {
        this.f229084e = activityC16384xb66222dd;
        this.f229083d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f229084e;
        int i17 = this.f229083d;
        activityC16384xb66222dd.I2 = i17;
        int i18 = activityC16384xb66222dd.P1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i18 == 0) {
            activityC16384xb66222dd.f227940i.setVisibility(0);
            android.view.View view = activityC16384xb66222dd.f227946m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = activityC16384xb66222dd.f227950o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
            return;
        }
        activityC16384xb66222dd.f227940i.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "exchangeExpressionState() state:%s", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case 0:
                android.view.View view3 = activityC16384xb66222dd.f227946m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227948n.setText("");
                android.view.View view4 = activityC16384xb66222dd.f227950o;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
                return;
            case 1:
                if (activityC16384xb66222dd.X1 != null) {
                    activityC16384xb66222dd.Y1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = activityC16384xb66222dd.Y1;
                    c6646xbe932a67.f139948d = 4L;
                    c6646xbe932a67.k();
                }
                activityC16384xb66222dd.X1 = activityC16384xb66222dd.W1;
                int i19 = activityC16384xb66222dd.f227931b2;
                if (i19 == 0) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = activityC16384xb66222dd.W1;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var).getClass();
                    if (n22.m.j(interfaceC4987x84e327cb)) {
                        activityC16384xb66222dd.f227930a2 = 2;
                    } else {
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = activityC16384xb66222dd.W1;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var2).getClass();
                        if (n22.m.p(interfaceC4987x84e327cb2)) {
                            activityC16384xb66222dd.f227930a2 = 4;
                        } else {
                            activityC16384xb66222dd.f227930a2 = 3;
                        }
                    }
                } else if (i19 == 1) {
                    activityC16384xb66222dd.f227930a2 = 2;
                    activityC16384xb66222dd.f227933d2++;
                } else if (i19 == 2) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var3 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = activityC16384xb66222dd.W1;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var3).getClass();
                    if (n22.m.j(interfaceC4987x84e327cb3)) {
                        activityC16384xb66222dd.f227930a2 = 2;
                        activityC16384xb66222dd.f227937g2++;
                    } else {
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var4 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb4 = activityC16384xb66222dd.W1;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var4).getClass();
                        if (n22.m.p(interfaceC4987x84e327cb4)) {
                            activityC16384xb66222dd.f227930a2 = 4;
                            activityC16384xb66222dd.f227935f2++;
                        } else {
                            activityC16384xb66222dd.f227930a2 = 3;
                            activityC16384xb66222dd.f227934e2++;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
                android.view.View view5 = activityC16384xb66222dd.f227946m;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = activityC16384xb66222dd.f227950o;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227960s.setVisibility(8);
                activityC16384xb66222dd.f227952p.setVisibility(0);
                activityC16384xb66222dd.f227956q.setVisibility(0);
                android.view.View view7 = activityC16384xb66222dd.f227958r;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = activityC16384xb66222dd.f227962t;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227964u.setVisibility(8);
                activityC16384xb66222dd.f227966v.setVisibility(8);
                return;
            case 2:
                android.view.View view9 = activityC16384xb66222dd.f227946m;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view10 = activityC16384xb66222dd.f227950o;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227960s.setVisibility(8);
                activityC16384xb66222dd.f227952p.setVisibility(8);
                activityC16384xb66222dd.f227956q.setVisibility(8);
                android.view.View view11 = activityC16384xb66222dd.f227958r;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = activityC16384xb66222dd.f227962t;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227964u.setVisibility(0);
                activityC16384xb66222dd.f227966v.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
                return;
            case 3:
                android.view.View view13 = activityC16384xb66222dd.f227946m;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
                android.view.View view14 = activityC16384xb66222dd.f227950o;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(0);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227960s.setVisibility(8);
                activityC16384xb66222dd.f227952p.setVisibility(8);
                activityC16384xb66222dd.f227956q.setVisibility(8);
                android.view.View view15 = activityC16384xb66222dd.f227958r;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view16 = activityC16384xb66222dd.f227962t;
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                arrayList16.add(8);
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227964u.setVisibility(8);
                activityC16384xb66222dd.f227966v.setVisibility(0);
                activityC16384xb66222dd.f227968w.setImageResource(com.p314xaae8f345.mm.R.raw.f80553x3a45498e);
                return;
            case 4:
                android.view.View view17 = activityC16384xb66222dd.f227946m;
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList17.add(0);
                java.util.Collections.reverse(arrayList17);
                yj0.a.d(view17, arrayList17.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227948n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573961gm1);
                android.view.View view18 = activityC16384xb66222dd.f227950o;
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                arrayList18.add(8);
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(view18, arrayList18.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
                return;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setPAGDataAndStart：%s", activityC16384xb66222dd.C1);
                activityC16384xb66222dd.f227975y0.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.li(activityC16384xb66222dd));
                return;
            case 6:
                android.view.View view19 = activityC16384xb66222dd.f227946m;
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList19.add(8);
                java.util.Collections.reverse(arrayList19);
                yj0.a.d(view19, arrayList19.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                yj0.a.f(view19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view20 = activityC16384xb66222dd.f227950o;
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                arrayList20.add(0);
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(view20, arrayList20.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(view20, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227960s.setVisibility(8);
                activityC16384xb66222dd.f227952p.setVisibility(8);
                activityC16384xb66222dd.f227956q.setVisibility(8);
                android.view.View view21 = activityC16384xb66222dd.f227958r;
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                arrayList21.add(8);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(view21, arrayList21.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(view21, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view22 = activityC16384xb66222dd.f227962t;
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                arrayList22.add(8);
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(view22, arrayList22.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view22.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                yj0.a.f(view22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC16384xb66222dd.f227964u.setVisibility(8);
                activityC16384xb66222dd.f227966v.setVisibility(0);
                activityC16384xb66222dd.f227968w.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aml);
                android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                activityC16384xb66222dd.f227968w.startAnimation(rotateAnimation);
                activityC16384xb66222dd.B2.mo48813x58998cd();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.b(activityC16384xb66222dd.A1, activityC16384xb66222dd.B1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.X6(activityC16384xb66222dd);
                return;
            default:
                return;
        }
    }
}
