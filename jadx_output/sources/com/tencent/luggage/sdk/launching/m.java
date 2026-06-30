package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public class m extends com.tencent.luggage.sdk.launching.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper f47619e;

    public m(com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper onWXAppResultXPCWrapper) {
        this.f47619e = onWXAppResultXPCWrapper;
    }

    @Override // com.tencent.luggage.sdk.launching.h
    public void a(android.os.Parcelable parcelable) {
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("parcel", new com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper(parcelable));
        this.f47619e.f47606e.send(-1, bundle);
    }
}
