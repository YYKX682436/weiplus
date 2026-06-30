package pk2;

/* loaded from: classes3.dex */
public final class n4 extends qk2.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
    }

    @Override // qk2.f
    public java.lang.String i() {
        return "";
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        if (((mm2.e1) o9Var.c(mm2.e1.class)).c7() && zl2.r4.f555483a.x1()) {
            return !n() ? ((mm2.c1) o9Var.c(mm2.c1.class)).f410437w3 : ((mm2.c1) o9Var.c(mm2.c1.class)).f410431v3;
        }
        return false;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
        if (!o()) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.rtc);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorShowLocationOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorShowLocationOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 134217728);
        int i17 = z17 ? 11 : 10;
        if (n()) {
            java.lang.Integer num2 = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num2 != null) {
                num2.intValue();
                jSONObject.put("type", num2.intValue());
            }
            jSONObject.put("sub_element", 10);
            jSONObject.put("sub_type", i17);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num3 = 1;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            if (num3 != null) {
                num3.intValue();
                jSONObject2.put("type", num3.intValue());
            }
            jSONObject2.put("sub_element", 10);
            jSONObject2.put("sub_type", i17);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowLocation:$, showLocationEnable:");
        sb6.append(z17);
        sb6.append(", isSecondDevice:");
        zl2.r4 r4Var = zl2.r4.f555483a;
        sb6.append(r4Var.w1() && !r4Var.x1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, sb6.toString());
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.rtc);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorShowLocationOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorShowLocationOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc g17 = o9Var.g(view, com.p314xaae8f345.mm.R.id.s7l, z17);
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.j4(o9Var), new pk2.m4(o9Var, this, view, g17, null));
        }
        java.lang.String obj = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.rvw)).getText().toString();
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.rtc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        v(obj, findViewById3, g17);
    }
}
