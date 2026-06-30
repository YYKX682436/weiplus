package gc3;

/* loaded from: classes9.dex */
public final class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa f351956a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa) {
        this.f351956a = abstractC16410x346dc9fa;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        gc3.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351956a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.os.Bundle data = msg.getData();
            data.getInt("localCode");
            data.getInt("errType");
            data.getInt("errCode");
            abstractC16410x346dc9fa.getClass();
            return;
        }
        int i18 = abstractC16410x346dc9fa.currentState;
        if (i18 != 2) {
            return;
        }
        if (i18 == 2 && (aVar = abstractC16410x346dc9fa.voiceDetectListener) != null) {
            ((gc3.o) aVar).a();
        }
        abstractC16410x346dc9fa.currentState = 3;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = abstractC16410x346dc9fa.f229134n;
        n3Var.mo50303x856b99f0(0);
        n3Var.mo50307xb9e94560(0, abstractC16410x346dc9fa.f229132i);
        n3Var.mo50307xb9e94560(1, abstractC16410x346dc9fa.f229133m);
        abstractC16410x346dc9fa.e(false);
    }
}
