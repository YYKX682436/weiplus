package v8;

/* loaded from: classes15.dex */
public class b implements q8.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v8.c f515506a;

    public b(v8.c cVar, v8.a aVar) {
        this.f515506a = cVar;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        v8.c cVar = this.f515506a;
        if (j17 == 0) {
            return cVar.f515508b;
        }
        long j18 = (cVar.f515510d.f515555i * j17) / 1000000;
        long j19 = cVar.f515509c;
        long j27 = cVar.f515508b;
        long j28 = (((j18 * (j19 - j27)) / cVar.f515512f) - 30000) + j27;
        if (j28 >= j27) {
            j27 = j28;
        }
        return j27 >= j19 ? j19 - 1 : j27;
    }

    @Override // q8.m
    public long g() {
        return (this.f515506a.f515512f * 1000000) / r0.f515510d.f515555i;
    }
}
