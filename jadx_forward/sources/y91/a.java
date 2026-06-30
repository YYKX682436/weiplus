package y91;

/* loaded from: classes16.dex */
public class a implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa1.b f541791d;

    public a(y91.d dVar, aa1.b bVar) {
        this.f541791d = bVar;
    }

    @Override // r56.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo131526x2e7a5e(p56.r rVar) {
        java.lang.String a17 = this.f541791d.a(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.InterfaceC2422xfd62b179.f7379x9ff58fb5);
        if (android.text.TextUtils.isEmpty(a17)) {
            rVar.mo157869xaf8aa769(new java.lang.Throwable("mDevice location is empty"));
            return;
        }
        try {
            java.net.URL url = new java.net.URL(a17);
            x91.c b17 = new y91.l0().b(url.openStream());
            if (b17 != null) {
                b17.f534166a = a17;
                b17.f534167b = url.getHost();
                b17.f534168c = url.getPort();
            }
            rVar.a(b17);
            rVar.mo157868xaa8b332c();
        } catch (java.io.IOException e17) {
            rVar.mo157869xaf8aa769(e17.getCause());
            v91.b.c("DlnaRepositoryImpl", e17, "");
        }
    }
}
