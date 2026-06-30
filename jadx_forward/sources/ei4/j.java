package ei4;

/* loaded from: classes11.dex */
public final class j implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.C18595x38eba632 f334755d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.C18595x38eba632 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f334755d = fragment;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        hi4.a item = (hi4.a) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean a17 = ii4.b.a(item);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.C18595x38eba632 c18595x38eba632 = this.f334755d;
        if (a17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.ActivityC18596x74a43c27.f254743e;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.ActivityC18596x74a43c27.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity$Companion", "start", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity$Companion", "start", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ni4.x xVar = ni4.x.f419309d;
            li4.b k17 = xVar.k();
            k17.getClass();
            java.lang.String[] strArr = mj4.n.f408609e;
            k17.f400321d.A("TextStatusLike", "update TextStatusGreetingItem set Read = 1 where Read != 1");
            k17.mo142179xf35bbb4(li4.b.f400320f, 6, null);
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c18595x38eba632.mo7430x19263085();
            if (mo7430x19263085 != null) {
                xVar.o();
                pf5.z zVar = pf5.z.f435481a;
                boolean z17 = mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.class)).U6(1);
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activityC0065xcd7aa112).a(hi4.m.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                qj4.s.o(qj4.s.f445491a, 51, null, hi4.m.f363089g, 0, null, 0, 0, 0, 0, null, null, null, null, null, 16378, null);
            }
        } else {
            view.setSelected(true);
            java.lang.String a19 = en1.a.a();
            wn.u uVar = c18595x38eba632.f146271u;
            if (uVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("readyChattingUIC");
                throw null;
            }
            wn.t tVar = uVar.f528913d;
            if (tVar != null) {
                ((rb5.l) tVar).l(item.f76582xbed8694c, a19, null, new ei4.i(item, this, view));
            }
        }
        return jz5.f0.f384359a;
    }
}
