package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f162513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f162514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h f162515f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar, android.content.Context context, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f162515f = hVar;
        this.f162513d = context;
        this.f162514e = onCancelListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar = this.f162515f;
        hVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.m(hVar));
        android.content.Context context = this.f162513d;
        if (context != null) {
            hVar.f162488h = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, this.f162514e);
        }
    }
}
