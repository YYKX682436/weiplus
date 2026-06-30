package px2;

/* loaded from: classes2.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c f440434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c) {
        super(1);
        this.f440434d = c15413x7c45044c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar;
        in5.s0 s0Var;
        float floatValue = ((java.lang.Number) obj).floatValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c.C1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c = this.f440434d;
        c15413x7c45044c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalVideoPreviewLayout", "handleSpeedIndicatorClick: clickedSpeed=" + floatValue);
        px2.v0 v0Var = c15413x7c45044c.callback;
        if (v0Var != null && (s0Var = (ptVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215336b).f217149q) != null) {
            android.view.View view = ptVar.f217146n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) view : null;
            if (c15188xd8bd4bd != null) {
                android.content.Context context = c15413x7c45044c.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 k60Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216458e;
                kz5.p0 p0Var = kz5.p0.f395529d;
                ow2.h hVar = c15413x7c45044c.W;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15477xbd78f833);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.a7(c15477xbd78f833, s0Var, p0Var, c15188xd8bd4bd, k60Var, null, hVar, 16, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
