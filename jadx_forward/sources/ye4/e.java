package ye4;

@j95.b
/* loaded from: classes4.dex */
public final class e extends i95.w implements ze4.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f542768d = "oneday/";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f542769e = "oneday/temp/";

    public r45.mf6 Ai() {
        ef4.v vVar = ef4.w.f334001t;
        nf4.f y07 = vVar.g().y0(vVar.e());
        if (y07.f66296xddbf0be == null) {
            return new r45.mf6();
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.mf6().mo11468x92b714fd(y07.f66296xddbf0be);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryUserInfo");
            return (r45.mf6) mo11468x92b714fd;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StoryExtInfo", "error get storyUserInfo!");
            return new r45.mf6();
        }
    }

    public void Bi(java.lang.String str, boolean z17) {
        if4.f c17;
        if (str == null) {
            return;
        }
        int Ni = z17 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_with_enter_sns, 1) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_with_change_sns, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadForSnsUser: ");
        sb6.append(Ni);
        sb6.append(" isEnter: ");
        sb6.append(z17);
        sb6.append(" username ");
        sb6.append(str);
        sb6.append(' ');
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginStory", sb6.toString());
        if (Ni != 1 || (c17 = lf4.l.f399969d.c(str, false)) == null) {
            return;
        }
        sf4.u1.b(sf4.u1.f489116a, kz5.b0.c(c17.f372780e), 0, 2, null);
    }

    public void Di(java.util.List userList, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userList, "userList");
        long j18 = mf4.d.f407696d.f142457j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (userList) {
            java.util.Iterator it = userList.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
        }
        pm0.v.L("reportWaitPlayList", true, new ef4.z(j18, j17, arrayList));
    }

    public java.lang.String wi() {
        return gm0.j1.u().d() + this.f542768d;
    }
}
