package mb2;

/* loaded from: classes5.dex */
public class a implements mb2.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f406866a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f406867b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f406868c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f406869d;

    public a(java.lang.Object obj, java.lang.String name, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f406866a = obj;
        this.f406867b = name;
        this.f406868c = aVar;
    }

    @Override // mb2.e
    public void a() {
    }

    public void b() {
    }

    public java.lang.Object c() {
        java.lang.Object obj = this.f406869d;
        return obj == null ? this.f406866a : obj;
    }

    /* renamed from: toString */
    public java.lang.String m147105x9616526c() {
        return "name " + this.f406867b + " value " + this.f406869d + " dummyValue " + this.f406866a;
    }

    public /* synthetic */ a(java.lang.Object obj, java.lang.String str, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(obj, str, (i17 & 4) != 0 ? null : aVar);
    }
}
