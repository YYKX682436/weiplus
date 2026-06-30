package p52;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p52.e[] f433541d;

    static {
        p52.e[] eVarArr = {new p52.e("SINGLE_CHAT", 0, 1), new p52.e("GROUP_CHAT", 1, 2), new p52.e("SNS", 2, 3), new p52.e("KEFU_CHAT", 3, 4)};
        f433541d = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static p52.e m157850xdce0328(java.lang.String str) {
        return (p52.e) java.lang.Enum.valueOf(p52.e.class, str);
    }

    /* renamed from: values */
    public static p52.e[] m157851xcee59d22() {
        return (p52.e[]) f433541d.clone();
    }
}
