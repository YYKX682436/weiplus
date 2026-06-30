package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.ProcessTextChannel */
/* loaded from: classes8.dex */
public class C28666xfae34d47 {

    /* renamed from: CHANNEL_NAME */
    private static final java.lang.String f71446x87093867 = "flutter/processtext";

    /* renamed from: METHOD_PROCESS_TEXT_ACTION */
    private static final java.lang.String f71447x2f43973a = "ProcessText.processTextAction";

    /* renamed from: METHOD_QUERY_TEXT_ACTIONS */
    private static final java.lang.String f71448xeae04220 = "ProcessText.queryTextActions";
    private static final java.lang.String TAG = "ProcessTextChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71449x2c0b7d03;

    /* renamed from: packageManager */
    public final android.content.pm.PackageManager f71450x2e2c3887;

    /* renamed from: parsingMethodHandler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71451xf115c659 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
        /* renamed from: onMethodCall */
        public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.this.f71452x6591f84d == null) {
                return;
            }
            java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
            java.lang.Object obj = c28687x4bb242ff.f71609x86ac7956;
            str.getClass();
            if (!str.equals(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.f71447x2f43973a)) {
                if (!str.equals(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.f71448xeae04220)) {
                    result.mo65719xbc9fa82f();
                    return;
                }
                try {
                    result.mo65720x90b54003(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.this.f71452x6591f84d.mo138296x8494a128());
                    return;
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", e17.getMessage(), null);
                    return;
                }
            }
            try {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.this.f71452x6591f84d.mo138295x42f65592((java.lang.String) arrayList.get(0), (java.lang.String) arrayList.get(1), ((java.lang.Boolean) arrayList.get(2)).booleanValue(), result);
            } catch (java.lang.IllegalStateException e18) {
                result.mo65718x5c4d208("error", e18.getMessage(), null);
            }
        }
    };

    /* renamed from: processTextMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.ProcessTextMethodHandler f71452x6591f84d;

    /* renamed from: io.flutter.embedding.engine.systemchannels.ProcessTextChannel$ProcessTextMethodHandler */
    /* loaded from: classes8.dex */
    public interface ProcessTextMethodHandler {
        /* renamed from: processTextAction */
        void mo138295x42f65592(java.lang.String str, java.lang.String str2, boolean z17, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result);

        /* renamed from: queryTextActions */
        java.util.Map<java.lang.String, java.lang.String> mo138296x8494a128();
    }

    public C28666xfae34d47(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192, android.content.pm.PackageManager packageManager) {
        this.f71450x2e2c3887 = packageManager;
        this.f71449x2c0b7d03 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, f71446x87093867, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
    }

    /* renamed from: setMethodHandler */
    public void m138294x6b2b1e7(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.ProcessTextMethodHandler processTextMethodHandler) {
        this.f71452x6591f84d = processTextMethodHandler;
    }
}
