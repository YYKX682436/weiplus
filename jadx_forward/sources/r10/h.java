package r10;

/* loaded from: classes3.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f450109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450110e;

    public h(java.lang.Class cls, yz5.l lVar) {
        this.f450109d = cls;
        this.f450110e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = (android.os.Parcelable) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOpenAsyncInfo", "invokeAsync callback, task: ".concat(this.f450109d.getSimpleName()));
        if (parcelable != null) {
            this.f450110e.mo146xb9724478(parcelable);
        }
    }
}
