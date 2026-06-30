package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class s extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 f280348b;

    public s(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 m0Var) {
        this.f280347a = str;
        this.f280348b = m0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c8, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d8
    public void a(java.util.List list) {
        android.widget.ImageView imageView;
        if (list == null) {
            return;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < list.size(); i18++) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) list.get(i18);
            if (!l4Var.h1().equals(this.f280347a) && !c01.e2.d(l4Var.h1())) {
                i17++;
                if (i17 == 1) {
                    imageView = (android.widget.ImageView) this.f280348b.f280334f.findViewById(com.p314xaae8f345.mm.R.id.aja);
                } else if (i17 == 2) {
                    imageView = (android.widget.ImageView) this.f280348b.f280334f.findViewById(com.p314xaae8f345.mm.R.id.ajb);
                } else if (i17 == 3) {
                    imageView = (android.widget.ImageView) this.f280348b.f280334f.findViewById(com.p314xaae8f345.mm.R.id.ajc);
                } else if (i17 != 4) {
                    break;
                } else {
                    imageView = (android.widget.ImageView) this.f280348b.f280334f.findViewById(com.p314xaae8f345.mm.R.id.ajd);
                }
                if (imageView != null && (imageView.getParent() instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) imageView.getParent()).setVisibility(0);
                    imageView.setBackground(null);
                    imageView.setClickable(false);
                    imageView.setLongClickable(false);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, l4Var.h1(), null);
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.r(this, list));
    }
}
