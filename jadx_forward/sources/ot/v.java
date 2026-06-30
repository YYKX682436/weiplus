package ot;

/* loaded from: classes12.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt.h f429872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(tt.h hVar, tt.i iVar) {
        super(0);
        this.f429872d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15;
        r45.ul5 ul5Var;
        java.util.LinkedList linkedList;
        jz5.g gVar = ot.w.f429873m;
        java.util.Iterator it = kz5.n0.S0((java.util.HashSet) ((jz5.n) ot.w.f429873m).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            tt.j jVar = (tt.j) ((java.lang.ref.WeakReference) it.next()).get();
            if (jVar != null && (ul5Var = (activityC16966x2b279c15 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16968xf66cfbad) jVar).f236816a).f236810v) != null && (linkedList = ul5Var.f468998f) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.gp0 gp0Var = (r45.gp0) it6.next();
                    s15.h hVar = this.f429872d.f503299c;
                    if (hVar.m75945x2fec8307(hVar.f384955d + 3).equals(gp0Var.T)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = activityC16966x2b279c15.f236800n;
                        h0Var.f236934g.mo50293x3498a0(h0Var.f236947w);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
