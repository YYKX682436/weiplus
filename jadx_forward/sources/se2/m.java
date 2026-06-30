package se2;

/* loaded from: classes3.dex */
public final class m implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm2.c f488395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f488396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488397c;

    public m(lm2.c cVar, android.content.Context context, java.lang.String str) {
        this.f488395a = cVar;
        this.f488396b = context;
        this.f488397c = str;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.view.MenuItem findItem = g4Var.findItem(165);
        lm2.c cVar = this.f488395a;
        android.content.Context context = this.f488396b;
        if (findItem != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f488397c, "msg " + cVar.h() + " seq:" + cVar.e());
        } else if (cVar.f400907g) {
            g4Var.i(166, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572784ci5), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc), com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc));
        } else {
            g4Var.i(165, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci6), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
        }
        se2.w wVar = se2.w.f488428a;
        if (se2.w.a(wVar, context, cVar) && g4Var.findItem(154) == null) {
            g4Var.i(154, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573003d61), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79890x421682d2, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
        }
        if (g4Var.findItem(155) == null) {
            g4Var.i(155, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573216dx2), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
        }
        if (se2.w.a(wVar, context, cVar)) {
            se2.e eVar = se2.e.f488380a;
            if (se2.e.f488382c.contains(java.lang.Integer.valueOf(cVar.h())) && g4Var.findItem(156) == null) {
                g4Var.i(156, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79891x20253fac, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
            }
        }
    }
}
