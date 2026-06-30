package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class e extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 f241459a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116) {
        this.f241459a = c17345xe981d116;
    }

    @Override // qt5.f
    public void a() {
        this.f241459a.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.f(this));
        if (((qt5.c) this.f241459a.f296835e).f448190b) {
            uo.n.f511055a.f(this.f241459a.getContext());
            return;
        }
        uo.n nVar = uo.n.f511055a;
        nVar.a(this.f241459a.getContext(), qt5.c.class);
        nVar.g(3, true, new yz5.a() { // from class: com.tencent.mm.plugin.scanner.view.e$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                boolean z17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.e.this;
                if ((eVar.f241459a.getContext() instanceof android.app.Activity) && !((android.app.Activity) eVar.f241459a.getContext()).isFinishing()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = eVar.f241459a;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116.A;
                    if (!((qt5.c) c17345xe981d116.f296835e).f448190b) {
                        z17 = false;
                        return java.lang.Boolean.valueOf(z17);
                    }
                }
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }, new yz5.p() { // from class: com.tencent.mm.plugin.scanner.view.e$$b
            @Override // yz5.p
            /* renamed from: invoke */
            public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.e.this;
                eVar.getClass();
                eVar.f241459a.g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.g(eVar, (java.lang.Integer) obj, (yz5.l) obj2));
                return null;
            }
        });
    }
}
