package nq;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq.e f420397d;

    public d(nq.e eVar) {
        this.f420397d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq.e eVar = this.f420397d;
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = eVar.f420398d.f420408i;
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            surfaceHolderCallback2C10435xb52e77fb.b();
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb2 = eVar.f420398d.f420408i;
        if (surfaceHolderCallback2C10435xb52e77fb2 != null) {
            surfaceHolderCallback2C10435xb52e77fb2.setVisibility(4);
        }
    }
}
