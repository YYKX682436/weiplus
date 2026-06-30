package aa2;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f2491a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.Button f2492b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f2493c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f2494d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f2495e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f2496f;

    public b(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f2491a = activity;
    }

    public void a(int i17, java.lang.String str) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f2491a;
        java.lang.String string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.ciw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int color = appCompatActivity.getResources().getColor(com.tencent.mm.R.color.Blue_100);
        if (i17 == -4063) {
            string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.cit);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.widget.TextView textView = this.f2494d;
            if (textView != null) {
                textView.setText(string);
            }
            android.widget.TextView textView2 = this.f2495e;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else if (i17 == -4058) {
            if (str == null) {
                str = appCompatActivity.getResources().getString(com.tencent.mm.R.string.cjq);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            color = appCompatActivity.getResources().getColor(com.tencent.mm.R.color.Red_100);
            string = str;
        }
        android.widget.TextView textView3 = this.f2495e;
        if (textView3 != null) {
            textView3.setText(string);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f2496f;
        if (weImageView == null) {
            return;
        }
        weImageView.setIconColor(color);
    }

    public void b() {
        android.widget.TextView textView;
        android.widget.Button button;
        android.view.View inflate;
        android.view.ViewStub viewStub = (android.view.ViewStub) this.f2491a.findViewById(com.tencent.mm.R.id.e8q);
        android.widget.Button button2 = null;
        android.widget.LinearLayout linearLayout = (viewStub == null || (inflate = viewStub.inflate()) == null) ? null : (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.e8p);
        this.f2493c = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.f2493c;
        if (linearLayout2 == null || (textView = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.e8t)) == null) {
            textView = null;
        } else {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        this.f2494d = textView;
        android.widget.LinearLayout linearLayout3 = this.f2493c;
        this.f2495e = linearLayout3 != null ? (android.widget.TextView) linearLayout3.findViewById(com.tencent.mm.R.id.e8r) : null;
        android.widget.LinearLayout linearLayout4 = this.f2493c;
        this.f2496f = linearLayout4 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout4.findViewById(com.tencent.mm.R.id.e8s) : null;
        android.widget.LinearLayout linearLayout5 = this.f2493c;
        if (linearLayout5 != null && (button = (android.widget.Button) linearLayout5.findViewById(com.tencent.mm.R.id.e8o)) != null) {
            button.setOnClickListener(new aa2.a(this));
            button2 = button;
        }
        this.f2492b = button2;
    }
}
