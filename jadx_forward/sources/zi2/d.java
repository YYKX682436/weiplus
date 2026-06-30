package zi2;

/* loaded from: classes3.dex */
public final class d implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554636d;

    public d(zi2.w wVar) {
        this.f554636d = wVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean c17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        zi2.w wVar = this.f554636d;
        wVar.getClass();
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.X2).mo141623x754a37bb()).r()).intValue() == 0) {
            c17 = true;
        } else {
            c17 = wVar.w1().c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "isEnablePkBarClick: " + c17);
        }
        if (c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "pk bar clicked, is red team " + booleanValue);
            ((ni2.w) ((jz5.n) wVar.f554693w).mo141623x754a37bb()).z(booleanValue ? fj2.k.f344708d : fj2.k.f344709e, null);
        }
        return jz5.f0.f384359a;
    }
}
