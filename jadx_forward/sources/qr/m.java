package qr;

/* loaded from: classes12.dex */
public class m extends qr.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.o f447558a;

    public m(qr.o oVar) {
        this.f447558a = oVar;
    }

    @Override // qr.k
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        qr.o oVar = this.f447558a;
        if (i17 != 0) {
            oVar.a(i17);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = oVar.f447552a.f68671x4b6e68b9;
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadBackup", "backup: origin %s, gif %s, token: %d", objArr);
        new pr.b(oVar.f447553b ? 1 : 0, 4, java.util.Collections.singletonList(str)).l().K(new qr.n(oVar, str, str2, str3));
    }
}
