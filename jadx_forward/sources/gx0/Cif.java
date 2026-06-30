package gx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gx0.if, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cif {

    /* renamed from: d, reason: collision with root package name */
    public static final gx0.Cif f358082d;

    /* renamed from: e, reason: collision with root package name */
    public static final gx0.Cif f358083e;

    /* renamed from: f, reason: collision with root package name */
    public static final gx0.Cif f358084f;

    /* renamed from: g, reason: collision with root package name */
    public static final gx0.Cif f358085g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ gx0.Cif[] f358086h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f358087i;

    static {
        gx0.Cif cif = new gx0.Cif("OCR", 0);
        f358082d = cif;
        gx0.Cif cif2 = new gx0.Cif("RETRIEVER", 1);
        f358083e = cif2;
        gx0.Cif cif3 = new gx0.Cif("LOCAL_ASR", 2);
        f358084f = cif3;
        gx0.Cif cif4 = new gx0.Cif("REMOTE_ASR", 3);
        f358085g = cif4;
        gx0.Cif[] cifArr = {cif, cif2, cif3, cif4};
        f358086h = cifArr;
        f358087i = rz5.b.a(cifArr);
    }

    public Cif(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gx0.Cif m132426xdce0328(java.lang.String str) {
        return (gx0.Cif) java.lang.Enum.valueOf(gx0.Cif.class, str);
    }

    /* renamed from: values */
    public static gx0.Cif[] m132427xcee59d22() {
        return (gx0.Cif[]) f358086h.clone();
    }
}
