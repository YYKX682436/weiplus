package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class k extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f202680e;

    public k(java.lang.String finderAuthorUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f202680e = finderAuthorUsername;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dc_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.d item = (jo2.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        ng5.a.a((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.mkt), c01.z1.r());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f568371q15);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = holder.f374654e;
        java.lang.String b17 = hc2.t.b(context, 2);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, b17));
        holder.p(com.p314xaae8f345.mm.R.id.q0c).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.j(holder, this));
    }
}
