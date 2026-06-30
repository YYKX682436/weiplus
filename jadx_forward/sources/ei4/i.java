package ei4;

/* loaded from: classes11.dex */
public final class i implements wn.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi4.a f334752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.j f334753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334754f;

    public i(hi4.a aVar, ei4.j jVar, android.view.View view) {
        this.f334752d = aVar;
        this.f334753e = jVar;
        this.f334754f = view;
    }

    @Override // wn.q
    public void G4() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationClickListener", "onChattingUIEnter");
        ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
        hi4.a aVar = this.f334752d;
        java.lang.String str2 = aVar.f76582xbed8694c;
        xVar.getClass();
        if (!(str2 == null || r26.n0.N(str2))) {
            mj4.w Ai = xVar.Ai(str2);
            if (Ai != null && ((str = Ai.f76640x21f9b213) == null || str.length() == 0)) {
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkContactExpired] isNeedGetContact=true sessionId=");
            sb6.append(str2);
            sb6.append(" nickname=");
            sb6.append(Ai != null ? Ai.f76640x21f9b213 : null);
            sb6.append(" avatar=");
            sb6.append(Ai != null ? Ai.f76645x44fa3ce : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusContactService", sb6.toString());
            java.lang.String str3 = ni4.x.f419309d.m().y0(str2).f76632x114ef53e;
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusContactService", "[checkContactExpired] talker=".concat(str3));
            ki4.x.wi(xVar, new jz5.l(str2, str3), null, null, false, 14, null);
        }
        li4.a h17 = ni4.x.f419309d.h();
        java.lang.String field_sessionId = aVar.f76582xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        h17.y0(field_sessionId);
        if (this.f334753e.f334755d.mo7430x19263085() != null) {
            hi4.k kVar = hi4.m.f363088f;
            java.lang.String field_sessionId2 = aVar.f76582xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
            kVar.d(field_sessionId2, 53);
        }
    }

    @Override // wn.q
    public boolean c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationClickListener", "onChattingUIExit");
        ra5.c cVar = new ra5.c(this.f334754f);
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(cVar, 0L);
        ni4.x xVar = ni4.x.f419309d;
        li4.a h17 = xVar.h();
        java.lang.String field_sessionId = this.f334752d.f76582xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        h17.y0(field_sessionId);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = this.f334753e.f334755d.mo7430x19263085();
        if (mo7430x19263085 == null) {
            return false;
        }
        xVar.o();
        pf5.z zVar = pf5.z.f435481a;
        if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.class)).U6(1);
        return false;
    }
}
