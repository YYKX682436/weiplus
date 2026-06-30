package nn1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn1.k f420199d;

    public j(nn1.k kVar) {
        this.f420199d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = this.f420199d.f420200a;
        nn1.a aVar = activityC12832x56c88de.f174041e;
        java.util.HashSet hashSet = aVar.f420170e;
        hashSet.clear();
        aVar.f420169d.d7(hashSet);
        activityC12832x56c88de.b7().b();
        if (activityC12832x56c88de.b7().b().size() == 0) {
            int i17 = activityC12832x56c88de.f174054u;
            if (i17 == 0) {
                activityC12832x56c88de.f174044h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a7s);
            } else if (i17 == 1) {
                activityC12832x56c88de.f174044h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.abz);
            }
            activityC12832x56c88de.f174044h.setVisibility(0);
        } else {
            activityC12832x56c88de.f174044h.setVisibility(4);
        }
        activityC12832x56c88de.f174045i.setVisibility(4);
        activityC12832x56c88de.f174042f.setVisibility(0);
        aVar.notifyDataSetChanged();
    }
}
