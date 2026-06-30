package hk5;

/* loaded from: classes9.dex */
public final class m extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        g00.c cVar;
        w05.b bVar;
        fc5.a model = (fc5.a) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        b00.r rVar = (b00.r) ((c00.z2) c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        rVar.f98290d.getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0 c10520x8a9df0c0 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0(context, null, 0, 6, null);
        java.lang.String j17 = model.j();
        if (j17 == null) {
            j17 = "";
        }
        java.lang.String talker = model.m75945x2fec8307(model.f125235d + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        rVar.f98290d.getClass();
        l15.c cVar2 = new l15.c();
        cVar2.m126728xdc93280d(j17);
        v05.b k17 = cVar2.k();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SHARE;
        if (k17 == null || (bVar = (w05.b) k17.m75936x14adae67(k17.f513848e + 54)) == null) {
            cVar = new g00.c(null, x8Var);
        } else {
            cVar = new g00.c(e00.l.c(bVar), x8Var);
            cVar.f348921f = talker;
        }
        c10520x8a9df0c0.m48330xfcfee142(cVar);
        return c10520x8a9df0c0;
    }

    @Override // o50.j
    public void X6(android.view.View previewChattingView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewChattingView, "previewChattingView");
        previewChattingView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
    }
}
