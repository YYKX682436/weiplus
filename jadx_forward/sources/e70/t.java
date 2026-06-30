package e70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final e70.t f331388d;

    /* renamed from: e, reason: collision with root package name */
    public static final e70.t f331389e;

    /* renamed from: f, reason: collision with root package name */
    public static final e70.t f331390f;

    /* renamed from: g, reason: collision with root package name */
    public static final e70.t f331391g;

    /* renamed from: h, reason: collision with root package name */
    public static final e70.t f331392h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e70.t[] f331393i;

    static {
        e70.t tVar = new e70.t("SUCCESS", 0);
        f331388d = tVar;
        e70.t tVar2 = new e70.t("NO_NEED_UPDATE", 1);
        f331389e = tVar2;
        e70.t tVar3 = new e70.t("REQUEST_ERROR", 2);
        f331390f = tVar3;
        e70.t tVar4 = new e70.t("PROTOBUF_ERROR", 3);
        f331391g = tVar4;
        e70.t tVar5 = new e70.t("CGI_ERROR", 4);
        f331392h = tVar5;
        e70.t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
        f331393i = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static e70.t m127107xdce0328(java.lang.String str) {
        return (e70.t) java.lang.Enum.valueOf(e70.t.class, str);
    }

    /* renamed from: values */
    public static e70.t[] m127108xcee59d22() {
        return (e70.t[]) f331393i.clone();
    }
}
