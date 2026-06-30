package c43;

/* loaded from: classes9.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f120052d;

    public y0(c43.x xVar) {
        this.f120052d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f120052d.w(view);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
