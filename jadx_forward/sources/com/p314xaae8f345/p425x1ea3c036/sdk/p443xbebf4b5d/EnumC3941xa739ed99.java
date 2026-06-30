package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/luggage/sdk/processes/LuggageServiceType;", "", "Landroid/os/Parcelable;", "com/tencent/luggage/sdk/processes/u", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.processes.LuggageServiceType */
/* loaded from: classes7.dex */
public final class EnumC3941xa739ed99 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99> f15708x681a0c0c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.u f129158d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 f129159e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 f129160f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 f129161g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99[] f129162h;

    static {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99 = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99("WASERVICE", 0);
        f129159e = enumC3941xa739ed99;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed992 = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99("WAGAME", 1);
        f129160f = enumC3941xa739ed992;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed993 = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99("NIL", 2);
        f129161g = enumC3941xa739ed993;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99[] enumC3941xa739ed99Arr = {enumC3941xa739ed99, enumC3941xa739ed992, enumC3941xa739ed993};
        f129162h = enumC3941xa739ed99Arr;
        rz5.b.a(enumC3941xa739ed99Arr);
        f129158d = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.u(null);
        f15708x681a0c0c = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.v();
    }

    public EnumC3941xa739ed99(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 m32221xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99) java.lang.Enum.valueOf(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99[] m32222xcee59d22() {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99[]) f129162h.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(name());
    }
}
