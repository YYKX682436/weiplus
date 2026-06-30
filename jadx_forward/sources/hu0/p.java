package hu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final hu0.p f366578d;

    /* renamed from: e, reason: collision with root package name */
    public static final hu0.p f366579e;

    /* renamed from: f, reason: collision with root package name */
    public static final hu0.p f366580f;

    /* renamed from: g, reason: collision with root package name */
    public static final hu0.p f366581g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ hu0.p[] f366582h;

    static {
        hu0.p pVar = new hu0.p("IDLE", 0);
        f366578d = pVar;
        hu0.p pVar2 = new hu0.p("OPENING", 1);
        f366579e = pVar2;
        hu0.p pVar3 = new hu0.p("OPENED", 2);
        f366580f = pVar3;
        hu0.p pVar4 = new hu0.p("CLOSING", 3);
        f366581g = pVar4;
        hu0.p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        f366582h = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static hu0.p m134147xdce0328(java.lang.String str) {
        return (hu0.p) java.lang.Enum.valueOf(hu0.p.class, str);
    }

    /* renamed from: values */
    public static hu0.p[] m134148xcee59d22() {
        return (hu0.p[]) f366582h.clone();
    }
}
