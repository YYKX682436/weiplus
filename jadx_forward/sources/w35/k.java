package w35;

/* loaded from: classes8.dex */
public final class k implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.l f524272d;

    public k(w35.l lVar) {
        this.f524272d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.ArrayList<com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2> parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("deviceList") : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (parcelableArrayList != null) {
            for (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 : parcelableArrayList) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
                wVar.f272549f = c10597xb1f0d2;
                arrayList.add(wVar);
            }
        }
        w35.l lVar = this.f524272d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f524273e, "get device open way count: " + arrayList.size());
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new w35.j(lVar, arrayList));
    }
}
