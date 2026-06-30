package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 f233856d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1) {
        this.f233856d = abstractActivityC16727x398198e1;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233856d;
        abstractActivityC16727x398198e1.getClass();
        if (abstractActivityC16727x398198e1.K) {
            return false;
        }
        if (!z17) {
            if (!abstractActivityC16727x398198e1.R && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e12 = this.f233856d;
                abstractActivityC16727x398198e12.R = true;
                db5.e1.C(abstractActivityC16727x398198e12, abstractActivityC16727x398198e12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), abstractActivityC16727x398198e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC16727x398198e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), abstractActivityC16727x398198e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.i(this), null);
            }
            return true;
        }
        int i18 = (int) d18;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2003, f17, f18, i18);
        abstractActivityC16727x398198e1.K = true;
        i11.e eVar = abstractActivityC16727x398198e1.f233773p;
        if (eVar != null) {
            ((i11.h) eVar).m(abstractActivityC16727x398198e1.T);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseLifeUI", "on get location %f %f " + java.lang.System.currentTimeMillis(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        abstractActivityC16727x398198e1.f233777t = new r45.d64();
        r45.d64 d64Var = abstractActivityC16727x398198e1.f233777t;
        d64Var.f453711h = "";
        d64Var.f453712i = 0;
        d64Var.f453708e = f18;
        d64Var.f453707d = f17;
        d64Var.f453710g = "";
        d64Var.f453709f = i18;
        abstractActivityC16727x398198e1.f233778u = f18;
        abstractActivityC16727x398198e1.f233779v = f17;
        abstractActivityC16727x398198e1.f233780w = i17;
        abstractActivityC16727x398198e1.f233781x = (float) d18;
        i11.e eVar2 = abstractActivityC16727x398198e1.f233773p;
        abstractActivityC16727x398198e1.f233782y = eVar2 == null ? false : ((i11.h) eVar2).f368625a;
        double d27 = f18;
        double d28 = f17;
        abstractActivityC16727x398198e1.b7(d27, d28);
        java.util.ArrayList arrayList = abstractActivityC16727x398198e1.f233767g.f233837i;
        if (arrayList == null || arrayList.size() <= 0) {
            abstractActivityC16727x398198e1.a7(d27, d28);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) arrayList.get(arrayList.size() - 1);
            abstractActivityC16727x398198e1.a7(c20989xcfc00935.f273942d, c20989xcfc00935.f273943e);
            float f19 = c20989xcfc00935.f273942d;
            float f27 = c20989xcfc00935.f273943e;
            abstractActivityC16727x398198e1.getClass();
            abstractActivityC16727x398198e1.E = o25.l2.a((double) f19, (double) f27, d27, d28) > 1000.0d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar = abstractActivityC16727x398198e1.f233767g;
        r45.d64 d64Var2 = abstractActivityC16727x398198e1.f233777t;
        float f28 = d64Var2.f453708e;
        float f29 = d64Var2.f453707d;
        aVar.f233841p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(f28, f29);
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a aVar2 = abstractActivityC16727x398198e1.f233768h;
        aVar2.f233841p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(f28, f29);
        if (abstractActivityC16727x398198e1.I) {
            aVar = aVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1.U6(abstractActivityC16727x398198e1, aVar);
        abstractActivityC16727x398198e1.d7(false);
        abstractActivityC16727x398198e1.m78489xd6d59aa8(true, abstractActivityC16727x398198e1.H);
        return false;
    }
}
