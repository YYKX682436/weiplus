package vw3;

/* loaded from: classes.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f522638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522639e;

    public s2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI, java.lang.String str) {
        this.f522638d = repairerMagicBootsUI;
        this.f522639e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.m125854x26a183b(this.f522638d.mo55332x76847179(), "check fail:" + this.f522639e, 1).show();
    }
}
