package ni2;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.d0 f418785d;

    public a0(ni2.d0 d0Var) {
        this.f418785d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLisencePanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ni2.d0 d0Var = this.f418785d;
        if (d0Var.f418809r != 1) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(d0Var.f199914d, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
            android.view.View view2 = d0Var.f418806o;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceContainer");
                throw null;
            }
            view2.startAnimation(loadAnimation);
        } else {
            d0Var.getClass();
            ae2.in.f85221a.C0(d0Var.f418809r);
            qo0.c cVar = d0Var.f418802h;
            qo0.b bVar = qo0.b.V3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", d0Var.f418807p);
            hi2.b bVar2 = d0Var.f418808q;
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", bVar2 != null ? bVar2.f363039a : null);
            hi2.b bVar3 = d0Var.f418808q;
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", bVar3 != null ? bVar3.f363040b : false);
            cVar.mo46557x60d69242(bVar, bundle);
            d0Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLisencePanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
