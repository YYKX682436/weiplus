package iu3;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu3.e f376523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(iu3.e eVar) {
        super(0);
        this.f376523d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioPanel create shouldUseMusicPanelV2=");
        iu3.e eVar = this.f376523d;
        sb6.append(eVar.f376526f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        boolean z17 = eVar.f376526f;
        android.view.ViewGroup viewGroup = eVar.f376524d;
        if (!z17) {
            android.view.ViewStub viewStub = (android.view.ViewStub) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pvl);
            viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddk);
            android.view.View findViewById = viewStub.inflate().findViewById(com.p314xaae8f345.mm.R.id.pvm);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e) findViewById;
            c17040x9d8b708e.setVisibility(8);
            return c17040x9d8b708e;
        }
        int i17 = (com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y * 3) / 4;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        e0Var.f391648d = -1.0f;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gv3.b bVar = new gv3.b(context, i17);
        bVar.f304110m = new iu3.c(e0Var, i17, eVar);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("PARAM_1_FLOAT", i17);
        eVar.f376525e.w(ju3.c0.G1, bundle);
        return bVar;
    }
}
