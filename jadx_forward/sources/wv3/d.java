package wv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final wv3.d f531587e;

    /* renamed from: f, reason: collision with root package name */
    public static final wv3.d f531588f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wv3.d[] f531589g;

    /* renamed from: d, reason: collision with root package name */
    public final int f531590d;

    static {
        wv3.d dVar = new wv3.d("SINGLE_VIDEO", 0, 1);
        f531587e = dVar;
        wv3.d dVar2 = new wv3.d("TEMPLATE", 1, 2);
        f531588f = dVar2;
        wv3.d[] dVarArr = {dVar, dVar2};
        f531589g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f531590d = i18;
    }

    /* renamed from: valueOf */
    public static wv3.d m174541xdce0328(java.lang.String str) {
        return (wv3.d) java.lang.Enum.valueOf(wv3.d.class, str);
    }

    /* renamed from: values */
    public static wv3.d[] m174542xcee59d22() {
        return (wv3.d[]) f531589g.clone();
    }
}
