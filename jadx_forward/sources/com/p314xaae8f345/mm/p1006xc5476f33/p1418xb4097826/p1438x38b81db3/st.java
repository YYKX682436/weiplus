package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class st extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f186106e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f186107f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f186108g;

    public st(boolean z17, java.util.HashSet hashSet) {
        this.f186106e = z17;
        this.f186107f = hashSet;
        this.f186108g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qt();
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570607di5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        nr2.m item = (nr2.m) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qed)).setText(item.k());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565497qe4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean p17 = item.p();
        android.content.Context context = holder.f374654e;
        if (p17) {
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572851lq0));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572852lq1, java.lang.String.valueOf(item.f())));
            }
        } else {
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgv));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgw, java.lang.String.valueOf(item.f())));
            }
        }
        if (item.a() != 0) {
            sb6.append(" ");
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572856lq5, java.lang.String.valueOf(item.a())));
        }
        textView.setText(sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f565498qe5);
        imageView.setOutlineProvider(this.f186108g);
        imageView.setClipToOutline(true);
        int i19 = 0;
        if (item.c().length() == 0) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(item.c(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411496q));
        }
        if (item.g()) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qee)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqb, java.lang.String.valueOf(item.i())));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qee)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqa, java.lang.String.valueOf(item.i())));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "paid_collection");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String str3 = "";
        if (nyVar == null || (str = nyVar.f216919r) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (nyVar != null && (str2 = nyVar.f216915p) != null) {
            str3 = str2;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f216913n : 0));
        lVarArr[3] = new jz5.l("author_finder_username", item.o());
        lVarArr[4] = new jz5.l("collection_id", pm0.v.u(item.l()));
        if (item.p()) {
            i19 = 1;
        } else if (item.q()) {
            i19 = 2;
        }
        lVarArr[5] = new jz5.l("paid_collection_type", java.lang.Integer.valueOf(i19));
        boolean z18 = this.f186106e;
        lVarArr[6] = new jz5.l("paid_collection_position", java.lang.Integer.valueOf(z18 ? 1 : 2));
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 25496);
        if (z18) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(holder.f3639x46306858, 160, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rt(this, nyVar, item));
        }
    }

    public /* synthetic */ st(boolean z17, java.util.HashSet hashSet, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : hashSet);
    }
}
