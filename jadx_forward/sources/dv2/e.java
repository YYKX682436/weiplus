package dv2;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.h f325366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.c f325367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325370e;

    public e(dv2.h hVar, dv2.c cVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f325366a = hVar;
        this.f325367b = cVar;
        this.f325368c = i17;
        this.f325369d = str;
        this.f325370e = str2;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback
    /* renamed from: complete */
    public final void mo112788xdc453139(boolean z17) {
        dv2.h hVar = this.f325366a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f325390d, hVar.hashCode() + ' ' + this.f325367b + " reportMsgReadCGI complete unreadCount=" + this.f325368c + " username=" + this.f325369d + ",sessionId=" + this.f325370e);
        hVar.R6();
    }
}
