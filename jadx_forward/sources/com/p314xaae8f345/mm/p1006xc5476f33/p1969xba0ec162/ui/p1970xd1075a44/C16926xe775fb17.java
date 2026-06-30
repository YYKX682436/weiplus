package com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView */
/* loaded from: classes15.dex */
public class C16926xe775fb17 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public int f236307d;

    /* renamed from: e, reason: collision with root package name */
    public int f236308e;

    /* renamed from: f, reason: collision with root package name */
    public gs3.b f236309f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f236310g;

    public C16926xe775fb17(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f236308e = 0;
        this.f236310g = new gs3.a(this);
    }

    public final void a(int i17) {
        gs3.b bVar = this.f236309f;
        if (bVar == null || this.f236308e == i17) {
            return;
        }
        this.f236308e = i17;
        android.view.View view = ((fs3.d) bVar).f347834a.F;
        if (view != null) {
            if (i17 == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.f236307d = getScrollY();
        int action = motionEvent.getAction();
        if (action == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f236310g;
            if (n3Var != null) {
                n3Var.mo50311x7ab51103(n3Var.mo50288x733c63a2(), 5L);
            }
        } else if (action == 2) {
            a(1);
        }
        return onTouchEvent;
    }

    /* renamed from: setMMOnScrollListener */
    public void m67748x3bd2d002(gs3.b bVar) {
        this.f236309f = bVar;
    }

    public C16926xe775fb17(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f236308e = 0;
        this.f236310g = new gs3.a(this);
    }
}
