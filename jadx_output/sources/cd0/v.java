package cd0;

/* loaded from: classes5.dex */
public final class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f40596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f40597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f40598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f40599i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f40601n;

    public v(com.tencent.mm.storage.f9 f9Var, java.lang.String str, yb5.d dVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, long j17, java.lang.String str2, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f40594d = f9Var;
        this.f40595e = str;
        this.f40596f = dVar;
        this.f40597g = u3Var;
        this.f40598h = z17;
        this.f40599i = j17;
        this.f40600m = str2;
        this.f40601n = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        boolean z17;
        cd0.v vVar = this;
        int itemId = menuItem.getItemId();
        com.tencent.mm.storage.f9 f9Var = vVar.f40594d;
        cd0.b0 b0Var = cd0.b0.f40525a;
        if (itemId == 1) {
            b0Var.c(f9Var, vVar.f40595e, vVar.f40596f, vVar.f40597g, vVar.f40598h);
            com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct messageBatchRevokeStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct();
            messageBatchRevokeStruct.f59178d = 2L;
            messageBatchRevokeStruct.f59183i = vVar.f40599i;
            messageBatchRevokeStruct.f59184j = (c01.id.c() - f9Var.getCreateTime()) / 1000;
            messageBatchRevokeStruct.p(vVar.f40600m);
            messageBatchRevokeStruct.k();
        } else {
            if (menuItem.getItemId() == 2) {
                java.lang.String str = vVar.f40595e;
                java.lang.String str2 = vVar.f40600m;
                long j17 = vVar.f40599i;
                boolean z18 = vVar.f40598h;
                if (f9Var != null) {
                    com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(f9Var.Q0(), f9Var.getMsgId());
                    yb5.d dVar = vVar.f40596f;
                    if (!dVar.I()) {
                        cd0.b0.f40526b = new java.lang.ref.WeakReference(db5.e1.Q(dVar.g(), null, dVar.s().getString(com.tencent.mm.R.string.b5q), true, false, null));
                        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "runBatchRevoke() called with: msgId:" + java.lang.Long.valueOf(n17.getMsgId()) + " msgSvrId:" + java.lang.Long.valueOf(n17.I0()) + " type:" + java.lang.Integer.valueOf(n17.getType()) + " status:" + java.lang.Integer.valueOf(n17.P0()) + ", revokeTicket = " + str + ", synchFlag:" + java.lang.Integer.valueOf(n17.h2()));
                        dh3.c cVar = dh3.c.f232489a;
                        java.lang.String Q0 = n17.Q0();
                        boolean z19 = Q0 == null || Q0.length() == 0;
                        kz5.p0 p0Var = kz5.p0.f313996d;
                        if (z19) {
                            z17 = z18;
                            com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: talker is empty or recordMsg is null");
                        } else {
                            java.lang.String i18 = cVar.i(Q0, java.lang.Long.valueOf(n17.getMsgId()), java.lang.Long.valueOf(n17.getCreateTime()));
                            java.lang.String str3 = (java.lang.String) dh3.c.f232494f.b(i18);
                            com.tencent.mm.sdk.platformtools.o4 o4Var = dh3.c.f232490b;
                            if (str3 == null) {
                                str3 = o4Var.t(i18);
                            }
                            if (str3 == null || str3.length() == 0) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: revokeBatchId is null, talker: " + Q0 + ", msgId: " + n17.getMsgId() + ", svrId: " + n17.I0());
                                z17 = z18;
                            } else {
                                dh3.e eVar = new dh3.e();
                                java.lang.String t17 = o4Var.t(str3);
                                if (t17 != null) {
                                    eVar.fromXml(t17);
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.util.Iterator it = eVar.j().iterator();
                                while (it.hasNext()) {
                                    java.lang.Long l17 = (java.lang.Long) it.next();
                                    java.util.Iterator it6 = it;
                                    pt0.e0 e0Var = pt0.f0.f358209b1;
                                    kotlin.jvm.internal.o.d(l17);
                                    boolean z27 = z18;
                                    com.tencent.mm.storage.f9 k17 = e0Var.k(Q0, l17.longValue());
                                    if (k17 != null) {
                                        arrayList.add(k17);
                                    }
                                    it = it6;
                                    z18 = z27;
                                }
                                z17 = z18;
                                com.tencent.mars.xlog.Log.i("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: revokeBatchId: " + str3 + ", talker: " + Q0 + ", msgId: " + n17.getMsgId() + ", recordCount: " + eVar.j().size() + ", msgListSize: " + arrayList.size());
                                p0Var = arrayList;
                            }
                        }
                        b0Var.a(n17, p0Var, null, str, weakReference, str2, true, j17, z17);
                    }
                }
            }
            vVar = this;
        }
        vVar.f40601n.u();
    }
}
