package k03;

/* loaded from: classes5.dex */
public final class g extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f384653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        this.f384653a = messenger;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return new k03.j(context, i17, map, this.f384653a);
    }
}
