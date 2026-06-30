package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.e1 f70221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, com.tencent.mm.mj_template.sns.compose.widget.e1 e1Var) {
        super(0);
        this.f70220d = t2Var;
        this.f70221e = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "MusicList: ");
        com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var = this.f70220d;
        t2Var.getClass();
        com.tencent.mm.mj_template.sns.compose.widget.e1 snsMusicInfoWrapper = this.f70221e;
        kotlin.jvm.internal.o.g(snsMusicInfoWrapper, "snsMusicInfoWrapper");
        r45.k96 k96Var = (r45.k96) snsMusicInfoWrapper.f69938a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "selectedMusic: " + k96Var.f378517d);
        if (kotlin.jvm.internal.o.b(((r45.k96) ((com.tencent.mm.mj_template.sns.compose.widget.e1) ((n0.q4) t2Var.f70241n).getValue()).f69938a).f378517d, k96Var.f378517d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicSearchPanel", "selectedMusic: already selected this music, skip");
        } else {
            java.lang.String str = k96Var.f378517d;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = k96Var.f378518e;
                if (!(str2 == null || str2.length() == 0)) {
                    ((n0.q4) t2Var.f70240m).setValue(snsMusicInfoWrapper);
                    com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var = t2Var.f70237g;
                    if (t0Var != null) {
                        java.lang.String music_id = k96Var.f378517d;
                        kotlin.jvm.internal.o.f(music_id, "music_id");
                        t0Var.d(music_id);
                    }
                    kotlinx.coroutines.l.d(t2Var.f70234d, null, null, new com.tencent.mm.mj_template.sns.compose.widget.s2(t2Var, k96Var, null), 3, null);
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicSearchPanel", "selectedMusic: musicId or musicUrl is null, " + k96Var.f378517d + ", " + k96Var.f378518e);
        }
        return jz5.f0.f302826a;
    }
}
