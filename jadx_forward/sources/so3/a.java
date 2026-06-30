package so3;

/* loaded from: classes8.dex */
public final class a implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so3.c f492276a;

    public a(so3.c cVar) {
        this.f492276a = cVar;
    }

    @Override // c01.o8
    public final void a(java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f492276a.getClass();
        so3.c cVar = this.f492276a;
        synchronized ("MicroMsg.CoverSubscribeNotifyMsgInterceptor") {
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "sync contact finished, username: " + username + ", succ: " + z17);
            cVar.f492279d.remove(username);
        }
    }
}
