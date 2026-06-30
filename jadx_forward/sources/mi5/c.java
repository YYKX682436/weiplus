package mi5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb5.a f408337d;

    public c(pb5.a aVar) {
        this.f408337d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingContactCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pb5.a aVar = this.f408337d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = aVar.m75942xfb822ef2(aVar.f125235d + 0) != 0 ? pt0.f0.f439742b1.n(aVar.m75945x2fec8307(aVar.f125235d + 1), aVar.m75942xfb822ef2(aVar.f125235d + 0)) : new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        android.content.Context context = view.getContext();
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str2 = V1;
        m15.a j17 = aVar.j();
        if (j17 == null || (str = j17.m126747x696739c()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wg.a(context, str2, str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.Q0()), n17.A0() == 0, n17);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingContactCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
