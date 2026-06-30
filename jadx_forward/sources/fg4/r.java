package fg4;

/* loaded from: classes8.dex */
public class r implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 f344023d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 c18533xf1098150) {
        this.f344023d = c18533xf1098150;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        fg4.l lVar = this.f344023d.M;
        if (lVar != null) {
            lVar.f344013e = !lVar.f344013e;
            lVar.notifyDataSetChanged();
        }
        return true;
    }
}
