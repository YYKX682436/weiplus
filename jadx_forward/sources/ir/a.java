package ir;

/* loaded from: classes12.dex */
public abstract class a implements ir.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ir.r f375344a;

    /* renamed from: b, reason: collision with root package name */
    public final ir.i0 f375345b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f375346c;

    public a(ir.r groupInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        this.f375344a = groupInfo;
        this.f375345b = new ir.i0(groupInfo);
        this.f375346c = new java.util.LinkedList();
    }

    @Override // ir.k0
    public java.util.List b() {
        return this.f375346c;
    }

    /* renamed from: equals */
    public boolean m139713xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof ir.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ir.a) obj).f375344a.c(), this.f375344a.c());
    }

    @Override // ir.k0
    public final ir.r p() {
        return this.f375344a;
    }
}
