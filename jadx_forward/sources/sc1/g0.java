package sc1;

/* loaded from: classes7.dex */
public class g0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f487201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f487202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f487203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f487204g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc1.x0 f487205h;

    public g0(sc1.x0 x0Var, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f487205h = x0Var;
        this.f487201d = activity;
        this.f487202e = lVar;
        this.f487203f = jSONObject;
        this.f487204g = i17;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 118) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f487202e;
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
                sc1.x0 x0Var = this.f487205h;
                x0Var.getClass();
                x0Var.B(lVar, this.f487203f, this.f487204g, lVar.mo50357xcd94f799());
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sc1.f0(this), 50L);
            }
            si1.e1.b(lVar.mo48798x74292566(), this);
        }
    }
}
