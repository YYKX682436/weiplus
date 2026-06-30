package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f274032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.x5 f274033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f274034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f274035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 f274036i;

    public c6(android.content.Context context, int i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x5 x5Var, int i18, boolean z17, com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 w5Var) {
        this.f274031d = context;
        this.f274032e = i17;
        this.f274033f = x5Var;
        this.f274034g = i18;
        this.f274035h = z17;
        this.f274036i = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f274035h;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x5 x5Var = this.f274033f;
        android.content.Context context = this.f274031d;
        int i17 = this.f274034g;
        int i18 = this.f274032e;
        try {
            try {
                java.lang.String string = context.getString(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.a(d6Var, i18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlaySoundNew", "play asset path:" + string + " hit rateControl, ignore this play request");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.b(d6Var, i18);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySoundNew", "play asset path:" + string + ", pathId:" + i18 + ", speakeron:" + x5Var + ", stream:" + i17 + ", looping:" + z17);
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101082x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101082x5f9ba979(context);
                if (m101082x5f9ba979 == null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.b(d6Var, i18);
                    return;
                }
                m101082x5f9ba979.mo100942x683d6267(context.getAssets().openFd(string));
                if (x5Var != com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274617d && -1 == i17) {
                    m101082x5f9ba979.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a, x5Var == com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274618e ? 3 : 8));
                } else if (i17 != -1) {
                    m101082x5f9ba979.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a, i17));
                }
                m101082x5f9ba979.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101061xaab99aa1(419, 1));
                m101082x5f9ba979.mo100947xfd27780d(z17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b6 b6Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b6(this.f274036i);
                m101082x5f9ba979.mo100957x5dd7c812(b6Var);
                m101082x5f9ba979.mo100955x40f8c003(b6Var);
                m101082x5f9ba979.mo100956xa23b7bf3(b6Var);
                m101082x5f9ba979.mo100951xa4560c71(b6Var);
                m101082x5f9ba979.mo100954x6954c27b(b6Var);
                m101082x5f9ba979.mo100932x857611b5();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.b(d6Var, i18);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PlaySoundNew", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a, i18);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a, i18);
            throw th6;
        }
    }
}
