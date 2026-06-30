package ca3;

/* loaded from: classes5.dex */
public final class s extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f121342a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f121343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger, java.lang.ref.WeakReference activityPluginBinding) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityPluginBinding, "activityPluginBinding");
        this.f121342a = messenger;
        this.f121343b = activityPluginBinding;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppMapViewFactory", "create platformview id: %d", java.lang.Integer.valueOf(i17));
        java.lang.String format = java.lang.String.format("wx_liteapp_map_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e(context, i17, map, new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(this.f121342a, format), (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3) this.f121343b.get());
    }
}
