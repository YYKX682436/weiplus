package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class c0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f103010e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103011f;

    public c0(java.lang.String finderUsername, int i17) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f103010e = finderUsername;
        this.f103011f = i17;
    }

    public static final void n(com.tencent.mm.plugin.finder.convert.c0 c0Var, in5.s0 s0Var, boolean z17, long j17, java.lang.String str) {
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterConvert", "isNext: " + z17 + ", feedId:" + j17);
        so2.d0 d0Var = (so2.d0) s0Var.f293125i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", d0Var.f410308d.getInteger(21));
        r45.vx0 vx0Var = d0Var.f410308d;
        java.lang.String string = vx0Var.getString(1);
        if (string == null) {
            string = "";
        }
        long j18 = vx0Var.getLong(0);
        long j19 = vx0Var.getLong(8);
        intent.putExtra("key_topic_title", string);
        intent.putExtra("KEY_TOPIC_ID", j18);
        if (z17) {
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            intent.putExtra("key_ref_object_id", j19);
        } else {
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
            intent.putExtra("key_ref_object_id", j17);
            intent.putExtra("key_ref_object_dup_flag", str);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(context, intent);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b6g;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.d0 d0Var;
        long j17;
        r45.vx0 vx0Var;
        int i19;
        int i27;
        int i28;
        int i29;
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        so2.d0 item = (so2.d0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.eaj);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.eag);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        r45.vx0 vx0Var2 = item.f410308d;
        java.lang.String string = vx0Var2.getString(1);
        if (string == null) {
            string = "";
        }
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        boolean z18 = context instanceof com.tencent.mm.ui.MMActivity;
        com.tencent.mm.ui.MMActivity mMActivity = z18 ? (com.tencent.mm.ui.MMActivity) context : null;
        long longExtra = (mMActivity == null || (intent3 = mMActivity.getIntent()) == null) ? 0L : intent3.getLongExtra("finder_read_feed_id", -1L);
        com.tencent.mm.ui.MMActivity mMActivity2 = z18 ? (com.tencent.mm.ui.MMActivity) context : null;
        java.lang.String stringExtra = (mMActivity2 == null || (intent2 = mMActivity2.getIntent()) == null) ? null : intent2.getStringExtra("finder_read_feed_dup_flag");
        boolean b17 = lk5.s.b(z18 ? (com.tencent.mm.ui.MMActivity) context : null);
        com.tencent.mm.ui.MMActivity mMActivity3 = z18 ? (com.tencent.mm.ui.MMActivity) context : null;
        long longExtra2 = (mMActivity3 == null || (intent = mMActivity3.getIntent()) == null) ? 0L : intent.getLongExtra("key_finder_collection_id", 0L);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        if (i17 == 0 && b17 && longExtra2 != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) cu2.u.f222442b.get(java.lang.Long.valueOf(longExtra));
            if (bool == null) {
                bool = java.lang.Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            if (vx0Var2.getLong(8) != 0 && booleanValue) {
                textView2.setText(context.getString(com.tencent.mm.R.string.etj));
                if (item.f410309e) {
                    textView2.setVisibility(0);
                } else {
                    item.f410309e = true;
                    textView2.postDelayed(new com.tencent.mm.plugin.finder.convert.b0(textView2), 500L);
                }
                textView2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.w(this, holder, longExtra, stringExtra));
                holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.y(this, holder, textView, textView2));
            } else if (vx0Var2.getLong(8) == 0 || !booleanValue) {
                textView2.setText(context.getString(com.tencent.mm.R.string.eti));
                if (item.f410309e) {
                    i28 = 0;
                    textView2.setVisibility(0);
                } else {
                    item.f410309e = true;
                    textView2.postDelayed(new com.tencent.mm.plugin.finder.convert.b0(textView2), 500L);
                    i28 = 0;
                }
                d0Var = item;
                i29 = i28;
                holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.z(this, holder, longExtra, stringExtra, textView2));
                kotlin.jvm.internal.o.d(textView2);
                j17 = longExtra;
                i19 = i29;
                i27 = 1;
                vx0Var = vx0Var2;
                com.tencent.mm.plugin.finder.report.d2.m(d2Var, textView2, "watch_next_episode", 0, 0, o(vx0Var2, longExtra), null, 44, null);
            } else {
                textView2.setVisibility(8);
            }
            d0Var = item;
            i29 = 0;
            kotlin.jvm.internal.o.d(textView2);
            j17 = longExtra;
            i19 = i29;
            i27 = 1;
            vx0Var = vx0Var2;
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, textView2, "watch_next_episode", 0, 0, o(vx0Var2, longExtra), null, 44, null);
        } else {
            d0Var = item;
            j17 = longExtra;
            vx0Var = vx0Var2;
            i19 = 0;
            i27 = 1;
            textView2.setVisibility(8);
        }
        if (this.f103011f == i27) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, itemView, "member_zone_collection", 8, 0, kz5.c1.k(new jz5.l("author_finder_username", this.f103010e), new jz5.l("collection_id", pm0.v.u(vx0Var.getLong(i19))), new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17))), null, 40, null);
        } else {
            android.view.View itemView2 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, itemView2, "collection_tag", 0, 0, o(vx0Var, j17), null, 44, null);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterConvert", "item hash:" + d0Var.hashCode() + ", topic:" + vx0Var.getString(i27));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final java.util.Map o(r45.vx0 vx0Var, long j17) {
        return kz5.c1.k(new jz5.l("collection_id", pm0.v.u(vx0Var.getLong(0))), new jz5.l("feed_id", pm0.v.u(j17)));
    }
}
