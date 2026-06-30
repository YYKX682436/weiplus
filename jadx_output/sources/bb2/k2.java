package bb2;

/* loaded from: classes10.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView, java.lang.String str) {
        super(1);
        this.f18905d = megaVideoBulletNativeView;
        this.f18906e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        java.lang.String content = this.f18906e;
        kotlin.jvm.internal.o.f(content, "$content");
        int i17 = com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView.f102801s;
        this.f18905d.k(content, true);
        return jz5.f0.f302826a;
    }
}
