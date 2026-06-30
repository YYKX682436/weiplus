package gt4;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.k f356950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f356951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f356954h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356955i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f356956m;

    public e(gt4.k kVar, android.widget.EditText editText, java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var) {
        this.f356950d = kVar;
        this.f356951e = editText;
        this.f356952f = str;
        this.f356953g = str2;
        this.f356954h = textView;
        this.f356955i = context;
        this.f356956m = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.k kVar = this.f356950d;
        if (kVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w0) kVar).a(false, this.f356951e.getText().toString().trim(), this.f356952f, this.f356953g, this.f356954h.getText().toString().trim());
        }
        gt4.l.a(this.f356955i, this.f356956m.f293531c);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
