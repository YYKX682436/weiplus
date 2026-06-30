package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class yb implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb f166976d;

    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar) {
        this.f166976d = vbVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        boolean z17;
        k91.v5 v5Var;
        k91.v5 v5Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wb wbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wb(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xb xbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xb(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar = this.f166976d;
        if (!android.text.TextUtils.isEmpty(vbVar.f166816i)) {
            z17 = vbVar.A && !xbVar.mo51849xb9724478();
            return (z17 || (v5Var = vbVar.f166820p) == null) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.h(vbVar.f166816i, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bc(vbVar, null), wbVar) : android.util.Pair.create(v5Var, null);
        }
        z17 = vbVar.A && !xbVar.mo51849xb9724478();
        if (!z17 && (v5Var2 = vbVar.f166820p) != null) {
            return android.util.Pair.create(v5Var2, null);
        }
        java.lang.String str = vbVar.f166817m;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.i(str, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bc(vbVar, null), new k91.q4(str, wbVar), null);
    }
}
