package sx3;

/* loaded from: classes10.dex */
public final class d implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f495086d;

    public d(sx3.m mVar) {
        this.f495086d = mVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        sx3.m mVar = this.f495086d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((sx3.b) pf5.z.f435481a.a(activity).a(sx3.b.class)).f495080e) {
            mVar.O6().e(true);
        } else {
            mVar.O6().f();
        }
        mVar.O6().i(true);
        mVar.O6().m82914x4c6bcf83().f411726c = false;
        if (list == null) {
            mVar.Q6();
            return;
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) mVar.f495098d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mVar.P6().setVisibility(0);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.l.d(mVar.m158345xefc66565(), null, null, new sx3.c(mVar, (ox3.g) it.next(), null), 3, null);
        }
    }
}
