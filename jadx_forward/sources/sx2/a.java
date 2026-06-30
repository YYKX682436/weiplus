package sx2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final sx2.a f495052d;

    /* renamed from: e, reason: collision with root package name */
    public static final sx2.a f495053e;

    /* renamed from: f, reason: collision with root package name */
    public static final sx2.a f495054f;

    /* renamed from: g, reason: collision with root package name */
    public static final sx2.a f495055g;

    /* renamed from: h, reason: collision with root package name */
    public static final sx2.a f495056h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ sx2.a[] f495057i;

    static {
        sx2.a aVar = new sx2.a("NONE", 0);
        f495052d = aVar;
        sx2.a aVar2 = new sx2.a("LEFT_TO_RIGHT", 1);
        f495053e = aVar2;
        sx2.a aVar3 = new sx2.a("RIGHT_TO_LEFT", 2);
        f495054f = aVar3;
        sx2.a aVar4 = new sx2.a("TOP_TO_BOTTOM", 3);
        f495055g = aVar4;
        sx2.a aVar5 = new sx2.a("BOTTOM_TO_TOP", 4);
        f495056h = aVar5;
        sx2.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f495057i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static sx2.a m165435xdce0328(java.lang.String str) {
        return (sx2.a) java.lang.Enum.valueOf(sx2.a.class, str);
    }

    /* renamed from: values */
    public static sx2.a[] m165436xcee59d22() {
        return (sx2.a[]) f495057i.clone();
    }
}
