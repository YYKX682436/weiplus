package sn1;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f491591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(byte[] bArr) {
        super(2);
        this.f491591d = bArr;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p944x882e457a.o rr6 = (com.p314xaae8f345.mm.p944x882e457a.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((com.p314xaae8f345.mm.p944x882e457a.i) obj2, "<anonymous parameter 1>");
        rr6.f152247e = 1;
        boolean mo47981x74080c24 = rr6.mo47981x74080c24();
        o45.zg mo47979x2d63726f = rr6.mo47979x2d63726f();
        byte[] bArr = this.f491591d;
        mo47979x2d63726f.m150625x820885cc(bArr);
        rr6.mo47979x2d63726f().m150626x3f3df288(new sn1.m(mo47979x2d63726f, bArr, mo47981x74080c24));
        return jz5.f0.f384359a;
    }
}
