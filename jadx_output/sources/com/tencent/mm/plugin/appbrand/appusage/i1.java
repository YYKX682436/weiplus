package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class i1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.j1 f76463d;

    public i1(com.tencent.mm.plugin.appbrand.appusage.j1 j1Var) {
        this.f76463d = j1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Parcel parcel = (android.os.Parcel) obj;
        this.f76463d.f76483e.f76549d.doNotify(parcel.readString(), parcel.readInt(), parcel.readString());
    }
}
