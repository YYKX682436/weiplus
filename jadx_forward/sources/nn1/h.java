package nn1;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f420196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn1.i f420197e;

    public h(nn1.i iVar, java.util.LinkedList linkedList) {
        this.f420197e = iVar;
        this.f420196d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f420196d.size();
        nn1.i iVar = this.f420197e;
        if (size != 0) {
            iVar.f420198d.f174043g.setClickable(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = iVar.f420198d;
            activityC12832x56c88de.f174043g.setTextColor(activityC12832x56c88de.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560845vs));
            iVar.f420198d.f174045i.setVisibility(8);
            iVar.f420198d.f174041e.notifyDataSetChanged();
            return;
        }
        iVar.f420198d.f174045i.setVisibility(8);
        iVar.f420198d.f174044h.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de2 = iVar.f420198d;
        int i17 = activityC12832x56c88de2.f174054u;
        if (i17 == 0) {
            activityC12832x56c88de2.f174044h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a7s);
        } else {
            if (i17 != 1) {
                return;
            }
            activityC12832x56c88de2.f174044h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.abz);
        }
    }
}
