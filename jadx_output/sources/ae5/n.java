package ae5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ae5.n f4432d;

    /* renamed from: e, reason: collision with root package name */
    public static final ae5.n f4433e;

    /* renamed from: f, reason: collision with root package name */
    public static final ae5.n f4434f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ae5.n[] f4435g;

    static {
        ae5.n nVar = new ae5.n("IDLE", 0);
        f4432d = nVar;
        ae5.n nVar2 = new ae5.n("RUNNING", 1);
        f4433e = nVar2;
        ae5.n nVar3 = new ae5.n(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_FINISH, 2);
        f4434f = nVar3;
        ae5.n[] nVarArr = {nVar, nVar2, nVar3};
        f4435g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static ae5.n valueOf(java.lang.String str) {
        return (ae5.n) java.lang.Enum.valueOf(ae5.n.class, str);
    }

    public static ae5.n[] values() {
        return (ae5.n[]) f4435g.clone();
    }
}
