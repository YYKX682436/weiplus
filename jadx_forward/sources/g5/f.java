package g5;

/* loaded from: classes13.dex */
public class f extends g5.d {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f350414e = a5.a0.e("NetworkMeteredCtrlr");

    public f(android.content.Context context, m5.a aVar) {
        super(h5.j.a(context, aVar).f360533c);
    }

    @Override // g5.d
    public boolean a(j5.w wVar) {
        return wVar.f379306j.f82918a == a5.b0.METERED;
    }

    @Override // g5.d
    public boolean b(java.lang.Object obj) {
        f5.b bVar = (f5.b) obj;
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            a5.a0.c().a(f350414e, "Metered network constraint is not supported before API 26, only checking for connected state.", new java.lang.Throwable[0]);
            return !bVar.f341101a;
        }
        if (bVar.f341101a && bVar.f341103c) {
            z17 = false;
        }
        return z17;
    }
}
