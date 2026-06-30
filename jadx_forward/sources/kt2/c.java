package kt2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final kt2.c f393504d;

    /* renamed from: e, reason: collision with root package name */
    public static final kt2.c f393505e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kt2.c[] f393506f;

    static {
        kt2.c cVar = new kt2.c("PLAYER", 0);
        f393504d = cVar;
        kt2.c cVar2 = new kt2.c("EDITOR", 1);
        f393505e = cVar2;
        kt2.c[] cVarArr = {cVar, cVar2};
        f393506f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static kt2.c m144353xdce0328(java.lang.String str) {
        return (kt2.c) java.lang.Enum.valueOf(kt2.c.class, str);
    }

    /* renamed from: values */
    public static kt2.c[] m144354xcee59d22() {
        return (kt2.c[]) f393506f.clone();
    }
}
