package uz0;

/* loaded from: classes14.dex */
public final class n implements b0.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final uz0.r f513676a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f513677b;

    /* renamed from: c, reason: collision with root package name */
    public final z.d0 f513678c;

    /* renamed from: d, reason: collision with root package name */
    public final z.p f513679d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f513680e;

    public n(uz0.r layoutInfo, yz5.l maximumFlingDistance, z.d0 decayAnimationSpec, z.p springAnimationSpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutInfo, "layoutInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maximumFlingDistance, "maximumFlingDistance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decayAnimationSpec, "decayAnimationSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(springAnimationSpec, "springAnimationSpec");
        this.f513676a = layoutInfo;
        this.f513677b = maximumFlingDistance;
        this.f513678c = decayAnimationSpec;
        this.f513679d = springAnimationSpec;
        this.f513680e = n0.s4.c(null, null, 2, null);
    }

    public static final boolean b(uz0.n nVar, z.o oVar, uz0.s sVar, int i17, yz5.l lVar) {
        nVar.getClass();
        ((java.lang.Number) oVar.c()).floatValue();
        java.util.Objects.toString(sVar);
        float floatValue = ((java.lang.Number) oVar.c()).floatValue();
        uz0.r rVar = nVar.f513676a;
        int c17 = (floatValue <= 0.0f || sVar.a() != i17) ? (floatValue >= 0.0f || sVar.a() != i17 + (-1)) ? 0 : rVar.c(sVar.a() + 1) : rVar.c(sVar.a());
        if (c17 == 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnapperFlingBehavior", "Scrolled past item. vel:" + ((java.lang.Number) oVar.c()).floatValue() + ", current item: " + sVar + "} target:" + i17);
        lVar.mo146xb9724478(java.lang.Float.valueOf((float) c17));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c3, code lost:
    
        if (r1 >= r0.c(r5.a() + 1)) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0136  */
    @Override // b0.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(b0.p2 r19, float r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.n.a(b0.p2, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float c(float f17) {
        uz0.r rVar = this.f513676a;
        if (f17 < 0.0f && !rVar.b()) {
            return f17;
        }
        if (f17 <= 0.0f || rVar.a()) {
            return 0.0f;
        }
        return f17;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(b0.p2 r25, uz0.s r26, int r27, float r28, boolean r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.n.d(b0.p2, uz0.s, int, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(b0.p2 r26, uz0.s r27, int r28, float r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.n.e(b0.p2, uz0.s, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(java.lang.Integer num) {
        ((n0.q4) this.f513680e).mo148714x53d8522f(num);
    }
}
