package bp2;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f104583d;

    public h(bp2.i iVar) {
        this.f104583d = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r2 > 1.0f) goto L14;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            bp2.i r0 = r12.f104583d
            android.animation.AnimatorSet r1 = r0.f104588e
            if (r1 == 0) goto L9
            r1.pause()
        L9:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f104596m
            long r1 = r1 - r3
            float r1 = (float) r1
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = r4
        L1b:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 300(0x12c, double:1.48E-321)
            if (r2 == 0) goto L22
            goto L2a
        L22:
            float r2 = r1 * r5
            float r8 = (float) r6
            float r2 = r2 / r8
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 <= 0) goto L2b
        L2a:
            r2 = r5
        L2b:
            float r8 = r0.f104594k
            float r8 = r8 - r5
            float r8 = r8 * r2
            float r8 = r8 + r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "createReverseAnimationSet reverseRatio:"
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r2 = " reverseScaleRatio:"
            r9.append(r2)
            r9.append(r8)
            java.lang.String r2 = " ["
            r9.append(r2)
            r9.append(r1)
            java.lang.String r1 = "/300]"
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r2 = "FinderLiveCardPreViewAnimationHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r1 = r0.f104590g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r2 = 2
            float[] r9 = new float[r2]
            r9[r4] = r8
            r9[r3] = r5
            java.lang.String r10 = "scaleX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r10, r9)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r9 = r0.f104590g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
            float[] r10 = new float[r2]
            r10[r4] = r8
            r10[r3] = r5
            java.lang.String r5 = "scaleY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r9, r5, r10)
            int r9 = r0.f104593j
            android.content.Context r10 = r0.f104584a
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131102542(0x7f060b4e, float:1.7817525E38)
            int r10 = r10.getColor(r11)
            android.animation.ArgbEvaluator r11 = new android.animation.ArgbEvaluator
            r11.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofObject(r11, r9)
            if (r9 == 0) goto La9
            bp2.e r10 = new bp2.e
            r10.<init>(r0)
            r9.addUpdateListener(r10)
        La9:
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            float r6 = (float) r6
            float r6 = r6 * r8
            long r6 = (long) r6
            r10.setDuration(r6)
            r6 = 3
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r4] = r9
            r6[r3] = r1
            r6[r2] = r5
            r10.playTogether(r6)
            bp2.f r1 = new bp2.f
            r1.<init>(r0)
            r10.addListener(r1)
            r0.f104588e = r10
            r10.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bp2.h.run():void");
    }
}
