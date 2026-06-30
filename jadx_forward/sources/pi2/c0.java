package pi2;

/* loaded from: classes10.dex */
public final class c0 extends ni2.h0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View rootView, zh2.c pluginAbility, yz5.p notifyViewClick) {
        super(rootView, pluginAbility, notifyViewClick);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyViewClick, "notifyViewClick");
        android.view.View view = this.f418842h;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicModeSelectWidget", "<init>", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicLinkPluginAbility;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicModeSelectWidget", "<init>", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicLinkPluginAbility;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
