package gt4;

/* loaded from: classes.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f356960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f356961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f356962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f356963g;

    public f(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f356960d = linearLayout;
        this.f356961e = linearLayout2;
        this.f356962f = textView;
        this.f356963g = textView2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356960d.setVisibility(0);
        this.f356961e.setVisibility(8);
        this.f356962f.setText("");
        this.f356963g.setText("");
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
