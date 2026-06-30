package ci2;

/* loaded from: classes10.dex */
public final class h extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f123215b = jz5.h.b(ci2.e.f123210d);

    @Override // gi2.c
    public java.lang.String d() {
        return "ChatVoiceRoomLayout";
    }

    @Override // gi2.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        parent.getChatInviteLayout().removeAllViews();
        java.util.List V0 = kz5.n0.V0(viewList);
        boolean z17 = ((gi2.e) adapter).g(r1.f353806g.size() - 1).f536054b.f536089h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f353799a, "addItemView,size: " + viewList.size() + ",isLastGrabLayout: " + z17);
        int i17 = 0;
        if (z17) {
            android.view.View view = (android.view.View) kz5.n0.i0(V0);
            f(view, adapter, kz5.c0.h(V0));
            parent.getChatInviteLayout().addView(view);
            parent.getChatInviteLayout().setVisibility(0);
            ((java.util.ArrayList) V0).remove(kz5.c0.h(V0));
        } else {
            parent.getChatInviteLayout().setVisibility(8);
        }
        java.util.Iterator it = ((java.util.ArrayList) V0).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            f(view2, adapter, i17);
            parent.getChatContentLayout().addView(view2);
            i17 = i18;
        }
    }

    @Override // gi2.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        ci2.g gVar = new ci2.g(parent, this);
        if (parent.getWidth() != 0 && parent.getHeight() != 0) {
            gVar.mo152xb9724478();
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = parent.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new ci2.f(parent, gVar));
        }
    }
}
