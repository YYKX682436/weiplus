package rx2;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public rx2.w f482528a;

    /* renamed from: b, reason: collision with root package name */
    public rx2.d f482529b;

    /* renamed from: c, reason: collision with root package name */
    public rx2.a f482530c;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d descTv, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descTv, "descTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482528a = new rx2.w(descTv, activity);
        this.f482529b = new rx2.d();
        this.f482530c = new rx2.a();
    }

    public final void a(java.lang.String curDesc, android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curDesc, "curDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) s17.getSpans(0, s17.length(), android.text.style.ForegroundColorSpan.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(foregroundColorSpanArr);
        for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            s17.removeSpan(foregroundColorSpan);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (t70Var.e()) {
            b().b(curDesc, s17);
        }
        if (t70Var.G2()) {
            rx2.w wVar = this.f482528a;
            if (wVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topicSuggestManager");
                throw null;
            }
            java.util.ArrayList atStringInfoList = b().f482500c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atStringInfoList, "atStringInfoList");
            java.util.ArrayList arrayList = (java.util.ArrayList) wVar.f482532a;
            arrayList.clear();
            arrayList.addAll(hc2.x0.h(curDesc, atStringInfoList, new rx2.v(s17)));
        }
        if (this.f482530c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("activityPostManager");
            throw null;
        }
        int L = r26.n0.L(curDesc, "", 0, false, 6, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") || L < 0) {
            return;
        }
        int i17 = L + 0;
        s17.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)), L, i17, 17);
        s17.setSpan(new android.text.style.BackgroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560737ss)), L, i17, 17);
    }

    public final rx2.d b() {
        rx2.d dVar = this.f482529b;
        if (dVar != null) {
            return dVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atManager");
        throw null;
    }
}
