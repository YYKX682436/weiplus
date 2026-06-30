package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class k7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101226g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rl5.r f101227h;

    public k7(com.tencent.mm.plugin.fav.ui.z7 z7Var, java.lang.String str, int i17, int i18, rl5.r rVar) {
        this.f101223d = z7Var;
        this.f101224e = str;
        this.f101225f = i17;
        this.f101226g = i18;
        this.f101227h = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f101223d.f101669o;
        if (y8Var != null) {
            java.lang.String tag = this.f101224e;
            kotlin.jvm.internal.o.f(tag, "$tag");
            int i18 = this.f101225f;
            kotlinx.coroutines.l.d(y8Var.f101627f, null, null, new com.tencent.mm.plugin.fav.ui.v8(tag, y8Var, this.f101226g, i18, null), 3, null);
        }
        jx3.f.INSTANCE.d(29434, 4);
        this.f101227h.a();
    }
}
