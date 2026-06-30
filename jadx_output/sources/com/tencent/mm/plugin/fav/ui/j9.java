package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class j9 implements s82.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101208a;

    public j9(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f101208a = daVar;
    }

    @Override // s82.i
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101208a;
        if (daVar.getContext() instanceof com.tencent.mm.plugin.fav.ui.FavBaseUI) {
            android.app.Activity context = daVar.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
            ((com.tencent.mm.plugin.fav.ui.FavBaseUI) context).k7(str);
        }
    }
}
