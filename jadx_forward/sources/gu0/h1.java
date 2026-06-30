package gu0;

/* loaded from: classes5.dex */
public final class h1 implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f357223a;

    public h1(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f357223a = qVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.r
    /* renamed from: onComplete */
    public final void mo9342x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f357223a;
        if (c4093x6b88526b == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "prepareResourceAndRegister: loadLocalTemplateComponents failed: " + c4093x6b88526b.f16057x38eb0007);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("loadLocalTemplateComponents failed: " + c4093x6b88526b.f16057x38eb0007))));
    }
}
