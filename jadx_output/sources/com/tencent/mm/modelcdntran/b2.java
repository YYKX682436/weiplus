package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f70891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h2 f70892f;

    public b2(com.tencent.mm.modelcdntran.h2 h2Var, int i17, dn.m mVar) {
        this.f70892f = h2Var;
        this.f70890d = i17;
        this.f70891e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.h2 h2Var = this.f70892f;
        dn.m mVar = this.f70891e;
        int i17 = this.f70890d;
        if (i17 != -1) {
            ((java.util.HashMap) h2Var.f70996t).put(mVar.field_mediaId, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "CdnTransportService cdn thread run %s", mVar.field_mediaId);
        ((java.util.LinkedList) h2Var.f70993q).add(mVar.field_mediaId);
        ((java.util.HashMap) h2Var.f70994r).put(mVar.field_mediaId, mVar);
        h2Var.j(false);
    }

    public java.lang.String toString() {
        return super.toString() + "|addRecvTask";
    }
}
