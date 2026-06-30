package i12;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0 f368699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i12.c f368700e;

    public b(i12.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0 h0Var) {
        this.f368700e = cVar;
        this.f368699d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i12.c cVar = this.f368700e;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0 h0Var = this.f368699d;
        if (h0Var != null) {
            h0Var.E5(cVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
