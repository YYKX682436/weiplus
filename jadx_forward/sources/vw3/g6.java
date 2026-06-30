package vw3;

/* loaded from: classes.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f522499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f522500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f522501f;

    public g6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI, int i17, int i18) {
        this.f522499d = repairerUDRUI;
        this.f522500e = i17;
        this.f522501f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.m125854x26a183b(this.f522499d.mo55332x76847179(), "check fail errNo:" + this.f522500e + ",errCode:" + this.f522501f, 1).show();
    }
}
