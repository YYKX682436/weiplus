package aa2;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f84024a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.Button f84025b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f84026c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f84027d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f84028e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f84029f;

    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f84024a = activity;
    }

    public void a(int i17, java.lang.String str) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f84024a;
        java.lang.String string = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ciw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int color = activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac);
        if (i17 == -4063) {
            string = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cit);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.widget.TextView textView = this.f84027d;
            if (textView != null) {
                textView.setText(string);
            }
            android.widget.TextView textView2 = this.f84028e;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else if (i17 == -4058) {
            if (str == null) {
                str = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjq);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            color = activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
            string = str;
        }
        android.widget.TextView textView3 = this.f84028e;
        if (textView3 != null) {
            textView3.setText(string);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f84029f;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.m82040x7541828(color);
    }

    public void b() {
        android.widget.TextView textView;
        android.widget.Button button;
        android.view.View inflate;
        android.view.ViewStub viewStub = (android.view.ViewStub) this.f84024a.findViewById(com.p314xaae8f345.mm.R.id.e8q);
        android.widget.Button button2 = null;
        android.widget.LinearLayout linearLayout = (viewStub == null || (inflate = viewStub.inflate()) == null) ? null : (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.e8p);
        this.f84026c = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.f84026c;
        if (linearLayout2 == null || (textView = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.e8t)) == null) {
            textView = null;
        } else {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        this.f84027d = textView;
        android.widget.LinearLayout linearLayout3 = this.f84026c;
        this.f84028e = linearLayout3 != null ? (android.widget.TextView) linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.e8r) : null;
        android.widget.LinearLayout linearLayout4 = this.f84026c;
        this.f84029f = linearLayout4 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.e8s) : null;
        android.widget.LinearLayout linearLayout5 = this.f84026c;
        if (linearLayout5 != null && (button = (android.widget.Button) linearLayout5.findViewById(com.p314xaae8f345.mm.R.id.e8o)) != null) {
            button.setOnClickListener(new aa2.a(this));
            button2 = button;
        }
        this.f84025b = button2;
    }
}
