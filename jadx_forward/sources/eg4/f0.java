package eg4;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f334233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.h2 f334234e;

    public f0(eg4.i0 i0Var, eg4.h2 h2Var) {
        this.f334233d = i0Var;
        this.f334234e = h2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f334233d.f334262e;
        if (pVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            z17 = ((java.lang.Boolean) pVar.mo149xb9724478(view, this.f334234e)).booleanValue();
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
