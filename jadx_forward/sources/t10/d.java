package t10;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f496085a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f496086b = "";

    /* renamed from: c, reason: collision with root package name */
    public bw5.x7 f496087c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f496088d;

    public final bw5.n8 a(bw5.o8 ret) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        bw5.n8 n8Var = new bw5.n8();
        n8Var.f112072f = ret.f112545d;
        boolean[] zArr = n8Var.f112077n;
        zArr[3] = true;
        n8Var.f112070d = bw5.k8.EcsOpenPlatform_Native;
        zArr[1] = true;
        n8Var.f112071e = this.f496085a;
        zArr[2] = true;
        return n8Var;
    }

    public final void b(bw5.n8 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (this.f496088d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.callback", "callback 可能被执行多次, name: " + this.f496085a + ", type: " + this.f496086b + ", jumpInfo: " + this.f496087c);
            return;
        }
        if (resp.f112072f == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.callback", "callback failed, name: " + this.f496085a + ", type: " + this.f496086b + ", jumpInfo: " + this.f496087c + ", errMsg: " + resp.m12558x17ec12d2());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.callback", "callback success, name: " + this.f496085a + ", type: " + this.f496086b + ", jumpInfo: " + this.f496087c);
        }
        yz5.l lVar = this.f496088d;
        if (lVar != null) {
            lVar.mo146xb9724478(resp);
        }
        this.f496088d = null;
    }

    public final void c(java.lang.String str) {
        bw5.n8 a17 = a(bw5.o8.EcsOpenRespRet_Fail);
        a17.f112073g = str;
        a17.f112077n[4] = true;
        b(a17);
    }

    public final void d(yz5.l lVar) {
        bw5.n8 a17 = a(bw5.o8.EcsOpenRespRet_Success);
        if (lVar != null) {
            lVar.mo146xb9724478(a17);
        }
        b(a17);
    }
}
