package eo5;

/* loaded from: classes.dex */
public final class c implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eo5.e f337127a;

    public c(eo5.e eVar) {
        this.f337127a = eVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.content.Intent intent2;
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        eo5.e eVar = this.f337127a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = eVar.m158354x19263085();
        android.content.Intent intent3 = eVar.m158354x19263085().getIntent();
        if (intent3 != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            kz5.h0.w(arrayList, r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
            intent2 = intent3.putStringArrayListExtra("Select_Contact", arrayList);
        } else {
            intent2 = null;
        }
        m158354x19263085.setResult(-1, intent2);
        eVar.m158354x19263085().finish();
    }
}
