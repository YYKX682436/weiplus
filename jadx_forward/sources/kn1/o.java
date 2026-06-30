package kn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final kn1.o f391182e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn1.o f391183f;

    /* renamed from: g, reason: collision with root package name */
    public static final kn1.o f391184g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kn1.o[] f391185h;

    /* renamed from: d, reason: collision with root package name */
    public final int f391186d;

    static {
        kn1.o oVar = new kn1.o("kStatus_Default", 0, 0);
        f391182e = oVar;
        kn1.o oVar2 = new kn1.o("kStatus_Success", 1, 1);
        f391183f = oVar2;
        kn1.o oVar3 = new kn1.o("kStatus_Failed", 2, 2);
        f391184g = oVar3;
        kn1.o[] oVarArr = {oVar, oVar2, oVar3};
        f391185h = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17, int i18) {
        this.f391186d = i18;
    }

    /* renamed from: valueOf */
    public static kn1.o m143783xdce0328(java.lang.String str) {
        return (kn1.o) java.lang.Enum.valueOf(kn1.o.class, str);
    }

    /* renamed from: values */
    public static kn1.o[] m143784xcee59d22() {
        return (kn1.o[]) f391185h.clone();
    }
}
