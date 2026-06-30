package ox3;

/* loaded from: classes4.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f431308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f431310f;

    public v(ox3.f0 f0Var, in5.s0 s0Var, ox3.g gVar) {
        this.f431308d = f0Var;
        this.f431309e = s0Var;
        this.f431310f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f431308d.f431275f.mo149xb9724478(java.lang.Integer.valueOf(this.f431309e.m8183xf806b362()), this.f431310f);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
