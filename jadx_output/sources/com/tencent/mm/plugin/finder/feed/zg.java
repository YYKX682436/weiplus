package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class zg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f111256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f111257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f111258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111260h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111261i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f111262m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f111263n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111264o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f111265p;

    public zg(com.tencent.mm.ui.MMActivity mMActivity, r45.v71 v71Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var, zy2.i5 i5Var2, java.lang.String str4, r45.h32 h32Var) {
        this.f111256d = mMActivity;
        this.f111257e = v71Var;
        this.f111258f = i17;
        this.f111259g = str;
        this.f111260h = str2;
        this.f111261i = str3;
        this.f111262m = i5Var;
        this.f111263n = i5Var2;
        this.f111264o = str4;
        this.f111265p = h32Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
        if (itemId == 1) {
            jhVar.a(this.f111256d, this.f111257e, this.f111258f, this.f111259g, this.f111260h, this.f111261i, this.f111262m, this.f111263n);
            com.tencent.mm.plugin.finder.feed.jh.f107104d = 7;
            ml2.i5 i5Var = ml2.i5.f327572g;
            java.lang.String str = this.f111264o;
            r45.v71 v71Var = this.f111257e;
            r45.aa2 aa2Var = (r45.aa2) v71Var.getCustom(2);
            long j17 = aa2Var != null ? aa2Var.getLong(2) : 0L;
            r45.aa2 aa2Var2 = (r45.aa2) v71Var.getCustom(2);
            int i18 = 0;
            if (aa2Var2 != null && aa2Var2.getInteger(3) == 2) {
                i18 = 1;
            }
            int i19 = i18 ^ 1;
            java.lang.String str2 = this.f111259g;
            java.lang.String string = this.f111265p.getString(4);
            if (string == null) {
                string = "";
            }
            jhVar.d(i5Var, str, j17, i19, str2, string, this.f111260h);
        }
    }
}
