package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f168728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168729g;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.lang.String str, java.lang.String str2, int[] iArr) {
        this.f168729g = i3Var;
        this.f168726d = str;
        this.f168727e = str2;
        this.f168728f = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168729g;
        java.lang.String str = this.f168726d;
        java.lang.String str2 = this.f168727e;
        int[] iArr = this.f168728f;
        synchronized (i3Var.f168242o) {
            java.util.Iterator it = i3Var.f168243p.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) it.next()).r(str, str2, iArr);
            }
            java.util.Iterator it6 = i3Var.f168244q.iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) it6.next()).r(str, str2, iArr);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = i3Var.f168247t;
        if (v5Var != null && iArr != null && yo.a.a(iArr, v5Var.mo50260x9f1221c2())) {
            i3Var.f168247t.g(str, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = i3Var.f168248u;
        if (v5Var2 != null && iArr != null && yo.a.a(iArr, v5Var2.mo50260x9f1221c2())) {
            i3Var.f168248u.g(str, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = i3Var.f168250w;
        if (w2Var != null) {
            w2Var.r(str, str2, iArr);
        }
    }
}
