package l04;

/* loaded from: classes11.dex */
public class e implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f396383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396384b;

    public e(q80.d0 d0Var, android.content.Context context) {
        this.f396383a = d0Var;
        this.f396384b = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Feature", "openLiteApp fail %s.", this.f396383a.f442182a);
        l04.g.a(this.f396384b);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Feature", "openLiteApp success %s.", this.f396383a.f442182a);
    }
}
