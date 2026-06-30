package a43;

/* loaded from: classes11.dex */
public class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a43.g f1213a;

    public e(a43.g gVar) {
        this.f1213a = gVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a43.g gVar = this.f1213a;
        arrayList.addAll(gVar.f1216d);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                com.tencent.mm.pluginsdk.ui.n1 n1Var = (com.tencent.mm.pluginsdk.ui.n1) ((java.lang.ref.WeakReference) it.next()).get();
                if (n1Var != null) {
                    u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi((java.lang.String) gVar.b(n1Var.f190901m).first);
                    if (Bi != null) {
                        java.lang.String str = ((y33.e) Bi).field_avatarURL;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str == null) {
                            str = "";
                        }
                        if (str.equals(((a43.a) aVar.f293573a).f1208d)) {
                            n1Var.U(n1Var.f190901m);
                        }
                    }
                } else {
                    it.remove();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("GameChatRoom.ChatRoomAvatarInterceptor", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
