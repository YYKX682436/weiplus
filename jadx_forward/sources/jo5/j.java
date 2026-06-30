package jo5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f382489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jo5.l f382490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jo5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f382490e = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        jo5.j jVar = new jo5.j(this.f382490e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        jVar.f382489d = intValue;
        return jVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f382489d;
        jz5.l lVar = (jz5.l) this.f382490e.f382493b.get(new java.lang.Integer(i17));
        android.graphics.SurfaceTexture surfaceTexture = lVar != null ? (android.graphics.SurfaceTexture) lVar.f384367e : null;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        java.lang.String str = "Surface texture for memberId: " + i17 + " not found!";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoIPMPCodecDriver", str);
        throw new java.lang.RuntimeException(str);
    }
}
