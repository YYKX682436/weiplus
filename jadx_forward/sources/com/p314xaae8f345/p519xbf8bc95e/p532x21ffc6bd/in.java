package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class in extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im {

    /* renamed from: i, reason: collision with root package name */
    protected boolean f131444i;

    /* renamed from: j, reason: collision with root package name */
    protected java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im> f131445j;

    public in(boolean z17) {
        this.f131445j = null;
        this.f131444i = z17;
        this.f131445j = new java.util.ArrayList();
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar) {
        if (imVar == null) {
            return;
        }
        this.f131445j.add(imVar);
    }

    public final void c() {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im> list = this.f131445j;
        if (list == null) {
            return;
        }
        list.clear();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(long j17) {
        int size;
        super.a(j17);
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im> list = this.f131445j;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131445j.get(i17);
            if (imVar != null) {
                imVar.a(j17);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        int size;
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im> list = this.f131445j;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131445j.get(i17);
            if (imVar != null) {
                if (this.f131444i) {
                    imVar.a(f17, interpolator);
                } else {
                    imVar.a(f17, imVar.f131441f);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final boolean a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im> list;
        int size;
        boolean a17 = super.a(c4247x704e24df, c4247x704e24df2);
        if (!a17 || (list = this.f131445j) == null || (size = list.size()) == 0) {
            return false;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131445j.get(i17);
            if (imVar != null) {
                a17 = a17 && imVar.a(c4247x704e24df, c4247x704e24df2);
            }
        }
        return a17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(com.tencent.mapsdk.internal.im.b bVar) {
        int size;
        super.a(bVar);
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im> list = this.f131445j;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131445j.get(i17);
            if (imVar != null) {
                imVar.a(bVar);
            }
        }
    }
}
