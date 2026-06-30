package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class v implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f105279e;

    public v(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, int i17) {
        this.f105278d = e0Var;
        this.f105279e = i17;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105278d;
            if (i17 < e0Var.f105227q.size()) {
                java.lang.Object obj = e0Var.f105227q.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                zb2.d dVar = (zb2.d) obj;
                if (dVar.f471261e) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, e0Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
                intent.putExtra("CLIENT_KV_REPORTINFO", "{\"drama_source_card_region\":" + dVar.f471264h + '}');
                hc2.e0.a(intent, 0, null, 3, null);
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.fl5 fl5Var = dVar.f471260d;
                i0Var.ak(context, intent, fl5Var != null ? fl5Var.getLong(0) : 0L, fl5Var != null ? fl5Var.getLong(4) : 0L, null, null, 0L, null, this.f105279e, fl5Var != null ? fl5Var.getString(6) : null);
            }
        }
    }
}
