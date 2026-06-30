package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f67234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f67235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67236h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67237i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67238m;

    public o(com.tencent.mm.feature.lite.i iVar, android.content.Context context, android.os.Bundle bundle, boolean z17, boolean z18, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.f0 f0Var) {
        this.f67238m = iVar;
        this.f67232d = context;
        this.f67233e = bundle;
        this.f67234f = z17;
        this.f67235g = z18;
        this.f67236h = openExtraData;
        this.f67237i = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f67238m.nk(this.f67232d, this.f67233e, this.f67234f, this.f67235g, this.f67236h, this.f67237i);
    }
}
