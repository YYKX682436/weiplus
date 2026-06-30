package l41;

/* loaded from: classes4.dex */
public final class s1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397453d;

    public s1(yz5.l lVar) {
        this.f397453d = lVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ie ieVar;
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportLocationCgi ");
            sb6.append(aVar.f440820d);
            sb6.append(' ');
            int i17 = aVar.f440819c;
            sb6.append(i17);
            sb6.append(' ');
            r45.j05 j05Var = (r45.j05) aVar.f440822f;
            sb6.append(j05Var != null ? j05Var.mo11484xe92ab0a8() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqHelper", sb6.toString());
            boolean z17 = false;
            if (i17 == 0) {
                if ((j05Var == null || (ieVar = j05Var.f76492x92037252) == null || ieVar.f458492d != 0) ? false : true) {
                    z17 = true;
                }
            }
            this.f397453d.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        return jz5.f0.f384359a;
    }
}
