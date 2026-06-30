package jp3;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f382522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f382524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382530o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382531p;

    public e(int i17, java.lang.String str, android.app.Activity activity, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f382522d = i17;
        this.f382523e = str;
        this.f382524f = activity;
        this.f382525g = str2;
        this.f382526h = str3;
        this.f382527i = str4;
        this.f382528m = str5;
        this.f382529n = str6;
        this.f382530o = str7;
        this.f382531p = str8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doReturnAndFinish] errorCode：");
        int i17 = this.f382522d;
        sb6.append(i17);
        sb6.append(", errorMsg：");
        java.lang.String str = this.f382523e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintHelper", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("palm_error_code", i17);
        if (str == null) {
            str = "88888";
        }
        intent.putExtra("palm_error_msg", str);
        java.lang.String str2 = this.f382525g;
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("palm_stats_file_path", str2);
        java.lang.String str3 = this.f382526h;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("palm_register_image_path", str3);
        java.lang.String str4 = this.f382527i;
        if (str4 == null) {
            str4 = "";
        }
        intent.putExtra("palm_register_image_md5", str4);
        java.lang.String str5 = this.f382528m;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("palm_live_image_path", str5);
        java.lang.String str6 = this.f382529n;
        if (str6 == null) {
            str6 = "";
        }
        intent.putExtra("palm_live_image_md5", str6);
        java.lang.String str7 = this.f382530o;
        if (str7 == null) {
            str7 = "";
        }
        intent.putExtra("palm_video_path", str7);
        java.lang.String str8 = this.f382531p;
        intent.putExtra("palm_video_md5", str8 != null ? str8 : "");
        intent.putExtra("phone_type", o45.wf.f424557b + '_' + o45.wf.f424558c);
        android.app.Activity activity = this.f382524f;
        activity.setResult(-1, intent);
        activity.finish();
    }
}
