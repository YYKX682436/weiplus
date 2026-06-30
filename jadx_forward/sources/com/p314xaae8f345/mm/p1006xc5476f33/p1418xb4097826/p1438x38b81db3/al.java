package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class al extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.el {

    /* renamed from: e, reason: collision with root package name */
    public final dv2.i f184425e;

    public al(dv2.i tabType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
        this.f184425e = tabType;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.el, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, so2.v1 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        java.lang.String D0 = item.f492178d.D0();
        android.content.Context context = holder.f3639x46306858.getContext();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] bind_avatar_aggregation_");
        dv2.i tabType = this.f184425e;
        java.lang.String name = tabType.name();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = name.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append(" position=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowAggregationConvert", sb6.toString());
        if (activityC0065xcd7aa112 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u3.f206916a;
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
            r45.qt2 b17 = u3Var.b(activityC0065xcd7aa112);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[FollowFreqReport] bind_avatar_aggregation_");
            java.lang.String lowerCase2 = tabType.name().toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
            sb7.append(lowerCase2);
            sb7.append(" view_id=follow_frequently_viewed_avatar comment_scene=403 follow_frequently_viewed_tab=");
            int i19 = tabType.f325401d;
            sb7.append(i19);
            sb7.append(" avatar_finder_username=");
            sb7.append(D0);
            sb7.append(" ref_commentscene=");
            sb7.append(b17 != null ? java.lang.Integer.valueOf(b17.m75939xb282bd08(7)) : null);
            sb7.append(" finder_context_id=");
            sb7.append(b17 != null ? b17.m75945x2fec8307(1) : null);
            sb7.append(" finder_tab_context_id=");
            sb7.append(b17 != null ? b17.m75945x2fec8307(2) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfReporter", sb7.toString());
            java.util.Map l17 = kz5.c1.l(new jz5.l("comment_scene", 403), new jz5.l("follow_frequently_viewed_tab", java.lang.Integer.valueOf(i19)), new jz5.l("avatar_finder_username", D0));
            l17.putAll(u3Var.a(b17));
            hc2.v0.e(itemView, "follow_frequently_viewed_avatar", 0, 0, false, false, l17, null, 94, null);
        }
    }
}
