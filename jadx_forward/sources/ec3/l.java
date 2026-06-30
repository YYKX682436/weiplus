package ec3;

/* loaded from: classes9.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f332579d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f332580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static void O6(ec3.l lVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((ec3.g1) zVar.a(activity).a(ec3.g1.class)).mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udo);
        boolean z17 = relativeLayout != null && relativeLayout.getVisibility() == 0;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        boolean O6 = ((ec3.g1) zVar.a(activity2).a(ec3.g1.class)).O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        boolean z18 = ((ec3.g1) zVar.a(activity3).a(ec3.g1.class)).f332553q;
        if (!O6 && z18) {
            if (!z17) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = lVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                ((ec3.g1) zVar.a(activity4).a(ec3.g1.class)).V6();
            }
            ec3.r1.f332620a.c((android.widget.RelativeLayout) lVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udp), ec3.m.f332585f, lVar.m158354x19263085(), new ec3.e(aVar));
            if (lVar.f332579d) {
                return;
            }
            lVar.f332579d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = 11;
            objArr[1] = 0;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
            objArr[2] = activityC16373x8a110f13 != null ? activityC16373x8a110f13.T1 : null;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = lVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
            objArr[3] = activityC16373x8a110f132 != null ? activityC16373x8a110f132.s7() : null;
            objArr[4] = lVar.f332580e;
            objArr[5] = "";
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
            objArr[6] = ((ec3.g1) zVar.a(activity5).a(ec3.g1.class)).Z6();
            objArr[7] = 0;
            objArr[8] = "";
            objArr[9] = 0;
            objArr[10] = "";
            objArr[11] = 0;
            g0Var.d(18890, objArr);
        }
    }
}
