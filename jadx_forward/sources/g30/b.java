package g30;

/* loaded from: classes9.dex */
public class b implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g30.e f349554a;

    public b(g30.e eVar) {
        this.f349554a = eVar;
    }

    @Override // qr.i
    /* renamed from: onResult */
    public void mo44657x57429edc(int i17, java.lang.String str) {
        g30.e eVar = this.f349554a;
        if (i17 == 0) {
            eVar.wi();
        } else {
            eVar.Bi(5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBypService", "uploadCDN error");
        }
    }
}
