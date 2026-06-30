package nm4;

/* loaded from: classes13.dex */
public final class i implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 f420029a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731) {
        this.f420029a = c18735xc3936731;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = this.f420029a;
        if (zVar != null) {
            android.view.View view = c18735xc3936731.f256392q;
            if (view != null) {
                view.setBackgroundColor(zVar.f343128a);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryPagCoverBg");
                throw null;
            }
        }
        android.view.View view2 = c18735xc3936731.f256392q;
        if (view2 != null) {
            view2.setBackground(null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryPagCoverBg");
            throw null;
        }
    }
}
