package g5;

/* loaded from: classes13.dex */
public class e extends g5.d {
    public e(android.content.Context context, m5.a aVar) {
        super(h5.j.a(context, aVar).f360533c);
    }

    @Override // g5.d
    public boolean a(j5.w wVar) {
        return wVar.f379306j.f82918a == a5.b0.CONNECTED;
    }

    @Override // g5.d
    public boolean b(java.lang.Object obj) {
        f5.b bVar = (f5.b) obj;
        return android.os.Build.VERSION.SDK_INT >= 26 ? (bVar.f341101a && bVar.f341102b) ? false : true : true ^ bVar.f341101a;
    }
}
