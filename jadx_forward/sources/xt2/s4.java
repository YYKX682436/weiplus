package xt2;

/* loaded from: classes3.dex */
public final class s4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f538545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(xt2.b5 b5Var, android.view.View view) {
        super(3);
        this.f538544d = b5Var;
        this.f538545e = view;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        if (booleanValue) {
            xt2.b5 b5Var = this.f538544d;
            android.view.View view = b5Var.f538176r;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = b5Var.f538177s;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("manualChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f538545e;
            db5.t7.g(view3.getContext(), view3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573313e75));
        }
        return jz5.f0.f384359a;
    }
}
