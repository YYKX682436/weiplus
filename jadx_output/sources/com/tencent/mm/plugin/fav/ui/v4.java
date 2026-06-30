package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class v4 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f101489d;

    public v4(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, android.view.View view, int i17, o72.r2 r2Var) {
        this.f101489d = favSearchUI;
        this.f101486a = view;
        this.f101487b = i17;
        this.f101488c = r2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f101489d.f100400n.n(this.f101486a, this.f101487b, this.f101488c);
    }
}
