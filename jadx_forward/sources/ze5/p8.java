package ze5;

/* loaded from: classes9.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f553684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(ze5.w8 w8Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f553684d = w8Var;
        this.f553685e = f9Var;
        this.f553686f = dVar;
        this.f553687g = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = this.f553685e.P0() < 2;
        ze5.w8 w8Var = this.f553684d;
        w8Var.Z(it, z17, true);
        if (w8Var instanceof ye5.i) {
            android.widget.LinearLayout linearLayout = it.f553645d;
            if (linearLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(linearLayout, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$CommonItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                linearLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(linearLayout, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$CommonItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(linearLayout, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            ze5.w8 w8Var2 = this.f553684d;
            rd5.d dVar = this.f553686f;
            yb5.d dVar2 = this.f553687g;
            w8Var2.V(it, dVar, dVar2.t(), dVar2.D(), this.f553687g, this.f553684d);
            android.widget.LinearLayout linearLayout2 = it.f553645d;
            if (linearLayout2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(linearLayout2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(linearLayout2, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$CommonItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                linearLayout2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(linearLayout2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItem$CommonItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(linearLayout2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
