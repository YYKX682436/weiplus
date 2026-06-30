package ox3;

/* loaded from: classes4.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.k f431287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f431289f;

    public h(ox3.k kVar, in5.s0 s0Var, ox3.g gVar) {
        this.f431287d = kVar;
        this.f431288e = s0Var;
        this.f431289f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f431287d.f431296g.mo149xb9724478(java.lang.Integer.valueOf(this.f431288e.m8183xf806b362()), this.f431289f);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
