package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
class k0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f231203d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p971x6de15a2e.s0 f231204e = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j0();

    /* loaded from: classes8.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            int i17 = ((android.os.Bundle) obj).getInt("newState", 0);
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s on network changed: %d (%s)", bm5.f1.a(), java.lang.Integer.valueOf(i17), m40061x1de3608b);
            if ("NON_NETWORK".equals(m40061x1de3608b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.C(0);
            } else if ("2G".equals(m40061x1de3608b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.C(1);
            } else if ("3G".equals(m40061x1de3608b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.C(3);
            } else if ("WIFI".equals(m40061x1de3608b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.C(4);
            } else if ("4G".equals(m40061x1de3608b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.C(5);
            } else if ("5G".equals(m40061x1de3608b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.C(5);
            }
            if (rVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("err_code", 0);
                bundle.putString("err_desc", ya.b.f77504xbb80cbe3);
                rVar.a(bundle);
            }
        }
    }

    private k0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("from_process", "");
        f231203d = string;
        int i17 = -1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || !f231203d.startsWith("com.tencent.mm")) {
            str = "invalid package name " + f231203d;
        } else {
            int i18 = bundle.getInt("opcode", -1);
            com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var = f231204e;
            if (i18 == 0) {
                gm0.j1.n().a(s0Var);
            } else if (i18 == 1) {
                gm0.j1.n().d(s0Var);
            } else {
                i17 = -2;
                str = "not valid op code";
            }
            i17 = 0;
            str = ya.b.f77504xbb80cbe3;
        }
        if (rVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("err_code", i17);
            bundle2.putString("err_desc", str);
            rVar.a(bundle2);
        }
    }
}
