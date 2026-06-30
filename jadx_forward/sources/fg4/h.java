package fg4;

/* loaded from: classes8.dex */
public class h implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc f344008d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc) {
        this.f344008d = c18530x30d9cdbc;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        fg4.e eVar = this.f344008d.M;
        if (eVar != null) {
            eVar.f344004e = !eVar.f344004e;
            eVar.notifyDataSetChanged();
        }
        return true;
    }
}
