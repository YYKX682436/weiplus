package cr2;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f303424e;

    public t(cr2.x xVar, android.content.res.Configuration configuration) {
        this.f303423d = xVar;
        this.f303424e = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cr2.x xVar = this.f303423d;
        java.lang.String str = xVar.f303434g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged post orientation: ");
        sb6.append(this.f303424e.orientation);
        sb6.append(" width: ");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = xVar.f303440m;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        sb6.append(c22849x81a93d25.getWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.AbstractC14565x91bfdb1c abstractC14565x91bfdb1c = xVar.f303446s;
        if (abstractC14565x91bfdb1c != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = xVar.f303440m;
            if (c22849x81a93d252 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c22849x81a93d252.getWidth());
            java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
            abstractC14565x91bfdb1c.mo58439x213e8414(num != null ? num.intValue() : com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x);
        }
        cr2.a aVar = xVar.f303445r;
        if (aVar != null) {
            aVar.f295250v.clear();
        }
        cr2.a aVar2 = xVar.f303445r;
        if (aVar2 != null) {
            aVar2.m8146xced61ae5();
        }
    }
}
