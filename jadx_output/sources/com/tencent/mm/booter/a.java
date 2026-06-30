package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.b f63292a;

    public a(com.tencent.mm.booter.b bVar) {
        this.f63292a = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        if (i17 == 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.booter.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.booter.a.this.f63292a.b();
                }
            });
        } else if (i17 == 1 || i17 == 2) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.booter.a$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.booter.a.this.f63292a.a();
                }
            });
        }
    }
}
