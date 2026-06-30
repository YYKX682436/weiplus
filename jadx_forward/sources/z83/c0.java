package z83;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05 f552267d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05 activityC16163x5c385b05) {
        this.f552267d = activityC16163x5c385b05;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05 activityC16163x5c385b05 = this.f552267d;
        java.lang.String str = activityC16163x5c385b05.f224712f;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("openId");
            throw null;
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format("/pages/home/home.html?scene=register&openid=%s", java.util.Arrays.copyOf(objArr, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegSuccessUI", "goWebUIBtn, path:".concat(format));
        a93.a aVar = a93.a.f83962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16163x5c385b05.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        aVar.a(mo55332x76847179, "", true);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16163x5c385b05.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        aVar.b(mo55332x768471792, "wxaaff6b96fc2cd3c6", format, bb1.d.f4183x366c91de, "2");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
