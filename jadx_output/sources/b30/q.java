package b30;

/* loaded from: classes.dex */
public final class q implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f17576b;

    public q(int i17, c00.n3 n3Var) {
        this.f17575a = i17;
        this.f17576b = n3Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        int i19;
        if (i17 != this.f17575a) {
            return false;
        }
        if (i18 != -1) {
            i19 = 3;
            if (i18 == 0 && intent != null) {
                if (!intent.getBooleanExtra("sns_upload_is_cancel_save_draft", false)) {
                    intent = null;
                }
                if (intent != null) {
                    i19 = 2;
                }
            }
        } else {
            i19 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsSnsHelper", "onResult resultType " + i19);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("resultType", i19);
        this.f17576b.b(jSONObject);
        return true;
    }
}
