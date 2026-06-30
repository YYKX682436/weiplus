package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ae implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f106249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f106250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f106251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f106252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106253e;

    public ae(boolean z17, boolean z18, com.tencent.mm.plugin.finder.feed.af afVar, android.widget.ImageView imageView, int i17) {
        this.f106249a = z17;
        this.f106250b = z18;
        this.f106251c = afVar;
        this.f106252d = imageView;
        this.f106253e = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f106252d;
        com.tencent.mm.plugin.finder.feed.af afVar = this.f106251c;
        if (bitmap == null) {
            if (this.f106249a || this.f106250b) {
                java.lang.Object obj2 = aVar.f293573a;
                mn2.q3 q3Var = obj2 instanceof mn2.q3 ? (mn2.q3) obj2 : null;
                boolean z17 = false;
                if (q3Var != null) {
                    if (q3Var.getUrl().length() > 0) {
                        z17 = true;
                    }
                }
                if (z17) {
                    afVar.getClass();
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.we(afVar));
                    com.tencent.mars.xlog.Log.i(afVar.f106255d, "loadLinkIcon fail");
                }
            }
            imageView.setImageDrawable(null);
            afVar.c7();
            com.tencent.mars.xlog.Log.i(afVar.f106255d, "loadLinkIcon empty url");
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.zd(bitmap, this.f106253e, afVar, imageView));
        }
        com.tencent.mars.xlog.Log.i(afVar.f106255d, "loadLinkIcon resource :" + bitmap);
    }
}
