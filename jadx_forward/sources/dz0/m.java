package dz0;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz0.v f326465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f326466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dz0.v vVar, yz5.l lVar) {
        super(1);
        this.f326465d = vVar;
        this.f326466e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) obj;
        dz0.v vVar = this.f326465d;
        vVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginSegmentClipping: complete ");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", sb6.toString());
        yz5.l lVar = this.f326466e;
        if (lVar != null) {
            lVar.mo146xb9724478(c4093x6b88526b);
        }
        p3325xe03a0797.p3326xc267989b.z zVar = vVar.f326565d;
        if (zVar != null) {
            ((p3325xe03a0797.p3326xc267989b.a0) zVar).U(c4093x6b88526b);
        }
        vVar.f326566e = true;
        return jz5.f0.f384359a;
    }
}
