package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class t9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.y9 f292308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f292309e;

    public t9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18, com.p314xaae8f345.mm.ui.p2740x696c9db.y9 y9Var, java.util.ArrayList arrayList) {
        this.f292308d = y9Var;
        this.f292309e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18 = ((com.p314xaae8f345.mm.ui.p2740x696c9db.n9) this.f292308d).f292138a;
        java.util.ArrayList arrayList = this.f292309e;
        activityC22523xb066d18.f291693o = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "launch : fail, filePathList is null");
            activityC22523xb066d18.e7(1);
            activityC22523xb066d18.finish();
            return;
        }
        java.util.Iterator it = activityC22523xb066d18.f291693o.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "%s is not image", str);
                activityC22523xb066d18.e7(1);
                activityC22523xb066d18.finish();
                return;
            }
        }
        java.lang.String resolveType = activityC22523xb066d18.getIntent().resolveType(activityC22523xb066d18);
        if (resolveType == null || !resolveType.contains("image")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "mime type is not image, try to set it");
            activityC22523xb066d18.getIntent().setDataAndType(activityC22523xb066d18.getIntent().getData(), "image/*");
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.a7(activityC22523xb066d18, false);
    }
}
