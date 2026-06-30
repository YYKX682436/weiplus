package ya2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f542007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17) {
        super(1);
        this.f542007d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ya2.b2 contact = (ya2.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        contact.f69313xcad4ef95 = this.f542007d;
        return contact;
    }
}
