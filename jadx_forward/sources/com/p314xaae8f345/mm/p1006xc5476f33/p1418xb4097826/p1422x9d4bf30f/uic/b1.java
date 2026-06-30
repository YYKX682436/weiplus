package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class b1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f183369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jz5.l f183371c;

    public b1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var, jz5.l lVar) {
        this.f183369a = c0Var;
        this.f183370b = c1Var;
        this.f183371c = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f183369a.d();
        if (z17) {
            jz5.l lVar = this.f183371c;
            java.util.List list = (java.util.List) lVar.f384366d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            int c07 = kz5.n0.c0(list, (java.lang.CharSequence) obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183370b;
            c1Var.f183393y = c07;
            java.lang.Object obj4 = ((java.util.ArrayList) lVar.f384367e).get(c1Var.f183393y);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            c1Var.f183394z = ((java.util.List) obj4).indexOf((java.lang.CharSequence) obj2);
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            java.util.Date date = new java.util.Date(zl2.r4.f555483a.M0());
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(5, calendar.get(5) + c1Var.f183393y);
            calendar.set(11, (24 - ((java.util.List) ((java.util.ArrayList) lVar.f384367e).get(c1Var.f183393y)).size()) + c1Var.f183394z);
            calendar.set(12, 0);
            calendar.set(13, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityPostUIC", "chosen time:" + calendar.getTime() + ",timeInMills:" + calendar.getTimeInMillis());
            c1Var.f183391w = calendar.getTimeInMillis() / ((long) 1000);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(obj);
            sb6.append(' ');
            sb6.append(obj2);
            c1Var.f183392x = sb6.toString();
            android.widget.TextView textView = c1Var.f183382n;
            if (textView != null) {
                textView.setText(c1Var.f183392x);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTimeText");
                throw null;
            }
        }
    }
}
