package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class d0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91 f291870a;

    public d0(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91 activityC22497x4e26cc91) {
        this.f291870a = activityC22497x4e26cc91;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91.f291508p;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91 activityC22497x4e26cc91 = this.f291870a;
        activityC22497x4e26cc91.X6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFavoriteUI", "filepath:[%s]", activityC22497x4e26cc91.f291512g);
        int Y6 = activityC22497x4e26cc91.Y6(activityC22497x4e26cc91.getIntent().resolveType(activityC22497x4e26cc91));
        if (Y6 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddFavoriteUI", "launch, msgType is invalid");
            activityC22497x4e26cc91.finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFavoriteUI", "filepath:[%s] dealWithMultiItem msgType is %d", activityC22497x4e26cc91.f291512g, java.lang.Integer.valueOf(Y6));
        if (Y6 == 8 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC22497x4e26cc91.f291512g)) {
            activityC22497x4e26cc91.W6(Y6, activityC22497x4e26cc91.f291512g, null, false);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(activityC22497x4e26cc91.getIntent(), "Intro_Switch", false) || !c01.d9.h() || gm0.m.r()) {
            android.content.Intent intent = new android.content.Intent(activityC22497x4e26cc91, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22497x4e26cc91.class);
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC22497x4e26cc91.f291514i)) {
                arrayList = new java.util.ArrayList<>(0);
            } else {
                arrayList = new java.util.ArrayList<>(activityC22497x4e26cc91.f291514i.size());
                java.util.Iterator it = activityC22497x4e26cc91.f291514i.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(activityC22497x4e26cc91.mo55332x76847179(), new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it.next())));
                }
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.addFlags(268435456).addFlags(32768);
            intent.setType(activityC22497x4e26cc91.getIntent().getType());
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(activityC22497x4e26cc91, new android.content.Intent(activityC22497x4e26cc91, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class).addFlags(32768).addFlags(268435456), intent);
            activityC22497x4e26cc91.finish();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        java.util.ArrayList<java.lang.String> arrayList2 = activityC22497x4e26cc91.f291514i;
        boolean z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.f270312a;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or paths is empty");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
        } else if (arrayList2.size() > 9) {
            c4Var.f87859l = -20240419;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple images), paths %s sourceType %d", arrayList2, 13);
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            for (java.lang.String str : arrayList2) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    r45.gp0 gp0Var = new r45.gp0();
                    gp0Var.h0(2);
                    gp0Var.A0(str);
                    gp0Var.z0(true);
                    bq0Var.f452497f.add(gp0Var);
                }
            }
            jq0Var.e(c01.z1.r());
            jq0Var.j(c01.z1.r());
            jq0Var.g(13);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
            c4Var.f87851d = "";
            c4Var.f87848a = bq0Var;
            c4Var.f87850c = 2;
        }
        c4Var.f87856i = activityC22497x4e26cc91;
        c4Var.f87862o = new com.p314xaae8f345.mm.ui.p2740x696c9db.f0(activityC22497x4e26cc91);
        c4Var.f87863p = new com.p314xaae8f345.mm.ui.p2740x696c9db.g0(activityC22497x4e26cc91);
        c01.d9.e().a(837, activityC22497x4e26cc91);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.c0(1, activityC22497x4e26cc91.f291514i, activityC22497x4e26cc91.m78512xb8359e85()));
        activityC22497x4e26cc91.Z6();
        activityC22497x4e26cc91.f291511f = c5303xc75d2f73;
    }
}
