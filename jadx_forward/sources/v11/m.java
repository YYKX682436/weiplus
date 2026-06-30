package v11;

/* loaded from: classes11.dex */
public final class m extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final v11.s f513974a;

    public m(v11.s sVar) {
        super(null);
        this.f513974a = sVar;
    }

    /* renamed from: equals */
    public boolean m170923xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513974a, ((v11.m) obj).f513974a);
    }

    /* renamed from: hashCode */
    public int m170924x8cdac1b() {
        v11.s sVar = this.f513974a;
        if (sVar == null) {
            return 0;
        }
        return sVar.m170946x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m170925x9616526c() {
        return "HorizontalRule(sourceRange=" + this.f513974a + ')';
    }
}
