package h26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final h26.i f359869e;

    /* renamed from: f, reason: collision with root package name */
    public static final h26.i f359870f;

    /* renamed from: g, reason: collision with root package name */
    public static final h26.i f359871g;

    /* renamed from: h, reason: collision with root package name */
    public static final h26.i f359872h;

    /* renamed from: i, reason: collision with root package name */
    public static final h26.i f359873i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h26.i[] f359874m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f359875d;

    static {
        h26.i iVar = new h26.i("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        f359869e = iVar;
        h26.i iVar2 = new h26.i("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        f359870f = iVar2;
        h26.i iVar3 = new h26.i("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        h26.i iVar4 = new h26.i("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        f359871g = iVar4;
        h26.i iVar5 = new h26.i("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        h26.i iVar6 = new h26.i("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        h26.i iVar7 = new h26.i("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        f359872h = iVar7;
        h26.i iVar8 = new h26.i("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        h26.i iVar9 = new h26.i("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        f359873i = iVar9;
        h26.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, new h26.i("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s")};
        f359874m = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, java.lang.String str2) {
        this.f359875d = str2;
    }

    /* renamed from: valueOf */
    public static h26.i m132806xdce0328(java.lang.String str) {
        return (h26.i) java.lang.Enum.valueOf(h26.i.class, str);
    }

    /* renamed from: values */
    public static h26.i[] m132807xcee59d22() {
        return (h26.i[]) f359874m.clone();
    }
}
