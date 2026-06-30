package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f166537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.l f166538f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.l lVar, java.lang.String str, java.lang.Boolean bool) {
        this.f166538f = lVar;
        this.f166536d = str;
        this.f166537e = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.l lVar = this.f166538f;
        if (this.f166536d.equals(lVar.f166545d.f166546d.f158811d) && this.f166537e.booleanValue()) {
            lVar.f166545d.f166547e.run();
        } else {
            lVar.f166545d.f166548f.f166513c.f166490f.e(null, null);
        }
    }
}
