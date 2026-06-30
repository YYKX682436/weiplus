package m50;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, co.a model, java.util.List usernameList, java.lang.Class previewUICClz, boolean z17, android.os.Bundle bundle, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar, boolean z18, com.p314xaae8f345.mm.ui.zc zcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewUICClz, "previewUICClz");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseForwardUIC", "showHalfScreenForwardView, toUser:" + kz5.n0.g0(usernameList, ",", null, null, 0, null, null, 62, null) + ", model:" + model.m126747x696739c());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(usernameList, ","));
        intent.putExtra("Retr_ForwardXmlContent", model.m126747x696739c());
        pf5.j0.a(intent, previewUICClz);
        pf5.j0.a(intent, o50.n.class);
        if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
            pf5.j0.a(intent, o50.b.class);
        }
        if (!z17) {
            intent.putExtra("ForwardParams_EnableContentClick", false);
        } else if (iVar != null) {
            ok5.d.b(intent, "ForwardParams_ContentClick", iVar, new ok5.f());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10608xcce92520.f148617e;
        pf5.j0.a(intent, r50.g.class);
        pf5.j0.a(intent, r50.j0.class);
        boolean z19 = (!z18 || (model instanceof ld5.b) || (model instanceof ld5.a)) ? false : true;
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f102455a;
        dVar.f102457a = context;
        cVar.b(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.C10607xab9347fc.class);
        cVar.c(false);
        cVar.f(z19);
        dVar.f102460d.w(1);
        cVar.a(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10608xcce92520.class.getName());
        cVar.i(zcVar);
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        }
    }
}
