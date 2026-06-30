package com.tencent.luggage.sdk.processes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/luggage/sdk/processes/LuggageServiceType;", "", "Landroid/os/Parcelable;", "com/tencent/luggage/sdk/processes/u", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LuggageServiceType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.LuggageServiceType> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.u f47625d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.LuggageServiceType f47626e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.LuggageServiceType f47627f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.LuggageServiceType f47628g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.luggage.sdk.processes.LuggageServiceType[] f47629h;

    static {
        com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType = new com.tencent.luggage.sdk.processes.LuggageServiceType("WASERVICE", 0);
        f47626e = luggageServiceType;
        com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType2 = new com.tencent.luggage.sdk.processes.LuggageServiceType("WAGAME", 1);
        f47627f = luggageServiceType2;
        com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType3 = new com.tencent.luggage.sdk.processes.LuggageServiceType("NIL", 2);
        f47628g = luggageServiceType3;
        com.tencent.luggage.sdk.processes.LuggageServiceType[] luggageServiceTypeArr = {luggageServiceType, luggageServiceType2, luggageServiceType3};
        f47629h = luggageServiceTypeArr;
        rz5.b.a(luggageServiceTypeArr);
        f47625d = new com.tencent.luggage.sdk.processes.u(null);
        CREATOR = new com.tencent.luggage.sdk.processes.v();
    }

    public LuggageServiceType(java.lang.String str, int i17) {
    }

    public static com.tencent.luggage.sdk.processes.LuggageServiceType valueOf(java.lang.String str) {
        return (com.tencent.luggage.sdk.processes.LuggageServiceType) java.lang.Enum.valueOf(com.tencent.luggage.sdk.processes.LuggageServiceType.class, str);
    }

    public static com.tencent.luggage.sdk.processes.LuggageServiceType[] values() {
        return (com.tencent.luggage.sdk.processes.LuggageServiceType[]) f47629h.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(name());
    }
}
