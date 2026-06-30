package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class r7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f284176e;

    public r7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f284176e = activityC21618x43234cfd;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckd;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 item = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.h6y);
        boolean z18 = item.f148127o;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f284176e;
        if (z18) {
            imageView.setColorFilter(activityC21618x43234cfd.P1, android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter((android.graphics.ColorFilter) null);
        }
        if (item.f148127o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item.f148119d, activityC21618x43234cfd.Q1)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c1n);
        } else {
            n11.a.b().h(item.f148122g, imageView, activityC21618x43234cfd.f279778x1);
        }
        holder.p(com.p314xaae8f345.mm.R.id.f566831h75).setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q7(item, activityC21618x43234cfd));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.k3s)).setText(item.f148121f);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
