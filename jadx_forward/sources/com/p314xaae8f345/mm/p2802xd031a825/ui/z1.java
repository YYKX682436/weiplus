package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes4.dex */
public abstract class z1 implements android.view.View.OnClickListener {

    /* renamed from: DEFAULT_CLICK_LIMIT_TIME */
    private static final long f39914x1497b686 = 3000;
    private static final java.lang.String TAG = "MicroMsg.WalletClickListener";

    /* renamed from: _hellAccFlag_ */
    private byte f39915x7f11beae;

    /* renamed from: avoidDoubleClick */
    private boolean f39916xa9237782;

    /* renamed from: clickLimitTime */
    private long f39917xae76d080;

    /* renamed from: lastClickTime */
    private long f39918x1feb9e7f;

    public z1(boolean z17) {
        this(z17, f39914x1497b686);
    }

    /* renamed from: isFastClick */
    public boolean m83220x43151882() {
        long j17 = this.f39917xae76d080;
        if (j17 == 0) {
            j17 = f39914x1497b686;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f39918x1feb9e7f < j17) {
            return true;
        }
        this.f39918x1feb9e7f = currentTimeMillis;
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f39916xa9237782 && m83220x43151882()) {
            yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mo27114xc7e50b6b(view);
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.e(view);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: onRealClick */
    public abstract void mo27114xc7e50b6b(android.view.View view);

    public z1(boolean z17, long j17) {
        this.f39916xa9237782 = z17;
        this.f39917xae76d080 = j17;
    }
}
