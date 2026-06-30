package sm3;

/* loaded from: classes5.dex */
public final class a implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.a f491353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7 f491354e;

    public a(kp4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7 c16707x92645a7) {
        this.f491353d = aVar;
        this.f491354e = c16707x92645a7;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvFrameListView", this.f491353d + " receives " + ((java.lang.Number) obj).longValue());
        this.f491354e.postInvalidate();
        return jz5.f0.f384359a;
    }
}
