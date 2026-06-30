package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class gg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 f210833d;

    public gg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74) {
        this.f210833d = activityC15062xd67d4d74;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74 = this.f210833d;
        android.view.View view2 = activityC15062xd67d4d74.A;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("qrcodeContainer");
            throw null;
        }
        android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(view2);
        if (b07 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l + java.lang.System.nanoTime() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(activityC15062xd67d4d74, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ag(activityC15062xd67d4d74));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(1278L, 7L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            java.lang.String username = activityC15062xd67d4d74.f210234t;
            o3Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            java.lang.String str2 = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + username;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "18973 " + str2);
            fVar.mo68478xbd3cda5f(18973, str2);
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC15062xd67d4d74);
            e4Var.f293309c = activityC15062xd67d4d74.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573569h93);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
