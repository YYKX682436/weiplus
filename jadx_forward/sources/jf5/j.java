package jf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final jf5.j f381004d;

    /* renamed from: e, reason: collision with root package name */
    public static final jf5.j f381005e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jf5.j[] f381006f;

    static {
        jf5.j jVar = new jf5.j("WORD", 0);
        jf5.j jVar2 = new jf5.j("PARAGRAPH", 1);
        f381004d = jVar2;
        jf5.j jVar3 = new jf5.j("FULL_CONTENT", 2);
        f381005e = jVar3;
        jf5.j[] jVarArr = {jVar, jVar2, jVar3};
        f381006f = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static jf5.j m140848xdce0328(java.lang.String str) {
        return (jf5.j) java.lang.Enum.valueOf(jf5.j.class, str);
    }

    /* renamed from: values */
    public static jf5.j[] m140849xcee59d22() {
        return (jf5.j[]) f381006f.clone();
    }
}
