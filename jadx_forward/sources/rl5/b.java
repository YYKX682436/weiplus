package rl5;

/* loaded from: classes4.dex */
public class b implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f478839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478840e;

    public b(rl5.r rVar, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f478840e = rVar;
        this.f478839d = onCreateContextMenuListener;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        rl5.r rVar = this.f478840e;
        rVar.f478889z.clear();
        com.p314xaae8f345.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click", new java.lang.Object[0]);
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        this.f478839d.onCreateContextMenu(rVar.f478889z, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) rVar.f478889z.f309877d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f309914y = adapterContextMenuInfo;
        }
        rVar.m();
        return true;
    }
}
