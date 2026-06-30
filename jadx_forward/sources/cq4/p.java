package cq4;

/* loaded from: classes10.dex */
public final class p implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d f303015d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d) {
        this.f303015d = c18833x82cf22d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbView", "onTouchEvent: " + event.getX());
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbView", "onInterceptTouchEvent: " + event.getX() + ", " + event.getAction());
        float x17 = event.getX();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303015d;
        c18833x82cf22d.f257680u = x17;
        c18833x82cf22d.f257681v = event.getY();
        int action = event.getAction();
        if (action == 0) {
            c18833x82cf22d.A = false;
            recyclerView.f1();
            c18833x82cf22d.f257673n = false;
            bp4.c0 c0Var = c18833x82cf22d.f257684y;
            if (c0Var != null) {
                c0Var.mo10983x65825f6();
            }
            bp4.c0 audioSeekable = c18833x82cf22d.getAudioSeekable();
            if (audioSeekable != null) {
                audioSeekable.mo10983x65825f6();
            }
            java.lang.System.currentTimeMillis();
            c18833x82cf22d.getClass();
            float f17 = c18833x82cf22d.f257680u;
            c18833x82cf22d.getClass();
            float f18 = c18833x82cf22d.f257681v;
            c18833x82cf22d.getClass();
        } else if (action == 1 || action == 3) {
            c18833x82cf22d.getClass();
            if (recyclerView.mo7958x54496c8e() == 0) {
                c18833x82cf22d.f257673n = true;
                bp4.c0 c0Var2 = c18833x82cf22d.f257684y;
                if (c0Var2 != null) {
                    c0Var2.mo10984xc84dc82d();
                }
                c18833x82cf22d.A = false;
            } else {
                c18833x82cf22d.A = true;
            }
            java.lang.System.currentTimeMillis();
            c18833x82cf22d.getClass();
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }
}
