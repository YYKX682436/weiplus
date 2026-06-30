package hd5;

/* loaded from: classes9.dex */
public class u implements hd5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd5.q f362181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd5.t f362182b;

    public u(hd5.t tVar, hd5.q qVar) {
        this.f362182b = tVar;
        this.f362181a = qVar;
    }

    @Override // hd5.o
    /* renamed from: next */
    public void mo133232x338af3() {
        hd5.p pVar = this.f362182b.f362177f;
        hd5.q qVar = this.f362181a;
        ke5.b bVar = (ke5.b) pVar;
        bVar.getClass();
        int i17 = qVar.f362167f;
        ke5.a aVar = bVar.f388593c;
        aVar.getClass();
        aVar.f388576d = qVar.f362165d;
        java.util.LinkedList linkedList = (java.util.LinkedList) qVar.f362164c;
        if (linkedList.size() > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList.get(0);
            if (f9Var != null) {
                f9Var.mo78012x3fdd41df();
                aVar.getClass();
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList.get(linkedList.size() - 1);
            if (f9Var2 != null) {
                f9Var2.mo78012x3fdd41df();
                aVar.getClass();
                f9Var2.F0();
                aVar.getClass();
            }
        }
        hd5.t tVar = this.f362182b;
        hd5.n nVar = tVar.f362175d;
        ((tb5.d0) ((tb5.n0) tVar.f362179h.f362188f.f542241c.a(tb5.n0.class))).m0("sendFinishMessage", this.f362182b.f362175d);
        hd5.t tVar2 = this.f362182b;
        hd5.q qVar2 = this.f362181a;
        synchronized (tVar2.f362179h) {
            if (tVar2.f362178g.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ListDataLoader", "has cancel!");
                return;
            }
            android.os.Message message = new android.os.Message();
            message.what = 1;
            message.obj = qVar2;
            if (tVar2.f362176e && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                tVar2.f362179h.f362185c.handleMessage(message);
            } else {
                tVar2.f362179h.f362185c.sendMessage(message);
            }
        }
    }
}
