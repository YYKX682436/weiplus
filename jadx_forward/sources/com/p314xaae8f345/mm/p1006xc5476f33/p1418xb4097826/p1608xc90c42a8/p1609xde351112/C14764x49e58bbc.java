package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Intent;", "it", "Ljz5/f0;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$jumWxProfile$dialog$1 */
/* loaded from: classes.dex */
public final class C14764x49e58bbc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f204482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14764x49e58bbc(boolean z17, android.content.Context context) {
        super(1);
        this.f204482d = z17;
        this.f204483e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent it = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = this.f204482d;
        android.content.Context context = this.f204483e;
        if (z17) {
            it.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14119xff3e467.class);
        } else {
            it.putExtra("keyFromSource", 1);
            it.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13981x5704e39f.class);
        }
        android.content.Context context2 = this.f204483e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(it);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$jumWxProfile$dialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$jumWxProfile$dialog$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
