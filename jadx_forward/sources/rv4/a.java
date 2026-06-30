package rv4;

/* loaded from: classes12.dex */
public final class a implements mv4.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f481957a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f481958b;

    /* renamed from: c, reason: collision with root package name */
    public int f481959c;

    public a(rv4.w session, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f481957a = arrayList;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f481958b = uuid;
        this.f481959c = 3;
        arrayList.add(new rv4.b(this, (rv4.g0) ((jz5.n) session.f482092e).mo141623x754a37bb(), session));
    }

    @Override // mv4.c
    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f481957a).iterator();
        while (it.hasNext()) {
            rv4.b bVar = (rv4.b) ((mv4.b) it.next());
            nv4.k kVar = bVar.f481966b.f413208b;
            ov4.c a17 = bVar.a(ov4.d.f430739e);
            kVar.getClass();
            a17.m157218x9616526c();
            kVar.b(a17);
        }
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f481959c = i17;
        int i18 = 0;
        for (java.lang.Object obj : this.f481957a) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((rv4.b) ((mv4.b) obj)).f481967c = i19;
            i18 = i19;
        }
    }
}
