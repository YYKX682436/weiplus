package yv0;

/* loaded from: classes5.dex */
public final class k implements yv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 f547508a;

    public k(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 c10943x503f3e16) {
        this.f547508a = c10943x503f3e16;
    }

    @Override // yv0.a
    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a targetTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetTime, "targetTime");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(this.f547508a, targetTime, false, 2, null);
    }

    @Override // yv0.a
    public void b(double d17, boolean z17) {
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16.L;
        fy0.r scrollHelper = this.f547508a.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.d(d17, z17);
        }
    }
}
