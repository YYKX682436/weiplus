package mm2;

/* loaded from: classes3.dex */
public final class d extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public boolean f410475f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f410476g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f410477h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f410478i;

    /* renamed from: m, reason: collision with root package name */
    public int f410479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410476g = "";
        this.f410477h = "";
        this.f410478i = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N6() {
        /*
            r4 = this;
            in0.q r0 = in0.q.f374302b2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 != 0) goto L17
            sn0.b r0 = sn0.b.f491497e2
            if (r0 == 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L1b
            return r2
        L1b:
            boolean r0 = r4.f410475f
            if (r0 == 0) goto L3d
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            java.lang.String r3 = r4.f410476g
            com.tencent.mm.storage.z3 r0 = r0.n(r3, r2)
            if (r0 == 0) goto L55
            boolean r0 = r0.r2()
            if (r0 != r2) goto L55
            r1 = r2
            goto L55
        L3d:
            java.lang.Class<c61.yb> r0 = c61.yb.class
            i95.m r0 = i95.n0.c(r0)
            c61.yb r0 = (c61.yb) r0
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r4.m147920xbba4bfc0(r1)
            mm2.c1 r1 = (mm2.c1) r1
            java.lang.String r1 = r1.f410385o
            c61.p2 r0 = (c61.p2) r0
            boolean r1 = r0.rj(r1)
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.d.N6():boolean");
    }

    public final void O6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizModeSlice", "updateBizMode " + z17);
        this.f410475f = z17;
    }

    public final void P6(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (!(str == null || str.length() == 0)) {
            if (str == null) {
                str = "";
            }
            this.f410476g = str;
        }
        if (!(str2 == null || str2.length() == 0)) {
            if (str2 == null) {
                str2 = "";
            }
            this.f410477h = str2;
        }
        if (!(str3 == null || str3.length() == 0)) {
            if (str3 == null) {
                str3 = "";
            }
            this.f410478i = str3;
        }
        if (i17 != 0) {
            this.f410479m = i17;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizModeSlice", "#onCleared");
        this.f410475f = false;
        this.f410476g = "";
        this.f410477h = "";
        this.f410479m = 0;
    }
}
