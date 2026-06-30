package hw0;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.g f366986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hw0.g gVar) {
        super(1);
        this.f366986d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        jw0.a aVar = this.f366986d.F;
        if (aVar != null) {
            hw0.n nVar = ((hw0.k) aVar).f366999a;
            nVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingStickerPanelUI", "addEmoticonSegment: isEmojiFileExist " + emojiInfo.E0());
            p3325xe03a0797.p3326xc267989b.l.d(nVar.m158345xefc66565(), null, null, new hw0.h(nVar, emojiInfo, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
