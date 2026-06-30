package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class u1 implements le0.r {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.u1 f207750a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.u1();

    @Override // le0.r
    public final void a(android.content.Context context, le0.t tVar) {
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15020x6f5957c7) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1) tVar).f272777w = kz5.p1.d(68);
            return;
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            java.lang.String stringExtra = activity.getIntent().getStringExtra("key_chat_from");
            java.lang.String stringExtra2 = activity.getIntent().getStringExtra("Chat_User");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15022xdaaa9eb1.class.getName()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15024x118c94fd.class.getName()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13942x98996eea.class.getName()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15023xcce103d.class.getName()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(stringExtra2)) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1) tVar).f272777w = kz5.p1.d(68);
            }
        }
    }
}
