package oi4;

/* loaded from: classes9.dex */
public final class g extends oi4.n {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        kj4.b item = (kj4.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
        pj4.b2 b2Var = item.f389986e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 wi6 = ((m73.q) eVar).wi(b2Var.f436530f, 1);
        android.content.Context context = holder.f374654e;
        this.f427179f = context;
        if (wi6 == null || !wi6.r2()) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oog)).setText(b2Var.f436528d);
            n11.a.b().g(b2Var.f436529e, (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hke));
            holder.f3639x46306858.setOnClickListener(null);
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oog)).setText(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ai((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oog), wi6.d1(), ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, wi6.g2(), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)), bi4.c.CONVERSATION_LIST, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hke), wi6.d1(), null);
            holder.f3639x46306858.setOnClickListener(new oi4.f(wi6, holder, item, this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.haq);
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
        com.p314xaae8f345.mm.ui.uk.f(drawable, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        imageView.setImageDrawable(drawable);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oqb)).setText(k35.m1.f(context, b2Var.f436532h * 1000, true, false));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jue)).setVisibility(4);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // oi4.n
    public void n(java.lang.String userName, mj4.h textStatusItem, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusItem, "textStatusItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", "goToShowTextStatusActivity: id:" + ((mj4.k) textStatusItem).l() + " userName:" + userName + " refCommentId:" + str);
        android.content.Context context = this.f427179f;
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255226f.b(context, userName, textStatusItem);
        }
    }
}
