package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* loaded from: classes11.dex */
public class e implements xg3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o65.b f273788a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f273789b;

    public e(o65.b bVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f273788a = bVar;
        this.f273789b = u3Var;
    }

    @Override // xg3.n0
    public void a(final int i17, final java.lang.String str, final java.lang.String str2) {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.roomsdk.model.factory.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.e eVar = com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.e.this;
                o65.b bVar = eVar.f273788a;
                if (bVar != null) {
                    boolean z17 = bVar instanceof o65.f;
                    int i18 = i17;
                    if (z17) {
                        o65.f fVar = (o65.f) bVar;
                        fVar.f424756a = i18;
                        fVar.f424757b = str;
                        fVar.f424758c = str2;
                    }
                    bVar.a(0, i18, "", bVar);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = eVar.f273789b;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
        });
    }
}
