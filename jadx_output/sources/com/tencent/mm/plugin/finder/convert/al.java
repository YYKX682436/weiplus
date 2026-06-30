package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class al extends com.tencent.mm.plugin.finder.convert.el {

    /* renamed from: e, reason: collision with root package name */
    public final dv2.i f102892e;

    public al(dv2.i tabType) {
        kotlin.jvm.internal.o.g(tabType, "tabType");
        this.f102892e = tabType;
    }

    @Override // com.tencent.mm.plugin.finder.convert.el, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, so2.v1 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        java.lang.String D0 = item.f410645d.D0();
        android.content.Context context = holder.itemView.getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] bind_avatar_aggregation_");
        dv2.i tabType = this.f102892e;
        java.lang.String name = tabType.name();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = name.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append(" position=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FollowAggregationConvert", sb6.toString());
        if (appCompatActivity != null) {
            com.tencent.mm.plugin.finder.report.u3 u3Var = com.tencent.mm.plugin.finder.report.u3.f125383a;
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            kotlin.jvm.internal.o.g(tabType, "tabType");
            r45.qt2 b17 = u3Var.b(appCompatActivity);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[FollowFreqReport] bind_avatar_aggregation_");
            java.lang.String lowerCase2 = tabType.name().toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
            sb7.append(lowerCase2);
            sb7.append(" view_id=follow_frequently_viewed_avatar comment_scene=403 follow_frequently_viewed_tab=");
            int i19 = tabType.f243868d;
            sb7.append(i19);
            sb7.append(" avatar_finder_username=");
            sb7.append(D0);
            sb7.append(" ref_commentscene=");
            sb7.append(b17 != null ? java.lang.Integer.valueOf(b17.getInteger(7)) : null);
            sb7.append(" finder_context_id=");
            sb7.append(b17 != null ? b17.getString(1) : null);
            sb7.append(" finder_tab_context_id=");
            sb7.append(b17 != null ? b17.getString(2) : null);
            com.tencent.mars.xlog.Log.i("Finder.SelfReporter", sb7.toString());
            java.util.Map l17 = kz5.c1.l(new jz5.l("comment_scene", 403), new jz5.l("follow_frequently_viewed_tab", java.lang.Integer.valueOf(i19)), new jz5.l("avatar_finder_username", D0));
            l17.putAll(u3Var.a(b17));
            hc2.v0.e(itemView, "follow_frequently_viewed_avatar", 0, 0, false, false, l17, null, 94, null);
        }
    }
}
