package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.m f70897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h2 f70898e;

    public c2(com.tencent.mm.modelcdntran.h2 h2Var, dn.m mVar) {
        this.f70898e = h2Var;
        this.f70897d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.h2 h2Var = this.f70898e;
        java.util.Queue queue = h2Var.f70993q;
        dn.m mVar = this.f70897d;
        ((java.util.LinkedList) queue).add(mVar.field_mediaId);
        ((java.util.HashMap) h2Var.f70994r).put(mVar.field_mediaId, mVar);
        h2Var.j(false);
    }

    public java.lang.String toString() {
        return super.toString() + "|addSendTask";
    }
}
