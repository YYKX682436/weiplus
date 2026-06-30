package c43;

/* loaded from: classes15.dex */
public class t extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c43.v f120011m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c43.v vVar, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.view.View.OnTouchListener onTouchListener) {
        super(c23001x9d3a0bdc, onTouchListener);
        this.f120011m = vVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatItemTplVH", if1.m.f69928x24728b);
        js5.c cVar = this.f296744g;
        if (cVar != null) {
            android.text.style.CharacterStyle characterStyle = cVar.f383104g;
            if (characterStyle instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n1) characterStyle;
                java.lang.Object obj = n1Var.f220772e;
                if (obj instanceof c43.b1) {
                    c43.b1 b1Var = (c43.b1) obj;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f119931d) && b1Var.f119932e) {
                        java.lang.String str = ((c43.b1) n1Var.f220772e).f119931d;
                        c43.v vVar = this.f120011m;
                        vVar.getClass();
                        u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(str);
                        if (Bi != null && !vVar.s() && !s33.y.e(vVar.S).f484024b) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c c5237xbeff673c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c();
                            y33.e eVar = (y33.e) Bi;
                            java.lang.String str2 = eVar.f66967xdde069b;
                            am.b2 b2Var = c5237xbeff673c.f135570g;
                            b2Var.f87741a = str2;
                            b2Var.f87742b = eVar.f66960x21eb2633;
                            c5237xbeff673c.e();
                        }
                    }
                }
            }
        }
        super.onLongPress(motionEvent);
    }
}
