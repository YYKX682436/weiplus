package qx3;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx3.i f448899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx3.o f448900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vx3.i iVar, qx3.o oVar) {
        super(2);
        this.f448899d = iVar;
        this.f448900e = oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Number) obj2).intValue() != 0) {
            vx3.i iVar = this.f448899d;
            if (iVar.C) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtonePlayerFlow", "onPlayMusicError, try switch to video!");
                dk4.a aVar = iVar.f522817a;
                if (aVar != null) {
                    aVar.f316014r = null;
                }
                iVar.m(false);
                qx3.o oVar = this.f448900e;
                oVar.R6();
                oVar.O6(iVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
