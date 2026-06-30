package fy2;

/* loaded from: classes10.dex */
public final class c extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f348771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.p pVar, java.lang.Class cls) {
        super(cls);
        this.f348771b = pVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.g84 g84Var;
        java.lang.Object obj;
        r45.py2 result = (r45.py2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.LinkedList m75941xfb821914 = result.m75941xfb821914(0);
        java.lang.Object obj2 = null;
        if (m75941xfb821914 != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.g84) obj).m75939xb282bd08(0) == 1) {
                        break;
                    }
                }
            }
            g84Var = (r45.g84) obj;
        } else {
            g84Var = null;
        }
        java.util.LinkedList m75941xfb8219142 = result.m75941xfb821914(1);
        if (m75941xfb8219142 != null) {
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.g84) next).m75939xb282bd08(0) == 1) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (r45.g84) obj2;
        }
        yz5.p pVar = this.f348771b;
        if (pVar != null) {
            pVar.mo149xb9724478(g84Var, obj2);
        }
    }
}
