package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f166520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f f166521e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        this.f166521e = fVar;
        this.f166520d = c11809xbc286be4;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f394148d).a(this);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e eVar = this.f166521e.f166513c;
            eVar.f166490f.e(this.f166520d, eVar.f166488d.f166443o);
        } finally {
            this.f166521e.f166513c.f166488d.c();
        }
    }
}
