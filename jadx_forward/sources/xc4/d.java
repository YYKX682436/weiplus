package xc4;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f534886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xc4.p pVar) {
        super(0);
        this.f534886d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hm5.c cVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 d17 = this.f534886d.d1();
        if (d17.f38984xe83113e0.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<r45.e86> it = d17.f38984xe83113e0.iterator();
            while (it.hasNext()) {
                r45.e86 next = it.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(next.f454659d);
                str = "";
                if (f07 != null) {
                    str2 = f07.g2();
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String Q0 = f07.Q0();
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    java.lang.String G0 = f07.G0();
                    str3 = G0 != null ? G0 : "";
                    str = Q0;
                } else {
                    java.lang.String str4 = next.f454659d;
                    str2 = str4 == null ? "" : str4;
                    str3 = "";
                }
                arrayList.add(nm5.j.e(next.f454659d, str2, str, str3));
            }
            cVar = new hm5.c(arrayList, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        } else {
            hm5.c cVar2 = new hm5.c(new java.util.ArrayList(), null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
            cVar = cVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
        return cVar;
    }
}
