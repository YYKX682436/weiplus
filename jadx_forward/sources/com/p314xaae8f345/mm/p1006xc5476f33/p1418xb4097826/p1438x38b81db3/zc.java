package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class zc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gm2 f186632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f186633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186636h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186637i;

    public zc(r45.gm2 gm2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, java.lang.String str, in5.s0 s0Var, android.view.View view) {
        this.f186632d = gm2Var;
        this.f186633e = c14994x9b99c079;
        this.f186634f = qeVar;
        this.f186635g = str;
        this.f186636h = s0Var;
        this.f186637i = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long j17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.gm2 gm2Var = this.f186632d;
        int m75939xb282bd08 = gm2Var.m75939xb282bd08(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186634f;
        in5.s0 s0Var = this.f186636h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f186633e;
        if (m75939xb282bd08 > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_topic_type", gm2Var.m75939xb282bd08(2));
            intent.putExtra("key_topic_title", gm2Var.m75945x2fec8307(1));
            intent.putExtra("KEY_TOPIC_ID", gm2Var.m75942xfb822ef2(0));
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = gm2Var.m75934xbce7f2f(4);
            if (m75934xbce7f2f != null) {
                intent.putExtra("KEY_HOT_TOPIC_BUFFER", m75934xbce7f2f.f273689a);
            }
            intent.putExtra("key_hot_topic_type", gm2Var.m75939xb282bd08(2));
            intent.putExtra("KEY_CLICK_FEED_ID", c14994x9b99c079 != null ? java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()) : null);
            intent.putExtra("key_ref_object_id", c14994x9b99c079 != null ? java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()) : null);
            intent.putExtra("key_ref_object_dup_flag", c14994x9b99c079 != null ? c14994x9b99c079.m59229xb5af1dd5() : null);
            intent.putExtra("KEY_TAB_TYPE", qeVar.f185893h);
            java.lang.String str = this.f186635g;
            if (str == null) {
                str = "";
            }
            intent.putExtra("key_from_user", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            i0Var.il(context2, intent);
            j17 = 1;
        } else {
            java.lang.Object obj = s0Var.f374658i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
            boolean k07 = qeVar.k0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "[refreshNewsLayout] hot news not support jump! isShowRealNameRecommendLayout=" + k07);
            if (k07) {
                android.view.View view2 = this.f186637i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            j17 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long m76784x5db1b11 = (c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) ? 0L : feedObject.m76784x5db1b11();
        java.lang.String m59229xb5af1dd5 = c14994x9b99c079 != null ? c14994x9b99c079.m59229xb5af1dd5() : null;
        long m75942xfb822ef2 = gm2Var.m75942xfb822ef2(0);
        java.lang.String m75945x2fec8307 = gm2Var.m75945x2fec8307(1);
        java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        o3Var.Kk(m76784x5db1b11, m59229xb5af1dd5, 2L, m75942xfb822ef2, str2, j17, nyVar != null ? nyVar.f216913n : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
