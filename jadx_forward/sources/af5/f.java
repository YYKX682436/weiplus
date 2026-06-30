package af5;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.b f86103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86105f;

    public f(z01.b bVar, java.lang.String str, android.content.Context context) {
        this.f86103d = bVar;
        this.f86104e = str;
        this.f86105f = context;
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
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandProfileCardMvvmView$onUpdateViewModel$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        z01.b bVar = this.f86103d;
        b1Var.f398565k = bVar.f550484n;
        bVar.getClass();
        b1Var.f398545a = this.f86104e;
        s05.d dVar = bVar.f550480g;
        java.lang.String str3 = "";
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        b1Var.f398555f = str;
        s05.d dVar2 = bVar.f550480g;
        b1Var.f398549c = (dVar2 == null || (q17 = dVar2.q()) == null) ? 0 : q17.m163516xfb85f7b0();
        b1Var.f398551d = -1;
        s05.d dVar3 = bVar.f550480g;
        if (dVar3 == null || (str2 = dVar3.m163512x74292566()) == null) {
            str2 = "";
        }
        b1Var.f398547b = str2;
        bVar.getClass();
        b1Var.Q = 0;
        if (!android.text.TextUtils.isEmpty(b1Var.f398567l)) {
            b1Var.f398567l += ':';
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(b1Var.f398567l);
            bVar.getClass();
            sb6.append("0:null");
            bVar.getClass();
            b1Var.f398567l = sb6.toString();
        }
        bVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 6;
        s05.d dVar4 = bVar.f550480g;
        if (dVar4 != null && (n17 = dVar4.n()) != null) {
            str3 = n17;
        }
        c11812xa040dc98.f158859h = str3;
        b1Var.f398568m = 0;
        bVar.getClass();
        bVar.getClass();
        java.lang.String format = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{null, null}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        b1Var.f398569n = format;
        b1Var.f398574s = c11812xa040dc98;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f86105f, b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandProfileCardMvvmView$onUpdateViewModel$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
