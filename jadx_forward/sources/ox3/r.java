package ox3;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.g f431303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.s f431305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f431306g;

    public r(ox3.g gVar, in5.s0 s0Var, ox3.s sVar, int i17) {
        this.f431303d = gVar;
        this.f431304e = s0Var;
        this.f431305f = sVar;
        this.f431306g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneHistorySelectTingConverter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ox3.g gVar = this.f431303d;
        gVar.f431286h = !gVar.f431286h;
        ((android.widget.CheckBox) this.f431304e.p(com.p314xaae8f345.mm.R.id.btf)).setChecked(gVar.f431286h);
        this.f431305f.f431307e.mo149xb9724478(java.lang.Integer.valueOf(this.f431306g), gVar);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneHistorySelectTingConverter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
