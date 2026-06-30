package kd2;

/* loaded from: classes2.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f388311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(cw2.wa waVar) {
        super(1);
        this.f388311d = waVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da view = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.String mo56696x9040359a = view.mo56696x9040359a();
        cw2.wa waVar = this.f388311d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo56696x9040359a, waVar != null ? waVar.f305629c : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playVideo, advance pause view, mediaId=");
            sb6.append(waVar != null ? waVar.f305629c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", sb6.toString());
            view.mo58788x65825f6();
        }
        return java.lang.Boolean.FALSE;
    }
}
