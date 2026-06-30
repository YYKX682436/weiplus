package zw1;

/* loaded from: classes9.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.q2 f558289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558291f;

    public p2(zw1.q2 q2Var, ww1.a3 a3Var, ww1.b3 b3Var) {
        this.f558289d = q2Var;
        this.f558290e = a3Var;
        this.f558291f = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ww1.b3 b3Var;
        android.widget.RelativeLayout relativeLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeGiftEntranceUIC$setGiftEntranceBtnStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.app.Activity m80379x76847179 = this.f558289d.m80379x76847179();
        ww1.a3 a3Var = this.f558290e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(m80379x76847179, a3Var.H.f461349g, null);
        if (a3Var.G && (relativeLayout = (b3Var = this.f558291f).f531686y) != null) {
            relativeLayout.postDelayed(new zw1.o2(b3Var), 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeGiftEntranceUIC$setGiftEntranceBtnStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
