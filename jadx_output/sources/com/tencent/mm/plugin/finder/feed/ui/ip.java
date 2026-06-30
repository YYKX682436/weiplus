package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ip implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f110164d;

    public ip(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39) {
        this.f110164d = occupyFinderUI39;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 6) {
            int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39.C;
            com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39 = this.f110164d;
            occupyFinderUI39.e7().clearFocus();
            java.lang.String obj = r26.n0.u0(occupyFinderUI39.e7().getText().toString()).toString();
            if (!(!r26.n0.N(obj))) {
                obj = null;
            }
            if (obj != null) {
                java.lang.Object systemService = occupyFinderUI39.getSystemService("input_method");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(occupyFinderUI39.e7().getWindowToken(), 0);
                occupyFinderUI39.e7().setText("");
                bm2.w7 w7Var = occupyFinderUI39.f109619z;
                w7Var.getClass();
                java.util.ArrayList arrayList = (java.util.ArrayList) w7Var.f22417e;
                arrayList.add(obj);
                w7Var.notifyItemInserted(arrayList.size());
                occupyFinderUI39.g7(w7Var.getItemCount());
                kotlinx.coroutines.l.d(v65.m.b(occupyFinderUI39), null, null, new com.tencent.mm.plugin.finder.feed.ui.dp(occupyFinderUI39, obj, null), 3, null);
                return true;
            }
        }
        return false;
    }
}
