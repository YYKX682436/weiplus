package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.b f144825a;

    public a(com.p314xaae8f345.mm.p642xad8b531f.b bVar) {
        this.f144825a = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public void a(int i17) {
        if (i17 == 0) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.booter.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p642xad8b531f.a.this.f144825a.b();
                }
            });
        } else if (i17 == 1 || i17 == 2) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.booter.a$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p642xad8b531f.a.this.f144825a.a();
                }
            });
        }
    }
}
