package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ae implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f187782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f187783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f187784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f187785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187786e;

    public ae(boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, android.widget.ImageView imageView, int i17) {
        this.f187782a = z17;
        this.f187783b = z18;
        this.f187784c = afVar;
        this.f187785d = imageView;
        this.f187786e = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f187785d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f187784c;
        if (bitmap == null) {
            if (this.f187782a || this.f187783b) {
                java.lang.Object obj2 = aVar.f375106a;
                mn2.q3 q3Var = obj2 instanceof mn2.q3 ? (mn2.q3) obj2 : null;
                boolean z17 = false;
                if (q3Var != null) {
                    if (q3Var.mo148084xb5887639().length() > 0) {
                        z17 = true;
                    }
                }
                if (z17) {
                    afVar.getClass();
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.we(afVar));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(afVar.f187788d, "loadLinkIcon fail");
                }
            }
            imageView.setImageDrawable(null);
            afVar.c7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(afVar.f187788d, "loadLinkIcon empty url");
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zd(bitmap, this.f187786e, afVar, imageView));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(afVar.f187788d, "loadLinkIcon resource :" + bitmap);
    }
}
