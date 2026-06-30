package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class st extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104573e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f104574f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f104575g;

    public st(boolean z17, java.util.HashSet hashSet) {
        this.f104573e = z17;
        this.f104574f = hashSet;
        this.f104575g = new com.tencent.mm.plugin.finder.convert.qt();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489074di5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        nr2.m item = (nr2.m) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.qed)).setText(item.k());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483964qe4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean p17 = item.p();
        android.content.Context context = holder.f293121e;
        if (p17) {
            sb6.append(context.getString(com.tencent.mm.R.string.f491318lq0));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.tencent.mm.R.string.f491319lq1, java.lang.String.valueOf(item.f())));
            }
        } else {
            sb6.append(context.getString(com.tencent.mm.R.string.mgv));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.tencent.mm.R.string.mgw, java.lang.String.valueOf(item.f())));
            }
        }
        if (item.a() != 0) {
            sb6.append(" ");
            sb6.append(context.getString(com.tencent.mm.R.string.f491323lq5, java.lang.String.valueOf(item.a())));
        }
        textView.setText(sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f483965qe5);
        imageView.setOutlineProvider(this.f104575g);
        imageView.setClipToOutline(true);
        int i19 = 0;
        if (item.c().length() == 0) {
            imageView.setImageResource(com.tencent.mm.R.color.BW_0_Alpha_0_1);
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(item.c(), com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329963q));
        }
        if (item.g()) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.qee)).setText(context.getString(com.tencent.mm.R.string.lqb, java.lang.String.valueOf(item.i())));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.qee)).setText(context.getString(com.tencent.mm.R.string.lqa, java.lang.String.valueOf(item.i())));
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "paid_collection");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String str3 = "";
        if (nyVar == null || (str = nyVar.f135386r) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (nyVar != null && (str2 = nyVar.f135382p) != null) {
            str3 = str2;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f135380n : 0));
        lVarArr[3] = new jz5.l("author_finder_username", item.o());
        lVarArr[4] = new jz5.l("collection_id", pm0.v.u(item.l()));
        if (item.p()) {
            i19 = 1;
        } else if (item.q()) {
            i19 = 2;
        }
        lVarArr[5] = new jz5.l("paid_collection_type", java.lang.Integer.valueOf(i19));
        boolean z18 = this.f104573e;
        lVarArr[6] = new jz5.l("paid_collection_position", java.lang.Integer.valueOf(z18 ? 1 : 2));
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25496);
        if (z18) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(holder.itemView, 160, new com.tencent.mm.plugin.finder.convert.rt(this, nyVar, item));
        }
    }

    public /* synthetic */ st(boolean z17, java.util.HashSet hashSet, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : hashSet);
    }
}
