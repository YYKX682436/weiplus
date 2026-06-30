package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class e4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.g4 f281988d;

    public e4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.g4 g4Var) {
        this.f281988d = g4Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.g4 g4Var = this.f281988d;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) g4Var.f282055a.f542241c.a(sb5.z.class))).W;
        if (copyOnWriteArraySet != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(copyOnWriteArraySet);
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.d4(this));
            long[] jArr = new long[arrayList.size()];
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                jArr[i17] = ((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next()).f231013d;
                i17++;
            }
            intent.putExtra("k_outside_expose_proof_item_list", jArr);
            intent.putExtra("k_username", g4Var.f282055a.x());
            g4Var.f282055a.g().setResult(-1, intent);
        } else {
            g4Var.f282055a.g().setResult(0, intent);
        }
        intent.putExtra("k_is_group_chat", g4Var.f282055a.D());
        g4Var.f282055a.d();
        return false;
    }
}
