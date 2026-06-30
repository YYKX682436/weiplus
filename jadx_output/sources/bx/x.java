package bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final bx.x f36230e;

    /* renamed from: f, reason: collision with root package name */
    public static final bx.x f36231f;

    /* renamed from: g, reason: collision with root package name */
    public static final bx.x f36232g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ bx.x[] f36233h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f36234d;

    static {
        bx.x xVar = new bx.x("ResortTypeOnBrandServicePreResort", 0, "preResort");
        f36230e = xVar;
        bx.x xVar2 = new bx.x("ResortTypeOnBrandServiceResortStart", 1, "resortStart");
        f36231f = xVar2;
        bx.x xVar3 = new bx.x("ResortTypeOnBrandServiceResortEnd", 2, "resortEnd");
        f36232g = xVar3;
        bx.x[] xVarArr = {xVar, xVar2, xVar3};
        f36233h = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17, java.lang.String str2) {
        this.f36234d = str2;
    }

    public static bx.x valueOf(java.lang.String str) {
        return (bx.x) java.lang.Enum.valueOf(bx.x.class, str);
    }

    public static bx.x[] values() {
        return (bx.x[]) f36233h.clone();
    }
}
