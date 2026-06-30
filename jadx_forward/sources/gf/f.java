package gf;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.p2936x80def495.InterfaceC25571x85e88f86 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f352576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2936x80def495.C25587x226dda3 f352578c;

    public f(int i17, com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe, com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3) {
        this.f352576a = i17;
        this.f352577b = c3955x2d990bfe;
        this.f352578c = c25587x226dda3;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25571x85e88f86
    /* renamed from: onWindowDestroy */
    public void mo95680xf42cf24b(int i17) {
        boolean isEmpty;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", this.f352576a + " onWindowDestroy id:" + i17);
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352577b;
        synchronized (c3955x2d990bfe.f129252o) {
            c3955x2d990bfe.f129251n.remove(java.lang.Integer.valueOf(i17));
            isEmpty = c3955x2d990bfe.f129251n.isEmpty();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new gf.e(i17));
        if (isEmpty && this.f352577b.f129245h) {
            this.f352578c.mo95668xde4c7d14();
        }
    }
}
