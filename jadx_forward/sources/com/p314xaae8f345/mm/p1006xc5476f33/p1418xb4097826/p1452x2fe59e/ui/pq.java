package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class pq implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f191966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f191967b;

    public pq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688, android.net.Uri uri) {
        this.f191966a = activityC14125xe2977688;
        this.f191967b = uri;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(strArr);
        boolean z17 = !(strArr.length == 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f191966a;
        if (!z17 || iArr[0] != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "requestStoragePermission failed");
            db5.e1.C(activityC14125xe2977688.mo55332x76847179(), activityC14125xe2977688.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhe), "", activityC14125xe2977688.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC14125xe2977688.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.nq(activityC14125xe2977688), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oq(activityC14125xe2977688));
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688.f191161p;
            activityC14125xe2977688.X6(this.f191967b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "requestStoragePermission success");
        }
    }
}
