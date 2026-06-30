package tz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final tz0.l f504728g;

    /* renamed from: h, reason: collision with root package name */
    public static final tz0.l f504729h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tz0.l[] f504730i;

    /* renamed from: d, reason: collision with root package name */
    public final float f504731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f504732e;

    /* renamed from: f, reason: collision with root package name */
    public final int f504733f;

    static {
        tz0.l lVar = new tz0.l("Large", 0, 76, com.p314xaae8f345.mm.R.raw.f81139x20c11ab2, com.p314xaae8f345.mm.R.raw.f81133xd410a3c8);
        tz0.l lVar2 = new tz0.l("Normal", 1, 48, com.p314xaae8f345.mm.R.raw.f81138x649b51ed, com.p314xaae8f345.mm.R.raw.f81132x17eadb03);
        f504728g = lVar2;
        tz0.l lVar3 = new tz0.l("Small", 2, 16, com.p314xaae8f345.mm.R.raw.f81137x89aef3ac, com.p314xaae8f345.mm.R.raw.f81131x3cfe7cc2);
        f504729h = lVar3;
        tz0.l[] lVarArr = {lVar, lVar2, lVar3};
        f504730i = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, float f17, int i18, int i19) {
        this.f504731d = f17;
        this.f504732e = i18;
        this.f504733f = i19;
    }

    /* renamed from: valueOf */
    public static tz0.l m167279xdce0328(java.lang.String str) {
        return (tz0.l) java.lang.Enum.valueOf(tz0.l.class, str);
    }

    /* renamed from: values */
    public static tz0.l[] m167280xcee59d22() {
        return (tz0.l[]) f504730i.clone();
    }
}
