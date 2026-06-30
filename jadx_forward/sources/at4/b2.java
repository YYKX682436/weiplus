package at4;

/* loaded from: classes9.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f95346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f95347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        super(1);
        this.f95346d = h0Var;
        this.f95347e = h0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c it = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.v0()) {
            this.f95346d.f391656d = it;
            return java.lang.Boolean.TRUE;
        }
        if (!it.D0()) {
            return java.lang.Boolean.FALSE;
        }
        this.f95347e.f391656d = it;
        return java.lang.Boolean.TRUE;
    }
}
