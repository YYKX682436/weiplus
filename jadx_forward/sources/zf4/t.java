package zf4;

/* loaded from: classes13.dex */
public class t implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.w f554223d;

    public t(zf4.w wVar) {
        this.f554223d = wVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        zf4.q c17;
        zf4.w wVar = this.f554223d;
        java.lang.String str = wVar.f554231d;
        if (str != null && (c17 = zf4.r.c(str)) != null && c17.f68517x10a0fed7 == 1) {
            c17.f68517x10a0fed7 = 2;
            c17.U = 64;
            zf4.r.f(c17);
        }
        zf4.l.Ai().c();
        java.lang.String str2 = wVar.f554231d;
        return false;
    }
}
