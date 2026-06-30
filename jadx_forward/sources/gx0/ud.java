package gx0;

/* loaded from: classes5.dex */
public final class ud implements com.p314xaae8f345.p457x3304c6.p479x4179489f.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f358571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358572b;

    public ud(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, gx0.bf bfVar) {
        this.f358571a = interfaceC29045xdcb5ca57;
        this.f358572b = bfVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.u
    /* renamed from: onComplete */
    public final void mo34664x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f358571a;
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "onComplete: endClipSkimming mjError " + c4093x6b88526b.f129708ec.m33752x130a215f() + ", " + c4093x6b88526b.f16057x38eb0007);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.PlaybackControlUIC", "onComplete: endClipSkimming success");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        }
        this.f358572b.L = false;
    }
}
