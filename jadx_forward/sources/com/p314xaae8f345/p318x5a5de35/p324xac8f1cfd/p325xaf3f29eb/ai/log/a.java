package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f127410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b f127411b;

    public a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar, java.lang.String str) {
        this.f127411b = bVar;
        this.f127410a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File[] listFiles;
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f127411b;
        if (bVar.f127415d == null) {
            return;
        }
        if (!bVar.f127412a.m21658x87896884() || com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.a.a(this.f127411b.f127415d.get())) {
            java.lang.String str = this.f127410a;
            if (android.text.TextUtils.isEmpty(str) || (listFiles = new java.io.File(str).listFiles()) == null || listFiles.length == 0) {
                return;
            }
            for (java.io.File file : listFiles) {
                if (!file.isDirectory()) {
                    try {
                        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar2 = this.f127411b;
                        bVar2.getClass();
                        if (file.lastModified() < java.lang.System.currentTimeMillis() - bVar2.f127412a.m21652x90824e9() && !file.delete()) {
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
