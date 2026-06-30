package ku3;

/* loaded from: classes3.dex */
public final class u5 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.c6 f393959d;

    public u5(ku3.c6 c6Var) {
        this.f393959d = c6Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordTopOutsideMenuPlugin", "MENU_LIGHT >> " + cVar.f557121b);
        boolean z17 = cVar.f557121b;
        ku3.c6 c6Var = this.f393959d;
        if (z17) {
            c6Var.a().setVisibility(0);
            return;
        }
        c6Var.a().setVisibility(8);
        java.lang.Object mo141623x754a37bb = ((jz5.n) c6Var.f393720h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
