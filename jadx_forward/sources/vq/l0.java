package vq;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520717d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = u85.i.f507243d + "preview/";
        com.p314xaae8f345.mm.vfs.w6.f(str);
        com.p314xaae8f345.mm.vfs.w6.u(str);
        com.p314xaae8f345.mm.vfs.w6.Q("/sdcard/temp/sticker/output.zip", str);
        t85.j jVar = new t85.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        jVar.f498009c = str;
        jVar.f498007a = "preview";
        jVar.c(str);
        t85.j jVar2 = new t85.j();
        jVar2.f498009c = str;
        jVar2.b(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f520717d.d, "pack: " + jVar.f498017k.size() + ", " + jVar2.f498017k.size());
        return jz5.f0.f384359a;
    }
}
