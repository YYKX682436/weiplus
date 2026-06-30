package o72;

/* loaded from: classes9.dex */
public final class b2 {
    public b2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.gp0 a(r45.bq0 bq0Var, java.lang.String dataId) {
        java.util.LinkedList<r45.gp0> linkedList;
        r45.gp0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        if (bq0Var == null || (linkedList = bq0Var.f452497f) == null) {
            return null;
        }
        for (r45.gp0 gp0Var : linkedList) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gp0Var.T, dataId)) {
                return gp0Var;
            }
            if (gp0Var.I == 17 && (a17 = o72.c2.f424850a.a(gp0Var.f456984y2, dataId)) != null) {
                return a17;
            }
        }
        return null;
    }

    public final boolean b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_batch_pic_save_enable, 0) == 1;
    }

    public final boolean c(r45.gp0 favDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favDataItem, "favDataItem");
        int i17 = favDataItem.I;
        return i17 == 4 || i17 == 2 || i17 == 15 || i17 == 8 || i17 == 10130 || i17 == 3;
    }

    public final boolean d() {
        if (!o72.c2.f424851b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogicKt", "isFavOriginImgVideoEnabled: false (fixCheckCdn=false)");
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_fav_origin_img_video_android_enable, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogicKt", "isFavOriginImgVideoEnabled: " + z17 + " (fixCheckCdn=true)");
        return z17;
    }
}
