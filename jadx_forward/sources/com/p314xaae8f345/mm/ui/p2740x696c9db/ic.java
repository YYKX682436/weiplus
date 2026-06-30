package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class ic implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f292030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292031e;

    public ic(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72, java.util.ArrayList arrayList) {
        this.f292031e = activityC22543x95896a72;
        this.f292030d = arrayList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292031e;
        if (!activityC22543x95896a72.f291762q) {
            if (com.p314xaae8f345.mm.vfs.w6.j(activityC22543x95896a72.f291753e)) {
                g4Var.add(0, 1, 0, activityC22543x95896a72.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
            if (activityC22543x95896a72.f291763r) {
                g4Var.add(0, 3, 0, activityC22543x95896a72.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfz));
            }
            g4Var.add(0, 2, 0, activityC22543x95896a72.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8d));
            return;
        }
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(activityC22543x95896a72.f291753e);
        java.util.ArrayList arrayList = this.f292030d;
        if (j17) {
            g4Var.h(1, activityC22543x95896a72.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            arrayList.add(1);
        }
        if (activityC22543x95896a72.f291763r) {
            g4Var.h(3, activityC22543x95896a72.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f78683x36757420, 0);
            arrayList.add(2);
        }
    }
}
