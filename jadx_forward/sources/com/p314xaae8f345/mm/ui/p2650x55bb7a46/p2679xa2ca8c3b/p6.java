package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class p6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f286768b;

    /* renamed from: c, reason: collision with root package name */
    public zy2.x6 f286769c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f286770d;

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p6 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f286768b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565208bo3);
        zy2.x6 x6Var = (zy2.x6) view.findViewById(com.p314xaae8f345.mm.R.id.f565883dz4);
        this.f286769c = x6Var;
        x6Var.mo62059x7b2c6f0c(i65.a.b(view.getContext(), 98));
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        if (!(!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
            this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        }
        if (z17) {
            this.f39501x4004bbf3 = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.ott);
            this.f286770d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqz);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return (android.view.View) this.f286769c;
    }
}
