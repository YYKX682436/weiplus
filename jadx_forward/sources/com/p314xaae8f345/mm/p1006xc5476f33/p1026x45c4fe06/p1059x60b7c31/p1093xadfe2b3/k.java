package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f163073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f163074e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.u uVar, java.lang.Object[] objArr, android.content.Context context) {
        this.f163073d = objArr;
        this.f163074e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f163073d;
        if (objArr[1].equals(java.lang.Boolean.TRUE)) {
            return;
        }
        android.content.Context context = this.f163074e;
        objArr[0] = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f163074e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.j(this));
    }
}
