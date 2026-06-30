package z63;

/* loaded from: classes5.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.g f551896d;

    public a(z63.g gVar) {
        this.f551896d = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.String str2;
        u11.a a17;
        z63.g gVar = this.f551896d;
        android.content.Intent intent = new android.content.Intent(gVar.f551940c, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
        intent.putExtra("bind_scene", 0);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) gVar.f551940c.getSystemService("phone")).getSimCountryIso();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f505262c);
            intent.putExtra("couttry_code", a17.f505261b);
        }
        android.content.Context context = gVar.f551940c;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TiemDatePicker", "startWizardActivity()");
        iz5.a.g("startWizardActivity: Param context should be a Activity :" + context.toString(), context instanceof android.app.Activity);
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            str = intent2.getStringExtra("WizardRootClass");
            str2 = intent2.getStringExtra("WizardTransactionId");
        } else {
            str = null;
            str2 = null;
        }
        intent.putExtra("WizardRootClass", str);
        if (str2 != null) {
            intent.putExtra("WizardTransactionId", str2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4098);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker", "startBindActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
