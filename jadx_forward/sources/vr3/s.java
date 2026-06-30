package vr3;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f521179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f521180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f521181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f521182g;

    public s(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f521179d = arrayList;
        this.f521180e = c16893x570516c7;
        this.f521181f = arrayList2;
        this.f521182g = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f521179d;
        boolean z17 = !arrayList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = this.f521180e;
        if (z17) {
            c16893x570516c7.f235823u.mo523x53d8522f(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Updated bizProfileUpdateData with " + arrayList.size() + " items");
        }
        java.util.ArrayList arrayList2 = this.f521181f;
        if (!arrayList2.isEmpty()) {
            c16893x570516c7.f235824v.mo523x53d8522f(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Updated bizProfileArticleUpdateData with " + arrayList2.size() + " items");
        }
        java.util.ArrayList arrayList3 = this.f521182g;
        if (!arrayList3.isEmpty()) {
            c16893x570516c7.f235825w.mo523x53d8522f(arrayList3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Updated bizProfilePicUpdateData with " + arrayList3.size() + " items");
        }
    }
}
