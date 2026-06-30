package a73;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a73.b f1928a;

    public a(a73.b bVar) {
        this.f1928a = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        com.tencent.mm.plugin.gwallet.GWalletQueryProvider gWalletQueryProvider = this.f1928a.f1929a;
        b73.i iVar = gWalletQueryProvider.f142239d;
        if (iVar == null) {
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList = gWalletQueryProvider.f142243h;
        a73.c cVar = new a73.c(gWalletQueryProvider);
        iVar.c("query details");
        android.content.Intent intent = new android.content.Intent();
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IabHelper", "query list is empty!");
            b73.j jVar = new b73.j(5, "no query list or is empty");
            intent.putExtra("RESPONSE_CODE", 5);
            intent.putExtra("QUERY_DETAIL_INFO", new java.util.ArrayList());
            cVar.a(jVar, intent);
            return true;
        }
        try {
            arrayList.size();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            android.os.Bundle g17 = ((j6.a) iVar.f18217b).g(3, iVar.f18216a.getPackageName(), "inapp", bundle);
            int e17 = iVar.e(g17);
            java.lang.String.valueOf(e17);
            if (e17 != 0) {
                b73.j jVar2 = new b73.j(e17, "cannot query details");
                intent.putExtra("RESPONSE_CODE", e17);
                cVar.a(jVar2, intent);
                return true;
            }
            b73.j jVar3 = new b73.j(e17, "query list ok!");
            intent.putExtra("RESPONSE_CODE", e17);
            intent.putExtra("RESPONSE_QUERY_DETAIL_INFO", g17.getStringArrayList("DETAILS_LIST"));
            cVar.a(jVar3, intent);
            java.util.Iterator<java.lang.String> it = g17.getStringArrayList("DETAILS_LIST").iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        } catch (android.os.RemoteException e18) {
            iVar.g("RemoteException while launching query details ");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IabHelper", e18, "", new java.lang.Object[0]);
            b73.j jVar4 = new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "Remote exception while starting purchase flow");
            intent.putExtra("RESPONSE_CODE", 6);
            intent.putExtra("QUERY_DETAIL_INFO", new java.util.ArrayList());
            cVar.a(jVar4, intent);
            return true;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        a73.b bVar = this.f1928a;
        b73.i iVar = bVar.f1929a.f142239d;
        if (iVar != null) {
            iVar.d();
        }
        bVar.f1929a.f142239d = null;
        return true;
    }

    public java.lang.String toString() {
        return super.toString() + "|onIabSetupFinished";
    }
}
