package l41;

/* loaded from: classes4.dex */
public final class v1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397480d;

    public v1(yz5.l lVar) {
        this.f397480d = lVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ie ieVar;
        r45.ie mo11484xe92ab0a8;
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setReportLocationAcceptedCgi ");
            sb6.append(aVar.f440820d);
            sb6.append(' ');
            int i17 = aVar.f440819c;
            sb6.append(i17);
            sb6.append(' ');
            r45.k26 k26Var = (r45.k26) aVar.f440822f;
            sb6.append((k26Var == null || (mo11484xe92ab0a8 = k26Var.mo11484xe92ab0a8()) == null) ? null : new java.lang.Integer(mo11484xe92ab0a8.f458492d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqHelper", sb6.toString());
            boolean z17 = false;
            if (i17 == 0) {
                if ((k26Var == null || (ieVar = k26Var.f76492x92037252) == null || ieVar.f458492d != 0) ? false : true) {
                    z17 = true;
                }
            }
            this.f397480d.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        return jz5.f0.f384359a;
    }
}
