package ea3;

/* loaded from: classes5.dex */
public final class o extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f332177a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f332178b;

    /* renamed from: c, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f332179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger, java.lang.ref.WeakReference bindingRef) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindingRef, "bindingRef");
        this.f332177a = messenger;
        this.f332178b = bindingRef;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        java.lang.String format = java.lang.String.format("wx_album_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f332179c = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(this.f332177a, format);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewFactory", "create");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f332179c;
        if (c28688xe8dbe4c2 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81(context, i17, map, c28688xe8dbe4c2, (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3) this.f332178b.get());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("channel");
        throw null;
    }
}
