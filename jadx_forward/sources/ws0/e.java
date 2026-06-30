package ws0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0.g f530494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f530495e;

    public e(ws0.g gVar, yz5.a aVar) {
        this.f530494d = gVar;
        this.f530495e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45805x89c4face(0);
        java.lang.String m45783xcc0e980a = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45783xcc0e980a();
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45795xd22d4d47((m45783xcc0e980a == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m45783xcc0e980a, "")) ? false : true);
        int m45773x31c7a6ca = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45773x31c7a6ca(m45783xcc0e980a, 0, com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29004x77bbe3b8, ws0.d.f530493a, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530494d.f530498a, "Read remote persist.sys.hardcoder.name:" + m45783xcc0e980a + " initHardCoder:" + m45773x31c7a6ca);
        this.f530494d.f530499b = m45773x31c7a6ca == 0;
        if (this.f530494d.f530499b) {
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45965x99879e0(2, new ws0.c(this.f530494d, this.f530495e), new java.lang.String[0]);
        }
    }
}
