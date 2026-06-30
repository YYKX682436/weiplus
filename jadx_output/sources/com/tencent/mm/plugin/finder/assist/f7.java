package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class f7 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f102167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i f102169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102170e;

    public f7(androidx.appcompat.app.AppCompatActivity appCompatActivity, db5.h4 h4Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, zy2.i iVar, yz5.l lVar) {
        this.f102166a = appCompatActivity;
        this.f102167b = h4Var;
        this.f102168c = finderItem;
        this.f102169d = iVar;
        this.f102170e = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f102166a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.f102167b.A;
            kotlin.jvm.internal.o.f(str2, "getWebUrl(...)");
            com.tencent.mm.plugin.finder.assist.n7.a(n7Var, appCompatActivity, str, str2, this.f102168c, this.f102169d, 6, this.f102170e);
        }
    }
}
