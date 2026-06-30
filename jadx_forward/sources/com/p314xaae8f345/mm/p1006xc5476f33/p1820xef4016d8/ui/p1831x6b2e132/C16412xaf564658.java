package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0004B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout;", "Lcom/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceInputLayout;", "", "getUseTime", "Lgc3/n;", "t", "Lgc3/n;", "getVoiceListener", "()Lgc3/n;", "setVoiceListener", "(Lgc3/n;)V", "voiceListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout */
/* loaded from: classes9.dex */
public final class C16412xaf564658 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa {

    /* renamed from: q, reason: collision with root package name */
    public long f229150q;

    /* renamed from: r, reason: collision with root package name */
    public long f229151r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f229152s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public gc3.n voiceListener;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnTouchListener f229154u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f229155v;

    public C16412xaf564658(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        gc3.o oVar = new gc3.o(this);
        gc3.q qVar = new gc3.q(this);
        this.f229154u = qVar;
        gc3.p pVar = new gc3.p(this);
        this.f229155v = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.r(this), true);
        setOnTouchListener(qVar);
        setOnLongClickListener(pVar);
        m66248xc1b94687(oVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa
    public void e(boolean z17) {
    }

    /* renamed from: getUseTime, reason: from getter */
    public final long getF229151r() {
        return this.f229151r;
    }

    public final gc3.n getVoiceListener() {
        return this.voiceListener;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa
    public void i(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa
    public void j() {
    }

    public void k(boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f229150q = java.lang.System.currentTimeMillis();
        this.f229155v.c(5000L, 5000L);
    }

    /* renamed from: setVoiceListener */
    public final void m66252xf3ecdac4(gc3.n nVar) {
        this.voiceListener = nVar;
    }

    public C16412xaf564658(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        gc3.o oVar = new gc3.o(this);
        gc3.q qVar = new gc3.q(this);
        this.f229154u = qVar;
        gc3.p pVar = new gc3.p(this);
        this.f229155v = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.r(this), true);
        setOnTouchListener(qVar);
        setOnLongClickListener(pVar);
        m66248xc1b94687(oVar);
    }
}
