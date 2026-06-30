package ck1;

/* loaded from: classes4.dex */
public final class l extends ck1.o {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vf7 f123877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r45.vf7 appInfo) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appInfo, "appInfo");
        this.f123877a = appInfo;
    }

    /* renamed from: equals */
    public boolean m14986xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck1.l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123877a, ((ck1.l) obj).f123877a);
    }

    /* renamed from: hashCode */
    public int m14987x8cdac1b() {
        return this.f123877a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14988x9616526c() {
        return "Header(appInfo=" + this.f123877a + ')';
    }
}
