package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.mj_template.sns.compose.widget.p2 f70149d = new com.tencent.mm.mj_template.sns.compose.widget.p2();

    public p2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_music_search_direct_search_enabel, bm5.h0.RepairerConfig_Maas_DirectSearchEnable_Int, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "enableDirectSearch: " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
