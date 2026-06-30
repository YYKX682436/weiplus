package to1;

/* loaded from: classes5.dex */
public final class e implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro1.h f502442a;

    public e(ro1.h hVar) {
        this.f502442a = hVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("deviceId") : null;
        ro1.h hVar = this.f502442a;
        if (i17 != 0) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                hVar.a(stringExtra);
                return;
            }
        }
        hVar.mo162785x428b6afc(-2);
    }
}
