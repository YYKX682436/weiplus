package gp2;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gp2.l0 l0Var) {
        super(1);
        this.f355752d = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        gp2.l0 l0Var = this.f355752d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "invokeAutoPlayCallback pos:" + intValue);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = l0Var.f355776b;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager;
            android.view.View mo7935xa188593e = c15416x1f1f78b7.mo7935xa188593e(intValue);
            int i17 = 0;
            if (mo7935xa188593e != null) {
                if (l0Var.f355778d && !l0Var.B) {
                    if (l0Var.x(intValue)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "disableLiveMuteByPos pos:" + intValue);
                        java.util.Iterator it = l0Var.f355800z.iterator();
                        while (it.hasNext()) {
                            gp2.f fVar = (gp2.f) it.next();
                            int i18 = fVar.f355747a;
                            ws5.f fVar2 = fVar.f355748b;
                            if (i18 == intValue) {
                                if (fVar2 != null) {
                                    fVar2.mo58394x764d819b(false);
                                }
                            } else if (fVar2 != null) {
                                fVar2.mo58394x764d819b(true);
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(l0Var.t(), "disableLiveMuteByPos return for pos:" + intValue);
                    }
                    java.util.HashSet hashSet = l0Var.A;
                    hashSet.clear();
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.icp);
                    hashSet.add(new gp2.g(intValue, frameLayout != null ? frameLayout.hashCode() : 0, false));
                }
                l0Var.f355798x = true;
                l0Var.h(intValue, mo7935xa188593e);
                l0Var.p(intValue);
            }
            if (!l0Var.D(intValue)) {
                int i19 = l0Var.A(intValue) ? intValue + 1 : intValue - 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "findSameLineOtherPos otherPos:" + i19 + ", headerCount = " + l0Var.s());
                if (i19 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "findSameLineOtherPos fix otherPos:0 pos:" + intValue + " otherPos:0");
                } else {
                    if (l0Var.s() + intValue >= l0Var.f355777c.size()) {
                        i17 = l0Var.s() + (r5.size() - 1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "findSameLineOtherPos fix otherPos:" + i17 + " pos:" + intValue + " otherPos:" + i17);
                    } else {
                        i17 = i19;
                    }
                }
                android.view.View mo7935xa188593e2 = c15416x1f1f78b7.mo7935xa188593e(i17);
                if (mo7935xa188593e2 != null) {
                    l0Var.f355798x = true;
                    l0Var.h(i17, mo7935xa188593e2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
