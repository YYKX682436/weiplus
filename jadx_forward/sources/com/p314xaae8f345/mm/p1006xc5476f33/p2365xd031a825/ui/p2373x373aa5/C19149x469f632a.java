package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView */
/* loaded from: classes9.dex */
public class C19149x469f632a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public gt4.r1 f262260d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262261e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f262262f;

    /* renamed from: g, reason: collision with root package name */
    public gt4.l1 f262263g;

    public C19149x469f632a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        gt4.r1 r1Var = this.f262260d;
        if (r1Var != null) {
            r1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "onDestroy");
            q35.d dVar = r1Var.f357060u;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* renamed from: setScratchShakeCallback */
    public void m73928x2acfc13(gt4.l1 l1Var) {
        this.f262263g = l1Var;
    }

    public C19149x469f632a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
