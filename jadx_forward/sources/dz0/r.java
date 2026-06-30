package dz0;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz0.v f326527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dz0.v vVar) {
        super(1);
        this.f326527d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f326527d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "jumpSecondCutAppWithSegmentInfo: " + booleanValue);
        if (booleanValue) {
            bz0.h hVar = bz0.j.f118294l;
            if (hVar != null) {
                hVar.f118278b = true;
            }
            if ((hVar != null ? hVar.f118279c : null) == null && hVar != null) {
                hVar.f118279c = -1;
            }
        }
        return jz5.f0.f384359a;
    }
}
