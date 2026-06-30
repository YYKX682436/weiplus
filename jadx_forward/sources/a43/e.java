package a43;

/* loaded from: classes11.dex */
public class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a43.g f82746a;

    public e(a43.g gVar) {
        this.f82746a = gVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a43.g gVar = this.f82746a;
        arrayList.addAll(gVar.f82749d);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) ((java.lang.ref.WeakReference) it.next()).get();
                if (n1Var != null) {
                    u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi((java.lang.String) gVar.b(n1Var.f272434m).first);
                    if (Bi != null) {
                        java.lang.String str = ((y33.e) Bi).f66951x81118851;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (str == null) {
                            str = "";
                        }
                        if (str.equals(((a43.a) aVar.f375106a).f82741d)) {
                            n1Var.U(n1Var.f272434m);
                        }
                    }
                } else {
                    it.remove();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GameChatRoom.ChatRoomAvatarInterceptor", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
