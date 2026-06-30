package db5;

/* loaded from: classes8.dex */
public class x2 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 f310102d;

    public x2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151) {
        this.f310102d = c21498xf966a151;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310102d;
        db5.v2 v2Var = c21498xf966a151.f278958n;
        if (v2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMGridPaperGridView", "on item long click, but main adapter is null");
            return false;
        }
        int i18 = c21498xf966a151.f278954g;
        v2Var.getClass();
        return false;
    }
}
