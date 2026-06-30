package td5;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td5.b f499292d;

    public a(td5.b bVar) {
        this.f499292d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        td5.b bVar = this.f499292d;
        bVar.f307319b.m124850x7650bebc(10002);
        com.p314xaae8f345.mm.p957x53236a1b.d1.J(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5s), "", bVar.f307319b, "");
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(bVar.f307319b.m124847x74d37ac6(), bVar.f307319b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InvokeMessageNewXmlMsg", "checkExpired:%s", java.lang.Long.valueOf(bVar.f307319b.m124847x74d37ac6()));
    }
}
