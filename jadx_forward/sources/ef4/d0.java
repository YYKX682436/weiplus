package ef4;

/* loaded from: classes4.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(int i17) {
        java.util.LinkedList linkedList;
        r45.xe6 xe6Var;
        java.util.LinkedList linkedList2;
        r45.xe6 xe6Var2;
        java.util.LinkedList linkedList3;
        r45.xe6 xe6Var3;
        ef4.v vVar = ef4.w.f334001t;
        nf4.j J0 = vVar.i().J0(i17);
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date(((J0 != null ? java.lang.Integer.valueOf(J0.f69403xac3be4e) : null) != null ? r4.intValue() : 0L) * 1000));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        nf4.l i18 = vVar.i();
        i18.f418405h.mo70514xb06685ab("MMStoryInfo", nf4.j.N + "=?", new java.lang.String[]{"" + i17});
        nf4.j b17 = ef4.e0.f333974a.b(vVar.e());
        r45.lf6 y07 = b17.y0();
        r45.oe6 oe6Var = y07.f460965h;
        java.lang.String str = (oe6Var == null || (linkedList3 = oe6Var.f463738e) == null || (xe6Var3 = (r45.xe6) kz5.n0.a0(linkedList3, 0)) == null) ? null : xe6Var3.f471558h;
        r45.oe6 oe6Var2 = y07.f460965h;
        java.lang.String str2 = (oe6Var2 == null || (linkedList2 = oe6Var2.f463738e) == null || (xe6Var2 = (r45.xe6) kz5.n0.a0(linkedList2, 0)) == null) ? null : xe6Var2.f471556f;
        r45.oe6 oe6Var3 = y07.f460965h;
        ef4.a0.f333968a.a(vVar.e(), b17.f69410x443468b, b17.f69403xac3be4e, str, str2, ((oe6Var3 == null || (linkedList = oe6Var3.f463738e) == null || (xe6Var = (r45.xe6) kz5.n0.a0(linkedList, 0)) == null) ? 0.0f : xe6Var.f471573z) * 1000);
        nf4.h y08 = vVar.h().y0(format);
        if (y08 != null) {
            int i19 = y08.f69195x28f0318a - 1;
            y08.f69195x28f0318a = i19;
            if (i19 <= 0) {
                vVar.h().f418390d.mo70514xb06685ab("MMStoryHistoryItem", "date=?", new java.lang.String[]{format});
                return;
            }
            java.lang.String str3 = J0 != null ? J0.f69412xdde069b : null;
            if (str3 != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) vVar.i().d1(str3, (int) (new java.text.SimpleDateFormat("yyyy-MM-dd").parse(format).getTime() / 1000));
                if (!arrayList.isEmpty()) {
                    ((nf4.j) arrayList.get(0)).f69409x76e81a5a |= 16;
                    vVar.i().i1((int) ((nf4.j) arrayList.get(0)).f72763xa3c65b86, (nf4.j) arrayList.get(0));
                    long j17 = ((nf4.j) arrayList.get(0)).f72763xa3c65b86;
                    int i27 = ((nf4.j) arrayList.get(0)).f69409x76e81a5a;
                }
            }
            vVar.h().z0(y08);
        }
    }

    public final nf4.j b(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ef4.v vVar = ef4.w.f334001t;
        nf4.l i17 = vVar.i();
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), username);
        nf4.j jVar = new nf4.j();
        java.lang.String str = "select *,rowid from MMStoryInfo " + i17.y0(username, D0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        java.lang.String str2 = nf4.l.f418392n;
        if (!D0) {
            str2 = " AND " + nf4.l.f418393o + str2;
        }
        sb6.append(str2);
        android.database.Cursor f17 = i17.f418405h.f(sb6.toString() + " limit 1", null, 2);
        if (f17.moveToFirst()) {
            jVar.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return jVar;
    }

    public final long c(nf4.j storyInfo, r45.df6 storyObj, int i17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyInfo, "storyInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyObj, "storyObj");
        r45.cu5 cu5Var = storyObj.f453921i;
        if (cu5Var == null || (gVar = cu5Var.f453374f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryInfoStorageLogic", "object desc is null");
            return storyObj.f453916d;
        }
        java.lang.String str = new java.lang.String(gVar.g(), r26.c.f450398a);
        r45.lf6 a17 = ef4.h0.f333978a.a(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || a17 == null) {
            return storyObj.f453916d;
        }
        if (!storyInfo.D0(a17)) {
            return storyObj.f453916d;
        }
        storyObj.f453921i.d(new byte[0]);
        storyInfo.f69412xdde069b = storyObj.f453917e;
        storyInfo.f69403xac3be4e = storyObj.f453919g;
        storyInfo.f69410x443468b = storyObj.f453916d;
        storyInfo.f69400x4c58c87d = storyObj.mo14344x5f01b1f6();
        if (storyObj.f453927r == 1) {
            storyInfo.t0(4);
        } else {
            storyInfo.A0(4);
        }
        if (storyObj.f453928s == 1) {
            storyInfo.t0(8);
        } else {
            storyInfo.A0(8);
        }
        storyInfo.f69404x2b7f11ae = storyObj.f453929t;
        storyInfo.f69409x76e81a5a = i17 | storyInfo.f69409x76e81a5a;
        r45.lf6 y07 = storyInfo.y0();
        y07.f460962e = storyObj.f453917e;
        storyInfo.G0(y07);
        ef4.w.f334001t.i().mo11261xce0038c9(storyObj.f453916d, storyInfo);
        return storyObj.f453916d;
    }

    public final void d(java.util.List idList, java.util.List localIdList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idList, "idList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localIdList, "localIdList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryInfoStorageLogic", "setStoryFavRemote story count: " + idList.size() + " to " + z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(localIdList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = idList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ff4.o(((java.lang.Number) it.next()).longValue(), 5, z17 ? 1 : 0));
        }
        gm0.j1.n().f354821b.g(new ff4.e(arrayList2, arrayList));
    }

    public final nf4.j e(java.lang.String username, long j17, int i17, r45.df6 df6Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (z17) {
            nf4.l i18 = ef4.w.f334001t.i();
            i18.f418405h.mo70514xb06685ab("MMStoryInfo", "storyID=?", new java.lang.String[]{"" + j17});
            nf4.j jVar = new nf4.j();
            jVar.f69412xdde069b = username;
            jVar.f69410x443468b = j17;
            i18.mo142179xf35bbb4("notify_story_info_delete", 1, jVar);
            return null;
        }
        ef4.v vVar = ef4.w.f334001t;
        nf4.j D0 = vVar.i().D0(j17);
        if (D0 == null) {
            D0 = new nf4.j();
        }
        D0.f69410x443468b = j17;
        D0.f69403xac3be4e = i17;
        D0.f69412xdde069b = username;
        int i19 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(username, vVar.e()) ? 4 : 8) | D0.f69409x76e81a5a;
        D0.f69409x76e81a5a = i19;
        if (df6Var != null) {
            c(D0, df6Var, i19);
        } else {
            vVar.i().f418405h.l("MMStoryInfo", "", D0.mo9763xeb27878e());
        }
        return D0;
    }
}
