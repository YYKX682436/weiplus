package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class sa extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f287036b;

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sa a(android.view.View view) {
        super.mo80050xaf65a0fc(view);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.bkl);
        this.f287036b = c22624x85d69039;
        c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this.f287036b.getContext())));
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f39501x4004bbf3 = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.ott);
        return this;
    }

    public void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sa saVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f430199i != 47) {
            return;
        }
        java.lang.String str2 = v17.f430219n;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430216m0)) {
            if (str2.contains("{recver}")) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str3 = v17.f430216m0;
                ((sg3.a) v0Var).getClass();
                str2 = str2.replace("{recver}", c01.a2.e(str3));
            }
            bundle.putString("receiver_name", v17.f430216m0);
        }
        bundle.putString("rawUrl", v17.f430207k);
        bundle.putString("sender_name", f9Var.Q0());
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int m84164x40077844 = (int) saVar.f287036b.m84164x40077844();
        ((ke0.e) xVar).getClass();
        saVar.f287036b.c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.l(context, str2, m84164x40077844, 4, bundle, true), android.widget.TextView.BufferType.SPANNABLE, null);
        saVar.f287036b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), saVar, f9Var.Q0()));
        if (c01.d9.b().E()) {
            saVar.f287036b.setOnLongClickListener(a0Var.u(dVar));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f287036b;
    }
}
