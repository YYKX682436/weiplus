package sw4;

/* loaded from: classes8.dex */
public class f implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sw4.e f495018d;

    public f(sw4.e eVar) {
        this.f495018d = eVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        sw4.e eVar;
        android.os.Bundle bundleExtra;
        if (i17 != 3456 || intent == null || (eVar = this.f495018d) == null || (bundleExtra = intent.getBundleExtra("input_data")) == null) {
            return;
        }
        if (intent.getBooleanExtra("event_type", false)) {
            eVar.a(bundleExtra);
        } else {
            eVar.f(bundleExtra);
        }
    }
}
