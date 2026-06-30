package ob3;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob3.n f425605d;

    public m(ob3.n nVar) {
        this.f425605d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob3.n nVar = this.f425605d;
        android.view.View view = nVar.f425610h.f226573t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nVar.f425608f.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = nVar.f425610h;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3 = activityC16326x540b7c63.f226571r;
        if (c27990xda3033a3 != null) {
            c27990xda3033a3.m121469xce4186ff(nVar.f425607e);
        }
        activityC16326x540b7c63.f226571r.m121476x53eb72f9(nVar.f425609g);
    }
}
