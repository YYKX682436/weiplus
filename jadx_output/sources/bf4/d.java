package bf4;

/* loaded from: classes10.dex */
public final class d extends af4.a {

    /* renamed from: b, reason: collision with root package name */
    public static final bf4.d f19713b = new bf4.d();

    @Override // es0.c
    public java.lang.Object d() {
        return new bf4.c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0.0f, 32767, null);
    }

    @Override // es0.c
    public void e() {
        com.tencent.mm.modelcontrol.VideoTransPara videoPara;
        float L;
        bf4.c cVar = (bf4.c) b();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            videoPara = d11.s.fj().rj();
        } else {
            com.tencent.mm.plugin.story.proxy.StoryCaptureProxy storyCaptureProxy = com.tencent.mm.plugin.story.proxy.StoryCaptureProxy.f171860g;
            if (storyCaptureProxy == null) {
                kotlin.jvm.internal.o.o("instance");
                throw null;
            }
            videoPara = storyCaptureProxy.getVideoPara();
        }
        kotlin.jvm.internal.o.g(videoPara, "<set-?>");
        cVar.f19712p = videoPara;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = ((bf4.c) b()).f19712p;
        ((bf4.c) b()).f19697a = videoTransPara.f71191d;
        bf4.c cVar2 = (bf4.c) b();
        int i17 = videoTransPara.f71191d;
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        cVar2.f19698b = (h17.y * i17) / h17.x;
        if (((bf4.c) b()).f19698b % 16 != 0) {
            bf4.c cVar3 = (bf4.c) b();
            r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
            int i18 = ((bf4.c) b()).f19698b;
            ((q90.i) lVar).getClass();
            cVar3.f19698b = ai3.d.a(i18);
        }
        if (((bf4.c) b()).f19697a % 16 != 0) {
            bf4.c cVar4 = (bf4.c) b();
            r90.l lVar2 = (r90.l) i95.n0.c(r90.l.class);
            int i19 = ((bf4.c) b()).f19697a;
            ((q90.i) lVar2).getClass();
            cVar4.f19697a = ai3.d.a(i19);
        }
        ((bf4.c) b()).f19712p.f71191d = ((bf4.c) b()).f19697a;
        ((bf4.c) b()).f19712p.f71192e = ((bf4.c) b()).f19698b;
        ((bf4.c) b()).f19699c = videoTransPara.f71194g;
        ((bf4.c) b()).f19700d = videoTransPara.f71198n;
        ((bf4.c) b()).f19701e = videoTransPara.f71193f;
        ((bf4.c) b()).f19704h = videoTransPara.f71197m;
        ((bf4.c) b()).f19703g = videoTransPara.f71195h;
        ((bf4.c) b()).f19706j = videoTransPara.f71202r;
        ((bf4.c) b()).f19705i = videoTransPara.f71201q;
        ((bf4.c) b()).f19707k = videoTransPara.f71203s;
        ((bf4.c) b()).f19708l = videoTransPara.f71204t;
        ((bf4.c) b()).f19709m = videoTransPara.f71199o;
        bf4.c cVar5 = (bf4.c) b();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            L = com.tencent.mm.sdk.platformtools.t8.L(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("StoryCheckSendVideoBitrateLimit"), 1.3f);
        } else {
            ((q90.k) ((r90.m) i95.n0.c(r90.m.class))).getClass();
            L = com.tencent.mm.sdk.platformtools.t8.L(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getDynamicConfig("StoryCheckSendVideoBitrateLimit"), 1.3f);
        }
        cVar5.f19711o = L;
        wo.g1 g1Var = wo.v1.f447830j;
        if (g1Var.f447687a != -1) {
            ((bf4.c) b()).f19710n = g1Var.f447687a;
        }
        if (z65.c.a()) {
            ((bf4.c) b()).f19710n = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_ENCODER_TYPE_INT, 2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryEncodeElementConfig", "loadConfigFromVideoParam: " + b());
    }
}
