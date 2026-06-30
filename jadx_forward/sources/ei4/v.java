package ei4;

/* loaded from: classes9.dex */
public final class v implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f334779d;

    public v(yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        hi4.e item = (hi4.e) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(item.f76593x5ef57e62, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusGreetingClickListener", "openTextStateChatting hashUserName:%s changeUserName:%s", item.f76593x5ef57e62, Di);
        if (Di == null || r26.n0.N(Di)) {
            mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(item.f76597x1c3513c9);
            if (Ai != null && Ai.f76637x95576e57 == 1) {
                ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
                java.lang.String str = item.f76597x1c3513c9;
                java.lang.String str2 = item.f76592x6c03540b;
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                xVar.Di(str, str2, context);
                hi4.k kVar = hi4.m.f363088f;
                java.lang.String field_session_id = item.f76597x1c3513c9;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_session_id, "field_session_id");
                kVar.d(field_session_id, 102);
            } else {
                android.content.Context context2 = view.getContext();
                i95.m c17 = i95.n0.c(ki4.x.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ei4.u uVar = new ei4.u(this, context2, item);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                fi4.a aVar = new fi4.a(kz5.b0.c(new jz5.l(item.f76597x1c3513c9, item.f76592x6c03540b)), false);
                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getNetSceneQueue(...)");
                ii4.a.a(d17, aVar, (p012xc85e97e9.p093xedfae76a.y) context2, new ki4.t(aVar, uVar));
                this.f334779d = db5.e1.P(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), 3, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, new ei4.t(aVar));
            }
        } else {
            ki4.x xVar2 = (ki4.x) i95.n0.c(ki4.x.class);
            android.content.Context context3 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Di);
            xVar2.Ni(context3, Di);
        }
        return jz5.f0.f384359a;
    }
}
