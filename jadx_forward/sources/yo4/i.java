package yo4;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yo4.p pVar) {
        super(0);
        this.f545766d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioPanel create shouldUseMusicPanelV2=");
        yo4.p pVar = this.f545766d;
        sb6.append(pVar.f545812g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        boolean z17 = pVar.f545812g;
        android.view.ViewGroup viewGroup = pVar.f545811f;
        if (z17) {
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            return new mv3.a(context, 0, 2, null);
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pvl);
        viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddk);
        android.view.View findViewById = viewStub.inflate().findViewById(com.p314xaae8f345.mm.R.id.pvm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e) findViewById;
        c17040x9d8b708e.setVisibility(8);
        return c17040x9d8b708e;
    }
}
