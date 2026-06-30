package gt4;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.k f356942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f356943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f356945g;

    public d(gt4.k kVar, android.widget.EditText editText, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var) {
        this.f356942d = kVar;
        this.f356943e = editText;
        this.f356944f = context;
        this.f356945g = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.k kVar = this.f356942d;
        if (kVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w0) kVar).a(true, this.f356943e.getText().toString().trim(), null, null, null);
        }
        gt4.l.a(this.f356944f, this.f356945g.f293531c);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
