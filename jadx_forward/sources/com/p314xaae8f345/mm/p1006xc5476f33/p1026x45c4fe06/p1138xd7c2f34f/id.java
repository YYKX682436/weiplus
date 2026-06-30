package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class id implements com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f166208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nd f166210c;

    public id(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nd ndVar) {
        this.f166208a = atomicReference;
        this.f166209b = str;
        this.f166210c = ndVar;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.i
    public void a(android.os.Parcelable parcelable) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) parcelable;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f166208a;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.f166407a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hd(e1Var, c10750x9556b48c));
            atomicReference.set(null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(this.f166209b, this.f166210c);
    }
}
