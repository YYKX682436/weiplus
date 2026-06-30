package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class g implements pd1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f168993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f168994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i f168995c;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar, android.graphics.Point point, java.lang.Runnable runnable) {
        this.f168995c = iVar;
        this.f168993a = point;
        this.f168994b = runnable;
    }

    @Override // pd1.i
    public void a(int i17, int i18) {
        if (this.f168995c.f169012i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168995c.f169004a, "handleVideoPage2PipStart, onVideoPositionGot, released");
            return;
        }
        android.graphics.Point point = this.f168993a;
        point.x = i17;
        point.y = i18;
        this.f168994b.run();
    }
}
