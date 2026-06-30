package qd1;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f443171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.p f443172g;

    public i(qd1.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f443172g = pVar;
        this.f443169d = e9Var;
        this.f443170e = i17;
        this.f443171f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443169d;
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        int i17 = this.f443170e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowModal", "invoke after runtime initialized appId[%s] callbackId[%d]", mo48798x74292566, java.lang.Integer.valueOf(i17));
        this.f443172g.A(e9Var, this.f443171f, i17);
    }
}
