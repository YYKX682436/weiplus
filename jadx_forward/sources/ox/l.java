package ox;

/* loaded from: classes7.dex */
public final class l implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk.p f431026a;

    public l(tk.p pVar) {
        this.f431026a = pVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.BizPublishImageExternalService", "hookPublishCallback, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17 && jSONObject == null) {
            return;
        }
        this.f431026a.a(z17, err_msg, jSONObject);
    }
}
