package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f246191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f246192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f246193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s7 f246195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f246196i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 f246197m;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, android.util.SparseArray sparseArray3, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, int i17) {
        this.f246197m = i1Var;
        this.f246191d = sparseArray;
        this.f246192e = sparseArray2;
        this.f246193f = sparseArray3;
        this.f246194g = str;
        this.f246195h = s7Var;
        this.f246196i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseArray sparseArray;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$4");
        android.util.SparseArray sparseArray2 = this.f246191d;
        int size = sparseArray2.size();
        int i17 = 0;
        while (true) {
            sparseArray = this.f246193f;
            if (i17 >= size) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i17);
            r45.jj4 jj4Var = (r45.jj4) sparseArray2.get(keyAt);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.c(this.f246197m, 0, jj4Var, true)) {
                ca4.s0 s0Var = new ca4.s0(jj4Var);
                s0Var.d(0);
                s0Var.e(jj4Var.f459388d);
                this.f246192e.put(keyAt, s0Var);
                sparseArray.put(keyAt, jj4Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg put %s to downloadList", jj4Var.f459388d);
            }
            i17++;
        }
        if (sparseArray.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().b(this.f246194g, this.f246193f, this.f246192e, this.f246195h, this.f246196i, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$4");
    }
}
