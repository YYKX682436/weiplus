package v73;

/* loaded from: classes9.dex */
public class r0 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.f f515271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa f515272b;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa, r73.f fVar) {
        this.f515272b = activityC16102xafeab7fa;
        this.f515271a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa = this.f515272b;
        java.util.ArrayList arrayList = activityC16102xafeab7fa.f223877r;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            activityC16102xafeab7fa.f223872m.removeView((com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.C16098xc8b749c7) it.next());
        }
        arrayList.clear();
        this.f515272b.m78548x39037dd1();
        if (this.f515271a.f474702r.f473961o) {
            this.f515272b.f223879t = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24522, 1, 1);
        } else {
            this.f515272b.f223879t = false;
        }
        java.util.LinkedList linkedList = this.f515271a.f474702r.f473955f;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f515272b.f223793d, "empty card");
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa2 = this.f515272b;
            r45.z75 z75Var = this.f515271a.f474702r.f473956g;
            activityC16102xafeab7fa2.f223870h.setVisibility(0);
            v73.v0 v0Var = (v73.v0) activityC16102xafeab7fa2.m80391xac8f1cfd(v73.v0.class);
            v0Var.getClass();
            ku5.u0 u0Var = ku5.t0.f394148d;
            v73.u0 u0Var2 = new v73.u0(v0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u0Var2, 300L, false);
            if (z75Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z75Var.f473307d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC16102xafeab7fa2.f223793d, "empty help word!");
                activityC16102xafeab7fa2.f223873n.setVisibility(8);
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(activityC16102xafeab7fa2.f223873n);
                activityC16102xafeab7fa2.f223873n.setClickable(true);
                activityC16102xafeab7fa2.f223873n.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC16102xafeab7fa2));
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(7, new v73.m0(activityC16102xafeab7fa2, z75Var));
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(z75Var.f473307d);
                spannableStringBuilder.setSpan(d7Var, 0, spannableStringBuilder.length(), 18);
                activityC16102xafeab7fa2.f223873n.setText(spannableStringBuilder);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa3 = this.f515272b;
            r45.zw3 zw3Var = this.f515271a.f474702r;
            activityC16102xafeab7fa3.getClass();
            if (zw3Var.f473961o) {
                activityC16102xafeab7fa3.f223875p.setVisibility(0);
                activityC16102xafeab7fa3.f223873n.setVisibility(8);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) activityC16102xafeab7fa3.f223871i.getLayoutParams();
                layoutParams.bottomMargin = i65.a.b(activityC16102xafeab7fa3, 96);
                activityC16102xafeab7fa3.f223871i.setLayoutParams(layoutParams);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zw3Var.f473962p.f472088d)) {
                    r45.xw3 xw3Var = zw3Var.f473962p;
                    activityC16102xafeab7fa3.f223878s = xw3Var.f472089e;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(xw3Var.f472088d);
                    int length = sb6.length();
                    sb6.append(zw3Var.f473962p.f472089e);
                    activityC16102xafeab7fa3.f223874o.setText(sb6.toString());
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zw3Var.f473962p.f472089e)) {
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(activityC16102xafeab7fa3.f223874o, sb6.toString(), length, sb6.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new v73.n0(activityC16102xafeab7fa3, zw3Var), true), activityC16102xafeab7fa3);
                    }
                }
            } else {
                activityC16102xafeab7fa3.f223875p.setVisibility(8);
                activityC16102xafeab7fa3.f223873n.setVisibility(0);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) activityC16102xafeab7fa3.f223871i.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.b(activityC16102xafeab7fa3, 64);
                activityC16102xafeab7fa3.f223871i.setLayoutParams(layoutParams2);
            }
            this.f515272b.f223868f.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa4 = this.f515272b;
            activityC16102xafeab7fa4.f223794e = com.p314xaae8f345.mm.R.C30859x5a72f63.aaw;
            activityC16102xafeab7fa4.mo54450xbf7c1df6("");
        } else {
            this.f515272b.f223870h.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa5 = this.f515272b;
            java.util.LinkedList<r45.ax3> linkedList2 = this.f515271a.f474702r.f473955f;
            activityC16102xafeab7fa5.getClass();
            int i19 = 1;
            for (r45.ax3 ax3Var : linkedList2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.C16098xc8b749c7 c16098xc8b749c7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.C16098xc8b749c7(activityC16102xafeab7fa5);
                c16098xc8b749c7.m65143x409a4d83(ax3Var);
                c16098xc8b749c7.setOnClickListener(new v73.o0(activityC16102xafeab7fa5, ax3Var));
                activityC16102xafeab7fa5.f223872m.addView(c16098xc8b749c7, i19);
                activityC16102xafeab7fa5.f223877r.add(c16098xc8b749c7);
                if (i19 == 1) {
                    c16098xc8b749c7.sendAccessibilityEvent(8);
                }
                i19++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f515272b.f223793d, "show open card: %s", java.lang.Boolean.valueOf(this.f515271a.f474702r.f473958i));
            if (this.f515271a.f474702r.f473958i) {
                this.f515272b.f223868f.setVisibility(0);
            } else {
                this.f515272b.f223868f.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa6 = this.f515272b;
            activityC16102xafeab7fa6.f223794e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560767tm;
            activityC16102xafeab7fa6.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f573821fx5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa7 = this.f515272b;
        r45.tw4 tw4Var = this.f515271a.f474702r.f473960n;
        if (tw4Var != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) activityC16102xafeab7fa7.findViewById(com.p314xaae8f345.mm.R.id.pga);
            c22905xef04d72d.m83148xdedf72f8(tw4Var);
            c22905xef04d72d.m83149xa5089f5c(activityC16102xafeab7fa7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            c22905xef04d72d.m83150x1c5c5ff4(activityC16102xafeab7fa7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            activityC16102xafeab7fa7.getClass();
        }
        this.f515272b.U6();
        this.f515272b.findViewById(com.p314xaae8f345.mm.R.id.h4k).setBackgroundResource(this.f515272b.f223794e);
        u73.h.h(this.f515272b, this.f515271a.f474702r.f473957h, null, 0, null);
        android.view.View findViewById = this.f515272b.findViewById(com.p314xaae8f345.mm.R.id.h4_);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 0L, 1L);
    }
}
