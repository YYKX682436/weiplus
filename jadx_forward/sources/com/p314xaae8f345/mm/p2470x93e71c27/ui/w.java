package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes11.dex */
public class w implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1, com.p314xaae8f345.mm.p2470x93e71c27.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f273566d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f273567e = new java.util.HashMap();

    public w(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var) {
        this.f273566d = j1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        return b(str).W0(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var) {
        b(n1Var.f272434m).X9(n1Var);
        this.f273566d.X9(n1Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        return b(str).Zg(str, i17, i18, i19);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k1
    public boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 b17 = b(str);
        if (b17 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.k1) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.k1) b17).a(str);
        }
        return true;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 b(java.lang.String str) {
        if (str == null) {
            return this.f273566d;
        }
        synchronized (this.f273567e) {
            for (java.util.Map.Entry entry : this.f273567e.entrySet()) {
                if (str.endsWith((java.lang.String) entry.getKey())) {
                    return (com.p314xaae8f345.mm.p2470x93e71c27.ui.j1) entry.getValue();
                }
            }
            java.util.Iterator it = ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2470x93e71c27.ui.m1.class)).all().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.m1) ((fs.q) it.next()).get()).get(str);
                if (j1Var != null) {
                    return j1Var;
                }
            }
            return this.f273566d;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String str) {
        return b(str).mo560xd586ddb5(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f273566d.uc();
    }
}
