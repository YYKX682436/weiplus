package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.f f96548d;

    public d(com.tencent.mm.plugin.component.editor.f fVar) {
        this.f96548d = fVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.plugin.component.editor.f fVar = this.f96548d;
        com.tencent.mm.plugin.component.editor.c cVar = (com.tencent.mm.plugin.component.editor.c) fVar.f96555b.get(str);
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.editor.EditorCdnManager", "cdn info is null!!!");
            return 0;
        }
        com.tencent.mm.plugin.component.editor.b bVar = com.tencent.mm.plugin.component.editor.b.OUT_OF_DATE;
        com.tencent.mm.plugin.component.editor.b bVar2 = com.tencent.mm.plugin.component.editor.b.ERR;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f96555b;
        java.lang.String str2 = cVar.f96536b;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.editor.EditorCdnManager", "transfer err! startRet: %s. cdnInfo:%s", java.lang.Integer.valueOf(i17), cVar);
            if (-5103059 == i17) {
                com.tencent.mm.plugin.component.editor.f.a(fVar, cVar, bVar);
            } else {
                com.tencent.mm.plugin.component.editor.f.a(fVar, cVar, bVar2);
            }
            concurrentHashMap.remove(str2);
            return 0;
        }
        if (gVar != null) {
            cVar.f96541g = gVar.field_finishedLength;
            cVar.f96540f = gVar.field_toltalLength;
            com.tencent.mm.plugin.component.editor.f.a(fVar, cVar, com.tencent.mm.plugin.component.editor.b.TRAN);
        } else if (hVar != null) {
            if (hVar.field_retCode >= 0) {
                boolean z18 = cVar.f96544j;
                if (z18) {
                    cVar.f96543i = hVar.field_aesKey;
                    cVar.f96542h = hVar.field_fileUrl;
                }
                boolean endsWith = str.endsWith("_t");
                r45.gp0 gp0Var = cVar.f96535a;
                if (endsWith) {
                    gp0Var.c0(cVar.f96543i);
                    gp0Var.d0(cVar.f96542h);
                } else {
                    gp0Var.a0(cVar.f96543i);
                    gp0Var.b0(cVar.f96542h);
                    if (z18) {
                        if (cVar.f96537c == 4) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "video stream, id:%s", hVar.field_videoFileId);
                            gp0Var.T0(hVar.field_videoFileId);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.editor.EditorCdnManager", "transfer done, mediaId=%s completeResult.mediaId=%s aesKey=%s completeInfo=%s", str, hVar.f241766a, hVar.field_aesKey, hVar.toString());
                com.tencent.mm.plugin.component.editor.f.a(fVar, cVar, com.tencent.mm.plugin.component.editor.b.SUCC);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.editor.EditorCdnManager", "transfer err. mediaId=%s completeResult.mediaId=%s aesKey=%s completeInfo=%s", str, hVar.f241766a, hVar.field_aesKey, hVar.toString());
                if (-5103059 == hVar.field_retCode) {
                    com.tencent.mm.plugin.component.editor.f.a(fVar, cVar, bVar);
                } else {
                    com.tencent.mm.plugin.component.editor.f.a(fVar, cVar, bVar2);
                }
            }
            concurrentHashMap.remove(str2);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
