package ay0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ay0.b f15196d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ay0.b[] f15197e;

    static {
        ay0.b bVar = new ay0.b("AspectFit", 0);
        ay0.b bVar2 = new ay0.b("AspectFill", 1);
        f15196d = bVar2;
        ay0.b[] bVarArr = {bVar, bVar2};
        f15197e = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ay0.b valueOf(java.lang.String str) {
        return (ay0.b) java.lang.Enum.valueOf(ay0.b.class, str);
    }

    public static ay0.b[] values() {
        return (ay0.b[]) f15197e.clone();
    }
}
