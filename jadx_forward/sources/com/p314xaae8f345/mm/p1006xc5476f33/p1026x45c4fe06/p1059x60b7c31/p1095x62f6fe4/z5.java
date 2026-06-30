package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f163708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f163709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f6 f163710h;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f6 f6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str, java.lang.ref.WeakReference weakReference, int i17) {
        this.f163710h = f6Var;
        this.f163706d = e9Var;
        this.f163707e = str;
        this.f163708f = weakReference;
        this.f163709g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String o17;
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f6.f163340g.iterator();
        nm5.j jVar = null;
        while (it.hasNext() && (jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b6) it.next()).a(this.f163706d.t3(), this.f163707e)) == null) {
        }
        java.lang.ref.WeakReference weakReference = this.f163708f;
        if (weakReference.get() == null || !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) weakReference.get()).mo50262x39e05d35()) {
            return;
        }
        int i17 = this.f163709g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f6 f6Var = this.f163710h;
        if (jVar == null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) weakReference.get()).a(i17, f6Var.o("fail:file not found"));
            return;
        }
        int ordinal = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e6) jVar.a(0)).ordinal();
        if (ordinal == 0) {
            o17 = f6Var.o("fail:file not found");
        } else if (ordinal != 2) {
            o17 = f6Var.o("fail");
        } else {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("width", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c6) jVar.a(1)).f163275a));
            hashMap.put("height", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c6) jVar.a(1)).f163276b));
            hashMap.put("orientation", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c6) jVar.a(1)).f163277c);
            hashMap.put("type", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c6) jVar.a(1)).f163278d);
            o17 = f6Var.p("ok", hashMap);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) weakReference.get()).a(i17, o17);
    }
}
