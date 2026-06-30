package ci2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.n f41687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f41688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41689f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ci2.n nVar, r45.xn1 xn1Var, boolean z17) {
        super(0);
        this.f41687d = nVar;
        this.f41688e = xn1Var;
        this.f41689f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        ci2.n nVar = this.f41687d;
        if (!nVar.f41694h) {
            ci2.o service = nVar.getService();
            ci2.l lVar = new ci2.l(nVar);
            fi2.i iVar = (fi2.i) service;
            iVar.getClass();
            iVar.f262841a.f262871b.a0().b(lVar);
        }
        r45.xn1 xn1Var = this.f41688e;
        java.lang.String username = (xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername();
        boolean b17 = kotlin.jvm.internal.o.b(nVar.f41692f, username);
        fg2.p pVar = nVar.f41691e;
        if (!b17 && xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            zl2.a aVar = zl2.a.f473632a;
            android.widget.ImageView finderLiveMicUserAvatar = pVar.f262202c;
            kotlin.jvm.internal.o.f(finderLiveMicUserAvatar, "finderLiveMicUserAvatar");
            aVar.a(finderLiveMicUserAvatar, finderContact);
            if (com.tencent.mm.storage.z3.S3(finderContact.getUsername())) {
                pVar.f262201b.setAnimateMode(jj2.e.f299979d);
            } else {
                pVar.f262201b.setAnimateMode(jj2.e.f299980e);
            }
        }
        boolean z17 = nVar.f41693g;
        boolean z18 = this.f41689f;
        if (z17 != z18 || pVar.f262201b.c() != z18) {
            nVar.f41693g = z18;
            if (z18) {
                pVar.f262201b.d();
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView finderLiveChatVoiceRoomPreviewWaveView = pVar.f262201b;
                kotlin.jvm.internal.o.f(finderLiveChatVoiceRoomPreviewWaveView, "finderLiveChatVoiceRoomPreviewWaveView");
                int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
                finderLiveChatVoiceRoomPreviewWaveView.e(false);
            }
        }
        nVar.f41692f = username;
        return jz5.f0.f302826a;
    }
}
