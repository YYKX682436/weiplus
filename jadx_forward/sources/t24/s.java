package t24;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f496864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f496867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t24.u f496868h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wd0.x1 f496869i;

    public s(in5.s0 s0Var, java.lang.String str, java.lang.String str2, int i17, t24.u uVar, wd0.x1 x1Var) {
        this.f496864d = s0Var;
        this.f496865e = str;
        this.f496866f = str2;
        this.f496867g = i17;
        this.f496868h = uVar;
        this.f496869i = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSearchConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f496864d;
        android.content.Context context = s0Var.f374654e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f3 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context : null;
        if (abstractActivityC17509x7e1428f3 != null && (intent4 = abstractActivityC17509x7e1428f3.getIntent()) != null) {
            intent4.putExtra("cell_source_type", 1);
        }
        android.content.Context context2 = s0Var.f374654e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f32 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context2 : null;
        if (abstractActivityC17509x7e1428f32 != null && (intent3 = abstractActivityC17509x7e1428f32.getIntent()) != null) {
            intent3.putExtra("search_word", this.f496865e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f33 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context2 : null;
        if (abstractActivityC17509x7e1428f33 != null && (intent2 = abstractActivityC17509x7e1428f33.getIntent()) != null) {
            intent2.putExtra("search_query_id", this.f496866f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f34 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context2 : null;
        if (abstractActivityC17509x7e1428f34 != null && (intent = abstractActivityC17509x7e1428f34.getIntent()) != null) {
            intent.putExtra("search_index", this.f496867g + 1);
        }
        ((vd0.l3) ((wd0.y1) ((jz5.n) this.f496868h.f496873g).mo141623x754a37bb())).Ui(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2 : null, this.f496869i);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSearchConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
