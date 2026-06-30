package j33;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final j33.b f378937e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f378938f;

    /* renamed from: g, reason: collision with root package name */
    public static final j33.c f378939g;

    /* renamed from: h, reason: collision with root package name */
    public static final j33.c f378940h;

    /* renamed from: i, reason: collision with root package name */
    public static final j33.c f378941i;

    /* renamed from: m, reason: collision with root package name */
    public static final j33.c f378942m;

    /* renamed from: n, reason: collision with root package name */
    public static final j33.c f378943n;

    /* renamed from: o, reason: collision with root package name */
    public static final j33.c f378944o;

    /* renamed from: p, reason: collision with root package name */
    public static final j33.c f378945p;

    /* renamed from: q, reason: collision with root package name */
    public static final j33.c f378946q;

    /* renamed from: r, reason: collision with root package name */
    public static final j33.c f378947r;

    /* renamed from: s, reason: collision with root package name */
    public static final j33.c f378948s;

    /* renamed from: t, reason: collision with root package name */
    public static final j33.c f378949t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j33.c[] f378950u;

    /* renamed from: d, reason: collision with root package name */
    public final int f378951d;

    static {
        j33.c cVar = new j33.c(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7429x859b4284, 0, 0);
        f378939g = cVar;
        j33.c cVar2 = new j33.c("IMAGES_SIZE_LIMITED", 1, 1);
        f378940h = cVar2;
        j33.c cVar3 = new j33.c("VIDEOS_SIZE_LIMITED", 2, 2);
        f378941i = cVar3;
        j33.c cVar4 = new j33.c("VIDEOS_DURATION_LIMITED", 3, 3);
        f378942m = cVar4;
        j33.c cVar5 = new j33.c("VIDEOS_BOTH_LIMITED", 4, 4);
        f378943n = cVar5;
        j33.c cVar6 = new j33.c("BOTH_IMAGES_SIZE_LIMITED", 5, 5);
        f378944o = cVar6;
        j33.c cVar7 = new j33.c("BOTH_VIDEOS_SIZE_LIMITED", 6, 6);
        f378945p = cVar7;
        j33.c cVar8 = new j33.c("BOTH_VIDEOS_DURATION_LIMITED", 7, 7);
        f378946q = cVar8;
        j33.c cVar9 = new j33.c("BOTH_VIDEOS_BOTH_LIMITED", 8, 8);
        f378947r = cVar9;
        j33.c cVar10 = new j33.c("MIXED_VIDEOS_SIZE_LIMITED", 9, 9);
        f378948s = cVar10;
        j33.c cVar11 = new j33.c("MIXED_VIDEOS_DURATION_LIMITED", 10, 10);
        f378949t = cVar11;
        j33.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        f378950u = cVarArr;
        java.util.List a17 = rz5.b.a(cVarArr);
        f378937e = new j33.b(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((j33.c) next).f378951d), next);
        }
        f378938f = linkedHashMap;
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f378951d = i18;
    }

    /* renamed from: valueOf */
    public static j33.c m140269xdce0328(java.lang.String str) {
        return (j33.c) java.lang.Enum.valueOf(j33.c.class, str);
    }

    /* renamed from: values */
    public static j33.c[] m140270xcee59d22() {
        return (j33.c[]) f378950u.clone();
    }
}
