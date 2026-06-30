package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements wt2.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f195645p;

    /* renamed from: q, reason: collision with root package name */
    public final al2.f f195646q;

    /* renamed from: r, reason: collision with root package name */
    public final el2.i0 f195647r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195645p = "FinderLiveAnchorPromotionPlugin";
        if (zl2.r4.f555483a.w1() && ((mm2.c1) P0(mm2.c1.class)).Y4) {
            root.setElevation(root.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562079a43));
        }
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        al2.f fVar = new al2.f(context);
        fVar.f87371e = this;
        this.f195646q = fVar;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        el2.i0 i0Var = new el2.i0(context2);
        i0Var.o0(this, fVar.f87369c, this);
        this.f195647r = i0Var;
    }

    @Override // wt2.a
    public void B4(r45.a52 info, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f195646q.b(info, lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.content.Context context = this.f446856d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        t1(activity != null ? activity.getIntent() : null);
    }

    @Override // wt2.a
    public void J3(android.content.Context context, r45.z42 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f195646q.d(context, item);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        mf2.b0 b0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2;
        super.K0(i17);
        if (!(in0.q.f374302b2 != null) || (b0Var = (if2.b) U0(yf2.i2.class)) == null || !(b0Var instanceof jm2.a) || (c14396x9309a8f2 = ((yf2.i2) ((jm2.a) b0Var)).f543254q) == null) {
            return;
        }
        c14396x9309a8f2.m57892x66c1f0f7(i17 == 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            android.content.Context context = this.f446856d.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            t1(activity != null ? activity.getIntent() : null);
        } else if (ordinal == 113) {
            u1(bundle);
        } else {
            if (ordinal != 114) {
                return;
            }
            m1();
        }
    }

    @Override // wt2.a
    public void O1(r45.z42 info, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f195646q.c(info, lVar);
    }

    @Override // wt2.a
    public void V3() {
        al2.h.a(this.f195646q, null, 1, null);
    }

    @Override // wt2.a
    public java.util.LinkedList j0() {
        return this.f195646q.f87370d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void k1(android.content.Intent intent) {
        t1(intent);
    }

    @Override // wt2.a
    public void m1() {
        el2.i0.n0(this.f195647r, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        android.content.Intent intent2;
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoShow intent:");
        sb6.append(intent != null ? java.lang.Integer.valueOf(intent.hashCode()) : null);
        sb6.append(", doAction:");
        sb6.append(intExtra);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f195645p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (intExtra == 5) {
            android.view.ViewGroup viewGroup = this.f446856d;
            if (((viewGroup.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13986x61bc9017) || (viewGroup.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13985x442fb85f)) && !((mm2.c1) P0(mm2.c1.class)).a8()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "secondary device ui, but has not joinLive");
                return;
            }
            u1(null);
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent2 = activity.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[EDGE_INSN: B:46:0x00d9->B:47:0x00d9 BREAK  A[LOOP:0: B:33:0x0090->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:0: B:33:0x0090->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u1(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r9.u1(android.os.Bundle):void");
    }
}
