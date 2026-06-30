package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final kn0.l f391102d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn0.l f391103e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn0.l f391104f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kn0.l[] f391105g;

    static {
        kn0.l lVar = new kn0.l("LIVE_OUT_ROOM", 0);
        f391102d = lVar;
        kn0.l lVar2 = new kn0.l("LIVE_IN_ROOM", 1);
        f391103e = lVar2;
        kn0.l lVar3 = new kn0.l("LIVE_JOIN_ROOM", 2);
        f391104f = lVar3;
        kn0.l[] lVarArr = {lVar, lVar2, lVar3};
        f391105g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static kn0.l m143756xdce0328(java.lang.String str) {
        return (kn0.l) java.lang.Enum.valueOf(kn0.l.class, str);
    }

    /* renamed from: values */
    public static kn0.l[] m143757xcee59d22() {
        return (kn0.l[]) f391105g.clone();
    }
}
