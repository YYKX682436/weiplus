package fv4;

/* loaded from: classes8.dex */
public final class k extends fv4.g {
    @Override // fv4.g
    public void a() {
        this.f348538a = null;
    }

    @Override // fv4.g
    public android.view.View b() {
        fv4.i iVar = this.f348538a;
        if (iVar != null) {
            return iVar.f348543d;
        }
        return null;
    }

    @Override // fv4.g
    public void c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String content = "Unknown Logic handling method call: " + call.f71610xbfc5d0e1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnknownLogic", content);
    }
}
