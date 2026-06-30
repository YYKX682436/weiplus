package tt1;

/* loaded from: classes15.dex */
public class c implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 f503344d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875) {
        this.f503344d = abstractActivityC13036x7f885875;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseUI", "onItemLongClick pos is 0");
            return true;
        }
        if (i17 > 0) {
            i17--;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875 = this.f503344d;
        if (i17 >= abstractActivityC13036x7f885875.f176165e.getCount()) {
            return true;
        }
        abstractActivityC13036x7f885875.e7(abstractActivityC13036x7f885875.f176172o.mo54455xfb80e389(i17));
        return true;
    }
}
