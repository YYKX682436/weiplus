package pk2;

/* loaded from: classes3.dex */
public final class b3 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f437108i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f437109j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437109j = "";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437109j;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return n() || this.f445961b == 3;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View findViewById = bottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.u9d);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new pk2.x2(this, o9Var));
            android.view.View findViewById2 = bottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.t4g);
            if (findViewById2 != null) {
                int visibility = findViewById.getVisibility();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(visibility));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f437108i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        this.f437108i = j17 != null ? p3325xe03a0797.p3326xc267989b.l.d(j17, null, null, new pk2.z2(o9Var, this, bottomSheet, null), 3, null) : null;
        bottomSheet.f213501r = new pk2.a3(this);
        w(bottomSheet, (r45.ze2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) o9Var.c(mm2.g1.class)).f410606n).mo144003x754a37bb());
        x(1);
    }

    public final void w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, r45.ze2 ze2Var) {
        android.view.View view;
        if (ze2Var != null) {
            android.widget.TextView textView = (e3Var == null || (view = e3Var.f213492f) == null) ? null : (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.t6v);
            if (textView == null) {
                return;
            }
            textView.setText(ze2Var.m75945x2fec8307(3));
        }
    }

    public final void x(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("sub_element", 10);
        jSONObject.put("sub_type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
    }
}
