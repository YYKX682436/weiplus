package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes.dex */
public final class m1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f290059a;

    public m1(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f290059a = rVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizTask", "success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f290059a;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17));
        }
    }
}
