package v01;

/* loaded from: classes11.dex */
public final class k implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 f513742a;

    public k(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6) {
        this.f513742a = c11118xe5a619d6;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileCardFragment", "openPublish success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        boolean z18 = false;
        if (jSONObject != null && jSONObject.optBoolean("initSuccess")) {
            z18 = true;
        }
        if (z18) {
            int i17 = com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6.f152398q;
            this.f513742a.A0();
        }
    }
}
