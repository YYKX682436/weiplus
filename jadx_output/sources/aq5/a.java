package aq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final aq5.a f13215d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq5.a f13216e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq5.a f13217f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ aq5.a[] f13218g;

    static {
        aq5.a aVar = new aq5.a("CONNECTED", 0);
        f13215d = aVar;
        aq5.a aVar2 = new aq5.a(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_CONNECTING, 1);
        f13216e = aVar2;
        aq5.a aVar3 = new aq5.a("DISCONNECTED", 2);
        f13217f = aVar3;
        aq5.a[] aVarArr = {aVar, aVar2, aVar3};
        f13218g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static aq5.a valueOf(java.lang.String str) {
        return (aq5.a) java.lang.Enum.valueOf(aq5.a.class, str);
    }

    public static aq5.a[] values() {
        return (aq5.a[]) f13218g.clone();
    }
}
