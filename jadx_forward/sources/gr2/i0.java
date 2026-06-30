package gr2;

/* loaded from: classes10.dex */
public final class i0 implements ls5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nn0.c f356309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 f356310b;

    public i0(nn0.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393) {
        this.f356309a = cVar;
        this.f356310b = c14572x50388393;
    }

    @Override // ls5.l
    public boolean a() {
        android.content.Context context = this.f356309a.f411338d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return false;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.B;
        this.f356310b.getClass();
        return (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78542x6d20d943() : activity.isDestroyed()) ^ true;
    }
}
