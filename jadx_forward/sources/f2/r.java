package f2;

/* loaded from: classes14.dex */
public final class r implements java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final f2.r f340351e;

    /* renamed from: f, reason: collision with root package name */
    public static final f2.r f340352f;

    /* renamed from: g, reason: collision with root package name */
    public static final f2.r f340353g;

    /* renamed from: h, reason: collision with root package name */
    public static final f2.r f340354h;

    /* renamed from: i, reason: collision with root package name */
    public static final f2.r f340355i;

    /* renamed from: m, reason: collision with root package name */
    public static final f2.r f340356m;

    /* renamed from: n, reason: collision with root package name */
    public static final f2.r f340357n;

    /* renamed from: d, reason: collision with root package name */
    public final int f340358d;

    static {
        f2.r rVar = new f2.r(100);
        f2.r rVar2 = new f2.r(200);
        f2.r rVar3 = new f2.r(300);
        f2.r rVar4 = new f2.r(400);
        f340351e = rVar4;
        f2.r rVar5 = new f2.r(500);
        f340352f = rVar5;
        f2.r rVar6 = new f2.r(600);
        f340353g = rVar6;
        f2.r rVar7 = new f2.r(700);
        f2.r rVar8 = new f2.r(800);
        f2.r rVar9 = new f2.r(900);
        f340354h = rVar3;
        f340355i = rVar4;
        f340356m = rVar5;
        f340357n = rVar7;
        kz5.c0.i(rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9);
    }

    public r(int i17) {
        this.f340358d = i17;
        boolean z17 = false;
        if (1 <= i17 && i17 < 1001) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i17).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f2.r other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f340358d, other.f340358d);
    }

    /* renamed from: equals */
    public boolean m128756xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f2.r) {
            return this.f340358d == ((f2.r) obj).f340358d;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128757x8cdac1b() {
        return this.f340358d;
    }

    /* renamed from: toString */
    public java.lang.String m128758x9616526c() {
        return "FontWeight(weight=" + this.f340358d + ')';
    }
}
