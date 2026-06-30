package lx;

/* loaded from: classes10.dex */
public final class c implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.k f403236a;

    public c(lx.k kVar) {
        this.f403236a = kVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        bw5.bu buVar = (bw5.bu) obj;
        lx.k kVar = this.f403236a;
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "delete update success");
        com.p314xaae8f345.p2845xc516c4b6.biz.C23102xc5e76437 c23102xc5e76437 = kVar.f403356e;
        if (c23102xc5e76437 != null) {
            byte[] mo14344x5f01b1f6 = buVar.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            c23102xc5e76437.m84835xd841c699(mo14344x5f01b1f6, new lx.b(kVar));
        }
    }
}
