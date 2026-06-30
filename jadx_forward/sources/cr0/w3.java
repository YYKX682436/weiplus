package cr0;

/* loaded from: classes12.dex */
public final class w3 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.w3 f303333a = new cr0.w3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f303334b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f303335c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f303336d;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f303334b = jz5.h.a(iVar, cr0.q3.f303255d);
        f303335c = jz5.h.a(iVar, cr0.o3.f303233d);
        f303336d = mm.o.j(false, 1, null);
    }

    public final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212 a() {
        return (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212) f303335c.mo141623x754a37bb();
    }

    public boolean b() {
        return ((java.lang.Boolean) f303334b.mo141623x754a37bb()).booleanValue();
    }

    @Override // kh.e2
    public void d() {
        b();
    }

    @Override // kh.e2
    public void f() {
        if (b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkTracker", "#clearStats");
            a().m40834x32c52b(cr0.p3.f303242d);
        }
    }
}
