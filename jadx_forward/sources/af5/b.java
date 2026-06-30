package af5;

/* loaded from: classes9.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.a f86084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86086f;

    public b(z01.a aVar, java.lang.String str, android.content.Context context) {
        this.f86084d = aVar;
        this.f86085e = str;
        this.f86086f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String n17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandFakeNativeMvvmView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = 1096;
        z01.a aVar = this.f86084d;
        java.lang.String str3 = aVar.f550467o;
        if (str3 != null) {
            b1Var.f398567l = str3;
        }
        b1Var.f398545a = this.f86085e;
        s05.d dVar = aVar.f550461f;
        java.lang.String str4 = "";
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        b1Var.f398555f = str;
        b1Var.f398551d = -1;
        s05.d dVar2 = aVar.f550461f;
        if (dVar2 == null || (str2 = dVar2.m163512x74292566()) == null) {
            str2 = "";
        }
        b1Var.f398547b = str2;
        b1Var.Q = aVar.f550466n;
        if (!android.text.TextUtils.isEmpty(b1Var.f398567l)) {
            b1Var.f398567l += ':';
            b1Var.f398567l += aVar.f550466n + ':' + aVar.f550468p;
        }
        int i17 = aVar.f550466n;
        int i18 = 1;
        if (i17 != 1 && i17 != 2) {
            i18 = (i17 == 3 || i17 == 4) ? 2 : 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 6;
        s05.d dVar3 = aVar.f550461f;
        if (dVar3 != null && (n17 = dVar3.n()) != null) {
            str4 = n17;
        }
        c11812xa040dc98.f158859h = str4;
        b1Var.f398568m = i18;
        java.lang.String format = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{aVar.f550467o, aVar.f550468p}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        b1Var.f398569n = format;
        b1Var.f398574s = c11812xa040dc98;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f86086f, b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandFakeNativeMvvmView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
