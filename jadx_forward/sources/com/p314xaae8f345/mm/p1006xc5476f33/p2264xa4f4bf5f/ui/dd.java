package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class dd implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 f255344d;

    public dd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004) {
        this.f255344d = c18652x18778004;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 p07, android.view.MotionEvent p17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        arrayList.add(p17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$handleDeleteOrClear$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$handleDeleteOrClear$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004 = this.f255344d;
        c18652x18778004.f255181s[0] = (int) motionEvent.getRawX();
        c18652x18778004.f255181s[1] = (int) motionEvent.getRawY();
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }
}
