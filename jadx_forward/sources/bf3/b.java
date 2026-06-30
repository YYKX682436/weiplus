package bf3;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5136x9c8c9fbe f101144b;

    public b(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5136x9c8c9fbe impl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(impl, "impl");
        this.f101144b = impl;
        bf3.a aVar = new bf3.a(this);
        synchronized (impl.f135474b) {
            impl.f135474b.add(aVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1
    public java.nio.ByteBuffer a(java.lang.String str) {
        return this.f101144b.c(str);
    }
}
