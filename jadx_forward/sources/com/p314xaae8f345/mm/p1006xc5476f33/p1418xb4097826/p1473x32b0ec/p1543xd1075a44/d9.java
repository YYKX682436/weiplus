package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d9 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f199624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f199625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 f199626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f199628e;

    public d9(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var, int i17, yz5.l lVar) {
        this.f199624a = arrayList;
        this.f199625b = arrayList2;
        this.f199626c = e9Var;
        this.f199627d = i17;
        this.f199628e = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var = this.f199626c;
        if (z17) {
            try {
                java.util.ArrayList arrayList = this.f199624a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int c07 = kz5.n0.c0(arrayList, (java.lang.CharSequence) obj);
                java.lang.Object obj3 = this.f199625b.get(c07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = ((java.util.List) obj3).indexOf((java.lang.CharSequence) obj2);
                int i17 = (c07 * 3600) + (indexOf * 60);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeIncreaseDurationWidget", "chosen time:" + obj + ' ' + obj2 + ",firstChosenIndex:" + c07 + ",secChosenIndex:" + indexOf + ",duration:" + i17 + ",preview_type:" + e9Var.a().m75939xb282bd08(0));
                if (i17 <= this.f199627d) {
                    android.content.Context context = e9Var.f199770a;
                    db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573024d92));
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = e9Var.f199773d;
                if (c0Var != null) {
                    c0Var.d();
                }
                if (e9Var.a().m75939xb282bd08(0) == 2) {
                    e9Var.a().set(2, java.lang.Integer.valueOf(i17));
                } else {
                    e9Var.a().set(1, java.lang.Integer.valueOf(i17));
                }
                this.f199628e.mo146xb9724478(java.lang.Integer.valueOf(i17));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var2 = e9Var.f199773d;
                if (c0Var2 != null) {
                    c0Var2.d();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeIncreaseDurationWidget", th6.getMessage());
            }
        }
    }
}
