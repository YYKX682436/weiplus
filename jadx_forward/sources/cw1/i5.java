package cw1;

/* loaded from: classes11.dex */
public final class i5 extends p012xc85e97e9.p087x9da2e250.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83[] f304534d;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13119xe838701 activityC13119xe838701, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        super(abstractC1104xc1ad431d, 1);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83[] c22584xf7d97e83Arr = {lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354.class, new android.content.Intent().putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2), false, false, false, null, 60, null), lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.class, new android.content.Intent().putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2), false, false, false, null, 60, null)};
        this.f304534d = c22584xf7d97e83Arr;
        for (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 : c22584xf7d97e83Arr) {
            c22584xf7d97e83.q0(new cw1.h5(c22584xf7d97e83, activityC13119xe838701));
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return 2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        return this.f304534d[i17];
    }
}
