package mh2;

/* loaded from: classes10.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f407993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407994e;

    public t0(mh2.f1 f1Var, java.lang.String str) {
        this.f407993d = f1Var;
        this.f407994e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVSingingWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC0065xcd7aa112).a(pl2.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            pl2.x xVar = (pl2.x) a17;
            if (xVar.f438216f) {
                xVar.f438220m.f438211h = 3;
                pl2.s sVar = xVar.f438217g;
                if (sVar != null) {
                    pl2.s.e(sVar, 0L, null, 3, null);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVSingingWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        mh2.f1 f1Var = this.f407993d;
        f1Var.k(2);
        f1Var.f407861c.j(fn2.u1.f345946h, this.f407994e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVSingingWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
