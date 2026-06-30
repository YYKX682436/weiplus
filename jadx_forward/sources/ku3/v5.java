package ku3;

/* loaded from: classes3.dex */
public final class v5 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.c6 f393972d;

    public v5(ku3.c6 c6Var) {
        this.f393972d = c6Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordTopOutsideMenuPlugin", "MENU_HDR >> " + cVar.f557121b);
        boolean z17 = cVar.f557121b;
        ku3.c6 c6Var = this.f393972d;
        if (!z17) {
            android.view.View b17 = c6Var.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb = ((jz5.n) c6Var.f393720h).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View b18 = c6Var.b();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(b18, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(b18, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c6Var.a().getVisibility() == 0) {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) c6Var.f393720h).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$1$2", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
