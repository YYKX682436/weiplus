package wu3;

/* loaded from: classes5.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f531315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e) {
        super(1);
        this.f531315d = c17040x9d8b708e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList it = (java.util.LinkedList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f531315d;
        if (c17040x9d8b708e.V) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.f237503x1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorAudioView", "EditorView has been destroyed, skip callback");
        } else {
            boolean z17 = !it.isEmpty();
            c17040x9d8b708e.N = z17;
            if (z17) {
                wt3.v vVar = wt3.v.f531038i;
                if (vVar != null) {
                    vVar.f531043d = c17040x9d8b708e.m68181xbbb8ac5b();
                }
                c17040x9d8b708e.A.m68162xf040702b(c17040x9d8b708e.m68181xbbb8ac5b());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new wu3.m0(c17040x9d8b708e, it));
            }
        }
        return jz5.f0.f384359a;
    }
}
