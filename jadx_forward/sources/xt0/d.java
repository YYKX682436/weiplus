package xt0;

/* loaded from: classes5.dex */
public final class d extends xt0.a {
    public final void c(android.content.Context context, double d17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider, r45.q23 q23Var, boolean z17, xt0.h postSource, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3, r45.ab4 ab4Var) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postSource, "postSource");
        b(configProvider);
        android.os.Bundle bundle = ut3.f.f512709c.f512711b;
        bundle.putByteArray("KEY_POST_VIDEO_TEMPLATE", q23Var != null ? q23Var.mo14344x5f01b1f6() : null);
        bundle.putDouble("KEY_POST_VIDEO_COVER_START_TIME", c4128x879fba0a != null ? c4128x879fba0a.m33988x124aa384() : 0.0d);
        bundle.putBoolean("KEY_DELAY_ENTER_POST_UI", z17);
        bundle.putByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", gVar != null ? gVar.g() : null);
        bundle.putByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", gVar2 != null ? gVar2.g() : null);
        bundle.putByteArray("KEY_POST_ASSET_INFO", gVar3 != null ? gVar3.g() : null);
        if (ab4Var != null) {
            bundle.putBoolean("KEY_IS_COMPOSING_CREATION_REEDIT", true);
            bundle.putByteArray("KEY_CREATE_TEMPLATE_INFO", ab4Var.mo14344x5f01b1f6());
        }
        bundle.putBoolean("isLongVideoPost", postSource instanceof xt0.e);
        if (postSource instanceof xt0.g) {
            r45.h70 h70Var = ((xt0.g) postSource).f537955b;
            bundle.putByteArray("video_composition", h70Var.mo14344x5f01b1f6());
            java.util.LinkedList tracks = h70Var.f457430d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
            if (!tracks.isEmpty()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
                java.util.Iterator it = tracks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((r45.ho6) obj).f457867e == 2) {
                            break;
                        }
                    }
                }
                r45.ho6 ho6Var = (r45.ho6) obj;
                if (ho6Var != null) {
                    bundle.putString("KEY_POST_ORIGIN_FILE_PATH", ho6Var.f457866d);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = configProvider.I;
        bundle.putInt("key_ref_enter_scene", c16995x8ab634cd != null ? c16995x8ab634cd.f237229m : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd2 = configProvider.I;
        bundle.putLong("key_ref_feed_id", c16995x8ab634cd2 != null ? c16995x8ab634cd2.f237227h : 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd3 = configProvider.I;
        bundle.putString("key_ref_feed_dup_flag", c16995x8ab634cd3 != null ? c16995x8ab634cd3.f237228i : null);
        if (!(str == null || str.length() == 0)) {
            bundle.putString("KEY_POST_MIAOJIAN_TONGKUAN_META", str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            bundle.putString("KEY_POST_VIDEO_TITLE", str2);
        }
        if (bool != null) {
            bundle.putBoolean("KEY_POST_ASSETS_IS_REAL_SHOOT", bool.booleanValue());
        }
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.String a17 = postSource.a();
        long j17 = (long) d17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
        nu3.i iVar = nu3.i.f421751a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool2, a17, "", valueOf, bool3, iVar.l());
        iVar.n("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", java.lang.Long.valueOf(j17));
        iVar.n("KEY_VIDEO_CROP_DURATION_MS_INT", java.lang.Long.valueOf(j17));
        ut3.f fVar = ut3.f.f512709c;
        fVar.a(context, c16991x15ced046);
        fVar.d(true, iVar.l());
    }
}
