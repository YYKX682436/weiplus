package bi2;

/* loaded from: classes10.dex */
public final class c extends gi2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // gi2.d
    public gi2.g b() {
        jz5.g gVar = ci2.s.f41700b;
        gi2.g gVar2 = (gi2.g) ((jz5.n) ci2.s.f41700b).getValue();
        kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.chatvoiceroom.adapter.FinderLiveChatVoiceRoomPreviewAdapter.getMicLayout>");
        return gVar2;
    }

    @Override // gi2.d
    public void d(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // gi2.e
    public android.view.View f(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        return new android.view.View(this.f272269c);
    }

    @Override // gi2.e
    public java.lang.String i() {
        return "FinderLiveChatVoiceRoomPreviewAdapter";
    }
}
