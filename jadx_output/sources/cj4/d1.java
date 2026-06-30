package cj4;

/* loaded from: classes11.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41921d;

    public d1(cj4.i1 i1Var) {
        this.f41921d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.i1 i1Var = this.f41921d;
        i1Var.getClass();
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        int i17 = kotlin.jvm.internal.o.b(en1.a.a(), i1Var.f41946h) ? 6 : 4;
        qj4.b bVar = qj4.b.f363906a;
        java.lang.String a17 = bVar.a(i1Var.y(i17), bi4.v1.d().f21091a, false);
        qj4.s sVar = qj4.s.f363958a;
        qj4.s.m(sVar, i1Var.w(), 28L, a17, i1Var.R, 0L, 0L, 0L, i1Var.y(i17), null, null, 0L, 1904, null);
        android.content.Context w17 = i1Var.w();
        if (i1Var.f41942d.f21067g == 5) {
            bi4.u1 d17 = bi4.v1.d();
            int i18 = d17.f21091a;
            if (i18 != 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING, bi4.v1.c(java.lang.String.valueOf(i18), d17.f21092b));
            }
            bk4.s sVar2 = i1Var.B1;
            if (sVar2 != null && sVar2.f21554a) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING, bi4.v1.c("squrered", sVar2.f21555b));
            }
        }
        com.tencent.mm.plugin.textstatus.ui.ce.a(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.f173656z, w17, null, 6, i1Var.y(6), bi4.v1.d().f21091a, false, 34, null);
        qj4.s.l(sVar, 52L, bVar.a(i1Var.y(kotlin.jvm.internal.o.b(en1.a.a(), i1Var.f41946h) ? 6 : 4), bi4.v1.d().f21091a, false), com.tencent.mm.plugin.finder.gallery.b0.f111351b, 0L, null, 0L, 56, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
