package yo4;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yo4.p pVar) {
        super(1);
        this.f545786d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        iu3.h hVar;
        yz5.l lVar = (yz5.l) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clipProgressRegistrar] register listener=");
        sb6.append(lVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        iu3.i iVar = this.f545786d.f545818p;
        if (lVar != null) {
            iVar.getClass();
            hVar = new iu3.h(lVar);
        } else {
            hVar = null;
        }
        iVar.f376543f = hVar;
        iVar.f376544g = 100L;
        kk4.v vVar = iVar.f376541c;
        if (vVar != null) {
            vVar.I(hVar, 100L);
        }
        return jz5.f0.f384359a;
    }
}
