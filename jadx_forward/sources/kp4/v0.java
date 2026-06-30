package kp4;

/* loaded from: classes10.dex */
public final class v0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 f392685d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0) {
        this.f392685d = c18814xdf4aba0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int action = e17.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392685d;
        if (action == 0) {
            kp4.t0 callback = c18814xdf4aba0.getCallback();
            if (callback == null) {
                return false;
            }
            callback.mo10993x65825f6();
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18814xdf4aba0.f257588e;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        if (c1163xf1deaba4.mo7958x54496c8e() != 0) {
            c18814xdf4aba0.getClass();
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0.a(c18814xdf4aba0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18814xdf4aba0.f257587d, "onInterceptTouchEvent crop: " + c18814xdf4aba0.f257596p + ", " + c18814xdf4aba0.f257597q);
        kp4.t0 callback2 = c18814xdf4aba0.getCallback();
        if (callback2 != null) {
            callback2.b(c18814xdf4aba0.f257596p, c18814xdf4aba0.f257597q);
        }
        c18814xdf4aba0.getClass();
        return false;
    }
}
