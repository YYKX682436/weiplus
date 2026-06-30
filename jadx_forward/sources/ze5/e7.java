package ze5;

/* loaded from: classes3.dex */
public final class e7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.r f553438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f553439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(z01.r rVar, boolean z17) {
        super(1);
        this.f553438d = rVar;
        this.f553439e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a11.c sourceViewHolder = (a11.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceViewHolder, "sourceViewHolder");
        android.view.View view = sourceViewHolder.f82037a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$4", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$4", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = sourceViewHolder.f82039c;
        textView.setVisibility(0);
        z01.r rVar = this.f553438d;
        textView.setText(rVar.f550683i);
        if (this.f553439e) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = sourceViewHolder.f82038b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22699x3dcdb352, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c22699x3dcdb352, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$4", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$4", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = sourceViewHolder.f82038b;
            c22699x3dcdb3522.setVisibility(0);
            c22699x3dcdb3522.setImageResource(rVar.f550684m);
            c22699x3dcdb3522.m82040x7541828(rVar.f550685n);
        }
        return jz5.f0.f384359a;
    }
}
