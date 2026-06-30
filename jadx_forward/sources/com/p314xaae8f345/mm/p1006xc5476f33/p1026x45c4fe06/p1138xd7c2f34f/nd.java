package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class nd implements com.p314xaae8f345.mm.p794xb0fa9b5e.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f166360b;

    public nd(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f166359a = str;
        this.f166360b = atomicReference;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s0
    public void a() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(this.f166359a, this);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f166360b;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.f166407a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            e1Var.a();
            atomicReference.set(null);
        }
    }
}
