package ax0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final ax0.d f14971d;

    /* renamed from: e, reason: collision with root package name */
    public static final ax0.d f14972e;

    /* renamed from: f, reason: collision with root package name */
    public static final ax0.d f14973f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ax0.d[] f14974g;

    static {
        ax0.d dVar = new ax0.d("None", 0);
        f14971d = dVar;
        ax0.d dVar2 = new ax0.d("Normal", 1);
        f14972e = dVar2;
        ax0.d dVar3 = new ax0.d("Snapped", 2);
        f14973f = dVar3;
        ax0.d[] dVarArr = {dVar, dVar2, dVar3};
        f14974g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static ax0.d valueOf(java.lang.String str) {
        return (ax0.d) java.lang.Enum.valueOf(ax0.d.class, str);
    }

    public static ax0.d[] values() {
        return (ax0.d[]) f14974g.clone();
    }
}
