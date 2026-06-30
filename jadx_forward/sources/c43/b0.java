package c43;

/* loaded from: classes15.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f119927d;

    public b0(c43.x xVar) {
        this.f119927d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && (view.getTag() instanceof java.lang.Integer)) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            if (intValue == this.f119927d.X) {
                yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67 c5239x4881ea67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67();
            am.d2 d2Var = c5239x4881ea67.f135572g;
            d2Var.f87961a = intValue;
            d2Var.f87964d = true;
            c5239x4881ea67.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
