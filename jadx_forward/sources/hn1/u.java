package hn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final hn1.u f364023d;

    /* renamed from: e, reason: collision with root package name */
    public static final hn1.u f364024e;

    /* renamed from: f, reason: collision with root package name */
    public static final hn1.u f364025f;

    /* renamed from: g, reason: collision with root package name */
    public static final hn1.u f364026g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ hn1.u[] f364027h;

    static {
        hn1.u uVar = new hn1.u("NotExpired", 0);
        f364023d = uVar;
        hn1.u uVar2 = new hn1.u("Expired", 1);
        f364024e = uVar2;
        hn1.u uVar3 = new hn1.u("Empty", 2);
        f364025f = uVar3;
        hn1.u uVar4 = new hn1.u("NotExist", 3);
        f364026g = uVar4;
        hn1.u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f364027h = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static hn1.u m133805xdce0328(java.lang.String str) {
        return (hn1.u) java.lang.Enum.valueOf(hn1.u.class, str);
    }

    /* renamed from: values */
    public static hn1.u[] m133806xcee59d22() {
        return (hn1.u[]) f364027h.clone();
    }
}
