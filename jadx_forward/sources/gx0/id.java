package gx0;

/* loaded from: classes5.dex */
public final class id implements com.p314xaae8f345.p457x3304c6.p479x4179489f.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f358074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 f358076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f358077d;

    public id(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 c4170x5817ebc8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f358074a = c4181x2248e1a3;
        this.f358075b = bfVar;
        this.f358076c = c4170x5817ebc8;
        this.f358077d = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.u
    /* renamed from: onComplete */
    public final void mo34664x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f358077d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 c4170x5817ebc8 = this.f358076c;
        gx0.bf bfVar = this.f358075b;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f358074a;
        if (c4093x6b88526b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.PlaybackControlUIC", "onComplete: clipSegment = " + c4181x2248e1a3.C() + ", beginClipSkimming success");
            bfVar.L = true;
            c4170x5817ebc8.a();
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "onComplete: clipSegment = " + c4181x2248e1a3.f130065a + ", beginClipSkimming mjError " + c4093x6b88526b.f129708ec.m33752x130a215f() + ", " + c4093x6b88526b.f16057x38eb0007);
        bfVar.L = false;
        c4170x5817ebc8.a();
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }
}
