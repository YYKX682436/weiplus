package j20;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar) {
        super(1);
        this.f378750d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f378750d;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiPermission", "location permission granted");
            lVar.mo146xb9724478(0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiPermission", "location permission denied");
            lVar.mo146xb9724478(109);
        }
        return jz5.f0.f384359a;
    }
}
