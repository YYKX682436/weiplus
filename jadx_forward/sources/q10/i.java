package q10;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f441046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f441047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f441046d = h0Var;
        this.f441047e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.f441046d.f391656d;
        if (!(str == null || str.length() == 0) && !this.f441047e.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBProfileUtil", "uploadFile coroutine cancelled, cancel cronet taskId=" + str);
            try {
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile cancelCronetTask error: " + th6.getMessage());
            }
        }
        return jz5.f0.f384359a;
    }
}
