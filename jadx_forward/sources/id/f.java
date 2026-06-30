package id;

/* loaded from: classes5.dex */
public final class f implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f371984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id.e f371985b;

    public f(int i17, yz5.p pVar, id.e eVar) {
        this.f371984a = pVar;
        this.f371985b = eVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppModule.PocketMoneyHelper", "[onActivityResult] requestCode: " + i17 + " (expected: 50002), resultCode: " + i18);
        if (i17 != 50002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppModule.PocketMoneyHelper", "[onActivityResult] REQUEST CODE NOT MATCHED, passing through");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppModule.PocketMoneyHelper", "[onActivityResult] ✅ REQUEST CODE MATCHED!");
        yz5.p pVar = this.f371984a;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f371985b.f371981a, java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppModule.PocketMoneyHelper", "[onActivityResult] Callback invoked successfully");
        return true;
    }
}
