package n3;

/* loaded from: classes15.dex */
public final class i1 implements android.view.OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final n3.l0 f415875a;

    public i1(n3.l0 l0Var) {
        this.f415875a = l0Var;
    }

    @Override // android.view.OnReceiveContentListener
    public android.view.ContentInfo onReceiveContent(android.view.View view, android.view.ContentInfo contentInfo) {
        n3.i iVar;
        n3.g gVar = new n3.g(contentInfo);
        n3.i iVar2 = new n3.i(gVar);
        ih5.b bVar = (ih5.b) this.f415875a;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.content.ClipData clip = gVar.f415869a.getClip();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clip, "getClip(...)");
        ih5.a aVar = bVar.f373135a;
        boolean z17 = false;
        if (aVar != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19671xf9472bd2) aVar).f271647a;
            if (c19666xfd6e2f33.H1) {
                java.util.List a17 = t35.b.f496968a.a(clip);
                java.util.ArrayList arrayList = (java.util.ArrayList) a17;
                if (arrayList.size() > 1 || (arrayList.size() == 1 && ((t35.a) arrayList.get(0)).f496967c != null)) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xi) ((sb5.l1) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.l1.class))).m0(a17);
                    z17 = true;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "not support paste content!!");
            }
        }
        if (z17) {
            iVar = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AllMediaContentReceiver", "process fail");
            iVar = iVar2;
        }
        if (iVar == null) {
            return null;
        }
        if (iVar == iVar2) {
            return contentInfo;
        }
        android.view.ContentInfo contentInfo2 = ((n3.g) iVar.f415874a).f415869a;
        java.util.Objects.requireNonNull(contentInfo2);
        return contentInfo2;
    }
}
