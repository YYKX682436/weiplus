package au1;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ti3 f14058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r45.ti3 ti3Var) {
        super(0);
        this.f14058d = ti3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArray = this.f14058d.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_V3_STRING_SYNC, new java.lang.String(byteArray, r26.c.f368867c));
        return jz5.f0.f302826a;
    }
}
