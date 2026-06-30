package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class l6 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f292079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f292080e;

    public l6(com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f292080e = s6Var;
        this.f292079d = onCreateContextMenuListener;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = this.f292080e;
        s6Var.f292259m.clear();
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        this.f292079d.onCreateContextMenu(s6Var.f292259m, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) s6Var.f292259m.f309877d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f309914y = adapterContextMenuInfo;
        }
        s6Var.f292255f = new com.p314xaae8f345.mm.ui.p2740x696c9db.k6(this);
        s6Var.f292254e.V1 = true;
        s6Var.d();
        return true;
    }
}
