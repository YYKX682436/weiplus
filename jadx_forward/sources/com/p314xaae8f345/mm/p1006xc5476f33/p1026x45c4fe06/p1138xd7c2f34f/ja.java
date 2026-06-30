package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ja extends com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h implements im5.a {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f166235e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f166236f;

    /* renamed from: g, reason: collision with root package name */
    public ph1.p f166237g;

    public ja(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str, ph1.p pVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f166235e = c11510xdd90c2f2;
        this.f166236f = str;
        this.f166237g = pVar;
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.mo46316x322b85(this);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h
    public void a(android.os.Parcelable parcelable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6 c12348x9f2a4bd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6) parcelable;
        if (c12348x9f2a4bd6 == null) {
            return;
        }
        try {
            int i17 = c12348x9f2a4bd6.f165980d;
            if (i17 == 1) {
                ph1.p pVar = this.f166237g;
                if (pVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f = c12348x9f2a4bd6.f165981e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11666xa31a0b7f);
                    pVar.a(c11666xa31a0b7f);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult, appId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f166235e;
            sb6.append(c11510xdd90c2f2 != null ? c11510xdd90c2f2.f156336n : null);
            sb6.append(", module:");
            sb6.append(this.f166236f);
            sb6.append(", succeed:");
            sb6.append(c12348x9f2a4bd6.f165983g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModularizingPkgRetrieverContract.IPCCallback", sb6.toString());
            if (c12348x9f2a4bd6.f165983g) {
                ph1.p pVar2 = this.f166237g;
                if (pVar2 != null) {
                    java.util.List list = c12348x9f2a4bd6.f165982f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                    pVar2.b(true, list);
                }
            } else {
                ph1.p pVar3 = this.f166237g;
                if (pVar3 != null) {
                    pVar3.b(false, null);
                }
            }
            mo10668x2efc64();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ModularizingPkgRetrieverContract.IPCCallback", "IPCCallTask.onCallback t=" + th6);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ia(th6));
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f166235e;
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.n2(this);
        }
        this.f166235e = null;
        this.f166237g = null;
    }
}
