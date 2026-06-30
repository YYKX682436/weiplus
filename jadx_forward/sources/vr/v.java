package vr;

/* loaded from: classes5.dex */
public final class v extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f520972a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        this.f520972a = messenger;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        java.lang.String str = "com.tencent.xin.flutter.nativeEmoticonBoard.methodChannel." + i17;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(this.f520972a, str);
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonBoardNativeViewFactory", "created method channel: " + str + ", creationParams: " + map);
        return new vr.q(context, i17, c28688xe8dbe4c2, map);
    }
}
