package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/base/MBJsEventBase;", "Landroid/os/Parcelable;", "mb-commons_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.base.MBJsEventBase */
/* loaded from: classes.dex */
public class C16422xf998446d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d> f37484x681a0c0c = new lc3.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f229415e;

    public C16422xf998446d(java.lang.String name, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f229414d = name;
        this.f229415e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229414d);
        out.writeString(this.f229415e);
    }

    public /* synthetic */ C16422xf998446d(java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2);
    }
}
