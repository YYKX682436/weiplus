package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class mn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(android.content.Context context) {
        super(1);
        this.f214205d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent it = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.setClass(this.f214205d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14119xff3e467.class);
        android.content.Context context = this.f214205d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(it);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$showWxProfileDialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$showWxProfileDialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
