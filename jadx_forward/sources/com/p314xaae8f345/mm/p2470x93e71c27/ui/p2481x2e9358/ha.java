package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class ha implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra f271914d;

    public ha(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar) {
        this.f271914d = raVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = this.f271914d;
        if (action == 0) {
            raVar.f272168z.mo50305x3d8a09a2(20002);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        raVar.f272168z.mo50307xb9e94560(20001, 3000L);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }
}
