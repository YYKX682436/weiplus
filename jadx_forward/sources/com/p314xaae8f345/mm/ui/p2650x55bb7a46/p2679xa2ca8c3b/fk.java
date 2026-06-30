package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class fk implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ik f285510a;

    public fk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ik ikVar) {
        this.f285510a = ikVar;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            return;
        }
        int d17 = erVar.d();
        boolean z17 = erVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jk;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ik ikVar = this.f285510a;
        if (z17) {
            tt0.b bVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jk) erVar).R;
            ikVar.f285728h = bVar.f503317a;
            ikVar.f285729i = bVar.f503318b;
            ikVar.f285727g = false;
        } else if (erVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ck) {
            ikVar.f285730m = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ck) erVar).R;
            ikVar.f285727g = true;
        }
        g4Var.c(d17, 100, 0, ikVar.f285724d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
    }
}
