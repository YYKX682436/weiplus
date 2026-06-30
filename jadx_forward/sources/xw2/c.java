package xw2;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 f539220d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664) {
        this.f539220d = c15387x98533664;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664 = this.f539220d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c15387x98533664.getAdapter();
            if ((adapter != null ? adapter.mo1894x7e414b06() : 0) > 1) {
                int focusPosition = c15387x98533664.getFocusPosition() + 1;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter2 = c15387x98533664.getAdapter();
                if (focusPosition < (adapter2 != null ? adapter2.mo1894x7e414b06() : 0)) {
                    c15387x98533664.a(focusPosition, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664.b(c15387x98533664, 0L, 1, null);
                } else {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter3 = c15387x98533664.getAdapter();
                    if (focusPosition == (adapter3 != null ? adapter3.mo1894x7e414b06() : 0)) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter4 = c15387x98533664.getAdapter();
                        if (adapter4 instanceof eb5.d) {
                            try {
                                ((eb5.d) adapter4).mo8165x48eac7b3(c15387x98533664.f213247o);
                            } catch (java.lang.Exception unused) {
                            }
                            eb5.d dVar = (eb5.d) adapter4;
                            int mo1894x7e414b06 = dVar.mo1894x7e414b06();
                            dVar.f332454d.add(mo1894x7e414b06, dVar.f332454d.get(0));
                            dVar.m8149x8b456734(mo1894x7e414b06);
                            c15387x98533664.getRecyclerView().m7964x8d4ad49c(null);
                            c15387x98533664.a(focusPosition, false);
                            java.lang.Object obj = it.obj;
                            java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
                            c15387x98533664.postDelayed(new xw2.b(adapter4, c15387x98533664), (l17 != null ? l17.longValue() : 2500L) / 5);
                        }
                    }
                }
            }
        }
        return true;
    }
}
