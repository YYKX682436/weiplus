package df2;

/* loaded from: classes3.dex */
public final class o extends df2.de {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f312432p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f312433q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd f312434r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f312435s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f312436t;

    /* renamed from: u, reason: collision with root package name */
    public r45.f07 f312437u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312432p = "Micro.AnchorLivingWhiteListController";
        this.f312437u = r45.f07.VisibilityModeOptionStatus_Enable;
    }

    public final mm2.y6 m7() {
        return (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03ca, code lost:
    
        if ((r14 == null || r14.isEmpty()) != false) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Type inference failed for: r0v19, types: [r45.f07, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.tencent.mm.protobuf.f, r45.ge2] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.tencent.mm.protobuf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(java.util.LinkedList r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.o.n7(java.util.LinkedList, java.lang.String):void");
    }

    public final void o7() {
        java.lang.String string = O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ouq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd gdVar = this.f312434r;
        if (gdVar == null) {
            gdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd(O6());
            this.f312434r = gdVar;
            java.lang.Object obj = this.f372632e;
            android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
            if (viewGroup != null) {
                viewGroup.addView(gdVar, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
        }
        df2.m mVar = new df2.m(this);
        gdVar.setVisibility(0);
        gdVar.setAlpha(1.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = gdVar.f199958i;
        b4Var.d();
        gdVar.f199957h.setText(string);
        gdVar.f199959m = mVar;
        b4Var.c(1000L, 1000L);
    }

    @Override // df2.de, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        super.mo14867x5aa1c816(r71Var);
        if (zl2.r4.f555483a.y1(getStore().getLiveRoomData())) {
            n7(r71Var != null ? r71Var.m75941xfb821914(15) : null, "onLiveMsg");
            p7(r71Var != null ? (r45.ze2) r71Var.m75936x14adae67(46) : null, "onLiveStart");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        m7().f411115f = pm0.v.z(((mm2.e1) getStore().m56796xbba4bfc0(mm2.e1.class)).f410521r.m75939xb282bd08(37), 32768) ? 1 : 0;
        if (zl2.r4.f555483a.y1(getStore().getLiveRoomData())) {
            n7(hc1Var != null ? hc1Var.m75941xfb821914(9) : null, "onLiveStart");
            p7(hc1Var != null ? (r45.ze2) hc1Var.m75936x14adae67(15) : null, "onLiveStart");
        }
    }

    @Override // df2.de, if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8999xb1ef75c(pluginLayout);
        this.f312433q = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd gdVar = this.f312434r;
        if (gdVar != null) {
            gdVar.f199958i.d();
            gdVar.f199959m = null;
        }
        this.f312434r = null;
    }

    public final void p7(r45.ze2 ze2Var, java.lang.String str) {
        java.lang.Object obj;
        r45.ze2 ze2Var2 = (r45.ze2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410606n).mo144003x754a37bb();
        if (ze2Var2 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ze2Var2.m75945x2fec8307(5), ze2Var != null ? ze2Var.m75945x2fec8307(5) : null)) {
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updatePoi-");
        sb6.append(str);
        sb6.append("], data = ");
        if (ze2Var == null || (obj = pm0.b0.g(ze2Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312432p, sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410606n).k(ze2Var);
    }
}
