package ci2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.n f123220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f123221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f123222f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ci2.n nVar, r45.xn1 xn1Var, boolean z17) {
        super(0);
        this.f123220d = nVar;
        this.f123221e = xn1Var;
        this.f123222f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        ci2.n nVar = this.f123220d;
        if (!nVar.f123227h) {
            ci2.o m14915xb411027f = nVar.m14915xb411027f();
            ci2.l lVar = new ci2.l(nVar);
            fi2.i iVar = (fi2.i) m14915xb411027f;
            iVar.getClass();
            iVar.f344374a.f344404b.a0().b(lVar);
        }
        r45.xn1 xn1Var = this.f123221e;
        java.lang.String m76197x6c03c64c = (xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nVar.f123225f, m76197x6c03c64c);
        fg2.p pVar = nVar.f123224e;
        if (!b17 && xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
            zl2.a aVar = zl2.a.f555165a;
            android.widget.ImageView finderLiveMicUserAvatar = pVar.f343735c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicUserAvatar, "finderLiveMicUserAvatar");
            aVar.a(finderLiveMicUserAvatar, c19782x23db1cfa);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(c19782x23db1cfa.m76197x6c03c64c())) {
                pVar.f343734b.m56875xb4464262(jj2.e.f381512d);
            } else {
                pVar.f343734b.m56875xb4464262(jj2.e.f381513e);
            }
        }
        boolean z17 = nVar.f123226g;
        boolean z18 = this.f123222f;
        if (z17 != z18 || pVar.f343734b.c() != z18) {
            nVar.f123226g = z18;
            if (z18) {
                pVar.f343734b.d();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 finderLiveChatVoiceRoomPreviewWaveView = pVar.f343734b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveChatVoiceRoomPreviewWaveView, "finderLiveChatVoiceRoomPreviewWaveView");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502.f193250o;
                finderLiveChatVoiceRoomPreviewWaveView.e(false);
            }
        }
        nVar.f123225f = m76197x6c03c64c;
        return jz5.f0.f384359a;
    }
}
