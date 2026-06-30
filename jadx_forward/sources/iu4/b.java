package iu4;

/* loaded from: classes9.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f376547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 f376548e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6, java.util.List list) {
        this.f376548e = viewOnClickListenerC19201x9aa113d6;
        this.f376547d = list;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6 = this.f376548e;
        if (i18 == 0) {
            viewOnClickListenerC19201x9aa113d6.f262850o = false;
            viewOnClickListenerC19201x9aa113d6.f262851p = 0;
            hu4.i.g();
            hu4.i.e();
            hu4.i.f();
            viewOnClickListenerC19201x9aa113d6.f262849n = this.f376547d;
            viewOnClickListenerC19201x9aa113d6.f262844f = 1;
            viewOnClickListenerC19201x9aa113d6.Y6();
        } else if (i18 == -3) {
            viewOnClickListenerC19201x9aa113d6.f262851p++;
            viewOnClickListenerC19201x9aa113d6.f262844f = 2;
            viewOnClickListenerC19201x9aa113d6.Y6();
        } else {
            dp.a.m125854x26a183b(viewOnClickListenerC19201x9aa113d6, viewOnClickListenerC19201x9aa113d6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.frc), 0).show();
        }
        return 0;
    }
}
