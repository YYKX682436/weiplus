package lm3;

/* loaded from: classes10.dex */
public abstract class c0 {
    public static final java.lang.String a(r45.hf2 songInfo, fm3.u uVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        java.lang.String str;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n<MusicVideoStatusOpenParams>\n");
        sb6.append(c(songInfo));
        sb6.append('\n');
        if (uVar == null) {
            uVar = new fm3.u();
        }
        java.lang.String m75945x2fec8307 = songInfo.m75945x2fec8307(8);
        int i17 = uVar.f345669p;
        r45.xs4 xs4Var = null;
        xs4Var = null;
        xs4Var = null;
        xs4Var = null;
        r6 = null;
        r6 = null;
        java.lang.String str2 = null;
        xs4Var = null;
        if (i17 == 1) {
            java.lang.Long l17 = uVar.f345656c;
            java.lang.String str3 = uVar.f345657d;
            if (l17 != null && str3 != null) {
                long longValue = l17.longValue();
                if (longValue != 0) {
                    xs4Var = new r45.xs4();
                    xs4Var.set(0, pm0.v.u(longValue));
                    xs4Var.set(1, str3);
                    java.lang.String str4 = uVar.f345658e;
                    if (str4 != null) {
                        m75945x2fec8307 = str4;
                    }
                    xs4Var.set(2, m75945x2fec8307);
                    xs4Var.set(3, uVar.f345659f);
                }
            }
        } else if (i17 == 4 && (c19792x256d2725 = uVar.f345673t) != null) {
            r45.xs4 xs4Var2 = new r45.xs4();
            xs4Var2.set(0, pm0.v.u(c19792x256d2725.m76784x5db1b11()));
            xs4Var2.set(1, c19792x256d2725.m76803x6c285d75());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
            if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                str2 = c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
            }
            xs4Var2.set(2, str2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
            if (m76760x76845fea == null || (str = m76760x76845fea.m76184x8010e5e4()) == null) {
                str = "";
            }
            xs4Var2.set(3, str);
            xs4Var = xs4Var2;
        }
        if (xs4Var == null) {
            xs4Var = new r45.xs4();
        }
        java.lang.String a17 = zy2.pc.a(xs4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "makeContent(...)");
        sb6.append(a17);
        sb6.append("\n</MusicVideoStatusOpenParams>");
        return r26.b0.b(sb6.toString());
    }

    public static final java.lang.String b(java.lang.Object obj) {
        java.lang.String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        java.lang.String p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "escapeStringForXml(...)");
        return p17;
    }

    public static final java.lang.String c(r45.hf2 hf2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hf2Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<FinderMVSongInfo>\n    <songName>");
        sb6.append(b(hf2Var.m75945x2fec8307(0)));
        sb6.append("</songName>\n    <singer>");
        sb6.append(b(hf2Var.m75945x2fec8307(1)));
        sb6.append("</singer>\n    <musicDataUrl>");
        sb6.append(b(hf2Var.m75945x2fec8307(2)));
        sb6.append("</musicDataUrl>\n    <musicAppId>");
        sb6.append(b(hf2Var.m75945x2fec8307(3)));
        sb6.append("</musicAppId>\n    <musicWebUrl>");
        sb6.append(b(hf2Var.m75945x2fec8307(4)));
        sb6.append("</musicWebUrl>\n    <songId>");
        sb6.append(b(hf2Var.m75945x2fec8307(5)));
        sb6.append("</songId>\n    <lyric>");
        sb6.append(b(hf2Var.m75945x2fec8307(6)));
        sb6.append("</lyric>\n    <albumName>");
        sb6.append(b(hf2Var.m75945x2fec8307(7)));
        sb6.append("</albumName>\n    <albumUrl>");
        sb6.append(b(hf2Var.m75945x2fec8307(8)));
        sb6.append("</albumUrl>\n    <genre>");
        sb6.append(b(hf2Var.m75945x2fec8307(9)));
        sb6.append("</genre>\n    <publicTime>");
        sb6.append(b(hf2Var.m75945x2fec8307(10)));
        sb6.append("</publicTime>\n    <publicTimeS>");
        sb6.append(b(java.lang.Long.valueOf(hf2Var.m75942xfb822ef2(11))));
        sb6.append("</publicTimeS>\n    <extraInfo>");
        sb6.append(b(hf2Var.m75945x2fec8307(12)));
        sb6.append("</extraInfo>\n    <identification>");
        sb6.append(b(hf2Var.m75945x2fec8307(13)));
        sb6.append("</identification>\n    <duration>");
        sb6.append(hf2Var.m75939xb282bd08(14));
        sb6.append("</duration>\n    <musicOperationUrl>");
        r45.if2 if2Var = (r45.if2) hf2Var.m75936x14adae67(17);
        sb6.append(b(if2Var != null ? if2Var.m75945x2fec8307(0) : null));
        sb6.append("</musicOperationUrl>\n    <mid>");
        sb6.append(b(hf2Var.m75945x2fec8307(18)));
        sb6.append("</mid>\n</FinderMVSongInfo>\n");
        return r26.b0.b(sb6.toString());
    }
}
