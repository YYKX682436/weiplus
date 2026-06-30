package dk2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f315355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dk2.vg vgVar) {
        super(3);
        this.f315355d = vgVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        bw5.gq0 gq0Var = (bw5.gq0) obj3;
        dk2.vg vgVar = this.f315355d;
        if (booleanValue) {
            vgVar.f315787a.set(7, gq0Var != null ? gq0Var.m12014xb5887639() : null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAnchorMusicData", "fetch song url for listenId " + vgVar.f315787a.m75945x2fec8307(9) + " failed. ErrorMsg " + str);
        }
        return jz5.f0.f384359a;
    }
}
