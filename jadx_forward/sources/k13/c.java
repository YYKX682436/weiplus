package k13;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f384730d;

    public c(k13.g gVar) {
        this.f384730d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        k13.g gVar = this.f384730d;
        if (gVar.f384745f) {
            gVar.f384745f = false;
            android.view.View view = gVar.f384744e;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            try {
                ((android.view.WindowManager) ((jz5.n) gVar.f384748i).mo141623x754a37bb()).removeView(gVar.f384744e);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ForceNotify.BaseWindow", "detach from window failed");
            }
            k13.l1 l1Var = (k13.l1) gVar;
            l1Var.h().mo50302x6b17ad39(null);
            l1Var.s();
            java.util.ArrayList arrayList2 = l1Var.f384772q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
            arrayList2.clear();
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((i13.c) it.next()).o();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = l1Var.f384769n;
            if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            l1Var.f384769n = null;
            gVar.f384744e = null;
        }
    }
}
