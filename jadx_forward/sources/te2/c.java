package te2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.l f499442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(te2.l lVar) {
        super(0);
        this.f499442d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] bArr;
        boolean w17 = zl2.r4.f555483a.w1();
        te2.l lVar = this.f499442d;
        if (w17) {
            lVar.getClass();
            qo0.c.a(lVar.f499715g, qo0.b.V4, null, 2, null);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.R;
            ml2.e2[] e2VarArr = ml2.e2.f408907d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        } else {
            te2.b bVar = lVar.f499719n;
            if (bVar != null) {
                ((te2.o) bVar).a();
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = lVar.f499718m;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            boolean z17 = c1Var != null && c1Var.N1;
            qo0.c cVar = lVar.f499715g;
            if (z17) {
                mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var2 != null) {
                    c1Var2.N1 = false;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
                cVar.mo46557x60d69242(qo0.b.Z2, bundle);
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85246c4).mo141623x754a37bb()).r()).intValue() == 1) {
                dk2.u7 u7Var = dk2.u7.f315714a;
                ce2.i e17 = u7Var.e("MMFinderLiveGift100001");
                qo0.b bVar2 = qo0.b.T4;
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (!u7Var.g(e17)) {
                    java.lang.String str = e17 != null ? e17.f67819x7194d06c : null;
                    if (str == null) {
                        str = "";
                    }
                    bundle2.putString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL", str);
                }
                cVar.mo46557x60d69242(bVar2, bundle2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String r17 = c01.z1.r();
                if (r17 != null) {
                    bArr = r17.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                } else {
                    bArr = null;
                }
                sb6.append(kk.k.g(bArr));
                sb6.append('_');
                sb6.append(java.util.UUID.randomUUID());
                p3325xe03a0797.p3326xc267989b.l.d(lVar.f499720o, null, null, new te2.d(lVar, e17, sb6.toString(), null), 3, null);
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(lVar.f499717i, null, null, new te2.j(lVar, null), 3, null);
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((ml2.r0) c18).Yj(ml2.f2.f408957f, "");
        }
        return jz5.f0.f384359a;
    }
}
