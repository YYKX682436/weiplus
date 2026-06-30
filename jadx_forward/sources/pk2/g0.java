package pk2;

/* loaded from: classes3.dex */
public final class g0 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437289h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437290i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f437291j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437289h = helper.T;
        this.f437290i = "";
        this.f437291j = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        boolean D = D();
        pk2.o9 o9Var2 = this.f445960a;
        if (D) {
            df2.dd ddVar = df2.od.f312485w;
            gk2.e eVar = o9Var2.f437607b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar != null ? odVar.f312491r : null, 18);
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 12, 2, null, 4, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 9);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (((mm2.c1) o9Var2.c(mm2.c1.class)).O7()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mk_), 0).show();
        } else {
            df2.g3 g3Var = (df2.g3) o9Var.e(df2.g3.class);
            if (g3Var != null) {
                g3Var.Z6(this.f445961b, (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, ((mm2.o4) o9Var.c(mm2.o4.class)).U.f458665g, pk2.f0.f437254d);
            }
        }
    }

    public final boolean D() {
        df2.od odVar = (df2.od) this.f445960a.e(df2.od.class);
        return odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_MIC_COUNT);
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437291j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437290i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    @Override // qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r6 = this;
            java.lang.Class<mm2.h7> r0 = mm2.h7.class
            pk2.o9 r1 = r6.f445960a
            androidx.lifecycle.c1 r0 = r1.c(r0)
            mm2.h7 r0 = (mm2.h7) r0
            boolean r0 = r0.O6()
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L13
            return r3
        L13:
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r1.c(r0)
            mm2.e1 r0 = (mm2.e1) r0
            boolean r0 = r0.d7()
            if (r0 == 0) goto L5a
            java.lang.Class<jf2.u> r0 = jf2.u.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r1.e(r0)
            jf2.u r0 = (jf2.u) r0
            if (r0 == 0) goto L56
            java.util.LinkedList r0 = r0.f380934p
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            r4 = r1
            jf2.h r4 = (jf2.h) r4
            int r4 = r4.mo58036x368f3a()
            r5 = 10
            if (r4 != r5) goto L48
            r4 = r2
            goto L49
        L48:
            r4 = r3
        L49:
            if (r4 == 0) goto L31
            goto L4d
        L4c:
            r1 = 0
        L4d:
            if (r1 == 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 != 0) goto L56
            r0 = r2
            goto L57
        L56:
            r0 = r3
        L57:
            if (r0 == 0) goto L5a
            return r2
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.g0.o():boolean");
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (D()) {
            int i17 = this.f437289h;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
            java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            u(menu, i17, string, com.p314xaae8f345.mm.R.raw.f79197x1966aaf0, string2, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        } else {
            int i18 = this.f437289h;
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            t(menu, i18, string3, com.p314xaae8f345.mm.R.raw.f79197x1966aaf0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 12, 1, null, 4, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 9);
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (D()) {
            df2.dd ddVar = df2.od.f312485w;
            pk2.o9 o9Var2 = this.f445960a;
            gk2.e eVar = o9Var2.f437607b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 1, 7, odVar != null ? odVar.f312491r : null, 18);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437289h;
    }
}
