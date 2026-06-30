package ct2;

/* loaded from: classes10.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ct2.o f303826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303827b;

    public n(ct2.o oVar, yz5.l lVar) {
        this.f303826a = oVar;
        this.f303827b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        ct2.o oVar = this.f303826a;
        if (i17 == 0 && fVar.f152149b == 0) {
            oVar.f303831i = ((r45.lr1) fVar.f152151d).m75934xbce7f2f(3);
            boolean z17 = true;
            oVar.f303833n = ((r45.lr1) fVar.f152151d).m75933x41a8a7f2(1);
            oVar.f303829g.addAll(((r45.lr1) fVar.f152151d).m75941xfb821914(2));
            java.lang.String m75945x2fec8307 = ((r45.lr1) fVar.f152151d).m75945x2fec8307(4);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                oVar.f303832m = ((r45.lr1) fVar.f152151d).m75945x2fec8307(4);
                java.util.LinkedList m75941xfb821914 = ((r45.lr1) fVar.f152151d).m75941xfb821914(6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getResolution_node_list(...)");
                oVar.f303830h = m75941xfb821914;
                yz5.l lVar = this.f303827b;
                if (lVar != null) {
                    java.lang.String str = oVar.f303832m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    lVar.mo146xb9724478(str);
                }
            }
        } else {
            java.lang.String str2 = oVar.f303828f;
        }
        return jz5.f0.f384359a;
    }
}
