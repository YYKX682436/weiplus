package bs2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final bs2.a f23796d;

    /* renamed from: e, reason: collision with root package name */
    public static final bs2.a f23797e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bs2.a[] f23798f;

    static {
        bs2.a aVar = new bs2.a("Normal", 0);
        f23796d = aVar;
        bs2.a aVar2 = new bs2.a("WxForeground", 1);
        f23797e = aVar2;
        bs2.a[] aVarArr = {aVar, aVar2};
        f23798f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static bs2.a valueOf(java.lang.String str) {
        return (bs2.a) java.lang.Enum.valueOf(bs2.a.class, str);
    }

    public static bs2.a[] values() {
        return (bs2.a[]) f23798f.clone();
    }
}
