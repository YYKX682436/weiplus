package pb4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f434724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f434725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.util.ArrayList arrayList, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f434723d = str;
        this.f434724e = arrayList;
        this.f434725f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        pb4.c cVar = new pb4.c(this.f434723d, this.f434724e, this.f434725f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        return cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        java.lang.Object mo150x989b7ca4 = ((pb4.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSnsStarInfoFp >> ");
        java.lang.String str = this.f434723d;
        sb6.append(str);
        sb6.append(" snsInfoSize: ");
        java.util.ArrayList arrayList = this.f434724e;
        sb6.append(arrayList.size());
        sb6.append(' ');
        boolean z17 = this.f434725f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        boolean isEmpty = arrayList.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        pb4.e eVar = pb4.e.f434729a;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "fpSize is 0");
            eVar.a(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
            return f0Var;
        }
        int m70357x3fdd41df = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.i0(arrayList)).m70357x3fdd41df();
        eVar.c(str, m70357x3fdd41df);
        if (z17) {
            eVar.d(str, m70357x3fdd41df);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eVar.o(eVar.l((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next()), str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        return f0Var;
    }
}
