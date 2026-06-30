package wv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final wv3.c f531583e;

    /* renamed from: f, reason: collision with root package name */
    public static final wv3.c f531584f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wv3.c[] f531585g;

    /* renamed from: d, reason: collision with root package name */
    public final int f531586d;

    static {
        wv3.c cVar = new wv3.c("RECOMMEND", 0, 1);
        f531583e = cVar;
        wv3.c cVar2 = new wv3.c("SEARCH", 1, 2);
        f531584f = cVar2;
        wv3.c[] cVarArr = {cVar, cVar2};
        f531585g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f531586d = i18;
    }

    /* renamed from: valueOf */
    public static wv3.c m174538xdce0328(java.lang.String str) {
        return (wv3.c) java.lang.Enum.valueOf(wv3.c.class, str);
    }

    /* renamed from: values */
    public static wv3.c[] m174539xcee59d22() {
        return (wv3.c[]) f531585g.clone();
    }
}
