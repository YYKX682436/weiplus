package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f45877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.cloud.component.common.ai.log.b f45878b;

    public a(com.tencent.cloud.component.common.ai.log.b bVar, java.lang.String str) {
        this.f45878b = bVar;
        this.f45877a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File[] listFiles;
        com.tencent.cloud.component.common.ai.log.b bVar = this.f45878b;
        if (bVar.f45882d == null) {
            return;
        }
        if (!bVar.f45879a.isUseExternalFile() || com.tencent.cloud.component.common.ai.utils.a.a(this.f45878b.f45882d.get())) {
            java.lang.String str = this.f45877a;
            if (android.text.TextUtils.isEmpty(str) || (listFiles = new java.io.File(str).listFiles()) == null || listFiles.length == 0) {
                return;
            }
            for (java.io.File file : listFiles) {
                if (!file.isDirectory()) {
                    try {
                        com.tencent.cloud.component.common.ai.log.b bVar2 = this.f45878b;
                        bVar2.getClass();
                        if (file.lastModified() < java.lang.System.currentTimeMillis() - bVar2.f45879a.getFileOutTime() && !file.delete()) {
                            file.getCanonicalPath();
                        }
                    } catch (java.io.IOException e17) {
                        e17.getMessage();
                    }
                }
            }
        }
    }
}
