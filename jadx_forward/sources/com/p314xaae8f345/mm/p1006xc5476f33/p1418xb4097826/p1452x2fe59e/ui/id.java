package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class id implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f191682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f191683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f191684c;

    public id(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f191682a = kdVar;
        this.f191683b = arrayList;
        this.f191684c = arrayList2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f191682a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = kdVar.G1;
        if (c0Var != null) {
            c0Var.d();
        }
        if (z17) {
            try {
                java.util.ArrayList arrayList = this.f191683b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int c07 = kz5.n0.c0(arrayList, (java.lang.CharSequence) obj);
                java.lang.Object obj3 = this.f191684c.get(c07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
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
                r45.hf5 hf5Var = (r45.hf5) kdVar.K1.m75936x14adae67(3);
                boolean z18 = false;
                sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.m75939xb282bd08(0)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisibilityModeConfigPanel", sb6.toString());
                if (i17 <= 0) {
                    android.content.Context context = kdVar.f199716e;
                    db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573023d91));
                    return;
                }
                kdVar.H1 = true;
                r45.hf5 hf5Var2 = (r45.hf5) kdVar.K1.m75936x14adae67(3);
                if (hf5Var2 != null && hf5Var2.m75939xb282bd08(0) == 2) {
                    z18 = true;
                }
                if (z18) {
                    r45.hf5 hf5Var3 = (r45.hf5) kdVar.K1.m75936x14adae67(3);
                    if (hf5Var3 != null) {
                        hf5Var3.set(2, java.lang.Integer.valueOf(i17));
                    }
                } else {
                    r45.hf5 hf5Var4 = (r45.hf5) kdVar.K1.m75936x14adae67(3);
                    if (hf5Var4 != null) {
                        hf5Var4.set(1, java.lang.Integer.valueOf(i17));
                    }
                }
                kdVar.j0();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisibilityModeConfigPanel", th6.getMessage());
            }
        }
    }
}
