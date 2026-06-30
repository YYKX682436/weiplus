package hr;

/* loaded from: classes9.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(int i17, int i18, java.util.List md5List, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i19 & 2) != 0 ? 0 : i18;
        md5List = (i19 & 4) != 0 ? kz5.p0.f395529d : md5List;
        gVar = (i19 & 8) != 0 ? null : gVar;
        gVar2 = (i19 & 16) != 0 ? null : gVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md5List, "md5List");
        r45.xe xeVar = new r45.xe();
        r45.ye yeVar = new r45.ye();
        xeVar.f471535e = i17;
        xeVar.f471536f = new java.util.LinkedList(md5List);
        xeVar.f471537g = i18;
        xeVar.f471538h = gVar;
        xeVar.f471539i = gVar2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = xeVar;
        lVar.f152198b = yeVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        lVar.f152200d = 697;
        p(lVar.a());
    }
}
