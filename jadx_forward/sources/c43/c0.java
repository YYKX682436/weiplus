package c43;

/* loaded from: classes15.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f119937d;

    public c0(c43.x xVar) {
        this.f119937d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        v33.y yVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if ((view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8) view.getTag()).f36907xf877edf9) {
            boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8) view.getTag()).f36911x9c46cbb;
            c43.x xVar = this.f119937d;
            if (z17) {
                java.lang.String str = xVar.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                yVar = new v33.y(str, c15731x94356d67.seq, false, c15731x94356d67.f36570xfd4da1cb, 16);
            } else {
                java.lang.String str2 = xVar.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = xVar.f120028m;
                yVar = new v33.y(str2, c15731x94356d672.seq, true, c15731x94356d672.f36570xfd4da1cb, 16);
            }
            gm0.j1.d().g(yVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
