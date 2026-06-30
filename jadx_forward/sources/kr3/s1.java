package kr3;

/* loaded from: classes11.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kr3.s1 f393008a = new kr3.s1();

    public final void a(android.content.Intent intent, android.app.Activity context, java.lang.String str, java.lang.Class cls, java.lang.Integer num, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (cls == null) {
            return;
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20629x68ff2372()) == 1) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h.class)) {
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.g.class;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.class)) {
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0.class;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.class)) {
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1.class;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.x0.class)) {
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0.class;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.n1.class)) {
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m1.class;
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null) {
            intent2.replaceExtras(intent);
        }
        intent2.putStringArrayListExtra("key_intent_action_uic_list", new java.util.ArrayList<>());
        java.lang.String stringExtra = intent2.getStringExtra("Contact_User");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            if (!(str == null || r26.n0.N(str))) {
                intent2.putExtra("Contact_User", str);
            }
        }
        pf5.j0.a(intent2, cls);
        intent2.putStringArrayListExtra("key_intent_assemble_uic_list", kz5.c0.d(cls.getName()));
        intent2.putExtra("key_intent_assemble_ui_half_screen", true);
        java.lang.String d17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.ActivityC16875x275555e4.class).d();
        if (d17 == null) {
            return;
        }
        bh5.c cVar = new bh5.c();
        cVar.d(intent2);
        cVar.f102455a.f102457a = context;
        cVar.a(d17);
        if (z17) {
            cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1959xb2f71a2d.C16878x3d900bf9.class);
        }
        if (num != null) {
            cVar.h(num.intValue());
        } else {
            cVar.g();
        }
    }
}
