package yt3;

/* loaded from: classes3.dex */
public final class h implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.i f547003a;

    public h(yt3.i iVar) {
        this.f547003a = iVar;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "[onSelectedEmoji] emojiInfo:%s", emojiInfo);
        if (emojiInfo.o0() == null) {
            emojiInfo.K0(emojiInfo.mo42933xb5885648(), "");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("PARAM_EDIT_EMOJI_INFO", emojiInfo);
        yt3.i iVar = this.f547003a;
        iVar.f546865d.w(ju3.c0.f383425o2, bundle);
        hk0.u0 u0Var = iVar.f547021h;
        if (u0Var != null) {
            hk0.p pVar = hk0.p.f363319d;
            hk0.z zVar = u0Var.f363351i;
            zVar.getClass();
            java.lang.String str = "EMOJI_" + java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addEmojiData >> type: " + pVar + ", editId: " + str);
            java.util.LinkedList linkedList = zVar.f363382a;
            hk0.l lVar = hk0.l.f363300h;
            linkedList.add(new hk0.k(lVar, str));
            zVar.f363388g.put(str, new hk0.m(lVar, pVar, emojiInfo, null, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "addEmoji >> " + pVar + ' ' + str);
            p3325xe03a0797.p3326xc267989b.l.d(u0Var.f363355p, null, null, new hk0.e0(u0Var, u0Var.V6(new java.util.ArrayList()), str, null), 3, null);
        }
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        this.f547003a.A().b(false);
    }
}
