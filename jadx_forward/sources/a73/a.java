package a73;

/* loaded from: classes15.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a73.b f83461a;

    public a(a73.b bVar) {
        this.f83461a = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.C16082xfb3f4f99 c16082xfb3f4f99 = this.f83461a.f83462a;
        b73.i iVar = c16082xfb3f4f99.f223772d;
        if (iVar == null) {
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList = c16082xfb3f4f99.f223776h;
        a73.c cVar = new a73.c(c16082xfb3f4f99);
        iVar.c("query details");
        android.content.Intent intent = new android.content.Intent();
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IabHelper", "query list is empty!");
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
            android.os.Bundle g17 = ((j6.a) iVar.f99750b).g(3, iVar.f99749a.getPackageName(), "inapp", bundle);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabHelper", e18, "", new java.lang.Object[0]);
            b73.j jVar4 = new b73.j(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "Remote exception while starting purchase flow");
            intent.putExtra("RESPONSE_CODE", 6);
            intent.putExtra("QUERY_DETAIL_INFO", new java.util.ArrayList());
            cVar.a(jVar4, intent);
            return true;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        a73.b bVar = this.f83461a;
        b73.i iVar = bVar.f83462a.f223772d;
        if (iVar != null) {
            iVar.d();
        }
        bVar.f83462a.f223772d = null;
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m785x9616526c() {
        return super.toString() + "|onIabSetupFinished";
    }
}
