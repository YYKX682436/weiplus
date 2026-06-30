package ad3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ad3.c f3163d;

    /* renamed from: e, reason: collision with root package name */
    public static final ad3.c f3164e;

    /* renamed from: f, reason: collision with root package name */
    public static final ad3.c f3165f;

    /* renamed from: g, reason: collision with root package name */
    public static final ad3.c f3166g;

    /* renamed from: h, reason: collision with root package name */
    public static final ad3.c f3167h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ad3.c[] f3168i;

    static {
        ad3.c cVar = new ad3.c("NONE", 0);
        f3163d = cVar;
        ad3.c cVar2 = new ad3.c("PORTRAIT", 1);
        f3164e = cVar2;
        ad3.c cVar3 = new ad3.c("LANDSCAPE", 2);
        f3165f = cVar3;
        ad3.c cVar4 = new ad3.c("REVERSE_PORTRAIT", 3);
        f3166g = cVar4;
        ad3.c cVar5 = new ad3.c("REVERSE_LANDSCAPE", 4);
        f3167h = cVar5;
        ad3.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f3168i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static ad3.c valueOf(java.lang.String str) {
        return (ad3.c) java.lang.Enum.valueOf(ad3.c.class, str);
    }

    public static ad3.c[] values() {
        return (ad3.c[]) f3168i.clone();
    }
}
