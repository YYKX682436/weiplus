package fp3;

/* loaded from: classes9.dex */
public class o implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd f346857d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd activityC16778x6ec76dfd) {
        this.f346857d = activityC16778x6ec76dfd;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        dp3.o oVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd activityC16778x6ec76dfd = this.f346857d;
        if (i17 < ((java.util.ArrayList) activityC16778x6ec76dfd.f234388g).size() && (oVar = (dp3.o) ((java.util.ArrayList) activityC16778x6ec76dfd.f234388g).get(i17)) != null) {
            android.os.Bundle m83105x7498fe14 = activityC16778x6ec76dfd.m83105x7498fe14();
            m83105x7498fe14.putString("key_trans_id", oVar.f323757d);
            m83105x7498fe14.putInt("key_pay_type", oVar.f323765o);
            m83105x7498fe14.putString("bill_id", oVar.A);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC16778x6ec76dfd, m83105x7498fe14);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(26, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
