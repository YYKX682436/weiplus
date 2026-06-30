package gc3;

/* loaded from: classes9.dex */
public final class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa f351955d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa) {
        this.f351955d = abstractC16410x346dc9fa;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351955d;
        z21.e eVar = abstractC16410x346dc9fa.f229129f;
        if (eVar == null) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        int mo48281x67ad3875 = eVar.mo48281x67ad3875();
        if (abstractC16410x346dc9fa.getCurrentState() == 2) {
            abstractC16410x346dc9fa.i(mo48281x67ad3875);
        }
        return true;
    }
}
