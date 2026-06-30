package rv4;

/* loaded from: classes12.dex */
public final class e0 extends rv4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final int f481994f;

    /* renamed from: g, reason: collision with root package name */
    public final int f481995g;

    /* renamed from: h, reason: collision with root package name */
    public final int f481996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(rv4.w session, boolean z17, java.lang.String title, int i17, int i18, int i19, boolean z18) {
        super(session, z17, title, z18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f481994f = i17;
        this.f481995g = i18;
        this.f481996h = i19;
    }

    @Override // rv4.a0
    public java.lang.String b() {
        if (this.f481961b) {
            ov4.g[] gVarArr = ov4.g.f430768d;
            return "1006";
        }
        ov4.g[] gVarArr2 = ov4.g.f430768d;
        return "1007";
    }

    @Override // rv4.a0
    public boolean d() {
        return this.f481961b;
    }

    @Override // rv4.a0
    public void e(boolean z17) {
        sv4.d dVar;
        this.f481961b = z17;
        java.lang.ref.WeakReference weakReference = this.f481964e;
        if (weakReference == null || (dVar = (sv4.d) weakReference.get()) == null) {
            return;
        }
        ((qv4.r0) dVar).o(this.f481994f, z17);
    }
}
