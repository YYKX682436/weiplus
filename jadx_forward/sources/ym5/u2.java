package ym5;

/* loaded from: classes10.dex */
public final class u2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 f545081d;

    public u2(com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810) {
        this.f545081d = c22792x31410810;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810 = this.f545081d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c22792x31410810.getAdapter();
            if ((adapter != null ? adapter.mo1894x7e414b06() : 0) > 1) {
                int focusPosition = c22792x31410810.getFocusPosition() + 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaBanner", "[handleMsg] targetPosition:" + focusPosition);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter2 = c22792x31410810.getAdapter();
                if (focusPosition < (adapter2 != null ? adapter2.mo1894x7e414b06() : 0)) {
                    c22792x31410810.a(focusPosition, true);
                    c22792x31410810.b();
                } else {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter3 = c22792x31410810.getAdapter();
                    if (focusPosition == (adapter3 != null ? adapter3.mo1894x7e414b06() : 0)) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter4 = c22792x31410810.getAdapter();
                        if (adapter4 instanceof eb5.d) {
                            try {
                                adapter4.mo8165x48eac7b3(c22792x31410810.getDataObserver());
                            } catch (java.lang.Exception unused) {
                            }
                            eb5.d dVar = (eb5.d) adapter4;
                            int mo1894x7e414b06 = dVar.mo1894x7e414b06();
                            dVar.f332454d.add(mo1894x7e414b06, dVar.f332454d.get(0));
                            dVar.m8149x8b456734(mo1894x7e414b06);
                            c22792x31410810.getPagerView().m7964x8d4ad49c(null);
                            c22792x31410810.a(focusPosition, false);
                            c22792x31410810.postDelayed(new ym5.t2(adapter4, c22792x31410810), 500L);
                        }
                    }
                }
            }
        }
        return true;
    }
}
