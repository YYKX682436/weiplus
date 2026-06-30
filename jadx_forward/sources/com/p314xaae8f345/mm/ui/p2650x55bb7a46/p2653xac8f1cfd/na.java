package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes15.dex */
public final class na extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta f281116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar) {
        super(0);
        this.f281115d = list;
        this.f281116e = taVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : this.f281115d) {
            xq.q qVar = this.f281116e.f281511m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
            qVar.getClass();
            xq.n nVar = qVar.f537544c;
            java.util.Iterator it = nVar.f537540a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((xq.m) obj).f537524c == f9Var.m124847x74d37ac6()) {
                    break;
                }
            }
            xq.m mVar = (xq.m) obj;
            if (mVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "stop: ");
                mVar.b();
                nVar.f537540a.remove(mVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
