package a73;

/* loaded from: classes15.dex */
public class h implements b73.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gwallet.GWalletUI f1937b;

    public h(com.tencent.mm.plugin.gwallet.GWalletUI gWalletUI, boolean z17) {
        this.f1937b = gWalletUI;
        this.f1936a = z17;
    }

    @Override // b73.h
    public void a(b73.j jVar, android.content.Intent intent) {
        java.util.Objects.toString(intent);
        if (intent == null) {
            intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
            intent.putExtra("RESPONSE_CODE", jVar.a());
        } else {
            intent.setAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
        }
        if (!this.f1936a) {
            intent.putExtra("is_direct", false);
        }
        this.f1937b.sendBroadcast(intent);
    }
}
