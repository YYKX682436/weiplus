package sn5;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final sn5.a f491678c;

    /* renamed from: d, reason: collision with root package name */
    public static final sn5.a f491679d;

    /* renamed from: e, reason: collision with root package name */
    public static final sn5.a f491680e;

    /* renamed from: f, reason: collision with root package name */
    public static final sn5.a f491681f;

    /* renamed from: g, reason: collision with root package name */
    public static final sn5.a f491682g;

    /* renamed from: h, reason: collision with root package name */
    public static final sn5.a f491683h;

    /* renamed from: i, reason: collision with root package name */
    public static final sn5.a[] f491684i;

    /* renamed from: a, reason: collision with root package name */
    public final int f491685a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f491686b;

    static {
        sn5.a aVar = new sn5.a(0, false);
        f491678c = aVar;
        sn5.a aVar2 = new sn5.a(1, true);
        sn5.a aVar3 = new sn5.a(2, false);
        f491679d = aVar3;
        sn5.a aVar4 = new sn5.a(3, true);
        sn5.a aVar5 = new sn5.a(4, false);
        f491680e = aVar5;
        sn5.a aVar6 = new sn5.a(5, true);
        sn5.a aVar7 = new sn5.a(6, false);
        f491681f = aVar7;
        sn5.a aVar8 = new sn5.a(7, true);
        sn5.a aVar9 = new sn5.a(8, false);
        f491682g = aVar9;
        sn5.a aVar10 = new sn5.a(9, true);
        f491683h = aVar10;
        f491684i = new sn5.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, new sn5.a(10, false), new sn5.a(10, true)};
    }

    public a(int i17, boolean z17) {
        this.f491685a = i17;
        this.f491686b = z17;
    }

    public final boolean a(sn5.a status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int i17 = this.f491685a;
        int i18 = status.f491685a;
        return i17 < i18 || ((!this.f491686b || f491683h == this) && i17 == i18);
    }
}
