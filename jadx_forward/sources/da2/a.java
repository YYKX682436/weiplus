package da2;

/* loaded from: classes3.dex */
public final class a extends aa2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        b();
    }

    @Override // aa2.b
    public void a(int i17, java.lang.String str) {
        android.widget.TextView textView = this.f84027d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f84024a;
        if (textView != null) {
            if (str == null) {
                str = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqa);
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.f84028e;
        if (textView2 != null) {
            textView2.setText(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqb));
        }
        android.widget.Button button = this.f84025b;
        if (button != null) {
            button.setTextColor(activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77749x38f99acf));
        }
    }
}
