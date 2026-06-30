package cd0;

/* loaded from: classes5.dex */
public final class j implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f40535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f40536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f40538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40539h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40540i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40541m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f40542n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f40543o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f40544p;

    public j(java.util.List list, com.tencent.mm.storage.f9 f9Var, java.util.List list2, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, boolean z17, long j17, boolean z18) {
        this.f40536e = list;
        this.f40537f = f9Var;
        this.f40538g = list2;
        this.f40539h = str;
        this.f40540i = weakReference;
        this.f40541m = str2;
        this.f40542n = z17;
        this.f40543o = j17;
        this.f40544p = z18;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.Iterator it;
        boolean z17;
        long j17;
        java.lang.String str;
        boolean z18;
        java.lang.ref.WeakReference weakReference;
        long j18;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (m0Var == null || l0Var == null || this.f40535d) {
            return;
        }
        java.util.ArrayList msgList = l0Var.f454412c;
        kotlin.jvm.internal.o.f(msgList, "msgList");
        com.tencent.mm.storage.f9 f9Var = this.f40537f;
        java.util.List list = this.f40538g;
        java.lang.String str2 = this.f40539h;
        java.lang.ref.WeakReference weakReference2 = this.f40540i;
        java.lang.String str3 = this.f40541m;
        boolean z19 = this.f40542n;
        long j19 = this.f40543o;
        boolean z27 = this.f40544p;
        java.util.Iterator it6 = msgList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) it6.next();
            if (this.f40536e.contains(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var2.getMsgId(), f9Var2.Q0()))) {
                com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(f9Var2.Q0(), f9Var2.getMsgId());
                com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "reqBatchRevoke() onNotifyChange msgId=" + java.lang.Long.valueOf(n17.getMsgId()) + " status:" + java.lang.Integer.valueOf(n17.P0()));
                if (n17.P0() == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "reqBatchRevoke() STATE_SENT msgId=" + n17.getMsgId());
                    this.f40535d = true;
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
                    z17 = z27;
                    j18 = j19;
                    it = it6;
                    str = str3;
                    z18 = z19;
                    weakReference = weakReference2;
                    cd0.b0.f40525a.a(f9Var, list, kz5.b0.c(n17), str2, weakReference2, str3, z19, j18, z17);
                } else {
                    it = it6;
                    z17 = z27;
                    j18 = j19;
                    str = str3;
                    z18 = z19;
                    weakReference = weakReference2;
                    if (n17.P0() == 5) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqBatchRevoke() STATE_FAILED msgId=");
                        sb6.append(n17.getMsgId());
                        sb6.append(" chattingContext is null:");
                        sb6.append((weakReference != null ? (yb5.d) weakReference.get() : null) == null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
                        this.f40535d = true;
                        ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
                        java.lang.ref.WeakReference weakReference3 = cd0.b0.f40526b;
                        if (weakReference3 != null && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference3.get()) != null) {
                            u3Var.dismiss();
                        }
                        com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct messageBatchRevokeStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct();
                        messageBatchRevokeStruct.f59178d = 3L;
                        j17 = j18;
                        messageBatchRevokeStruct.f59183i = j17;
                        messageBatchRevokeStruct.f59184j = (c01.id.c() - n17.getCreateTime()) / 1000;
                        messageBatchRevokeStruct.f59180f = list.size();
                        messageBatchRevokeStruct.f59182h = 1L;
                        messageBatchRevokeStruct.f59181g = 0L;
                        messageBatchRevokeStruct.f59179e = 4L;
                        messageBatchRevokeStruct.p(str);
                        messageBatchRevokeStruct.f59186l = 2L;
                        messageBatchRevokeStruct.k();
                    }
                }
                j17 = j18;
            } else {
                it = it6;
                z17 = z27;
                j17 = j19;
                str = str3;
                z18 = z19;
                weakReference = weakReference2;
            }
            str3 = str;
            j19 = j17;
            z27 = z17;
            z19 = z18;
            weakReference2 = weakReference;
            it6 = it;
        }
    }
}
