package bv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final bv0.d f24686d;

    /* renamed from: e, reason: collision with root package name */
    public static final bv0.d f24687e;

    /* renamed from: f, reason: collision with root package name */
    public static final bv0.d f24688f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bv0.d[] f24689g;

    static {
        bv0.d dVar = new bv0.d("BEGIN", 0);
        f24686d = dVar;
        bv0.d dVar2 = new bv0.d("IN_PROGRESS", 1);
        f24687e = dVar2;
        bv0.d dVar3 = new bv0.d("END", 2);
        f24688f = dVar3;
        bv0.d[] dVarArr = {dVar, dVar2, dVar3};
        f24689g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static bv0.d valueOf(java.lang.String str) {
        return (bv0.d) java.lang.Enum.valueOf(bv0.d.class, str);
    }

    public static bv0.d[] values() {
        return (bv0.d[]) f24689g.clone();
    }
}
