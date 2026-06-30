package h26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h26.b[] f359860d;

    static {
        h26.b[] bVarArr = {new h26.b("ERROR_CLASS", 0, "<Error class: %s>"), new h26.b("ERROR_FUNCTION", 1, "<Error function>"), new h26.b("ERROR_SCOPE", 2, "<Error scope>"), new h26.b("ERROR_MODULE", 3, "<Error module>"), new h26.b("ERROR_PROPERTY", 4, "<Error property>"), new h26.b("ERROR_TYPE", 5, "[Error type: %s]"), new h26.b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>")};
        f359860d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, java.lang.String str2) {
    }

    /* renamed from: valueOf */
    public static h26.b m132795xdce0328(java.lang.String str) {
        return (h26.b) java.lang.Enum.valueOf(h26.b.class, str);
    }

    /* renamed from: values */
    public static h26.b[] m132796xcee59d22() {
        return (h26.b[]) f359860d.clone();
    }
}
