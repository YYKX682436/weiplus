package a73;

/* loaded from: classes15.dex */
public class f implements b73.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a73.g f1934b;

    public f(a73.g gVar, boolean z17) {
        this.f1934b = gVar;
        this.f1933a = z17;
    }

    @Override // b73.h
    public void a(b73.j jVar, android.content.Intent intent) {
        java.util.Objects.toString(jVar);
        java.util.Objects.toString(intent);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.gwallet.ACTION_CONSUME_RESPONSE");
        if (this.f1933a) {
            intent2.putExtra("RESPONSE_CODE", 100000001);
        } else {
            intent2.putExtra("RESPONSE_CODE", 0);
        }
        com.tencent.mm.plugin.gwallet.GWalletUI gWalletUI = this.f1934b.f1935a;
        int i17 = com.tencent.mm.plugin.gwallet.GWalletUI.f142245f;
        gWalletUI.setResult(-1, intent2);
        gWalletUI.finish();
    }
}
