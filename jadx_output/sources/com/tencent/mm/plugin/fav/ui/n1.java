package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class n1 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f101283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101285c;

    public n1(r45.bq0 bq0Var, int i17, int i18) {
        this.f101283a = bq0Var;
        this.f101284b = i17;
        this.f101285c = i18;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        favoriteOperationEvent.f54243g.f8528a = 35;
        favoriteOperationEvent.e();
        com.tencent.mm.plugin.fav.ui.u1.i(this.f101283a, this.f101284b, "view_clk", true, this.f101285c);
    }
}
