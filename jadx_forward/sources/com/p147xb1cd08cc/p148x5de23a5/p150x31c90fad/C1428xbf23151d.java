package com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad;

/* renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment */
/* loaded from: classes13.dex */
public class C1428xbf23151d extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: d, reason: collision with root package name */
    public final j7.a f125502d;

    /* renamed from: e, reason: collision with root package name */
    public final j7.r f125503e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f125504f;

    /* renamed from: g, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d f125505g;

    /* renamed from: h, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.r f125506h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f125507i;

    public C1428xbf23151d() {
        j7.a aVar = new j7.a();
        this.f125503e = new j7.t(this);
        this.f125504f = new java.util.HashSet();
        this.f125502d = aVar;
    }

    public final void j0(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d c1428xbf23151d = this.f125505g;
        if (c1428xbf23151d != null) {
            ((java.util.HashSet) c1428xbf23151d.f125504f).remove(this);
            this.f125505g = null;
        }
        j7.q qVar = com.p147xb1cd08cc.p148x5de23a5.c.b(context).f125460i;
        qVar.getClass();
        com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d d17 = qVar.d(abstractC1104xc1ad431d, null, j7.q.e(context));
        this.f125505g = d17;
        if (m7427xb2c87fbf(d17)) {
            return;
        }
        ((java.util.HashSet) this.f125505g.f125504f).add(this);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this;
        while (componentCallbacksC1101xa17d4670.m7453x12a9d210() != null) {
            componentCallbacksC1101xa17d4670 = componentCallbacksC1101xa17d4670.m7453x12a9d210();
        }
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7446xe17c5d07 = componentCallbacksC1101xa17d4670.m7446xe17c5d07();
        if (m7446xe17c5d07 == null) {
            android.util.Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            j0(mo7438x76847179(), m7446xe17c5d07);
        } catch (java.lang.IllegalStateException unused) {
            android.util.Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        this.f125502d.c();
        com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d c1428xbf23151d = this.f125505g;
        if (c1428xbf23151d != null) {
            ((java.util.HashSet) c1428xbf23151d.f125504f).remove(this);
            this.f125505g = null;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        super.mo7400x3f5eee52();
        this.f125507i = null;
        com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d c1428xbf23151d = this.f125505g;
        if (c1428xbf23151d != null) {
            ((java.util.HashSet) c1428xbf23151d.f125504f).remove(this);
            this.f125505g = null;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        this.f125502d.d();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        this.f125502d.e();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: toString */
    public java.lang.String mo7591x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.mo7591x9616526c());
        sb6.append("{parent=");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = m7453x12a9d210();
        if (m7453x12a9d210 == null) {
            m7453x12a9d210 = this.f125507i;
        }
        sb6.append(m7453x12a9d210);
        sb6.append("}");
        return sb6.toString();
    }
}
