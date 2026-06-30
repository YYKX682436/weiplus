package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
class m implements com.tencent.mm.ipcinvoker.j {
    private m() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean downloadChecker$DownloadInterceptBean = (com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean) obj;
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = new com.tencent.mm.ipcinvoker.type.IPCLong();
        iPCLong.f68405d = -1L;
        if (downloadChecker$DownloadInterceptBean == null) {
            if (rVar != null) {
                rVar.a(iPCLong);
                return;
            }
            return;
        }
        if (downloadChecker$DownloadInterceptBean.f96947s) {
            com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
            aVar.f97234a = downloadChecker$DownloadInterceptBean.f96941m;
            aVar.f97235b = downloadChecker$DownloadInterceptBean.f96942n;
            aVar.f97237d = downloadChecker$DownloadInterceptBean.f96938g;
            aVar.f97236c = downloadChecker$DownloadInterceptBean.f96939h;
            aVar.f97239f = downloadChecker$DownloadInterceptBean.f96944p;
            aVar.f97240g = downloadChecker$DownloadInterceptBean.f96943o;
            aVar.f97241h = downloadChecker$DownloadInterceptBean.f96945q;
            aVar.f97247n = 1;
            aVar.f97244k = 8070;
            aVar.f97242i = downloadChecker$DownloadInterceptBean.f96946r;
            aVar.f97253t = downloadChecker$DownloadInterceptBean.f96949u.f225356d;
            iPCLong.f68405d = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, null);
        } else {
            com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
            t0Var.f97150a = downloadChecker$DownloadInterceptBean.f96941m;
            t0Var.f97151b = downloadChecker$DownloadInterceptBean.f96942n;
            java.lang.String str = downloadChecker$DownloadInterceptBean.f96938g;
            t0Var.f97156g = str;
            t0Var.f97152c = downloadChecker$DownloadInterceptBean.f96943o;
            t0Var.f97157h = downloadChecker$DownloadInterceptBean.f96944p;
            t0Var.f97153d = com.tencent.mm.pluginsdk.model.app.w.n(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.pluginsdk.model.app.w.h(str), null);
            t0Var.f97154e = downloadChecker$DownloadInterceptBean.f96945q;
            t0Var.f97158i = true;
            t0Var.f97159j = true;
            t0Var.f97155f = 1;
            t0Var.f97161l = 8070;
            t0Var.f97172w = downloadChecker$DownloadInterceptBean.f96949u.f225356d;
            if (downloadChecker$DownloadInterceptBean.f96946r == 1) {
                iPCLong.f68405d = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
            } else {
                iPCLong.f68405d = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", " add download task result:[%d], appid[%s]，downloaerType[%d]", java.lang.Long.valueOf(iPCLong.f68405d), downloadChecker$DownloadInterceptBean.f96938g, java.lang.Integer.valueOf(downloadChecker$DownloadInterceptBean.f96946r));
        if (rVar != null) {
            rVar.a(iPCLong);
        }
    }
}
