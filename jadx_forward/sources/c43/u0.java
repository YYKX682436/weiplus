package c43;

/* loaded from: classes15.dex */
public class u0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f120015d;

    public u0(c43.x xVar) {
        this.f120015d = xVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        c43.x xVar = this.f120015d;
        if (xVar.M != null && !xVar.s() && !s33.y.e(xVar.S).f484024b) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c c5237xbeff673c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c();
            java.lang.String str = xVar.f120028m.f36570xfd4da1cb;
            am.b2 b2Var = c5237xbeff673c.f135570g;
            b2Var.f87741a = str;
            b2Var.f87742b = ((y33.e) xVar.M).f66960x21eb2633;
            c5237xbeff673c.e();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
            long j17 = xVar.f120027i;
            long j18 = xVar.f120026h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
            fVar.g(4L, 27L, j17, j18, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, xVar.X);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
