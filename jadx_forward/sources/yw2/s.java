package yw2;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f548202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yw2.a0 a0Var) {
        super(0);
        this.f548202d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a k17 = this.f548202d.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = k17.footer;
        int i17 = c15270x6d877a34 != null ? c15270x6d877a34.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() : 0;
        int i18 = k17.sceneForReply == 2 ? 1 : 2;
        k17.sceneForReply = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.b3(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = k17.feedObj;
        if (c14994x9b99c079 != null) {
            android.content.Context context = k17.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            int i19 = nyVar != null ? nyVar.f216913n : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
            if (o3Var.dk(m59251x5db1b11) != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6590xecfe43b0 c6590xecfe43b0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6590xecfe43b0();
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                c6590xecfe43b0.f139415d = c6590xecfe43b0.b("sessionid", Ri, true);
                c6590xecfe43b0.f139416e = c6590xecfe43b0.b("feedid", o3Var.Ui(m59251x5db1b11), true);
                c6590xecfe43b0.f139418g = r3.m59254xf4204902();
                c6590xecfe43b0.f139419h = r3.m59216x8ed22866();
                c6590xecfe43b0.f139420i = r3.m59247xf67fd084();
                c6590xecfe43b0.f139417f = i19;
                c6590xecfe43b0.f139421j = i17;
                c6590xecfe43b0.k();
                o3Var.Zk(c6590xecfe43b0);
            }
        }
        return jz5.f0.f384359a;
    }
}
