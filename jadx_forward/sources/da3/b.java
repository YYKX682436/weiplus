package da3;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da3.c f309294a;

    public b(da3.c cVar) {
        this.f309294a = cVar;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: getFilePath */
    public java.lang.String mo32199x5000ed37(java.lang.String str) {
        boolean Kj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str);
        da3.c cVar = this.f309294a;
        if (Kj) {
            java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(cVar.f309298b, cVar.f309300d, str);
            if (com.p314xaae8f345.mm.vfs.w6.j(zj6)) {
                return zj6;
            }
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                return str;
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(cVar.f309299c + str)) {
                return cVar.f309299c + str;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppAudioBinding", "LiteApp audio file not exist in %s", str);
        return "";
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: onCallBack */
    public void mo32200x9ac7b764(long j17, java.lang.String str) {
    }
}
