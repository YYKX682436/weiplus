package xt2;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xt2.a0 f538144a = new xt2.a0();

    public final java.lang.Object a(android.widget.TextView textView, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        textView.setText("x" + j17);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.3f);
        ofFloat.addUpdateListener(new xt2.x(textView));
        ofFloat.setDuration(80L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.3f, 1.0f);
        ofFloat2.addUpdateListener(new xt2.x(textView));
        ofFloat2.setDuration(40L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.start();
        animatorSet.addListener(new xt2.w(nVar));
        java.lang.Object j18 = rVar.j();
        return j18 == pz5.a.f440719d ? j18 : jz5.f0.f384359a;
    }

    public final long b(long j17, r45.n32 animInfo) {
        java.util.Map map;
        java.lang.Long l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animInfo, "animInfo");
        mm2.f6 f6Var = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
        if (f6Var != null && (map = f6Var.D1) != null) {
            java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
            if (map2 != null && (l17 = (java.lang.Long) map2.get(java.lang.Integer.valueOf(animInfo.m75939xb282bd08(4)))) != null) {
                return l17.longValue();
            }
        }
        return animInfo.m75942xfb822ef2(2);
    }

    public final boolean c(long j17, r45.n32 n32Var, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (n32Var == null) {
            return false;
        }
        long b17 = b(j17, n32Var);
        n32Var.m75942xfb822ef2(3);
        boolean d17 = d(n32Var.m75939xb282bd08(5), b17, n32Var.m75942xfb822ef2(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShopCountDownAnimHelper", "isAnimValid from source " + source + ", startNum = " + b17 + ", animInfo = " + n32Var.mo12245xcc313de3() + ", valid = " + d17);
        return d17;
    }

    public final boolean d(int i17, long j17, long j18) {
        boolean z17 = true;
        if (i17 != 0 && (i17 == 1 ? j18 <= j17 : i17 != 2 || j18 >= j17)) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShopCountDownAnimHelper", "isNumChangeValid, startNum = " + j17 + ", endNum = " + j18 + ", expectedDirection = " + i17 + ", valid = " + z17);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
    
        if (r9 > r18) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0141, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0143, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015b, code lost:
    
        r7.f538656d = r1;
        r7.f538657e = r0;
        r7.f538658f = r4;
        r7.f538659g = r5;
        r7.f538660h = r2;
        r7.f538661i = r14;
        r7.f538662m = r10;
        r7.f538663n = r6;
        r7.f538666q = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0172, code lost:
    
        if (r1.a(r0, r10, r7) != r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0174, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0175, code lost:
    
        r24 = r14;
        r15 = r0;
        r14 = r4;
        r0 = r5;
        r4 = r24;
        r26 = r2;
        r2 = r10;
        r10 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0158, code lost:
    
        if (r9 < r18) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0242 -> B:17:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.widget.TextView r29, long r30, r45.n32 r32, java.lang.String r33, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r34) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.a0.e(android.widget.TextView, long, r45.n32, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        if (r13 > r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0126, code lost:
    
        r3.f538636d = r2;
        r3.f538637e = r0;
        r3.f538638f = r1;
        r3.f538639g = r11;
        r3.f538640h = r13;
        r3.f538641i = r8;
        r3.f538644o = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0139, code lost:
    
        if (r2.a(r0, r13, r3) != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013c, code lost:
    
        r6 = r0;
        r15 = r2;
        r0 = r8;
        r19 = r11;
        r11 = r13;
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (r13 < r9) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x015c -> B:17:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.widget.TextView r22, r45.n32 r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.a0.f(android.widget.TextView, r45.n32, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
