package pl4;

/* loaded from: classes15.dex */
public final class d extends pl4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f438240d;

    public d(pl4.k kVar) {
        this.f438240d = kVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        int i17;
        boolean z17;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f438240d.f438251b)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CDownloadCompleted mediaId:");
            sb6.append(this.f438240d.f438251b);
            sb6.append(" onC2CDownloadCompleted result:");
            sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", sb6.toString());
            boolean z18 = true;
            if (c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0) {
                pl4.k kVar = this.f438240d;
                kVar.f438259j = true;
                try {
                    java.lang.String field_fullpath = kVar.f438268s.f69595x6d25b0d9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "markDownloadCompleted fileCacheId:" + kVar.f438251b + ", createNewFile ret: " + com.p314xaae8f345.mm.vfs.w6.e(field_fullpath.concat(".finish")));
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingTPResourceLoader", "markDownloadCompleted createNewFile failed e " + e17.getMessage());
                    return;
                }
            }
            if (c2CDownloadResult == null || (i17 = c2CDownloadResult.f17871x139cb015) == 0) {
                return;
            }
            if (i17 == -10012) {
                pl4.k kVar2 = this.f438240d;
                synchronized (kVar2.f438254e) {
                    if (!kVar2.f438265p.isEmpty()) {
                        java.util.Iterator it = kVar2.f438265p.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac interfaceC26244x6ec750ac = (com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac) it.next();
                            long mo101490x3b780bb6 = interfaceC26244x6ec750ac.mo101498x11b6d29f().mo101490x3b780bb6();
                            if (mo101490x3b780bb6 + kVar2.d(mo101490x3b780bb6) < interfaceC26244x6ec750ac.mo101498x11b6d29f().mo101492xa811c5be() + interfaceC26244x6ec750ac.mo101498x11b6d29f().mo101493xad3aef6b()) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    z17 = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "onC2CDownloadCompleted mediaId:" + this.f438240d.f438251b + " allRequestDownloadFinished:" + z17 + ", hasRequested:" + this.f438240d.f438264o);
                pl4.k kVar3 = this.f438240d;
                if (kVar3.f438264o && z17) {
                    kVar3.j(false);
                    z18 = false;
                }
            }
            if (z18) {
                this.f438240d.f438253d.mo146xb9724478("download error: " + c2CDownloadResult.f17871x139cb015);
            }
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        pl4.k kVar = this.f438240d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar.f438251b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "onDownloadProgressChanged mediaId:" + kVar.f438251b + " onProgress finished:" + j17 + " total:" + j18);
            if (kVar.f438258i <= 0 && j18 > 0) {
                kVar.c(j18);
            }
            if (j17 > 0) {
                kVar.g();
            }
        }
    }
}
