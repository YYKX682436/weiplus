package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class oc implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f145947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe f145948b;

    public oc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f145948b = activityC10368x68cc8efe;
        this.f145947a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            int parseInt = java.lang.Integer.parseInt((java.lang.String) obj);
            int parseInt2 = java.lang.Integer.parseInt((java.lang.String) obj2) - 1;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe = this.f145948b;
            gn.d dVar = activityC10368x68cc8efe.f145492d.f145273b2;
            int intValue = (((parseInt - dVar.f355099g.get(1)) * 12) + parseInt2) - dVar.f355102m.intValue();
            if (intValue < 0) {
                intValue = 0;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) activityC10368x68cc8efe.f145492d.getLayoutManager();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectDateUI", "scrollToYearAndMonth", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/chatroom/ui/SelectDateUI", "scrollToYearAndMonth", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        this.f145947a.d();
    }
}
