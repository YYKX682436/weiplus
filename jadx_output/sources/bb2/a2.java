package bb2;

/* loaded from: classes10.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.f2 f18802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView, int i17, bb2.f2 f2Var, int i18) {
        super(0);
        this.f18800d = megaVideoBulletNativeView;
        this.f18801e = i17;
        this.f18802f = f2Var;
        this.f18803g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn fastFollowBtn;
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18800d;
        if (megaVideoBulletNativeView.isAttachedToWindow()) {
            long j17 = this.f18801e * 1000;
            if (!this.f18802f.f18861d && megaVideoBulletNativeView.getFeed().h2(megaVideoBulletNativeView.getBulletManager().f19046k)) {
                megaVideoBulletNativeView.getBulletManager().s(j17, this.f18803g * 1000);
            }
            if (megaVideoBulletNativeView.h()) {
                java.util.List<r45.f43> list = megaVideoBulletNativeView.getBulletManager().f19051p;
                boolean z18 = false;
                if (list != null && megaVideoBulletNativeView.getContext().getResources().getConfiguration().orientation != 2) {
                    for (r45.f43 f43Var : list) {
                        long j18 = f43Var.getLong(3);
                        long j19 = f43Var.getLong(2);
                        if (j18 >= 0 && j18 <= j17 && j17 < j19 + 1000) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    megaVideoBulletNativeView.g();
                    megaVideoBulletNativeView.getBulletManager().getClass();
                    xp.d.f().f455862s = true;
                }
                fastFollowBtn = megaVideoBulletNativeView.getFastFollowBtn();
                if (fastFollowBtn.getVisibility() == 8) {
                    java.util.List<r45.f43> list2 = megaVideoBulletNativeView.getBulletManager().f19051p;
                    if (list2 != null) {
                        megaVideoBulletNativeView.getBulletManager().getClass();
                        if (xp.d.f().f455862s) {
                            android.content.Context context = megaVideoBulletNativeView.getContext();
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            pf5.z zVar = pf5.z.f353948a;
                            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                            if (finderSpeedControlUIC != null && finderSpeedControlUIC.f133650u) {
                                z18 = true;
                            }
                            if (!z18 && megaVideoBulletNativeView.getContext().getResources().getConfiguration().orientation != 2) {
                                for (r45.f43 f43Var2 : list2) {
                                    long j27 = f43Var2.getLong(2);
                                    if (j27 >= 0 && j27 <= j17 && j27 + 1000 >= j17) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    f43Var2 = null;
                    if (f43Var2 != null) {
                        megaVideoBulletNativeView.l(f43Var2);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
