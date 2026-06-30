package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class vi implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f110907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f110908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f110909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f110910d;

    public vi(androidx.appcompat.app.AppCompatActivity appCompatActivity, db5.h4 h4Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, yz5.l lVar) {
        this.f110907a = appCompatActivity;
        this.f110908b = h4Var;
        this.f110909c = finderItem;
        this.f110910d = lVar;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(bundle, "<anonymous parameter 2>");
        com.tencent.mm.plugin.finder.feed.wi wiVar = com.tencent.mm.plugin.finder.feed.wi.f110978a;
        if (!z17) {
            com.tencent.mm.plugin.finder.feed.wi.b(wiVar);
            return;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f110907a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f110908b.A;
        kotlin.jvm.internal.o.f(str2, "getWebUrl(...)");
        com.tencent.mm.plugin.finder.feed.wi.a(wiVar, appCompatActivity, str, str2, this.f110909c, this.f110910d);
    }
}
