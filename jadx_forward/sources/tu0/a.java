package tu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final tu0.a f503603e;

    /* renamed from: f, reason: collision with root package name */
    public static final tu0.a f503604f;

    /* renamed from: g, reason: collision with root package name */
    public static final tu0.a f503605g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tu0.a[] f503606h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f503607d;

    static {
        tu0.a aVar = new tu0.a("PCM", 0, "pcm");
        f503603e = aVar;
        tu0.a aVar2 = new tu0.a("WAV", 1, "wav");
        f503604f = aVar2;
        tu0.a aVar3 = new tu0.a("SILK", 2, "silk");
        f503605g = aVar3;
        tu0.a[] aVarArr = {aVar, aVar2, aVar3};
        f503606h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f503607d = str2;
    }

    /* renamed from: valueOf */
    public static tu0.a m167047xdce0328(java.lang.String str) {
        return (tu0.a) java.lang.Enum.valueOf(tu0.a.class, str);
    }

    /* renamed from: values */
    public static tu0.a[] m167048xcee59d22() {
        return (tu0.a[]) f503606h.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f503607d;
    }
}
