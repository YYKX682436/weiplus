package af5;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.c f86092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86094f;

    public d(z01.c cVar, java.lang.String str, android.content.Context context) {
        this.f86092d = cVar;
        this.f86093e = str;
        this.f86094f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String n17;
        s05.e q17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandMvvmView$onUpdateViewModel$1$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        z01.c cVar = this.f86092d;
        b1Var.f398565k = cVar.f550504t;
        java.lang.String str3 = cVar.f550500p;
        if (str3 != null) {
            b1Var.f398567l = str3;
        }
        b1Var.f398545a = this.f86093e;
        s05.d dVar = cVar.f550494g;
        java.lang.String str4 = "";
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        b1Var.f398555f = str;
        s05.d dVar2 = cVar.f550494g;
        int i17 = 0;
        b1Var.f398549c = (dVar2 == null || (q17 = dVar2.q()) == null) ? 0 : q17.m163516xfb85f7b0();
        b1Var.f398551d = -1;
        s05.d dVar3 = cVar.f550494g;
        if (dVar3 == null || (str2 = dVar3.m163512x74292566()) == null) {
            str2 = "";
        }
        b1Var.f398547b = str2;
        b1Var.Q = cVar.f550499o;
        if (!android.text.TextUtils.isEmpty(b1Var.f398567l)) {
            b1Var.f398567l += ':';
            b1Var.f398567l += cVar.f550499o + ':' + cVar.f550501q;
        }
        int i18 = cVar.f550499o;
        if (i18 == 1 || i18 == 2) {
            i17 = 1;
        } else if (i18 == 3 || i18 == 4) {
            i17 = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 6;
        s05.d dVar4 = cVar.f550494g;
        if (dVar4 != null && (n17 = dVar4.n()) != null) {
            str4 = n17;
        }
        c11812xa040dc98.f158859h = str4;
        b1Var.f398568m = i17;
        java.lang.String format = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{cVar.f550500p, cVar.f550501q}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        b1Var.f398569n = format;
        b1Var.f398574s = c11812xa040dc98;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f86094f, b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandMvvmView$onUpdateViewModel$1$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
