package df2;

/* loaded from: classes3.dex */
public final class ve extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313128m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f313129n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f313130o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f313131p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f313132q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313128m = "Micro.LiveCheckRoleAndPrivacyController";
    }

    public final boolean Z6() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        return (gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L) & 32) != 0;
    }

    public final boolean a7() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        return (gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L) & 16) != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        super.mo14866x804e7f00();
        this.f313129n = java.lang.Integer.valueOf(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).I7().m75939xb282bd08(2));
        this.f313130o = java.lang.Boolean.valueOf(a7());
        this.f313131p = java.lang.Boolean.valueOf(Z6());
        this.f313132q = java.lang.Boolean.valueOf((a7() || Z6()) ? false : true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313128m, "save on Float: roleTypeOnFloatMode=" + this.f313129n + ", chooseInvisibleVip=" + this.f313130o + ", chooseHideIdentity=" + this.f313131p + ", chooseNormal=" + this.f313132q);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        this.f313129n = null;
        this.f313130o = null;
        this.f313131p = null;
        this.f313132q = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onNormalMode */
    public void mo14868x7c41fe69() {
        super.mo14868x7c41fe69();
        java.lang.Integer num = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Y3;
        java.lang.String str = this.f313128m;
        if (num != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "special live room, do nothing");
            return;
        }
        java.lang.Integer num2 = this.f313129n;
        java.lang.Boolean bool = this.f313130o;
        java.lang.Boolean bool2 = this.f313131p;
        java.lang.Boolean bool3 = this.f313132q;
        if (num2 != null && bool != null && bool2 != null && bool3 != null) {
            boolean booleanValue = bool3.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            boolean booleanValue3 = bool.booleanValue();
            int intValue = num2.intValue();
            g92.b bVar = g92.b.f351302e;
            boolean z17 = intValue != bVar.k2().m75939xb282bd08(4);
            boolean z18 = (booleanValue == (!a7() && !Z6()) && booleanValue3 == a7() && booleanValue2 == Z6()) ? false : true;
            if (z17 || z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkRestartLive] reJoinLive!!!");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("role:");
                sb6.append(intValue);
                sb6.append('-');
                sb6.append(bVar.k2().m75939xb282bd08(4));
                sb6.append(", ifNormal:");
                sb6.append(booleanValue);
                sb6.append('-');
                sb6.append((a7() || Z6()) ? false : true);
                sb6.append(", ifInvisible:");
                sb6.append(booleanValue3);
                sb6.append('-');
                sb6.append(a7());
                sb6.append(", ifHideId:");
                sb6.append(booleanValue2);
                sb6.append('-');
                sb6.append(Z6());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                long m75942xfb822ef2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                am.ia iaVar = c5445x963cab3.f135785g;
                iaVar.f88451a = m75942xfb822ef2;
                iaVar.f88452b = 14;
                iaVar.f88463m = z17;
                c5445x963cab3.e();
                if (zl2.q4.f555466a.E()) {
                    pm0.v.V(1000L, new df2.ue(this));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkRestartLive] do nothing");
            }
        }
        this.f313129n = null;
        this.f313130o = null;
        this.f313131p = null;
        this.f313132q = null;
    }
}
