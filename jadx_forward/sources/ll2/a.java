package ll2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final ll2.a f400657e;

    /* renamed from: f, reason: collision with root package name */
    public static final ll2.a f400658f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ll2.a[] f400659g;

    /* renamed from: d, reason: collision with root package name */
    public final int f400660d;

    static {
        ll2.a aVar = new ll2.a("EXPOSE", 0, 1);
        f400657e = aVar;
        ll2.a aVar2 = new ll2.a("CLICK", 1, 2);
        f400658f = aVar2;
        ll2.a[] aVarArr = {aVar, aVar2};
        f400659g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f400660d = i18;
    }

    /* renamed from: valueOf */
    public static ll2.a m145886xdce0328(java.lang.String str) {
        return (ll2.a) java.lang.Enum.valueOf(ll2.a.class, str);
    }

    /* renamed from: values */
    public static ll2.a[] m145887xcee59d22() {
        return (ll2.a[]) f400659g.clone();
    }
}
