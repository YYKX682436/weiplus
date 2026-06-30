package iu4;

/* loaded from: classes9.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 f376579d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6) {
        this.f376579d = viewOnClickListenerC19201x9aa113d6;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6 = this.f376579d;
        viewOnClickListenerC19201x9aa113d6.f262852q = null;
        viewOnClickListenerC19201x9aa113d6.f262848m = null;
        if (i18 == 0) {
            dp.a.m125854x26a183b(viewOnClickListenerC19201x9aa113d6, viewOnClickListenerC19201x9aa113d6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.frt), 0).show();
            viewOnClickListenerC19201x9aa113d6.a7(-1, 0, "open gesture ok");
        } else {
            dp.a.m125854x26a183b(viewOnClickListenerC19201x9aa113d6, viewOnClickListenerC19201x9aa113d6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.frb), 0).show();
            viewOnClickListenerC19201x9aa113d6.a7(-1, -1, "open gesture failed");
        }
        return 0;
    }
}
