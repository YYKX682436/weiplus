package av1;

/* loaded from: classes5.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13086x84522870 f95712a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13086x84522870 activityC13086x84522870) {
        this.f95712a = activityC13086x84522870;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        java.util.Map map = tv3.e.f503886a;
        java.lang.String str = (java.lang.String) this.f95712a.f177016f.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getActivityCallbackId(...)");
        if (c16997xb0aa383a != null) {
            java.lang.String d17 = c16997xb0aa383a.d();
            java.lang.String str2 = c16997xb0aa383a.f237245f;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            java.lang.String str4 = c16997xb0aa383a.f237256t;
            java.util.ArrayList arrayList = c16997xb0aa383a.f237247h;
            java.lang.String str5 = c16997xb0aa383a.f237258v;
            int i17 = c16997xb0aa383a.f237253q;
            r45.pg4 pg4Var = c16997xb0aa383a.A;
            r1 = new com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a(d17, str3, str4, arrayList, str5, i17, (pg4Var != null ? pg4Var.f464551d : null) == null ? 0 : 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLifeMusicPanelFeatureService", "callRet " + str + ", " + r1 + ", true");
        yz5.p pVar = (yz5.p) ((java.util.LinkedHashMap) tv3.e.f503886a).get(str);
        if (pVar != null) {
            pVar.mo149xb9724478(r1, java.lang.Boolean.TRUE);
        }
    }
}
