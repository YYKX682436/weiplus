package od0;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f426077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ od0.v f426079f;

    public h0(od0.v vVar, android.content.Intent intent, java.lang.String str) {
        this.f426079f = vVar;
        this.f426077d = intent;
        this.f426078e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f426077d;
        if (intent == null) {
            return;
        }
        try {
            java.lang.String stringExtra = intent.getStringExtra("geta8key_username");
            java.lang.String stringExtra2 = intent.getStringExtra("msgUsername");
            java.lang.String stringExtra3 = intent.getStringExtra("preChatName");
            java.lang.String stringExtra4 = intent.getStringExtra("rawUrl");
            int intExtra = intent.getIntExtra("geta8key_scene", 0);
            r45.k57 k57Var = new r45.k57();
            byte[] k17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.k(stringExtra, stringExtra2, stringExtra3, stringExtra4, this.f426078e, intExtra);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(k17);
            k57Var.f459942v = cu5Var;
            this.f426079f.Ai(540999710, k57Var.mo14344x5f01b1f6(), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "report wssi suc");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report wssf error, msg:" + th6);
        }
    }
}
