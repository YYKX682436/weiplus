package wr3;

/* loaded from: classes11.dex */
public abstract class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.j f530347d = new wr3.j();

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f530348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f530349f;

    /* renamed from: g, reason: collision with root package name */
    public int f530350g;

    /* renamed from: h, reason: collision with root package name */
    public yr3.o f530351h;

    /* renamed from: i, reason: collision with root package name */
    public wr3.h f530352i;

    public abstract android.content.Context B();

    public abstract long E();

    public final yr3.o I(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!J()) {
            return null;
        }
        if (this.f530351h == null) {
            this.f530351h = new yr3.o(context, x(), y());
        }
        return this.f530351h;
    }

    public abstract boolean J();

    public abstract boolean K();

    public abstract int x();

    public abstract sr3.g y();

    public abstract com.p314xaae8f345.mm.p2621x8fb0427b.z3 z();
}
