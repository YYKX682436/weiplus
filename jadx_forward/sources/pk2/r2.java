package pk2;

/* loaded from: classes3.dex */
public final class r2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437743h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437743h = helper.G;
        this.f437744i = n() ? "anchorlive.more.grow" : "startlive.more.grow";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) o9Var.c(mm2.c1.class)).Z;
        r45.k74 m76504xa819f0c7 = c19786x6a1e2862 != null ? c19786x6a1e2862.m76504xa819f0c7() : null;
        java.lang.String m75945x2fec8307 = m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(0) : null;
        java.lang.String m75945x2fec83072 = m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(1) : null;
        java.lang.String m75945x2fec83073 = m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(2) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clickAnchorOpPromotionMiniApp anchorOpPromoteMiniAppInfo hash:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = ((mm2.c1) o9Var.c(mm2.c1.class)).Z;
        sb6.append(c19786x6a1e28622 != null ? java.lang.Integer.valueOf(c19786x6a1e28622.hashCode()) : null);
        sb6.append(", appId:");
        sb6.append(m75945x2fec8307);
        sb6.append(", page:");
        sb6.append(m75945x2fec83072);
        sb6.append(", query:");
        sb6.append(m75945x2fec83073);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, sb6.toString());
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            db5.t7.g(o9Var.f437611d, "请稍候重试");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", m75945x2fec8307);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, m75945x2fec83072);
            bundle.putString("query", m75945x2fec83073);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(o9Var.f437611d, bundle, true, false, new pk2.q2(o9Var));
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 5, 2, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 4);
        jSONObject.put("type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437744i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        return ((mm2.c1) o9Var.c(mm2.c1.class)).Z != null && pm0.v.z((int) (((mm2.c1) o9Var.c(mm2.c1.class)).f410311a5 ? gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L)), 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r11, db5.g4 r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.r2.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f437743h;
    }
}
