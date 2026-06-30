package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class b7 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public long f289013d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f289014e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f289015f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289016g;

    public b7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d) {
        this.f289016g = c22376x88ed722d;
    }

    public static void a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 b7Var, int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = b7Var.f289016g;
        int firstVisiblePosition = c22376x88ed722d.f288905o.getFirstVisiblePosition();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = c22376x88ed722d.f288905o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewOnTouchListenerC22366xcd5c2226, arrayList.toArray(), "com/tencent/mm/ui/conversation/MainUI$3", "scrollToFromTop", "(I)V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
        viewOnTouchListenerC22366xcd5c2226.smoothScrollToPositionFromTop(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(viewOnTouchListenerC22366xcd5c2226, "com/tencent/mm/ui/conversation/MainUI$3", "scrollToFromTop", "(I)V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
        b7Var.f289015f = i17;
        c22376x88ed722d.f288905o.postOnAnimationDelayed(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z6(b7Var, firstVisiblePosition, i17), 250L);
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        zr.a aVar = (zr.a) obj;
        int i17 = aVar.f556636a;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2524x2c1ddc83.C20113xe34cc462()) == 1;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = this.f289016g;
        int i18 = aVar.f556636a;
        int i19 = aVar.f556637b;
        if (!z17) {
            if (i18 == 1) {
                c22376x88ed722d.f288905o.postDelayed(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a7(this, java.lang.Integer.valueOf(i19)), 100L);
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 == 1) {
                c22376x88ed722d.f288905o.postDelayed(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a7(this, java.lang.Integer.valueOf(i19)), 100L);
                return;
            }
            return;
        }
        fg5.c.f344034a.a(3L, i19, null, c22376x88ed722d.f288912v);
        yf5.w0 w0Var = (yf5.w0) c22376x88ed722d.f288912v;
        w0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = w0Var.f543517p;
        if (c16718x7059cefe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmList");
            throw null;
        }
        java.util.Iterator it = c16718x7059cefe.f233598o.iterator();
        while (it.hasNext()) {
            yf5.x xVar = (yf5.x) it.next();
            if (xVar.f543547z == 2) {
                arrayList.add(xVar);
            }
        }
        yf5.w conversationDataSource = w0Var.d();
        yf5.d dVar = w0Var.f543526y;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context = w0Var.f543508d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversationDataSource, "conversationDataSource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadModeHelper", "openUnreadModeActivity, unreadList count: " + arrayList.size());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.class);
        ok5.d.b(intent, "conversation_datasource", conversationDataSource, new ok5.f());
        ok5.d.b(intent, "conversation_unread_list", arrayList, new ok5.f());
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.e0.f289662a = new java.lang.ref.WeakReference(dVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadModeHelper", "openUnreadModeActivity", "(Landroid/content/Context;Lcom/tencent/mm/ui/conversation/adapter/ConversationDataSource;Ljava/util/List;Lcom/tencent/mm/ui/conversation/adapter/ConvListViewPool;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/conversation/unreadmode/UnreadModeHelper", "openUnreadModeActivity", "(Landroid/content/Context;Lcom/tencent/mm/ui/conversation/adapter/ConversationDataSource;Ljava/util/List;Lcom/tencent/mm/ui/conversation/adapter/ConvListViewPool;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
