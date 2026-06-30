package lf4;

/* loaded from: classes4.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.ArrayList a(java.lang.String username, boolean z17) {
        java.util.List<nf4.j> P0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            ef4.v vVar = ef4.w.f334001t;
            nf4.l i17 = vVar.i();
            boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), username);
            int e17 = c01.id.e();
            ef4.n.f333993a.a();
            P0 = i17.W0(username, D0, e17 - 86400);
        } else {
            ef4.v vVar2 = ef4.w.f334001t;
            nf4.l i18 = vVar2.i();
            boolean D02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar2.e(), username);
            int e18 = c01.id.e();
            ef4.n.f333993a.a();
            P0 = i18.P0(username, D02, e18 - 86400, true);
        }
        for (nf4.j jVar : P0) {
            r45.lf6 y07 = jVar.y0();
            r45.oe6 oe6Var = y07.f460965h;
            if (oe6Var != null && oe6Var.f463738e.size() != 0) {
                if4.g storyItemScene = (2 & 2) != 0 ? if4.g.f372783d : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyItemScene, "storyItemScene");
                arrayList.add(new if4.f(jVar, jVar.y0(), storyItemScene));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDb story username " + username + ' ' + arrayList.size() + " content " + ((r45.xe6) y07.f460965h.f463738e.get(0)).f471558h + " and " + ((r45.xe6) y07.f460965h.f463738e.get(0)).f471556f + " id:" + jVar.f69410x443468b + " storyUsername: " + jVar.f69412xdde069b + " tryCount:" + jVar.v0().f472551e + " flag:" + jVar.f69406x52c1d072);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList b(java.lang.String username, java.lang.String date) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) ef4.w.f334001t.i().d1(username, (int) (new java.text.SimpleDateFormat("yyyy-MM-dd").parse(date).getTime() / 1000))).iterator();
        while (it.hasNext()) {
            nf4.j jVar = (nf4.j) it.next();
            r45.lf6 y07 = jVar.y0();
            r45.oe6 oe6Var = y07.f460965h;
            if (oe6Var != null && oe6Var.f463738e.size() != 0) {
                arrayList.add(new if4.f(jVar, jVar.y0(), if4.g.f372783d));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDbByDate story username " + username + ' ' + arrayList.size() + " content " + ((r45.xe6) y07.f460965h.f463738e.get(0)).f471558h + " and " + ((r45.xe6) y07.f460965h.f463738e.get(0)).f471556f + " id:" + jVar.f69410x443468b + " storyUsername: " + jVar.f69412xdde069b);
            }
        }
        return arrayList;
    }

    public final if4.f c(java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.GalleryController", "LogStory: loadSyncData ".concat(username));
        ef4.v vVar = ef4.w.f334001t;
        nf4.f y07 = vVar.g().y0(username);
        if (y07.f66294x10ed17fb == 0) {
            return null;
        }
        if (z17) {
            nf4.j L0 = vVar.i().L0(y07.f66294x10ed17fb);
            nf4.j jVar = new nf4.j();
            jVar.f69410x443468b = y07.f66294x10ed17fb;
            jVar.f69403xac3be4e = y07.f66293xb7d4dd1d;
            jVar.f69412xdde069b = y07.m149511x6bf53a6c();
            r45.lf6 lf6Var = new r45.lf6();
            r45.oe6 oe6Var = new r45.oe6();
            r45.tl5 tl5Var = new r45.tl5();
            tl5Var.f468086e = 0.0f;
            tl5Var.f468085d = 0.0f;
            lf6Var.f460964g = tl5Var;
            lf6Var.f460965h = oe6Var;
            lf6Var.f460961d = "";
            lf6Var.f460963f = 0;
            lf6Var.f460962e = y07.m149511x6bf53a6c();
            lf6Var.f460963f = y07.f66293xb7d4dd1d;
            r45.xe6 xe6Var = new r45.xe6();
            xe6Var.f471554d = "empty_" + c01.id.c();
            if (L0 != null && L0.y0().f460968n == 0) {
                java.lang.String str = y07.f66285x140d09b4;
                if (str == null) {
                    str = "";
                }
                xe6Var.f471558h = str;
                java.lang.String str2 = y07.f66286xfb4868ef;
                xe6Var.f471556f = str2 != null ? str2 : "";
            }
            lf6Var.f460965h.f463738e.add(xe6Var);
            jVar.D0(lf6Var);
            return new if4.f(jVar, lf6Var, null, 4, null);
        }
        nf4.j jVar2 = new nf4.j();
        jVar2.f69410x443468b = y07.f66294x10ed17fb;
        jVar2.f69403xac3be4e = y07.f66293xb7d4dd1d;
        jVar2.f69412xdde069b = y07.m149511x6bf53a6c();
        r45.lf6 lf6Var2 = new r45.lf6();
        r45.oe6 oe6Var2 = new r45.oe6();
        r45.tl5 tl5Var2 = new r45.tl5();
        tl5Var2.f468086e = 0.0f;
        tl5Var2.f468085d = 0.0f;
        lf6Var2.f460964g = tl5Var2;
        lf6Var2.f460965h = oe6Var2;
        lf6Var2.f460961d = "";
        lf6Var2.f460963f = 0;
        lf6Var2.f460962e = y07.m149511x6bf53a6c();
        lf6Var2.f460963f = y07.f66293xb7d4dd1d;
        r45.xe6 xe6Var2 = new r45.xe6();
        xe6Var2.f471554d = "empty_" + c01.id.c();
        java.lang.String str3 = y07.f66285x140d09b4;
        if (str3 == null) {
            str3 = "";
        }
        xe6Var2.f471558h = str3;
        java.lang.String str4 = y07.f66286xfb4868ef;
        xe6Var2.f471556f = str4 != null ? str4 : "";
        long j17 = y07.f66281xa7075739;
        xe6Var2.f471573z = j17 > 0 ? (float) (j17 / 1000.0d) : 0.0f;
        lf6Var2.f460965h.f463738e.add(xe6Var2);
        jVar2.D0(lf6Var2);
        return new if4.f(jVar2, lf6Var2, null, 4, null);
    }
}
