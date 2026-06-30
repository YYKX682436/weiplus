package ox3;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f431313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f431315f;

    public x(ox3.f0 f0Var, in5.s0 s0Var, ox3.g gVar) {
        this.f431313d = f0Var;
        this.f431314e = s0Var;
        this.f431315f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ox3.f0 f0Var = this.f431313d;
        in5.s0 s0Var = this.f431314e;
        pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.w(f0Var, s0Var));
        f0Var.f431276g.mo149xb9724478(java.lang.Integer.valueOf(s0Var.m8183xf806b362()), this.f431315f);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
