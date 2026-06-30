package v73;

/* loaded from: classes8.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 f515265d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344, v73.m mVar) {
        this.f515265d = activityC16099xbf243344;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f515265d.F.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.v55) this.f515265d.F.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = this.f515265d;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(activityC16099xbf243344.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjn, viewGroup, false);
            v73.r rVar = new v73.r(activityC16099xbf243344, null);
            rVar.f515267a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.h2k);
            com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) view2.findViewById(com.p314xaae8f345.mm.R.id.h2i);
            rVar.f515268b = c22904x897710ab;
            c22904x897710ab.b();
            rVar.f515269c = view2.findViewById(com.p314xaae8f345.mm.R.id.h2j);
            view2.setTag(rVar);
        } else {
            view2 = view;
        }
        r45.v55 v55Var = (r45.v55) activityC16099xbf243344.F.get(i17);
        v73.r rVar2 = (v73.r) view2.getTag();
        rVar2.f515267a.setText(v55Var.f469450d);
        rVar2.f515268b.setText(u73.h.a(v55Var.f469451e));
        if (rVar2.f515270d.F.size() == 1) {
            android.view.View view3 = rVar2.f515269c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = rVar2.f515269c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.v55) this.f515265d.F.get(i17)).f469452f);
    }
}
