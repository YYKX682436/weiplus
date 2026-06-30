package hg2;

/* loaded from: classes3.dex */
public final class l extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f362902m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f362903n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(hg2.l r6, int r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof hg2.j
            if (r0 == 0) goto L16
            r0 = r8
            hg2.j r0 = (hg2.j) r0
            int r1 = r0.f362896h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f362896h = r1
            goto L1b
        L16:
            hg2.j r0 = new hg2.j
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f362894f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f362896h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.f362893e
            java.lang.Object r6 = r0.f362892d
            hg2.l r6 = (hg2.l) r6
            goto L35
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
        L38:
            if (r7 <= 0) goto L57
            android.widget.TextView r8 = r6.f362903n
            if (r8 != 0) goto L3f
            goto L46
        L3f:
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r8.setText(r2)
        L46:
            int r7 = r7 + (-1)
            r0.f362892d = r6
            r0.f362893e = r7
            r0.f362896h = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r0)
            if (r8 != r1) goto L38
            goto L59
        L57:
            jz5.f0 r1 = jz5.f0.f384359a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.l.Z6(hg2.l, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.qf7);
        android.view.ViewGroup viewGroup = S6 instanceof android.view.ViewGroup ? (android.view.ViewGroup) S6 : null;
        this.f362902m = viewGroup;
        this.f362903n = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qdz) : null;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f362902m = null;
        this.f362903n = null;
    }
}
