package fw0;

/* loaded from: classes5.dex */
public final class c implements yv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p895x6855c7a2.p896x8438d441.C10945x27e58328 f348573a;

    public c(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p895x6855c7a2.p896x8438d441.C10945x27e58328 c10945x27e58328) {
        this.f348573a = c10945x27e58328;
    }

    @Override // yv0.a
    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a targetTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetTime, "targetTime");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(this.f348573a, targetTime, false, 2, null);
    }

    @Override // yv0.a
    public void b(double d17, boolean z17) {
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p895x6855c7a2.p896x8438d441.C10945x27e58328.E;
        fy0.r scrollHelper = this.f348573a.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.d(d17, z17);
        }
    }
}
