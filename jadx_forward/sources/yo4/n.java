package yo4;

/* loaded from: classes5.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yo4.p pVar) {
        super(1);
        this.f545803d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "[onBgmVolumeChanged] bgmVolume=" + intValue);
        iu3.i iVar = this.f545803d.f545818p;
        float f17 = ((float) e06.p.f(intValue, 0, 100)) / ((float) 100);
        iVar.getClass();
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f376540b, "setVolume " + e17);
        iVar.f376542e = java.lang.Float.valueOf(e17);
        kk4.v vVar = iVar.f376541c;
        if (vVar != null) {
            vVar.K(e17);
        }
        return jz5.f0.f384359a;
    }
}
