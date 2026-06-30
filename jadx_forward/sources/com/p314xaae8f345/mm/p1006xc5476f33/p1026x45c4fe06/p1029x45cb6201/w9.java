package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f157564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157565f;

    public w9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x9 x9Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f157563d = str;
        this.f157564e = i17;
        this.f157565f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C();
        int i17 = this.f157564e;
        java.lang.String str = this.f157563d;
        C.s(str, i17);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = this.f157565f;
        if (str2 != null) {
            str = str2;
        }
        objArr[0] = str;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571780p7, objArr), 1).show();
    }
}
