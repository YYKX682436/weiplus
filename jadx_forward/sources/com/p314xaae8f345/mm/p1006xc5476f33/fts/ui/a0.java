package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class a0 implements q01.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c f219544d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c activityC15591x5482e11c) {
        this.f219544d = activityC15591x5482e11c;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        q01.g gVar = (q01.g) obj;
        if (gVar.f440812a == q01.f.f440809e) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c.P;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c activityC15591x5482e11c = this.f219544d;
            activityC15591x5482e11c.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c0(activityC15591x5482e11c));
            int i18 = gVar.f440814c;
            int i19 = gVar.f440813b;
            if (i19 == 0 && i18 == 0) {
                activityC15591x5482e11c.f219422J = ((l41.e0) ((ab0.v) gVar.f440816e)).f397336g;
                activityC15591x5482e11c.K = 1;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
                c6802x562a2fb9.p(activityC15591x5482e11c.G);
                c6802x562a2fb9.f141325e = 0L;
                c6802x562a2fb9.f141326f = 1L;
                c6802x562a2fb9.k();
            } else {
                if (i18 == -24) {
                    tm.a b17 = tm.a.b(gVar.f440815d);
                    if (b17 != null) {
                        activityC15591x5482e11c.A.setText(b17.f501932b);
                    } else {
                        activityC15591x5482e11c.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h9y);
                    }
                } else if (i18 != -4) {
                    activityC15591x5482e11c.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h9y);
                } else if (i19 == 4) {
                    activityC15591x5482e11c.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h9y);
                } else {
                    activityC15591x5482e11c.A.setText(activityC15591x5482e11c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icn));
                }
                activityC15591x5482e11c.K = -1;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb92 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
                c6802x562a2fb92.p(activityC15591x5482e11c.G);
                c6802x562a2fb92.f141325e = 0L;
                c6802x562a2fb92.f141326f = 2L;
                c6802x562a2fb92.k();
            }
            if (activityC15591x5482e11c.K == 0) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c0(activityC15591x5482e11c));
            int i27 = activityC15591x5482e11c.K;
            if (i27 > 0) {
                activityC15591x5482e11c.D = true;
                activityC15591x5482e11c.g7();
                return;
            }
            if (i27 <= 0) {
                activityC15591x5482e11c.f219436d.setVisibility(8);
                android.view.View view = activityC15591x5482e11c.f219425r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = activityC15591x5482e11c.f219426s;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = activityC15591x5482e11c.f219427t;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = activityC15591x5482e11c.f219428u;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = activityC15591x5482e11c.f219429v;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC15591x5482e11c.F.setVisibility(8);
                return;
            }
            r45.cx5 cx5Var = activityC15591x5482e11c.f219422J;
            java.lang.String str = cx5Var.f453433d;
            java.lang.String str2 = cx5Var.f453434e;
            activityC15591x5482e11c.f219436d.setVisibility(8);
            android.view.View view6 = activityC15591x5482e11c.f219425r;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = activityC15591x5482e11c.f219426s;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15591x5482e11c.f219430w.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z(activityC15591x5482e11c));
            activityC15591x5482e11c.f219432y.setText(str2);
            activityC15591x5482e11c.f219433z.setText("");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(activityC15591x5482e11c.f219431x, str, null);
            android.view.View view8 = activityC15591x5482e11c.f219427t;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = activityC15591x5482e11c.f219428u;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = activityC15591x5482e11c.f219429v;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15591x5482e11c.F.setVisibility(8);
        }
    }
}
