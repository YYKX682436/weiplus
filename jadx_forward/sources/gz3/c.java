package gz3;

/* loaded from: classes15.dex */
public class c implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea f359282d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea) {
        this.f359282d = activityC17273xa70a65ea;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerHistoryUI", "onItemLongClick pos is 0");
            return true;
        }
        if (i17 > 0) {
            i17--;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea = this.f359282d;
        if (i17 >= activityC17273xa70a65ea.f240270f.getCount()) {
            return true;
        }
        db5.e1.e(activityC17273xa70a65ea, activityC17273xa70a65ea.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aud), null, activityC17273xa70a65ea.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), new gz3.e(activityC17273xa70a65ea, i17));
        return true;
    }
}
