package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class g2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef f145705d;

    public g2(com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef c10341xc7527cef) {
        this.f145705d = c10341xc7527cef;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (((com.p314xaae8f345.mm.p648x55baa833.ui.le) c1163xf1deaba4.getChildAt(0)) == null) {
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.C10341xc7527cef c10341xc7527cef = this.f145705d;
        c10341xc7527cef.getClass();
        c10341xc7527cef.getClass();
        c10341xc7527cef.getClass();
        com.p314xaae8f345.mm.p648x55baa833.ui.h2 h2Var = c10341xc7527cef.f145278g2;
        if (h2Var != null) {
            com.p314xaae8f345.mm.p648x55baa833.ui.jc jcVar = (com.p314xaae8f345.mm.p648x55baa833.ui.jc) h2Var;
            jcVar.getClass();
            int i19 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe.f145491o;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe = jcVar.f145792a;
            int[] T6 = activityC10368x68cc8efe.T6();
            if (T6 == null) {
                int[] m43523xbcd1ef6e = activityC10368x68cc8efe.f145492d.m43523xbcd1ef6e();
                if (m43523xbcd1ef6e != null) {
                    activityC10368x68cc8efe.V6(m43523xbcd1ef6e[0], m43523xbcd1ef6e[1] + 1);
                    activityC10368x68cc8efe.f145498m.setVisibility(0);
                } else {
                    activityC10368x68cc8efe.f145498m.setVisibility(8);
                }
            } else if (T6.length == 2) {
                activityC10368x68cc8efe.V6(T6[0], T6[1]);
                activityC10368x68cc8efe.f145498m.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
