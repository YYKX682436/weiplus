package os3;

/* loaded from: classes8.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f429578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f429579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429581g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429582h;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86, int i17, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f429582h = activityC16931x24037f86;
        this.f429578d = i17;
        this.f429579e = r6Var;
        this.f429580f = str;
        this.f429581g = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429582h;
        if (activityC16931x24037f86.f236386y.d() + this.f429578d > 52428800) {
            db5.e1.m(activityC16931x24037f86, com.p314xaae8f345.mm.R.C30867xcad56011.hkr, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            return;
        }
        if (activityC16931x24037f86.f236377q.getText().toString().trim().length() == 0) {
            java.lang.String trim = this.f429579e.m82467xfb82e301().trim();
            int lastIndexOf = trim.lastIndexOf(".");
            android.widget.EditText editText = activityC16931x24037f86.f236377q;
            if (lastIndexOf <= 0) {
                lastIndexOf = trim.length();
            }
            editText.setText(trim.substring(0, lastIndexOf));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "in upload file mode = %d", java.lang.Integer.valueOf(activityC16931x24037f86.M));
        os3.v1 v1Var = activityC16931x24037f86.f236386y;
        v1Var.getClass();
        java.lang.String str = this.f429580f;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) v1Var.f429759h;
        if (hashMap.containsKey(str)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.FileUploadHelper", "file path is not exist: %s", str);
            return;
        }
        ks3.v0 v0Var = new ks3.v0();
        v0Var.f393288d = str;
        java.lang.String str2 = this.f429581g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            v0Var.f393289e = r6Var.m82467xfb82e301();
        } else {
            v0Var.f393289e = str2;
        }
        v0Var.f393290f = r6Var.C();
        v0Var.f393291g = 0;
        hashMap.put(str, v0Var);
        v1Var.i(v0Var);
    }
}
