package un;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.l f510828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(un.l lVar) {
        super(0);
        this.f510828d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f510828d.m158359x1e885992().getStringExtra("room_operation_session_id");
        if (stringExtra != null) {
            return stringExtra;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r()) + c01.id.c();
    }
}
