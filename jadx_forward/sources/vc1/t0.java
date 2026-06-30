package vc1;

/* loaded from: classes13.dex */
public class t0 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516706a;

    public t0(vc1.p1 p1Var) {
        this.f516706a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapClickListener
    /* renamed from: onMapClick */
    public void mo14567xae384c8b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        vc1.o2 o2Var;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        vc1.p1 p1Var = this.f516706a;
        for (vc1.o1 o1Var : ((java.util.concurrent.ConcurrentHashMap) p1Var.Y).values()) {
            vc1.q2 q2Var = o1Var.f516558b;
            if (q2Var != null && (o2Var = q2Var.f516681s) != null && o2Var.f516580n == 0 && (interfaceC4409x88f1805a = o1Var.f516563c) != null && interfaceC4409x88f1805a.mo37243x4a284ae9()) {
                o1Var.f516563c.mo37241xa1cc0120();
            }
        }
        vc1.e2 e2Var = p1Var.H;
        if (e2Var != null) {
            e2Var.a(c4406x873d1d26.m37196x79d7af9(), c4406x873d1d26.m37195x2605e9e2());
        }
    }
}
