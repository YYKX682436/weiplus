package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class c0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f184543e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184544f;

    public c0(java.lang.String finderUsername, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f184543e = finderUsername;
        this.f184544f = i17;
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0 c0Var, in5.s0 s0Var, boolean z17, long j17, java.lang.String str) {
        c0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterConvert", "isNext: " + z17 + ", feedId:" + j17);
        so2.d0 d0Var = (so2.d0) s0Var.f374658i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", d0Var.f491841d.m75939xb282bd08(21));
        r45.vx0 vx0Var = d0Var.f491841d;
        java.lang.String m75945x2fec8307 = vx0Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        long m75942xfb822ef2 = vx0Var.m75942xfb822ef2(0);
        long m75942xfb822ef22 = vx0Var.m75942xfb822ef2(8);
        intent.putExtra("key_topic_title", m75945x2fec8307);
        intent.putExtra("KEY_TOPIC_ID", m75942xfb822ef2);
        if (z17) {
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            intent.putExtra("key_ref_object_id", m75942xfb822ef22);
        } else {
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
            intent.putExtra("key_ref_object_id", j17);
            intent.putExtra("key_ref_object_dup_flag", str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(context, intent);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b6g;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.eaj);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.eag);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        r45.vx0 vx0Var2 = item.f491841d;
        java.lang.String m75945x2fec8307 = vx0Var2.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307));
        boolean z18 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = z18 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        long longExtra = (abstractActivityC21394xb3d2c0cf == null || (intent3 = abstractActivityC21394xb3d2c0cf.getIntent()) == null) ? 0L : intent3.getLongExtra("finder_read_feed_id", -1L);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = z18 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        java.lang.String stringExtra = (abstractActivityC21394xb3d2c0cf2 == null || (intent2 = abstractActivityC21394xb3d2c0cf2.getIntent()) == null) ? null : intent2.getStringExtra("finder_read_feed_dup_flag");
        boolean b17 = lk5.s.b(z18 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = z18 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        long longExtra2 = (abstractActivityC21394xb3d2c0cf3 == null || (intent = abstractActivityC21394xb3d2c0cf3.getIntent()) == null) ? 0L : intent.getLongExtra("key_finder_collection_id", 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        if (i17 == 0 && b17 && longExtra2 != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) cu2.u.f303975b.get(java.lang.Long.valueOf(longExtra));
            if (bool == null) {
                bool = java.lang.Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            if (vx0Var2.m75942xfb822ef2(8) != 0 && booleanValue) {
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.etj));
                if (item.f491842e) {
                    textView2.setVisibility(0);
                } else {
                    item.f491842e = true;
                    textView2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b0(textView2), 500L);
                }
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w(this, holder, longExtra, stringExtra));
                holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y(this, holder, textView, textView2));
            } else if (vx0Var2.m75942xfb822ef2(8) == 0 || !booleanValue) {
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eti));
                if (item.f491842e) {
                    i28 = 0;
                    textView2.setVisibility(0);
                } else {
                    item.f491842e = true;
                    textView2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b0(textView2), 500L);
                    i28 = 0;
                }
                d0Var = item;
                i29 = i28;
                holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z(this, holder, longExtra, stringExtra, textView2));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                j17 = longExtra;
                i19 = i29;
                i27 = 1;
                vx0Var = vx0Var2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, textView2, "watch_next_episode", 0, 0, o(vx0Var2, longExtra), null, 44, null);
            } else {
                textView2.setVisibility(8);
            }
            d0Var = item;
            i29 = 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            j17 = longExtra;
            i19 = i29;
            i27 = 1;
            vx0Var = vx0Var2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, textView2, "watch_next_episode", 0, 0, o(vx0Var2, longExtra), null, 44, null);
        } else {
            d0Var = item;
            j17 = longExtra;
            vx0Var = vx0Var2;
            i19 = 0;
            i27 = 1;
            textView2.setVisibility(8);
        }
        if (this.f184544f == i27) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, itemView, "member_zone_collection", 8, 0, kz5.c1.k(new jz5.l("author_finder_username", this.f184543e), new jz5.l("collection_id", pm0.v.u(vx0Var.m75942xfb822ef2(i19))), new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17))), null, 40, null);
        } else {
            android.view.View itemView2 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, itemView2, "collection_tag", 0, 0, o(vx0Var, j17), null, 44, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterConvert", "item hash:" + d0Var.hashCode() + ", topic:" + vx0Var.m75945x2fec8307(i27));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final java.util.Map o(r45.vx0 vx0Var, long j17) {
        return kz5.c1.k(new jz5.l("collection_id", pm0.v.u(vx0Var.m75942xfb822ef2(0))), new jz5.l("feed_id", pm0.v.u(j17)));
    }
}
