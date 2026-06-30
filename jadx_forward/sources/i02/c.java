package i02;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i02.h f368039i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i02.h hVar, long j17, com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 c26663xc1a70300, java.lang.String str) {
        super(j17, c26663xc1a70300);
        this.f368039i = hVar;
        this.f368038h = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        try {
            return this.f368039i.j().m104830xc45041ae(this.f368038h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadStateSync faile: " + e17.toString());
            return null;
        }
    }
}
