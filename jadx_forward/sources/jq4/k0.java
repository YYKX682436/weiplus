package jq4;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382695d;

    public k0(jq4.z0 z0Var) {
        this.f382695d = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "initView: onReject clicked");
        this.f382695d.s();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
