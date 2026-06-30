package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class gb implements java.util.concurrent.Callable, wu5.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb f166163d;

    public gb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb hbVar) {
        this.f166163d = hbVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb hbVar = this.f166163d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hbVar.f166180d = java.lang.System.currentTimeMillis();
        try {
            return this.f166163d.call();
        } finally {
            this.f166163d.f166181e = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb hbVar2 = this.f166163d;
            hbVar2.f166182f = hbVar2.f166181e - this.f166163d.f166180d;
        }
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f166163d.f();
    }
}
