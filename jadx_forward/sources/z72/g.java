package z72;

/* loaded from: classes12.dex */
public class g implements com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f552096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.j4 f552097b;

    public g(z72.f fVar, boolean[] zArr, o72.j4 j4Var) {
        this.f552096a = zArr;
        this.f552097b = j4Var;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe
    /* renamed from: insideTransaction */
    public boolean mo14059x1b311542(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "begin runTransaction thread id:" + java.lang.Thread.currentThread().getId());
        boolean a17 = ((s72.s) this.f552097b).a();
        boolean[] zArr = this.f552096a;
        zArr[0] = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "runTransaction end with ret:" + zArr[0] + " thread id:" + java.lang.Thread.currentThread().getId());
        return zArr[0];
    }
}
