package dr1;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dr1.a f324117a = new dr1.a();

    public final void a(int i17, int i18, long j17, java.lang.String latestDigest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestDigest, "latestDigest");
        if (i18 <= 0) {
            return;
        }
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", "[bumpGreetHolder] greet box disabled, skip. serviceType=" + i17);
            return;
        }
        hr1.t f17 = f(i17);
        hr1.e c17 = c(i17);
        if (c17.t0()) {
            c17.f66330xa35b5abb += i18;
            c17.f66324x9b4f418d = 0;
            c17.f66331xa783a79b = java.lang.Math.max(c17.f66331xa783a79b, j17);
            c17.f66316xf66fcca9 = latestDigest;
            f17.mo55864x413cb2b4(c17, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", "[bumpGreetHolder] serviceType=" + i17 + " delta=" + i18 + " unReadCount=" + c17.f66330xa35b5abb);
        }
    }

    public final void b(int i17) {
        java.lang.String str = i17 == 5 ? "bizphotofansgreetholder@picfansmsg" : "bizfansgreetholder@bizfansmsg";
        f(i17).m(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", "[clearHolderRedDot] serviceType=" + i17 + " sessionId=" + str);
    }

    public final hr1.e c(int i17) {
        hr1.e eVar;
        java.lang.String str = i17 == 5 ? "bizphotofansgreetholder@picfansmsg" : "bizfansgreetholder@bizfansmsg";
        hr1.e z07 = i17 == 5 ? yq1.u0.Vi().z0(str) : yq1.u0.Di().z0(str);
        if (z07.t0()) {
            return z07;
        }
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", "[getOrCreateHolder] greet box disabled, skip create. serviceType=" + i17);
            return z07;
        }
        if (i17 == 5) {
            nr1.d dVar = nr1.f.f420673e;
            eVar = new hr1.e(nr1.f.f420680o);
        } else {
            hr1.g gVar = hr1.i.f364882e;
            eVar = new hr1.e(hr1.i.f364884g);
        }
        eVar.f66326xbed8694c = str;
        eVar.f66328x114ef53e = str;
        eVar.f66325xea7a0fe2 = f324117a.g(i17);
        eVar.f66329x2262335f = 2;
        eVar.f66323xa97e89ae = 50L;
        eVar.f66330xa35b5abb = 0;
        eVar.f66324x9b4f418d = 1;
        if (i17 == 5) {
            yq1.u0.Vi().mo55864x413cb2b4(eVar, true);
        } else {
            yq1.u0.Di().mo55864x413cb2b4(eVar, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", "[getOrCreateHolder] created greet holder for serviceType=" + i17);
        return eVar;
    }

    public final boolean d() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_greet_box_enable, 0) == 1;
    }

    public final void e(int i17) {
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", "[rebuildGreetHolder] greet box disabled, skip. serviceType=" + i17);
            return;
        }
        hr1.t f17 = f(i17);
        java.lang.String g17 = g(i17);
        int y17 = f17.y(g17);
        hr1.e n17 = f17.n(g17);
        hr1.e c17 = c(i17);
        if (c17.t0()) {
            c17.f66330xa35b5abb = y17;
            c17.f66324x9b4f418d = y17 > 0 ? 0 : 1;
            if (n17 != null) {
                c17.f66331xa783a79b = n17.f66331xa783a79b;
                java.lang.String str = n17.f66316xf66fcca9;
                c17.f66316xf66fcca9 = str != null ? str : "";
            } else {
                c17.f66316xf66fcca9 = "";
                c17.f66331xa783a79b = 0L;
            }
            f17.mo55864x413cb2b4(c17, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[rebuildGreetHolder] serviceType=");
            sb6.append(i17);
            sb6.append(" selfBiz=");
            sb6.append(g17);
            sb6.append(" totalUnread=");
            sb6.append(y17);
            sb6.append(" latestSession=");
            sb6.append(n17 != null ? n17.f66326xbed8694c : null);
            sb6.append(" latestDigest=");
            sb6.append(n17 != null ? n17.f66316xf66fcca9 : null);
            sb6.append(" latestUpdateTime=");
            sb6.append(n17 != null ? java.lang.Long.valueOf(n17.f66331xa783a79b) : null);
            sb6.append(" holderDigest=");
            sb6.append(c17.f66316xf66fcca9);
            sb6.append(" holderUpdateTime=");
            sb6.append(c17.f66331xa783a79b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.GreetHolderHelper", sb6.toString());
        }
    }

    public final hr1.t f(int i17) {
        if (i17 == 5) {
            nr1.f Vi = yq1.u0.Vi();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
            return Vi;
        }
        hr1.i Di = yq1.u0.Di();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Di, "getBizFansConversationStorage(...)");
        return Di;
    }

    public final java.lang.String g(int i17) {
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            return jr1.j.c(((ox.r) d0Var).Bi(2).c());
        }
        rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr2 = tk.s.f501403d;
        return jr1.j.a(((ox.r) d0Var2).Bi(1).c());
    }
}
