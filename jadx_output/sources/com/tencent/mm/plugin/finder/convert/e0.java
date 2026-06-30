package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class e0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final tu2.b f103211e;

    public e0(tu2.b itemViewConfig, int i17, kotlin.jvm.internal.i iVar) {
        itemViewConfig = (i17 & 1) != 0 ? new tu2.b() : itemViewConfig;
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f103211e = itemViewConfig;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e6v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        java.lang.String d17;
        r45.xx0 xx0Var;
        r45.xx0 xx0Var2;
        so2.c0 item = (so2.c0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mars.xlog.Log.i("FinderMixFavVideoRoundCornerConvert", "position:" + i17 + " FinderCollectInfoFeed=" + item);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f483570so5);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        r45.oo2 oo2Var = item.f410286d;
        r45.vx0 vx0Var = (r45.vx0) oo2Var.getCustom(2);
        mn2.q3 q3Var = new mn2.q3(vx0Var != null ? vx0Var.getString(3) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(this.f103211e.f422133c ? mn2.f1.f329956g : mn2.f1.f329955f));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.obc);
        r45.vx0 vx0Var2 = (r45.vx0) oo2Var.getCustom(2);
        java.lang.String string2 = vx0Var2 != null ? vx0Var2.getString(1) : null;
        if (string2 == null || string2.length() == 0) {
            r45.vx0 vx0Var3 = (r45.vx0) oo2Var.getCustom(2);
            if (vx0Var3 != null) {
                string = vx0Var3.getString(2);
            }
            string = null;
        } else {
            r45.vx0 vx0Var4 = (r45.vx0) oo2Var.getCustom(2);
            if (vx0Var4 != null) {
                string = vx0Var4.getString(1);
            }
            string = null;
        }
        if (!(string == null || string.length() == 0)) {
            if (textView != null) {
                textView.setText(string);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484050cu2);
        r45.vx0 vx0Var5 = (r45.vx0) oo2Var.getCustom(2);
        int integer = vx0Var5 != null ? vx0Var5.getInteger(4) : 0;
        r45.vx0 vx0Var6 = (r45.vx0) oo2Var.getCustom(2);
        int integer2 = (vx0Var6 == null || (xx0Var2 = (r45.xx0) vx0Var6.getCustom(23)) == null) ? 0 : xx0Var2.getInteger(0);
        android.content.Context context = holder.f293121e;
        if (integer > 0 && integer2 > 0) {
            if (textView2 != null) {
                textView2.setText(context.getString(com.tencent.mm.R.string.f491414nn4, java.lang.Integer.valueOf(integer2), java.lang.Integer.valueOf(integer)));
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.k3f);
        ya2.b2 b2Var = item.f410287e;
        java.lang.String w07 = b2Var != null ? b2Var.w0() : null;
        if (textView3 != null) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o7i);
        r45.vx0 vx0Var7 = (r45.vx0) oo2Var.getCustom(2);
        long j17 = (vx0Var7 == null || (xx0Var = (r45.xx0) vx0Var7.getCustom(23)) == null) ? -1L : xx0Var.getLong(2);
        if (j17 > 0) {
            if (textView4 != null) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
                gregorianCalendar.setTimeInMillis(j17);
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar();
                gregorianCalendar2.setTimeInMillis(java.lang.System.currentTimeMillis());
                if (gregorianCalendar2.get(1) == gregorianCalendar.get(1)) {
                    d17 = k35.m1.d(context.getString(com.tencent.mm.R.string.f492135fc2), j17 / 1000);
                    kotlin.jvm.internal.o.d(d17);
                } else {
                    d17 = k35.m1.d(context.getString(com.tencent.mm.R.string.fcl), j17 / 1000);
                    kotlin.jvm.internal.o.d(d17);
                }
                textView4.setText(d17);
            }
        } else if (textView4 != null) {
            textView4.setText("");
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "collection_list_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.itemView, 32, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, kz5.b1.e(new jz5.l("comment_scene", 349)));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new com.tencent.mm.plugin.finder.convert.d0(V6, item));
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f11941i = true;
        }
        if (layoutParams2 != null) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = xy2.c.a(context);
        }
        if (layoutParams2 != null) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = xy2.c.a(context);
        }
        if (layoutParams2 == null) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = xy2.c.a(context);
    }
}
