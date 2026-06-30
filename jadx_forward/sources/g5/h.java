package g5;

/* loaded from: classes13.dex */
public class h extends g5.d {
    public h(android.content.Context context, m5.a aVar) {
        super(h5.j.a(context, aVar).f360533c);
    }

    @Override // g5.d
    public boolean a(j5.w wVar) {
        a5.b0 b0Var = wVar.f379306j.f82918a;
        return b0Var == a5.b0.UNMETERED || (android.os.Build.VERSION.SDK_INT >= 30 && b0Var == a5.b0.TEMPORARILY_UNMETERED);
    }

    @Override // g5.d
    public boolean b(java.lang.Object obj) {
        f5.b bVar = (f5.b) obj;
        return !bVar.f341101a || bVar.f341103c;
    }
}
