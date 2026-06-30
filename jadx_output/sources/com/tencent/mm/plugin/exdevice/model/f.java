package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public final class f implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.k f98884d;

    public f(com.tencent.mm.plugin.exdevice.model.k kVar) {
        this.f98884d = kVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "getCdnAuthInfo mediaId = ".concat(mediaId));
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.exdevice.model.k kVar = this.f98884d;
        java.lang.String str = kVar.f98947d;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ExDeviceSendIotLogic", "cdnCallback Exception %s", e17);
        }
        if (i17 != 0) {
            kVar.f98952i = false;
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.exdevice.model.d(this.f98884d), "ExDeviceSendIotLogic");
            return 0;
        }
        if (gVar != null) {
            int i18 = (int) ((((float) gVar.field_finishedLength) / ((float) gVar.field_toltalLength)) * 100);
            if (i18 >= 100) {
                i18 = 99;
            }
            java.util.Iterator it = kVar.f98950g.keySet().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.exdevice.model.p.k((java.lang.String) it.next(), i18);
            }
        }
        if (hVar != null) {
            r45.rf4 rf4Var = new r45.rf4();
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.plugin.exdevice.model.k kVar2 = this.f98884d;
            com.tencent.mm.storage.f9 n17 = e0Var.n(kVar2.f98945b, kVar2.f98944a);
            v32.d dVar = new v32.d();
            dVar.field_fileid = hVar.field_fileId;
            dVar.field_fileUrl = hVar.field_fileUrl;
            dVar.field_fileThumbUrl = hVar.field_thumbUrl;
            dVar.field_aeskey = hVar.field_aesKey;
            dVar.field_msgid = this.f98884d.f98944a;
            dVar.field_md5 = hVar.field_filemd5;
            dVar.field_size = (int) hVar.field_fileLength;
            dVar.field_talker = n17.Q0();
            if (this.f98884d.f98948e == null) {
                com.tencent.mars.xlog.Log.e("ExDeviceSendIotLogic", "no cdn type");
            }
            java.lang.Integer num = this.f98884d.f98948e;
            if (num != null) {
                dVar.field_cdnType = num.intValue();
                int length = v32.d.D.f316952a.length;
                com.tencent.mm.plugin.exdevice.model.l3.Zi().replace(dVar);
                dn.m mVar = (dn.m) this.f98884d.f98954k.get(mediaId);
                com.tencent.mm.plugin.exdevice.model.k kVar3 = this.f98884d;
                com.tencent.mm.plugin.exdevice.model.p.b(rf4Var, mVar, kVar3.f98944a, kVar3.f98945b, "");
                com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "cdn uploaded md5 " + hVar.field_filemd5 + " size " + hVar.field_fileLength);
                r45.qf4 qf4Var = rf4Var.f384813h;
                if (qf4Var != null) {
                    r45.sx3 sx3Var = qf4Var.f383944p;
                    com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "deviceMsg.fileMsg key:" + sx3Var.f386006f + ", nonce: " + sx3Var.f386007g + ", tag: " + sx3Var.f386008h);
                }
                com.tencent.mm.vfs.w6.h(mVar != null ? mVar.field_fullpath : null);
                com.tencent.mm.vfs.w6.h(mVar != null ? mVar.field_thumbpath : null);
                com.tencent.mm.plugin.exdevice.model.k kVar4 = this.f98884d;
                kVar4.f98951h = rf4Var;
                kVar4.f98949f = 2;
                kVar4.f98952i = false;
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.exdevice.model.e(this.f98884d), "ExDeviceSendIotLogic");
            }
            return 0;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "decodePrepareResponse ");
        return inbuf;
    }
}
