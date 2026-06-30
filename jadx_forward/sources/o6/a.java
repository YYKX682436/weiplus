package o6;

/* loaded from: classes16.dex */
public class a implements m6.c {

    /* renamed from: a, reason: collision with root package name */
    public o6.b f424706a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f424707b;

    @Override // m6.c
    /* renamed from: getDuration */
    public int mo146856x51e8b0a() {
        int i17;
        try {
            o6.c cVar = (o6.c) this.f424707b.get(r1.size() - 1);
            java.util.Iterator it = cVar.f424709b.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                m6.e eVar = (m6.e) it.next();
                if (eVar.f405882a.f405874a.equals("continuous")) {
                    m6.b bVar = eVar.f405882a;
                    i17 = bVar.f405875b + bVar.f405876c;
                } else {
                    i17 = eVar.f405882a.f405875b + 22;
                }
                if (i17 > i18) {
                    i18 = i17;
                }
            }
            return i18 + cVar.f424708a;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // m6.c
    /* renamed from: getVersion */
    public int mo146857x52c258a2() {
        this.f424706a.getClass();
        return 2;
    }
}
