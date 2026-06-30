package b21;

/* loaded from: classes11.dex */
public abstract class u extends b21.s {
    public static b21.r b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, b21.t tVar) {
        r45.xs4 xs4Var;
        b21.r a17 = b21.s.a(i17, str, str2, (tVar == null || (xs4Var = tVar.f17366b) == null || com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(4))) ? str3 : tVar.f17366b.getString(4), str4, str5, str6, str7, str8, str9, str10, str11);
        d(a17, tVar);
        return a17;
    }

    public static b21.r c(java.lang.String str, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i17, b21.t tVar) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        if (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null || (linkedList = a90Var.f369840h) == null || linkedList.size() <= 0) {
            return null;
        }
        r45.jj4 jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        if (jj4Var == null) {
            return null;
        }
        b21.r rVar = new b21.r();
        rVar.f17345d = i17;
        rVar.f17346e = timeLineObject.Id;
        rVar.f17347f = 0.0f;
        rVar.f17350i = "";
        if (!android.text.TextUtils.isEmpty(jj4Var.P)) {
            rVar.f17362x = jj4Var.P;
        }
        rVar.f17351m = jj4Var.f377860i;
        rVar.f17356r = null;
        rVar.f17355q = jj4Var.Q;
        rVar.f17348g = jj4Var.f377864o;
        r45.xs4 xs4Var = timeLineObject.ContentObj.f369852w;
        if (xs4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(4))) {
            rVar.f17349h = jj4Var.f377857f;
        } else {
            rVar.f17349h = timeLineObject.ContentObj.f369852w.getString(4);
        }
        r45.xs4 xs4Var2 = timeLineObject.ContentObj.f369852w;
        if (xs4Var2 != null) {
            rVar.P = xs4Var2.getString(11);
        }
        r45.a90 a90Var2 = timeLineObject.ContentObj;
        rVar.f17354p = a90Var2 != null ? a90Var2.f369839g : null;
        rVar.f17353o = jj4Var.f377868q;
        rVar.f17352n = jj4Var.f377858g;
        rVar.f17359u = jj4Var.f377862m;
        rVar.f17361w = jj4Var.f377855d;
        rVar.f17358t = timeLineObject.AppInfo.f390846d;
        rVar.f17364z = timeLineObject.UserName;
        rVar.f17344J = timeLineObject.Id;
        rVar.T = true;
        ((ja0.e0) ((ka0.j0) i95.n0.c(ka0.j0.class))).getClass();
        rVar.M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_use_network_data_play, bm5.h0.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) == 1;
        d(rVar, tVar);
        return rVar;
    }

    public static void d(b21.r rVar, b21.t tVar) {
        r45.xs4 xs4Var;
        ka0.j0 j0Var = (ka0.j0) i95.n0.c(ka0.j0.class);
        java.lang.String str = rVar.f17358t;
        ((ja0.e0) j0Var).getClass();
        if (kotlin.jvm.internal.o.b("wx5aa333606550dfd5", str)) {
            rVar.T = true;
        } else if (tVar != null) {
            rVar.T = !zy2.qc.a(tVar.f17366b);
        } else {
            rVar.T = false;
        }
        if (tVar != null && (xs4Var = tVar.f17366b) != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(14)) && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17348g)) {
                xs4Var.set(14, rVar.f17348g);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(15)) && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17355q)) {
                xs4Var.set(15, rVar.f17355q);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(11))) {
                rVar.P = xs4Var.getString(11);
            }
        }
        ((ll3.k2) ((c21.j) i95.n0.c(c21.j.class))).getClass();
        ll3.q0.e(rVar, tVar);
    }
}
