package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class m0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f166310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l0 f166311b;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l0 l0Var, java.lang.Runnable runnable) {
        this.f166311b = l0Var;
        this.f166310a = runnable;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.n
    public void a() {
        this.f166311b.f166271g.f165908t = false;
        this.f166310a.run();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.n
    /* renamed from: cancel */
    public void mo50417xae7a2e7a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a092 = this.f166311b.f166271g;
        c12330xa378a092.f165908t = true;
        c12330xa378a092.c();
    }
}
