package qd2;

/* loaded from: classes2.dex */
public abstract class k {
    public static final void a(android.app.Activity activity, android.view.View anchor, java.lang.CharSequence menuTitle, yz5.a onConfirm) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuTitle, "menuTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirm, "onConfirm");
        rl5.r rVar = new rl5.r(activity);
        int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        int i18 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        int i19 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFollowAggregationHelper", "showFollowItemPopup at (" + i18 + ", " + i19 + "), title=" + ((java.lang.Object) menuTitle));
        rVar.h(anchor, new qd2.i(0, menuTitle), new qd2.j(0, onConfirm), i18, i19);
    }
}
