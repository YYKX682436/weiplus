package rl1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f478696a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 f478697b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f478698c = new android.animation.AnimatorSet();

    /* renamed from: d, reason: collision with root package name */
    public rl1.h f478699d = new rl1.h();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r7.add(a(r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.util.LinkedList r6, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a r7, com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 r8) {
        /*
            r5 = this;
            r5.<init>()
            r5.f478696a = r7
            r5.f478697b = r8
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r5.f478698c = r7
            rl1.h r7 = new rl1.h
            r7.<init>()
            r5.f478699d = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r6.next()
            vc1.x1 r8 = (vc1.x1) r8
            float r0 = r8.f516743e
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L57
            double r1 = r8.f516742d
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L57
            double r1 = r8.f516741c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L57
            android.animation.ValueAnimator r0 = r5.b(r8)
            android.animation.ValueAnimator r8 = r5.a(r8)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r8 = r1.play(r8)
            r8.with(r0)
            r7.add(r1)
            goto L1e
        L57:
            if (r0 == 0) goto L61
            android.animation.ValueAnimator r8 = r5.a(r8)
            r7.add(r8)
            goto L1e
        L61:
            android.animation.ValueAnimator r8 = r5.b(r8)
            r7.add(r8)
            goto L1e
        L69:
            android.animation.AnimatorSet r6 = r5.f478698c
            r6.playSequentially(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.e.<init>(java.util.LinkedList, com.tencent.mapsdk.raster.model.Marker, com.tencent.mm.plugin.location_soso.api.SoSoMapView):void");
    }

    public android.animation.ValueAnimator a(vc1.x1 x1Var) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = this.f478696a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(interfaceC4409x88f1805a.mo37235x79734cf4(), interfaceC4409x88f1805a.mo37235x79734cf4() + x1Var.f516743e);
        ofFloat.setDuration(x1Var.f516744f);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new rl1.d(this));
        return ofFloat;
    }

    public android.animation.ValueAnimator b(vc1.x1 x1Var) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] c4406x873d1d26Arr = {new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(x1Var.f516740b, x1Var.f516739a), new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(x1Var.f516742d, x1Var.f516741c)};
        rl1.g a17 = this.f478699d.a(c4406x873d1d26Arr[0]);
        rl1.g a18 = this.f478699d.a(c4406x873d1d26Arr[1]);
        double[] dArr = new double[1];
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f mo98900x78d58245 = this.f478697b.mo98900x78d58245();
        double d17 = 0.0d;
        int i17 = 0;
        while (i17 < 1) {
            int i18 = i17 + 1;
            double mo98923x69db0a53 = mo98900x78d58245.mo98923x69db0a53(c4406x873d1d26Arr[i17], c4406x873d1d26Arr[i18]);
            dArr[i17] = mo98923x69db0a53;
            d17 += mo98923x69db0a53;
            i17 = i18;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration((long) ((x1Var.f516744f * dArr[0]) / d17));
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setFloatValues((float) dArr[0]);
        valueAnimator.addUpdateListener(new rl1.c(this, a17, a18, dArr));
        return valueAnimator;
    }
}
