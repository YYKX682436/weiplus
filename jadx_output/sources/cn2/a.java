package cn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final cn2.a f43463d;

    /* renamed from: e, reason: collision with root package name */
    public static final cn2.a f43464e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cn2.a[] f43465f;

    static {
        cn2.a aVar = new cn2.a("START", 0);
        f43463d = aVar;
        cn2.a aVar2 = new cn2.a("REPLACE", 1);
        f43464e = aVar2;
        cn2.a[] aVarArr = {aVar, aVar2};
        f43465f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static cn2.a valueOf(java.lang.String str) {
        return (cn2.a) java.lang.Enum.valueOf(cn2.a.class, str);
    }

    public static cn2.a[] values() {
        return (cn2.a[]) f43465f.clone();
    }
}
