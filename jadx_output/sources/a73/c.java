package a73;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gwallet.GWalletQueryProvider f1930a;

    public c(com.tencent.mm.plugin.gwallet.GWalletQueryProvider gWalletQueryProvider) {
        this.f1930a = gWalletQueryProvider;
    }

    public void a(b73.j jVar, android.content.Intent intent) {
        java.util.Objects.toString(jVar);
        com.tencent.mm.plugin.gwallet.GWalletQueryProvider gWalletQueryProvider = this.f1930a;
        gWalletQueryProvider.f142241f = true;
        gWalletQueryProvider.f142242g = intent.getStringArrayListExtra("RESPONSE_QUERY_DETAIL_INFO");
        gWalletQueryProvider.f142244i = intent.getIntExtra("RESPONSE_CODE", 0);
    }
}
