package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0002B%\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'B\u001d\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceInputLayout;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Lgc3/a;", "d", "Lgc3/a;", "getVoiceDetectListener", "()Lgc3/a;", "setVoiceDetectListener", "(Lgc3/a;)V", "voiceDetectListener", "", "e", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "", "<set-?>", "g", "I", "getCurrentState", "()I", "setCurrentState", "(I)V", "currentState", "", "h", "Z", "getDisableTrans", "()Z", "setDisableTrans", "(Z)V", "disableTrans", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout */
/* loaded from: classes9.dex */
public abstract class AbstractC16410x346dc9fa extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public gc3.a voiceDetectListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String filePath;

    /* renamed from: f, reason: collision with root package name */
    public z21.e f229129f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int currentState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean disableTrans;

    /* renamed from: i, reason: collision with root package name */
    public final int f229132i;

    /* renamed from: m, reason: collision with root package name */
    public final int f229133m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f229134n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f229135o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f229136p;

    public AbstractC16410x346dc9fa(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getVoiceFilePath(...)");
        this.filePath = f17;
        this.currentState = 1;
        this.f229132i = 3000;
        this.f229133m = 10000;
        this.f229134n = new gc3.e(this);
        this.f229135o = new gc3.c(this);
        this.f229136p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.b(this), true);
    }

    public final void c() {
        int i17 = this.currentState;
        if (i17 == 1 || i17 != 2) {
            return;
        }
        this.currentState = 3;
        gc3.a aVar = this.voiceDetectListener;
        if (aVar != null) {
            ((gc3.o) aVar).a();
        }
        this.f229136p.d();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f229134n;
        n3Var.mo50303x856b99f0(0);
        n3Var.mo50307xb9e94560(0, this.f229132i);
        n3Var.mo50307xb9e94560(1, this.f229133m);
        e(true);
        z21.e eVar = this.f229129f;
        if (eVar != null) {
            eVar.mo48299x360802(true);
        }
    }

    public abstract void e(boolean z17);

    public final int getCurrentState() {
        return this.currentState;
    }

    public final boolean getDisableTrans() {
        return this.disableTrans;
    }

    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public final gc3.a getVoiceDetectListener() {
        return this.voiceDetectListener;
    }

    public abstract void i(int i17);

    public abstract void j();

    /* renamed from: setCurrentState */
    public final void m66246xee20281a(int i17) {
        this.currentState = i17;
    }

    /* renamed from: setDisableTrans */
    public final void m66247x5bdbfe22(boolean z17) {
        this.disableTrans = z17;
    }

    /* renamed from: setVoiceDetectListener */
    public final void m66248xc1b94687(gc3.a aVar) {
        this.voiceDetectListener = aVar;
    }

    public AbstractC16410x346dc9fa(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getVoiceFilePath(...)");
        this.filePath = f17;
        this.currentState = 1;
        this.f229132i = 3000;
        this.f229133m = 10000;
        this.f229134n = new gc3.e(this);
        this.f229135o = new gc3.c(this);
        this.f229136p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gc3.b(this), true);
    }
}
