package or1;

/* loaded from: classes9.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f429043a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f429044b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.w6 f429045c;

    public j1(android.app.Activity activity, java.lang.String str) {
        this.f429043a = activity;
        this.f429044b = str;
    }

    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            return false;
        }
        if (i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
            java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
            ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
            android.app.Activity activity = this.f429043a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
        }
        return true;
    }
}
