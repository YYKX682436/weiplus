package dq1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final dq1.c f323879d;

    /* renamed from: e, reason: collision with root package name */
    public static final dq1.c f323880e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dq1.c[] f323881f;

    static {
        dq1.c cVar = new dq1.c("LOGIN_UIN_SAME", 0, 0);
        f323879d = cVar;
        dq1.c cVar2 = new dq1.c("NO_LOGIN", 1, 1);
        f323880e = cVar2;
        dq1.c[] cVarArr = {cVar, cVar2, new dq1.c("NONE", 2, 99)};
        f323881f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static dq1.c m125892xdce0328(java.lang.String str) {
        return (dq1.c) java.lang.Enum.valueOf(dq1.c.class, str);
    }

    /* renamed from: values */
    public static dq1.c[] m125893xcee59d22() {
        return (dq1.c[]) f323881f.clone();
    }
}
