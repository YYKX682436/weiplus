package bb2;

/* loaded from: classes10.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f19072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView) {
        super(0);
        this.f19072d = megaVideoBulletNativeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f19072d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn = new com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn(context, null, 0);
        finderBulletFastFollowBtn.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.setMarginEnd((int) finderBulletFastFollowBtn.getContext().getResources().getDimension(com.tencent.mm.R.dimen.afe));
        finderBulletFastFollowBtn.setLayoutParams(layoutParams);
        return finderBulletFastFollowBtn;
    }
}
