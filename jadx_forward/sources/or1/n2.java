package or1;

/* loaded from: classes12.dex */
public class n2 extends fb5.c {

    /* renamed from: d, reason: collision with root package name */
    public static fb5.b f429077d;

    public n2(java.lang.Object obj) {
        super(0, obj);
        this.f342416c = true;
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.m2();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f429077d == null) {
            f429077d = new or1.l2(this);
        }
        return f429077d;
    }
}
