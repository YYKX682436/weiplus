package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class f5 implements com.tencent.luggage.sdk.launching.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f84609a;

    public f5(l81.b1 b1Var) {
        this.f84609a = b1Var;
    }

    @Override // com.tencent.luggage.sdk.launching.i
    public void a(android.os.Parcelable parcelable) {
        pm0.v.X(new com.tencent.mm.plugin.appbrand.launching.e5(this.f84609a, (com.tencent.mm.ipcinvoker.type.IPCInteger) parcelable));
    }
}
