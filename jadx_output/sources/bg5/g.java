package bg5;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.MainFrameEnterSessionStruct f20751g;

    public g(java.lang.String str, long j17, int i17, com.tencent.mm.autogen.mmdata.rpt.MainFrameEnterSessionStruct mainFrameEnterSessionStruct) {
        this.f20748d = str;
        this.f20749e = j17;
        this.f20750f = i17;
        this.f20751g = mainFrameEnterSessionStruct;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int s96 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().s9(this.f20748d, this.f20749e);
        int i17 = this.f20750f;
        int min = java.lang.Math.min(s96, i17);
        int i18 = i17 - min;
        long j17 = min;
        com.tencent.mm.autogen.mmdata.rpt.MainFrameEnterSessionStruct mainFrameEnterSessionStruct = this.f20751g;
        mainFrameEnterSessionStruct.f59117v = j17;
        mainFrameEnterSessionStruct.f59118w = i18;
        mainFrameEnterSessionStruct.k();
    }
}
