package ex5;

/* loaded from: classes7.dex */
public class e implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d f338782d;

    public e(com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d) {
        this.f338782d = abstractActivityC27751xff12907d;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.AbstractActivityC27751xff12907d abstractActivityC27751xff12907d = this.f338782d;
        if (i17 < abstractActivityC27751xff12907d.A.getHeaderViewsCount()) {
            return false;
        }
        int headerViewsCount = i17 - abstractActivityC27751xff12907d.A.getHeaderViewsCount();
        if (headerViewsCount >= abstractActivityC27751xff12907d.f301660z.getCount()) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.mmui.WeUIPreference", "itemlongclick, outofindex, %d, %d", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(abstractActivityC27751xff12907d.f301660z.getCount()));
            return false;
        }
        ex5.g gVar = abstractActivityC27751xff12907d.f301660z;
        android.widget.ListView listView = abstractActivityC27751xff12907d.A;
        abstractActivityC27751xff12907d.getClass();
        return false;
    }
}
