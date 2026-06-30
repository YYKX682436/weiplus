package cj4;

/* loaded from: classes11.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123454d;

    public d1(cj4.i1 i1Var) {
        this.f123454d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.i1 i1Var = this.f123454d;
        i1Var.getClass();
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(en1.a.a(), i1Var.f123479h) ? 6 : 4;
        qj4.b bVar = qj4.b.f445439a;
        java.lang.String a17 = bVar.a(i1Var.y(i17), bi4.v1.d().f102624a, false);
        qj4.s sVar = qj4.s.f445491a;
        qj4.s.m(sVar, i1Var.w(), 28L, a17, i1Var.R, 0L, 0L, 0L, i1Var.y(i17), null, null, 0L, 1904, null);
        android.content.Context w17 = i1Var.w();
        if (i1Var.f123475d.f102600g == 5) {
            bi4.u1 d17 = bi4.v1.d();
            int i18 = d17.f102624a;
            if (i18 != 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING, bi4.v1.c(java.lang.String.valueOf(i18), d17.f102625b));
            }
            bk4.s sVar2 = i1Var.B1;
            if (sVar2 != null && sVar2.f103087a) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING, bi4.v1.c("squrered", sVar2.f103088b));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ce.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.f255189z, w17, null, 6, i1Var.y(6), bi4.v1.d().f102624a, false, 34, null);
        qj4.s.l(sVar, 52L, bVar.a(i1Var.y(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(en1.a.a(), i1Var.f123479h) ? 6 : 4), bi4.v1.d().f102624a, false), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192884b, 0L, null, 0L, 56, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
