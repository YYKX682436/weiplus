package cy;

/* loaded from: classes5.dex */
public final class d extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f306198a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 messenger) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messenger, "messenger");
        this.f306198a = messenger;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        cy.h.f306199a.a();
        if (context == null) {
            throw new java.lang.IllegalStateException("ChatbotCard PlatformView missing context, viewId=" + i17);
        }
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        if (map == null) {
            map = kz5.q0.f395534d;
        }
        java.util.Map map2 = map;
        java.lang.Object obj2 = map2.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map2.get("itemId");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create viewId=");
        sb6.append(i17);
        sb6.append(" scene=");
        sb6.append(str);
        sb6.append(" itemId=");
        sb6.append(str2);
        sb6.append(" suffix=");
        sb6.append(valueOf);
        sb6.append(" argsType=");
        sb6.append(obj != null ? obj.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotCardPlatformViewFactory", sb6.toString());
        return new cy.c(context, i17, this.f306198a, valueOf, new cy.a(), map2);
    }
}
