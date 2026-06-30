package ax0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ax0.b f14964d;

    /* renamed from: e, reason: collision with root package name */
    public static final ax0.b f14965e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ax0.b[] f14966f;

    static {
        ax0.b bVar = new ax0.b("Normal", 0);
        f14964d = bVar;
        ax0.b bVar2 = new ax0.b("Highlighted", 1);
        f14965e = bVar2;
        ax0.b[] bVarArr = {bVar, bVar2, new ax0.b("Disabled", 2)};
        f14966f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ax0.b valueOf(java.lang.String str) {
        return (ax0.b) java.lang.Enum.valueOf(ax0.b.class, str);
    }

    public static ax0.b[] values() {
        return (ax0.b[]) f14966f.clone();
    }
}
