package mi5;

/* loaded from: classes9.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob5.a f408417d;

    public n0(ob5.a aVar) {
        this.f408417d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingPhotoAccountNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ob5.a aVar = this.f408417d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = aVar.m75942xfb822ef2(aVar.f125235d + 0) != 0 ? pt0.f0.f439742b1.n(aVar.m75945x2fec8307(aVar.f125235d + 1), aVar.m75942xfb822ef2(aVar.f125235d + 0)) : new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        ze5.q4 q4Var = ze5.r4.f553713a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str2 = V1;
        l15.c j17 = aVar.j();
        if (j17 == null || (str = j17.m126747x696739c()) == null) {
            str = "";
        }
        q4Var.d(context, str2, str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.Q0()), n17.A0() == 0, n17);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingPhotoAccountNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
