package e23;

/* loaded from: classes9.dex */
public class c2 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f328331q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f328332r;

    /* renamed from: s, reason: collision with root package name */
    public final e23.a2 f328333s;

    /* renamed from: t, reason: collision with root package name */
    public final e23.b2 f328334t;

    public c2(int i17) {
        super(16, i17);
        this.f328332r = false;
        this.f328333s = new e23.a2(this);
        this.f328334t = new e23.b2(this);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328333s;
    }
}
