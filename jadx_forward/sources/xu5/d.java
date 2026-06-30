package xu5;

/* loaded from: classes12.dex */
public class d implements xu5.s, xu5.u {
    public d(xu5.c cVar) {
    }

    public void a(xu5.b bVar, xu5.v vVar) {
        vVar.f538876z = null;
        xu5.t tVar = bVar.f538836b;
        if (tVar.f538868e.get()) {
            return;
        }
        synchronized (tVar) {
            xu5.v vVar2 = (xu5.v) tVar.f538872i.pollFirst();
            while (vVar2 != null && vVar2.isCancelled()) {
                vVar2 = (xu5.v) tVar.f538872i.pollFirst();
            }
            if (vVar2 == null) {
                tVar.f538870g = false;
                tVar.e();
            } else {
                xu5.s sVar = tVar.f538869f;
                java.util.Objects.requireNonNull(sVar);
                vVar2.f538876z = (xu5.d) sVar;
                ((vu5.b) vVar2.f531390r).c(vVar2);
            }
        }
    }
}
