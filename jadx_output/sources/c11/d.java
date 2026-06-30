package c11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c11.d f37824d;

    /* renamed from: e, reason: collision with root package name */
    public static final c11.d f37825e;

    /* renamed from: f, reason: collision with root package name */
    public static final c11.d f37826f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c11.d[] f37827g;

    static {
        c11.d dVar = new c11.d("Ratio_Tall_3_4", 0);
        f37824d = dVar;
        c11.d dVar2 = new c11.d("Ratio_Fat_4_3", 1);
        f37825e = dVar2;
        c11.d dVar3 = new c11.d("Ratio_1_1", 2);
        f37826f = dVar3;
        c11.d[] dVarArr = {dVar, dVar2, dVar3};
        f37827g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static c11.d valueOf(java.lang.String str) {
        return (c11.d) java.lang.Enum.valueOf(c11.d.class, str);
    }

    public static c11.d[] values() {
        return (c11.d[]) f37827g.clone();
    }
}
