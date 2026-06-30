package lu4;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.m f402970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lu4.m mVar, java.lang.String str) {
        super(1);
        this.f402970d = mVar;
        this.f402971e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ak akVar = (r45.ak) obj;
        lu4.m mVar = this.f402970d;
        java.lang.String str = mVar.f402964c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportCgi resp_json=");
        sb6.append(akVar != null ? akVar.f451593f : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        lu4.c cVar = (lu4.c) mVar.f402963b;
        java.lang.String str2 = this.f402971e;
        java.lang.String str3 = akVar != null ? akVar.f451593f : null;
        lu4.c.u(cVar, str2, str3 == null ? "null" : str3, null, 4, null);
        return jz5.f0.f384359a;
    }
}
