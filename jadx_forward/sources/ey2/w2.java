package ey2;

/* loaded from: classes2.dex */
public final class w2 extends ey2.f2 {
    @Override // ey2.f2
    public int N6(java.lang.String source, int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E3).mo141623x754a37bb()).r()).intValue() == 1;
        g92.b bVar = g92.b.f351302e;
        r45.e33 e33Var = (r45.e33) bVar.k2().d().m75936x14adae67(17);
        boolean m75933x41a8a7f2 = e33Var != null ? e33Var.m75933x41a8a7f2(2) : true;
        r45.e33 e33Var2 = (r45.e33) bVar.k2().d().m75936x14adae67(17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxMessageTabStateCacheVM", "[findTabIndex] isEnable=" + z17 + " enableLike=" + m75933x41a8a7f2 + " enableComment=" + (e33Var2 != null ? e33Var2.m75933x41a8a7f2(3) : true));
        int i18 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(vy2.a.f522987m[1]) != null ? 1 : 0;
        if (i17 == 3) {
            int O6 = O6(source, "WxMessageEntryRight", username);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxMessageTabStateCacheVM", "[findTabIndex] use extInfo index=" + O6);
            if (O6 != -1) {
                return O6;
            }
        }
        return i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ey2.f2
    public int O6(java.lang.String source, java.lang.String path, java.lang.String str) {
        r45.k03 k03Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(path);
        int i17 = 1;
        if ((I0 != null && I0.f455427n == 4) != true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" [getEnterTabIndexBy] path=");
            sb6.append(path);
            sb6.append(", index=-1,show_ext_info_type:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f455427n) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxMessageTabStateCacheVM", sb6.toString());
            return -1;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = I0.f455428o;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            k03Var = new r45.k03();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(k03Var.mo11468x92b714fd(g17));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        } else {
            k03Var = new r45.k03();
        }
        if (k03Var.m75939xb282bd08(0) == 1) {
            i17 = 0;
        } else if (k03Var.m75939xb282bd08(0) != 2) {
            i17 = -1;
        }
        this.f338906f.put(str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxMessageTabStateCacheVM", source + " [getEnterTabIndexBy] path=" + path + ", index=" + i17);
        return i17;
    }

    @Override // ey2.f2
    public void R6(int i17, java.lang.Integer[] redDotFlags, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotFlags, "redDotFlags");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageLike");
        r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageComment");
        redDotFlags[0] = java.lang.Integer.valueOf(Q6(I0));
        redDotFlags[1] = java.lang.Integer.valueOf(Q6(I02));
    }
}
