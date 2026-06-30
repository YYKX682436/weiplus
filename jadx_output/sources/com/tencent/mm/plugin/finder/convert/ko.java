package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ko extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f103848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103849f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f103850g;

    public ko(boolean z17, tu2.b itemViewConfig, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g((i19 & 2) != 0 ? new tu2.b() : itemViewConfig, "itemViewConfig");
        this.f103848e = i17;
        this.f103849f = i18;
        this.f103850g = new com.tencent.mm.plugin.finder.convert.jo();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aif;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.g item = (jo2.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.e0c);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o_w);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ote);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        int i19 = this.f103848e;
        layoutParams.width = i19;
        layoutParams.height = this.f103849f;
        p17.setLayoutParams(layoutParams);
        android.content.Context context = holder.f293121e;
        boolean z18 = item.f300887e;
        java.lang.String string = z18 ? context.getString(com.tencent.mm.R.string.en9) : context.getString(com.tencent.mm.R.string.en_);
        kotlin.jvm.internal.o.d(string);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        layoutParams2.width = i19;
        textView.setLayoutParams(layoutParams2);
        textView.setText(context.getString(com.tencent.mm.R.string.emy, string, java.lang.String.valueOf(item.f300886d)));
        long j17 = item.f300890h;
        if (j17 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            layoutParams3.width = i19;
            textView2.setLayoutParams(layoutParams3);
            textView2.setText(context.getString(com.tencent.mm.R.string.m8j, com.tencent.mm.plugin.finder.assist.w2.k(context, j17 * 1000)));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z18) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "remaining_live_playback");
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "remaining_video");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.ckl);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        android.view.View p19 = holder.p(com.tencent.mm.R.id.ckm);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        java.util.ArrayList<android.widget.ImageView> d17 = kz5.c0.d(p18, p19);
        for (android.widget.ImageView imageView : d17) {
            imageView.setOutlineProvider(this.f103850g);
            imageView.setClipToOutline(true);
        }
        d17.add(0, holder.p(com.tencent.mm.R.id.ckk));
        java.util.LinkedList linkedList = item.f300889g;
        if (linkedList != null) {
            int i27 = 0;
            for (java.lang.Object obj : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.lc5 lc5Var = (r45.lc5) obj;
                mn2.q3 q3Var = new mn2.q3(lc5Var.f379305d + "?token=" + lc5Var.f379306e, com.tencent.mm.plugin.finder.storage.y90.f128356f);
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d e17 = g1Var.e();
                java.lang.Object obj2 = d17.get(i27);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                e17.c(q3Var, (android.widget.ImageView) obj2, g1Var.h(mn2.f1.B));
                i27 = i28;
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25496);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[6];
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar = (eo2.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f255558d : 0));
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
        lVarArr[1] = new jz5.l("comment_scene", e18 != null ? java.lang.Integer.valueOf(e18.f135380n) : null);
        lVarArr[2] = new jz5.l("finder_username", item.f300888f);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
        lVarArr[3] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context);
        lVarArr[4] = new jz5.l("finder_context_id", e27 != null ? e27.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(context);
        lVarArr[5] = new jz5.l("behaviour_session_id", e28 != null ? e28.f135385q : null);
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
    }
}
