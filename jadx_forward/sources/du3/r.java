package du3;

/* loaded from: classes3.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        int i17 = configProvider.M.getBoolean("is_from_sns_comment", false) ? 97 : configProvider.M.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", -1);
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_enable_scene_list, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
        return r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null).contains(java.lang.String.valueOf(i17));
    }
}
