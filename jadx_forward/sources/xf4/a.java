package xf4;

/* loaded from: classes4.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xf4.b f535860d;

    public a(xf4.b bVar) {
        this.f535860d = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        r45.xw6 xw6Var;
        r45.cu5 cu5Var;
        r45.cu5 cu5Var2;
        xf4.b bVar = this.f535860d;
        int i17 = bVar.f535863f;
        if (i17 < 0) {
            return false;
        }
        r45.zq3 zq3Var = (r45.zq3) bVar.f535862e.f152244b.f152233a;
        try {
            xw6Var = (r45.xw6) zq3Var.f473838f.get(i17);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetVUserInfo", "get item :" + bVar.f535863f + " not Found");
            xw6Var = null;
        }
        if (xw6Var != null && (cu5Var = xw6Var.f472099g) != null && cu5Var.f453374f != null && (cu5Var2 = xw6Var.f472098f) != null && cu5Var2.f453374f != null) {
            int i18 = zq3Var.f473836d;
            int i19 = bVar.f535863f;
            java.lang.Integer.toHexString(xw6Var.f472096d);
            int i27 = xw6Var.f472098f.f453372d;
            r45.cu5 cu5Var3 = xw6Var.f472099g;
            int i28 = cu5Var3.f453372d;
            xf4.b.H(bVar, xw6Var.f472096d, true, cu5Var3.f453374f.g());
            xf4.b.H(bVar, xw6Var.f472096d, false, xw6Var.f472098f.f453374f.g());
        }
        bVar.f535863f--;
        return true;
    }
}
