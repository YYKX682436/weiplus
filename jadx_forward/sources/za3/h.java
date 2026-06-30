package za3;

/* loaded from: classes5.dex */
public class h implements za3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f552454d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f552455e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f552456f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f552457g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageButton f552458h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f552459i;

    public h(ab3.h hVar, android.content.Context context) {
        android.view.View findViewById = ((android.app.Activity) context).findViewById(com.p314xaae8f345.mm.R.id.in_);
        this.f552456f = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.in8);
        this.f552457g = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.in9);
        this.f552458h = (android.widget.ImageButton) findViewById.findViewById(com.p314xaae8f345.mm.R.id.inh);
        this.f552459i = (android.view.ViewGroup) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ini);
        this.f552454d = findViewById;
    }

    @Override // za3.c
    /* renamed from: getPreText */
    public java.lang.String mo65930x2ac69e3a() {
        return "";
    }

    @Override // za3.c
    /* renamed from: setText */
    public void mo65933x765074af(java.lang.String str) {
        android.view.View view = this.f552454d;
        view.getWidth();
        view.getHeight();
        if (str != null && !str.equals("")) {
            this.f552457g.setText(str);
        }
        java.lang.String str2 = this.f552455e;
        android.widget.TextView textView = this.f552456f;
        if (str2 == null || str2.equals("")) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ggg);
        } else {
            textView.setText(this.f552455e);
        }
        android.view.View view2 = this.f552454d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/NewItemOverlay", "initInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/NewItemOverlay", "initInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.invalidate();
    }
}
