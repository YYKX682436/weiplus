package bb2;

/* loaded from: classes10.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f43 f18916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView, java.lang.String str, r45.f43 f43Var) {
        super(1);
        this.f18914d = megaVideoBulletNativeView;
        this.f18915e = str;
        this.f18916f = f43Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18914d;
        bb2.w1 bulletManager = megaVideoBulletNativeView.getBulletManager();
        java.lang.String content = this.f18915e;
        kotlin.jvm.internal.o.f(content, "$content");
        boolean z17 = megaVideoBulletNativeView.getBulletManager().f19046k;
        r45.f43 f43Var = this.f18916f;
        bb2.w1.k(bulletManager, content, z17, 6, f43Var.getLong(0), 0L, longValue, false, 16, null);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = megaVideoBulletNativeView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.report.d2.i(d2Var, context, "bs_follow_button", "view_long_press", false, megaVideoBulletNativeView.i(f43Var, java.lang.Long.valueOf(longValue)), 8, null);
        return jz5.f0.f302826a;
    }
}
