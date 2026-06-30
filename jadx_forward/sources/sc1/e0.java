package sc1;

/* loaded from: classes7.dex */
public class e0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f487187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f487188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f487189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f487190g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc1.x0 f487191h;

    public e0(sc1.x0 x0Var, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f487191h = x0Var;
        this.f487187d = activity;
        this.f487188e = lVar;
        this.f487189f = jSONObject;
        this.f487190g = i17;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f487188e;
        if (i17 == 117) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
                sc1.x0 x0Var = this.f487191h;
                x0Var.getClass();
                x0Var.B(lVar, this.f487189f, this.f487190g, lVar.mo50357xcd94f799());
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sc1.d0(this), 50L);
            }
        }
        si1.e1.b(lVar.mo48798x74292566(), this);
    }
}
