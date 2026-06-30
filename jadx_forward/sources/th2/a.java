package th2;

/* loaded from: classes5.dex */
public final class a extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f500856a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f500857b;

    /* renamed from: c, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f500858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        this.f500856a = messenger;
        this.f500857b = "NativeViewFactory";
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f500857b, "on create platformview, create params = " + map);
        java.lang.String format = java.lang.String.format("wx_platformview_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f500858c = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(this.f500856a, format);
        java.lang.Object obj2 = map != null ? map.get("anchor") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f500858c;
        if (c28688xe8dbe4c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("channel");
            throw null;
        }
        ud2.a aVar = new ud2.a(context, i17, map, c28688xe8dbe4c2, str2);
        new java.lang.ref.WeakReference(aVar);
        return aVar;
    }
}
