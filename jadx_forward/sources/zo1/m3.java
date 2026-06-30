package zo1;

/* loaded from: classes5.dex */
public final class m3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        super(1);
        this.f556225d = activityC12872x8baa24f8;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "On expansion changed, isExpand=" + booleanValue);
        android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
        autoTransition.setDuration(200L);
        autoTransition.setInterpolator((android.animation.TimeInterpolator) new android.view.animation.LinearInterpolator());
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556225d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC12872x8baa24f8.f174385i;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarRv");
            throw null;
        }
        android.view.ViewParent parent = c1163xf1deaba4.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) parent, autoTransition);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = activityC12872x8baa24f8.f174385i;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarRv");
            throw null;
        }
        if (booleanValue) {
            layoutManager = activityC12872x8baa24f8.f174391r;
            if (layoutManager == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarLayoutManagerGrid");
                throw null;
            }
        } else {
            layoutManager = activityC12872x8baa24f8.f174390q;
            if (layoutManager == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarLayoutManagerLinear");
                throw null;
            }
        }
        c1163xf1deaba42.mo7967x900dcbe1(layoutManager);
        return jz5.f0.f384359a;
    }
}
