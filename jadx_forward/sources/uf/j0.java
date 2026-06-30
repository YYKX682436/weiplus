package uf;

/* loaded from: classes7.dex */
public final class j0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508569a;

    public j0(java.lang.String str) {
        this.f508569a = str;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "seek fail");
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "seek to " + this.f508569a + " success");
    }
}
