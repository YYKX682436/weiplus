package so5;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.m f492388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo5.q f492389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(so5.m mVar, uo5.q qVar) {
        super(1);
        this.f492388d = mVar;
        this.f492389e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        to5.a aVar = (to5.a) this.f492388d.f492416p.remove(java.lang.Long.valueOf(longValue / 1000));
        int i17 = 0;
        uo5.q qVar = this.f492389e;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.DecoderManager", "getFrameInfo: get info for frame idx " + longValue + " error");
            uo5.l lVar = (uo5.l) qVar;
            return new so5.b(lVar.f511266j, lVar.f511267k, 270, false);
        }
        uo5.l lVar2 = (uo5.l) qVar;
        android.util.Size size = lVar2.f511267k;
        android.util.Size size2 = lVar2.f511266j;
        int i18 = aVar.f502531g;
        if (i18 == 2) {
            i17 = 90;
        } else if (i18 == 3) {
            i17 = 180;
        } else if (i18 == 4) {
            i17 = 270;
        }
        return new so5.b(size2, size, i17, aVar.f502532h);
    }
}
