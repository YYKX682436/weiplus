package um2;

/* loaded from: classes3.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f510299e;

    public d5(um2.x5 x5Var, java.lang.Integer num) {
        this.f510298d = x5Var;
        this.f510299e = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        fm2.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = ((mm2.o4) this.f510298d.c(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        um2.x5 x5Var = this.f510298d;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) x5Var.c(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
        }
        boolean z17 = obj != null;
        if (z17) {
            um2.x5 x5Var2 = this.f510298d;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var2.f101138b;
            if ((activityC0065xcd7aa112 instanceof android.app.Activity) && (cVar = x5Var2.f101139c) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type android.app.Activity");
                cVar.m57765x2eb2fa87(activityC0065xcd7aa112, "", this.f510298d.f101138b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eij), "");
            }
        } else {
            dk2.xf h17 = this.f510298d.h();
            if (h17 != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = this.f510298d.f101138b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa1122, "null cannot be cast to non-null type android.app.Activity");
                ((dk2.r4) h17).r(activityC0065xcd7aa1122, false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f510298d.f510565f, "scene:" + this.f510299e + ", click ok linking:" + z17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
