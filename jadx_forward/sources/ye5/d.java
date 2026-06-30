package ye5;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f542780d;

    public d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f542780d = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemFoldSys$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jc5.b.f380549a.a(this.f542780d);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828().e();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemFoldSys$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
