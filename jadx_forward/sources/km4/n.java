package km4;

/* loaded from: classes8.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.l lVar) {
        super(2);
        this.f390832d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pi0.l1 l1Var = (pi0.l1) obj;
        android.content.Intent intent = (android.content.Intent) obj2;
        if (intent != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ting/utils/TingPlatformHybridRouterCreator$handleOpenInner$1", "invoke", "(Lcom/tencent/mm/flutter/base/MMFlutterInstance;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ting/utils/TingPlatformHybridRouterCreator$handleOpenInner$1", "invoke", "(Lcom/tencent/mm/flutter/base/MMFlutterInstance;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (l1Var != null) {
            bw5.k20 k20Var = new bw5.k20();
            k20Var.f110741d = l1Var.f436180f;
            k20Var.f110742e[1] = true;
            yz5.l lVar = this.f390832d;
            if (lVar != null) {
                lVar.mo146xb9724478(k20Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
