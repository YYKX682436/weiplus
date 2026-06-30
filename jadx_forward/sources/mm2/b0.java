package mm2;

/* loaded from: classes3.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.c f410285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tp2 f410286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f410287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lm2.c cVar, r45.tp2 tp2Var, mm2.e0 e0Var) {
        super(0);
        this.f410285d = cVar;
        this.f410286e = tp2Var;
        this.f410287f = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lm2.j0 d17;
        java.util.LinkedList linkedList;
        lm2.c cVar = this.f410285d;
        cVar.f400905e.set(12, java.lang.Long.valueOf(this.f410286e.m75942xfb822ef2(2)));
        lm2.h0 h0Var = this.f410287f.f410509s;
        if (h0Var != null) {
            r45.qm1 qm1Var = (r45.qm1) cVar.f400905e.m75936x14adae67(8);
            java.lang.Object obj = null;
            java.lang.String m75945x2fec8307 = qm1Var != null ? qm1Var.m75945x2fec8307(1) : null;
            boolean z17 = false;
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (d17 = h0Var.d(m75945x2fec8307)) != null) {
                lm2.o oVar = (lm2.o) h0Var.f400930d.get(m75945x2fec8307);
                int indexOf = d17.f400942b.indexOf(cVar);
                java.lang.String m75945x2fec83072 = cVar.f400905e.m75945x2fec8307(2);
                if (m75945x2fec83072 != null) {
                    if (m75945x2fec83072.length() > 0) {
                        z17 = true;
                    }
                }
                if (z17 && (linkedList = d17.f400944d.f465637g) != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        java.lang.String m75945x2fec83073 = cVar.f400905e.m75945x2fec8307(2);
                        r45.ch1 ch1Var = ((r45.wn) next).f470835d;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec83073, ch1Var != null ? ch1Var.m75945x2fec8307(2) : null)) {
                            obj = next;
                            break;
                        }
                    }
                    r45.wn wnVar = (r45.wn) obj;
                    if (wnVar != null) {
                        r45.ch1 ch1Var2 = wnVar.f470835d;
                        if (ch1Var2 != null) {
                            ch1Var2.set(12, java.lang.Long.valueOf(cVar.f400905e.m75942xfb822ef2(12)));
                        }
                        java.lang.String str = "updateLocalSeq " + cVar.f400905e.m75942xfb822ef2(12) + ", " + cVar.f400905e.m75945x2fec8307(2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "memDataLog ".concat(str));
                    }
                }
                if (indexOf >= 0) {
                    h0Var.b("notifier update index:" + indexOf + ", msg:" + cVar.g());
                    if (oVar != null) {
                        ((se2.a0) oVar).f(new lm2.t(m75945x2fec8307, indexOf, 1, 102));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
