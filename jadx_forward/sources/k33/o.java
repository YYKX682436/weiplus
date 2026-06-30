package k33;

/* loaded from: classes13.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f385405a;

    /* renamed from: b, reason: collision with root package name */
    public long f385406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15675x95c3ae90 f385407c;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15675x95c3ae90 c15675x95c3ae90, java.lang.ref.WeakReference weakReference) {
        this.f385407c = c15675x95c3ae90;
        this.f385405a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15675x95c3ae90 c15675x95c3ae90;
        mo50303x856b99f0(message.what);
        java.lang.ref.WeakReference weakReference = this.f385405a;
        if (weakReference == null || (c15675x95c3ae90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15675x95c3ae90) weakReference.get()) == null) {
            return;
        }
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15675x95c3ae90 c15675x95c3ae902 = this.f385407c;
        if (i17 == 0) {
            c15675x95c3ae902.f220186e = 0;
        } else if (i17 == 1) {
            c15675x95c3ae902.getClass();
            c15675x95c3ae90.f220199u.mo50303x856b99f0(1);
        } else {
            mo50303x856b99f0(2);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15675x95c3ae90.f220184z;
        }
    }
}
