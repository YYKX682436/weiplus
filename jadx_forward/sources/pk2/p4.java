package pk2;

/* loaded from: classes3.dex */
public final class p4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437680h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437681i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437680h = helper.f437624j0;
        this.f437681i = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if ((r6 != null ? r6.f437423f : false) != false) goto L22;
     */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(pk2.o9 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r0 = 2
            r5.D(r0)
            java.lang.Class<yf2.g0> r0 = yf2.g0.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r6.e(r0)
            if2.b r0 = (if2.b) r0
            if (r0 == 0) goto L52
            boolean r1 = r0 instanceof jm2.b
            if (r1 == 0) goto L52
            r1 = 1
            r2 = 0
            pk2.j9 r6 = r6.f437617g
            if (r6 == 0) goto L2c
            java.lang.Integer r3 = r6.f437422e
            if (r3 != 0) goto L22
            goto L2c
        L22:
            int r3 = r3.intValue()
            int r4 = r5.f437680h
            if (r3 != r4) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 == 0) goto L38
            if (r6 == 0) goto L34
            boolean r6 = r6.f437423f
            goto L35
        L34:
            r6 = r2
        L35:
            if (r6 == 0) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            jm2.b r0 = (jm2.b) r0
            yf2.g0 r0 = (yf2.g0) r0
            java.lang.Class<mm2.g1> r6 = mm2.g1.class
            androidx.lifecycle.c1 r6 = r0.m56788xbba4bfc0(r6)
            mm2.g1 r6 = (mm2.g1) r6
            kotlinx.coroutines.flow.j2 r6 = r6.f410601f
            kotlinx.coroutines.flow.h3 r6 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r6
            java.lang.Object r6 = r6.mo144003x754a37bb()
            r45.q12 r6 = (r45.q12) r6
            r0.Z6(r6, r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.p4.B(pk2.o9):void");
    }

    public final void D(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 63L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437681i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437680h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f79085x7353ed39, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        D(1);
    }

    @Override // qk2.h
    public int y() {
        return this.f437680h;
    }
}
