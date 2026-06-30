package nf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final nf2.a f418181e;

    /* renamed from: f, reason: collision with root package name */
    public static final nf2.a f418182f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nf2.a[] f418183g;

    /* renamed from: d, reason: collision with root package name */
    public final int f418184d;

    static {
        nf2.a aVar = new nf2.a("HORIZONTAL", 0, com.p314xaae8f345.mm.R.C30867xcad56011.os9, com.p314xaae8f345.mm.R.raw.f79254xf5aaca68);
        f418181e = aVar;
        nf2.a aVar2 = new nf2.a("VERTICAL", 1, com.p314xaae8f345.mm.R.C30867xcad56011.osa, com.p314xaae8f345.mm.R.raw.f79254xf5aaca68);
        f418182f = aVar2;
        nf2.a[] aVarArr = {aVar, aVar2};
        f418183g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18, int i19) {
        this.f418184d = i18;
    }

    /* renamed from: valueOf */
    public static nf2.a m149487xdce0328(java.lang.String str) {
        return (nf2.a) java.lang.Enum.valueOf(nf2.a.class, str);
    }

    /* renamed from: values */
    public static nf2.a[] m149488xcee59d22() {
        return (nf2.a[]) f418183g.clone();
    }
}
