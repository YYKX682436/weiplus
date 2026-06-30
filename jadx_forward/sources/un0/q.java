package un0;

/* loaded from: classes3.dex */
public final class q implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f510942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f510943b;

    public q(boolean z17, v65.n nVar) {
        this.f510942a = z17;
        this.f510943b = nVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#requestPermission onResult resultCode=" + i17);
        un0.h hVar = new un0.h(false, null, 0, false, null, 0L, null, 0, 0, null, null, null, null, null, 16383, null);
        boolean z17 = i17 == -1;
        hVar.f510885a = z17;
        hVar.f510888d = this.f510942a;
        if (z17 && intent != null) {
            hVar.f510886b = intent;
        }
        hVar.f510887c = i17;
        this.f510943b.a(hVar);
    }
}
