package df2;

/* loaded from: classes3.dex */
public final class d4 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311471m;

    /* renamed from: n, reason: collision with root package name */
    public xt2.r5 f311472n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311473o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311474p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311471m = "FinderLiveShoppingQuestionController";
        this.f311473o = new p012xc85e97e9.p093xedfae76a.j0(null);
        this.f311474p = new p012xc85e97e9.p093xedfae76a.j0(java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z6() {
        /*
            r5 = this;
            zl2.r4 r0 = zl2.r4.f555483a
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r5.getStore()
            gk2.e r1 = r1.getLiveRoomData()
            boolean r0 = r0.y1(r1)
            r1 = 0
            if (r0 != 0) goto L64
            java.lang.Class<mm2.e0> r0 = mm2.e0.class
            androidx.lifecycle.c1 r0 = r5.m56788xbba4bfc0(r0)
            mm2.e0 r0 = (mm2.e0) r0
            androidx.lifecycle.j0 r0 = r0.f410503m
            java.lang.Object r0 = r0.mo3195x754a37bb()
            r45.qm1 r0 = (r45.qm1) r0
            java.lang.Class<df2.xw> r2 = df2.xw.class
            r3 = 1
            if (r0 == 0) goto L2e
            int r0 = r0.m75939xb282bd08(r1)
            int r4 = qs5.v.f448005a
            if (r0 != 0) goto L41
        L2e:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r5.m56789x25fe639c(r2)
            df2.xw r0 = (df2.xw) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.f313348s
            if (r0 != 0) goto L3c
            r0 = r3
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 == 0) goto L41
            r0 = r3
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto L64
            java.lang.Class<mm2.f6> r0 = mm2.f6.class
            androidx.lifecycle.c1 r0 = r5.m56788xbba4bfc0(r0)
            mm2.f6 r0 = (mm2.f6) r0
            boolean r0 = r0.f410568i
            if (r0 == 0) goto L64
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r5.m56789x25fe639c(r2)
            df2.xw r0 = (df2.xw) r0
            if (r0 == 0) goto L60
            boolean r0 = r0.e7()
            if (r0 != r3) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 == 0) goto L64
            r1 = r3
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d4.Z6():boolean");
    }

    public final android.widget.CheckBox a7() {
        android.view.View c76 = c7();
        if (c76 != null) {
            return (android.widget.CheckBox) c76.findViewById(com.p314xaae8f345.mm.R.id.btf);
        }
        return null;
    }

    public final android.view.View b7() {
        android.view.View h17 = h();
        if (h17 != null) {
            return h17.findViewById(com.p314xaae8f345.mm.R.id.rfm);
        }
        return null;
    }

    public final android.view.View c7() {
        android.view.View h17 = h();
        if (h17 != null) {
            return h17.findViewById(com.p314xaae8f345.mm.R.id.rgd);
        }
        return null;
    }

    public final boolean d7() {
        if (!Z6()) {
            return false;
        }
        android.widget.CheckBox a76 = a7();
        return a76 != null && a76.isChecked();
    }

    public final android.view.View h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.class);
        if (etVar != null) {
            return etVar.f446856d;
        }
        return null;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f311472n = null;
    }
}
