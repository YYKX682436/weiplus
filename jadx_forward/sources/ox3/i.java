package ox3;

/* loaded from: classes4.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.k f431290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f431292f;

    public i(ox3.k kVar, in5.s0 s0Var, ox3.g gVar) {
        this.f431290d = kVar;
        this.f431291e = s0Var;
        this.f431292f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f431290d.f431295f.mo149xb9724478(java.lang.Integer.valueOf(this.f431291e.m8183xf806b362()), this.f431292f);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
