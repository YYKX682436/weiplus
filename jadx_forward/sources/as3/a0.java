package as3;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f95015a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f95016b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f95017c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f95018d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac f95019e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f95020f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f95021g;

    public a0(android.app.Activity context, java.util.ArrayList outerDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerDataList, "outerDataList");
        this.f95015a = context;
        this.f95016b = outerDataList;
        this.f95017c = "BizProfileTopicFlowController";
        this.f95018d = new java.util.ArrayList();
    }

    public final void a(java.util.ArrayList newDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newDataList, "newDataList");
        java.util.ArrayList arrayList = this.f95018d;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(newDataList, 10));
        java.util.Iterator it = newDataList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new vr3.d0((r45.um) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac = this.f95019e;
            if (c16917xf24b9dac != null) {
                c16917xf24b9dac.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac2 = this.f95019e;
            if (c16917xf24b9dac2 != null) {
                c16917xf24b9dac2.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac3 = this.f95019e;
        if (c16917xf24b9dac3 != null) {
            c16917xf24b9dac3.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f95017c, "refresh, dataList size:" + arrayList.size());
    }
}
