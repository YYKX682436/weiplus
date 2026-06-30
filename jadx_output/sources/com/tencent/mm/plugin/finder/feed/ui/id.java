package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class id implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f110150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f110151c;

    public id(com.tencent.mm.plugin.finder.feed.ui.kd kdVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f110149a = kdVar;
        this.f110150b = arrayList;
        this.f110151c = arrayList2;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110149a;
        com.tencent.mm.ui.widget.picker.c0 c0Var = kdVar.G1;
        if (c0Var != null) {
            c0Var.d();
        }
        if (z17) {
            try {
                java.util.ArrayList arrayList = this.f110150b;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int c07 = kz5.n0.c0(arrayList, (java.lang.CharSequence) obj);
                java.lang.Object obj3 = this.f110151c.get(c07);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = ((java.util.List) obj3).indexOf((java.lang.CharSequence) obj2);
                int i17 = (c07 * 3600) + (indexOf * 60);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chosen time:");
                sb6.append(obj);
                sb6.append(' ');
                sb6.append(obj2);
                sb6.append(",firstChosenIndex:");
                sb6.append(c07);
                sb6.append(",secChosenIndex:");
                sb6.append(indexOf);
                sb6.append(",duration:");
                sb6.append(i17);
                sb6.append(",preview_type:");
                r45.hf5 hf5Var = (r45.hf5) kdVar.K1.getCustom(3);
                boolean z18 = false;
                sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.getInteger(0)) : null);
                com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", sb6.toString());
                if (i17 <= 0) {
                    android.content.Context context = kdVar.f118183e;
                    db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.f491490d91));
                    return;
                }
                kdVar.H1 = true;
                r45.hf5 hf5Var2 = (r45.hf5) kdVar.K1.getCustom(3);
                if (hf5Var2 != null && hf5Var2.getInteger(0) == 2) {
                    z18 = true;
                }
                if (z18) {
                    r45.hf5 hf5Var3 = (r45.hf5) kdVar.K1.getCustom(3);
                    if (hf5Var3 != null) {
                        hf5Var3.set(2, java.lang.Integer.valueOf(i17));
                    }
                } else {
                    r45.hf5 hf5Var4 = (r45.hf5) kdVar.K1.getCustom(3);
                    if (hf5Var4 != null) {
                        hf5Var4.set(1, java.lang.Integer.valueOf(i17));
                    }
                }
                kdVar.j0();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", th6.getMessage());
            }
        }
    }
}
