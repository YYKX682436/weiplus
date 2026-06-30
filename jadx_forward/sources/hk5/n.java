package hk5;

/* loaded from: classes9.dex */
public final class n extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.b();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 c10524x8587e460;
        g00.f fVar;
        java.lang.String R;
        fc5.b model = (fc5.b) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c00.z2 z2Var = (c00.z2) c17;
        l15.c cVar = new l15.c();
        java.lang.String j17 = model.j();
        java.lang.String str = "";
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        w05.a aVar2 = k17 != null ? (w05.a) k17.m75936x14adae67(k17.f513848e + 56) : null;
        if (aVar2 != null && (R = aVar2.R()) != null) {
            str = R;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(str) > 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            ((b00.r) z2Var).f98290d.getClass();
            c10524x8587e460 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10523x7e6be700(context, null, 0);
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            ((b00.r) z2Var).f98290d.getClass();
            c10524x8587e460 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10524x8587e460(context2, null, 0);
        }
        java.lang.String talker = model.m75945x2fec8307(model.f125235d + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        ((b00.r) z2Var).f98290d.getClass();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SHARE;
        if (aVar2 == null) {
            fVar = new g00.f(null, x8Var);
        } else {
            g00.f fVar2 = new g00.f(e00.l.f(aVar2), x8Var);
            fVar2.f348933f = talker;
            fVar = fVar2;
        }
        c10524x8587e460.m48330xfcfee142(fVar);
        return c10524x8587e460;
    }
}
