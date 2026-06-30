package w6;

/* loaded from: classes13.dex */
public class y extends w6.z {
    @Override // w6.z
    public boolean a() {
        return true;
    }

    @Override // w6.z
    public boolean b() {
        return true;
    }

    @Override // w6.z
    public boolean c(t6.a aVar) {
        return aVar == t6.a.REMOTE;
    }

    @Override // w6.z
    public boolean d(boolean z17, t6.a aVar, t6.c cVar) {
        return ((z17 && aVar == t6.a.DATA_DISK_CACHE) || aVar == t6.a.LOCAL) && cVar == t6.c.TRANSFORMED;
    }
}
