package af2;

/* loaded from: classes3.dex */
public final class g extends we2.x {
    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var == null) {
            return true;
        }
        java.util.LinkedList list = r71Var.getList(24);
        if (list != null) {
            dk2.tb tbVar = dk2.ef.f233392k;
            tbVar.getClass();
            tbVar.f234127h.post(new dk2.hb(list, tbVar));
        }
        java.util.LinkedList list2 = r71Var.getList(23);
        if (list2 == null) {
            return true;
        }
        dk2.tb tbVar2 = dk2.ef.f233392k;
        tbVar2.getClass();
        tbVar2.f234127h.post(new dk2.fb(list2, tbVar2));
        return true;
    }
}
