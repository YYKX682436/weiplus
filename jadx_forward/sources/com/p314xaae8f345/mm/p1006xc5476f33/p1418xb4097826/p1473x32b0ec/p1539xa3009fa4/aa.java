package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes2.dex */
public final class aa extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.v9 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z9 f198438h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z9(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f198439d;

    /* renamed from: e, reason: collision with root package name */
    public r45.md5 f198440e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f198441f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f198442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198439d = "";
    }

    public void O6(java.lang.String encryptedFeedId, long j17) {
        r45.md5 md5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedFeedId, "encryptedFeedId");
        r45.md5 md5Var2 = this.f198440e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(md5Var2 != null ? md5Var2.m75945x2fec8307(2) : null, encryptedFeedId) || (md5Var = this.f198440e) == null) {
            return;
        }
        md5Var.set(0, java.lang.Long.valueOf(j17));
    }

    public void P6(r45.g92 g92Var) {
        if (g92Var == null) {
            return;
        }
        try {
            g92Var.set(42, pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(pm0.v.Z(g92Var.m75945x2fec8307(0)))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductTraceUIC", "insertEnterSessionId " + g92Var.m75945x2fec8307(42));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderProductTraceUIC", th6, "", new java.lang.Object[0]);
        }
    }

    public void Q6(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            boolean z17 = true;
            if (obj instanceof r45.g92) {
                long Z = pm0.v.Z(((r45.g92) obj).m75945x2fec8307(0));
                r45.md5 md5Var = this.f198440e;
                if (md5Var == null || Z != md5Var.m75942xfb822ef2(1)) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderProductTraceUIC", "insertLastGMsgId to live, lastGMsgId:" + this.f198439d, new java.lang.Object[0]);
                    ((r45.g92) obj).set(41, this.f198439d);
                    return;
                }
                return;
            }
            if (!(obj instanceof r45.kv2)) {
                if (obj instanceof r45.jv2) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderProductTraceUIC", "insertLastGMsgId to profile, lastGMsgId:" + this.f198439d, new java.lang.Object[0]);
                    ((r45.jv2) obj).set(7, this.f198439d);
                    return;
                }
                return;
            }
            long Z2 = pm0.v.Z(((r45.kv2) obj).m75945x2fec8307(0));
            r45.md5 md5Var2 = this.f198440e;
            if (md5Var2 == null || Z2 != md5Var2.m75942xfb822ef2(0)) {
                z17 = false;
            }
            if (z17 || this.f198441f) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderProductTraceUIC", "insertLastGMsgId to feed, lastGMsgId:" + this.f198439d, new java.lang.Object[0]);
                ((r45.kv2) obj).set(27, this.f198439d);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderProductTraceUIC", th6, "", new java.lang.Object[0]);
        }
    }

    public android.content.Intent R6(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        f198438h.a(intent, this.f198439d, this.f198440e);
        return intent;
    }

    public android.content.Intent S6(long j17, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        r45.md5 md5Var = this.f198440e;
        boolean z17 = false;
        if (md5Var != null && md5Var.m75942xfb822ef2(0) == j17) {
            z17 = true;
        }
        if (z17 || this.f198441f) {
            f198438h.a(intent, this.f198439d, this.f198440e);
        }
        return intent;
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 T6(long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        r45.md5 md5Var = this.f198440e;
        boolean z17 = false;
        if (md5Var != null && md5Var.m75942xfb822ef2(1) == j17) {
            z17 = true;
        }
        if (z17) {
            f198438h.b(this.f198439d, jumpInfo);
        }
        return jumpInfo;
    }

    public l81.b1 U6(long j17, l81.b1 bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        r45.md5 md5Var = this.f198440e;
        boolean z17 = false;
        if (md5Var != null && md5Var.m75942xfb822ef2(1) == j17) {
            z17 = true;
        }
        if (z17) {
            f198438h.c(this.f198439d, bundle);
        }
        return bundle;
    }

    public void V6(java.lang.String gmsgId, r45.md5 md5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gmsgId, "gmsgId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set gmsgid manually, gmsgid = ");
        sb6.append(gmsgId);
        sb6.append(", extraInfo: liveId = ");
        sb6.append(md5Var != null ? java.lang.Long.valueOf(md5Var.m75942xfb822ef2(1)) : null);
        sb6.append(", feedId = ");
        sb6.append(md5Var != null ? java.lang.Long.valueOf(md5Var.m75942xfb822ef2(0)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductTraceUIC", sb6.toString());
        this.f198439d = gmsgId;
        this.f198440e = md5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("FINDER_PRODUCT_LAST_GLOBAL_MSG_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f198439d = stringExtra;
        r45.md5 md5Var = new r45.md5();
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("FINDER_PRODUCT_TRACE_EXTRA_INFO");
        if (byteArrayExtra != null) {
            try {
                md5Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            this.f198440e = md5Var;
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.app.Activity context = m80379x76847179();
            ((c61.p2) ybVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            this.f198441f = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductTraceUIC", "onCreate activity:" + m158354x19263085() + " lastGMsgId:" + this.f198439d + ", traceExtraInfo:" + f198438h.d(this.f198440e));
        }
        md5Var = null;
        this.f198440e = md5Var;
        c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
        android.app.Activity context2 = m80379x76847179();
        ((c61.p2) ybVar2).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        this.f198441f = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductTraceUIC", "onCreate activity:" + m158354x19263085() + " lastGMsgId:" + this.f198439d + ", traceExtraInfo:" + f198438h.d(this.f198440e));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        yz5.a aVar = this.f198442g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
