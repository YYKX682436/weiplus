package g22;

/* loaded from: classes15.dex */
public final class r extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 f349392a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318) {
        this.f349392a = abstractC13361x415b318;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        java.lang.String string;
        java.lang.String string2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318 = this.f349392a;
        abstractC13361x415b318.getClass();
        int i17 = msg.what;
        int i18 = abstractC13361x415b318.f179949h;
        java.lang.String str = abstractC13361x415b318.f179946e;
        if (i17 == i18) {
            if (msg.getData() == null || (string2 = msg.getData().getString(str)) == null) {
                return;
            }
            abstractC13361x415b318.m0().E(new i22.n(string2, msg.getData().getInt(abstractC13361x415b318.f179947f)));
            return;
        }
        if (i17 != abstractC13361x415b318.f179950i) {
            if (i17 == abstractC13361x415b318.f179951m) {
                abstractC13361x415b318.m0().B(true);
            }
        } else {
            if (msg.getData() == null || (string = msg.getData().getString(str)) == null) {
                return;
            }
            abstractC13361x415b318.m0().E(new i22.o(string, msg.getData().getInt(abstractC13361x415b318.f179948g)));
        }
    }
}
