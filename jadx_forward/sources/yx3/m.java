package yx3;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.v f549448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yx3.v vVar) {
        super(1);
        this.f549448d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Exception exc = (java.lang.Exception) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError: ");
        sb6.append(exc != null ? exc.getLocalizedMessage() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneServiceHelper", sb6.toString());
        yx3.v vVar = this.f549448d;
        vVar.f549495v = false;
        java.lang.String localizedMessage = exc != null ? exc.getLocalizedMessage() : null;
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        vVar.f549496w = localizedMessage;
        return jz5.f0.f384359a;
    }
}
