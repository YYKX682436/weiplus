package dd4;

/* loaded from: classes4.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final dd4.s a(r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        dd4.s sVar = (dd4.s) dd4.s.d().get(media.f459388d);
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
            return sVar;
        }
        dd4.s sVar2 = new dd4.s(media, null);
        java.util.HashMap d17 = dd4.s.d();
        java.lang.String Id = media.f459388d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
        d17.put(Id, sVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        return sVar2;
    }
}
