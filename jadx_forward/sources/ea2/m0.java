package ea2;

/* loaded from: classes3.dex */
public final class m0 extends x92.o {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f332106n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f332106n = jz5.h.b(new ea2.l0(activity));
    }

    @Override // x92.o, x92.r
    public void O6(int i17, java.lang.String str) {
        super.O6(i17, str);
        ((da2.a) ((jz5.n) this.f332106n).mo141623x754a37bb()).a(i17, str);
    }

    @Override // x92.o, x92.r
    public void P6(int i17, java.lang.String str) {
        super.P6(i17, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicTipsUIC", "responseCode:" + i17 + " errMsg:" + str);
        if (str == null || str.length() == 0) {
            if (m158354x19263085().isFinishing()) {
                return;
            }
            m158354x19263085().finish();
            return;
        }
        da2.a aVar = (da2.a) ((jz5.n) this.f332106n).mo141623x754a37bb();
        android.widget.TextView textView = aVar.f84027d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = aVar.f84024a;
        if (textView != null) {
            if (str == null) {
                str = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqa);
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = aVar.f84028e;
        if (textView2 != null) {
            textView2.setText("");
        }
        android.widget.Button button = aVar.f84025b;
        if (button != null) {
            button.setTextColor(activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77749x38f99acf));
        }
    }
}
