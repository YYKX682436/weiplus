package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public final class t2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d f181209e;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d activityC13467x6324ae0d) {
        this.f181209e = activityC13467x6324ae0d;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9r;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r2 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.djg);
        r45.e43 e43Var = item.f181172e;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView, e43Var.f454538e, null);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.djh);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = e43Var.f454538e;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d activityC13467x6324ae0d = this.f181209e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13467x6324ae0d, e17, textSize));
        int i19 = e43Var.f454539f;
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dic)).setText(java.lang.String.valueOf(i19));
        if (i19 >= 10000) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dic)).setTextColor(i65.a.d(activityC13467x6324ae0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560470ld));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dic)).setTextColor(i65.a.d(activityC13467x6324ae0d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560469lc));
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s2(activityC13467x6324ae0d, item));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
