package nq;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 f420454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420456f;

    public y(com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6, int i17, int i18) {
        this.f420454d = c10436x212919c6;
        this.f420455e = i17;
        this.f420456f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6 = this.f420454d;
        c10436x212919c6.f146426e = this.f420455e;
        c10436x212919c6.f146427f = this.f420456f;
        c10436x212919c6.f146429h = true;
    }
}
