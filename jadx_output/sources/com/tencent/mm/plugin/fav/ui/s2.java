package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class s2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101431c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f101432d;

    public s2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI, android.view.View view, int i17, o72.r2 r2Var) {
        this.f101432d = favFilterUI;
        this.f101429a = view;
        this.f101430b = i17;
        this.f101431c = r2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f101432d.f100335o.n(this.f101429a, this.f101430b, this.f101431c);
    }
}
