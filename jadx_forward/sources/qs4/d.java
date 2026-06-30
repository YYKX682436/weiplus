package qs4;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs4.f f447948d;

    public d(qs4.f fVar) {
        this.f447948d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard dialog lOk");
        qs4.f fVar = this.f447948d;
        fVar.f420367b.d(new rs4.a(fVar.f447949c, "1", ""), true);
        at4.y0.a(1);
    }
}
