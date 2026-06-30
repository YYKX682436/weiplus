package m8;

/* loaded from: classes15.dex */
public class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m8.k f406105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m8.k kVar, android.os.Looper looper) {
        super(looper);
        this.f406105a = kVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        m8.k kVar = this.f406105a;
        kVar.getClass();
        int i17 = message.what;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = kVar.f406110e;
        switch (i17) {
            case 0:
                kVar.f406118m--;
                return;
            case 1:
                kVar.f406116k = message.arg1;
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((m8.z) it.next()).y(kVar.f406114i, kVar.f406116k);
                }
                return;
            case 2:
                kVar.f406119n = message.arg1 != 0;
                java.util.Iterator it6 = copyOnWriteArraySet.iterator();
                while (it6.hasNext()) {
                    ((m8.z) it6.next()).b(kVar.f406119n);
                }
                return;
            case 3:
                if (kVar.f406118m == 0) {
                    q9.p pVar = (q9.p) message.obj;
                    kVar.f406113h = true;
                    kVar.f406122q = pVar.f442403a;
                    kVar.f406123r = pVar.f442404b;
                    q9.k kVar2 = (q9.k) kVar.f406106a;
                    kVar2.getClass();
                    kVar2.f442399c = (q9.j) pVar.f442405c;
                    java.util.Iterator it7 = copyOnWriteArraySet.iterator();
                    while (it7.hasNext()) {
                        ((m8.z) it7.next()).e(kVar.f406122q, kVar.f406123r);
                    }
                    return;
                }
                return;
            case 4:
                int i18 = kVar.f406117l - 1;
                kVar.f406117l = i18;
                if (i18 == 0) {
                    kVar.f406125t = (m8.m) message.obj;
                    if (kVar.f406120o.j()) {
                        kVar.f406126u = 0;
                        kVar.f406127v = 0L;
                    }
                    if (message.arg1 != 0) {
                        java.util.Iterator it8 = copyOnWriteArraySet.iterator();
                        while (it8.hasNext()) {
                            ((m8.z) it8.next()).A();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (kVar.f406117l == 0) {
                    kVar.f406125t = (m8.m) message.obj;
                    java.util.Iterator it9 = copyOnWriteArraySet.iterator();
                    while (it9.hasNext()) {
                        ((m8.z) it9.next()).A();
                    }
                    return;
                }
                return;
            case 6:
                m8.o oVar = (m8.o) message.obj;
                int i19 = kVar.f406117l - oVar.f406175d;
                kVar.f406117l = i19;
                if (kVar.f406118m == 0) {
                    m8.m0 m0Var = oVar.f406172a;
                    kVar.f406120o = m0Var;
                    kVar.f406121p = oVar.f406173b;
                    kVar.f406125t = oVar.f406174c;
                    if (i19 == 0 && m0Var.j()) {
                        kVar.f406126u = 0;
                        kVar.f406127v = 0L;
                    }
                    java.util.Iterator it10 = copyOnWriteArraySet.iterator();
                    while (it10.hasNext()) {
                        ((m8.z) it10.next()).t(kVar.f406120o, kVar.f406121p);
                    }
                    return;
                }
                return;
            case 7:
                m8.y yVar = (m8.y) message.obj;
                if (kVar.f406124s.m146936xb2c87fbf(yVar)) {
                    return;
                }
                kVar.f406124s = yVar;
                java.util.Iterator it11 = copyOnWriteArraySet.iterator();
                while (it11.hasNext()) {
                    ((m8.z) it11.next()).u(yVar);
                }
                return;
            case 8:
                m8.e eVar = (m8.e) message.obj;
                java.util.Iterator it12 = copyOnWriteArraySet.iterator();
                while (it12.hasNext()) {
                    ((m8.z) it12.next()).d(eVar);
                }
                return;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
