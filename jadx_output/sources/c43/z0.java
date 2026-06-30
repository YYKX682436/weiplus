package c43;

/* loaded from: classes15.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f38522d;

    public z0(c43.x xVar) {
        this.f38522d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c43.x xVar = this.f38522d;
        if (xVar.D.getTag() instanceof s33.j) {
            s33.j jVar = (s33.j) xVar.D.getTag();
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatItemVH", "retry send msg, cliMsgId:%s", jVar.f402508d);
            xVar.D.setVisibility(8);
            xVar.C.setVisibility(0);
            gm0.j1.d().g(new v33.t(jVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
