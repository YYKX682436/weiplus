package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.SpellCheckChannel */
/* loaded from: classes13.dex */
public class C28672x65861003 {
    private static final java.lang.String TAG = "SpellCheckChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71505x2c0b7d03;

    /* renamed from: parsingMethodHandler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71506xf115c659;

    /* renamed from: spellCheckMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.SpellCheckMethodHandler f71507xe6b00a49;

    /* renamed from: io.flutter.embedding.engine.systemchannels.SpellCheckChannel$SpellCheckMethodHandler */
    /* loaded from: classes13.dex */
    public interface SpellCheckMethodHandler {
        /* renamed from: initiateSpellCheck */
        void mo138350xde4e3039(java.lang.String str, java.lang.String str2, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result);
    }

    public C28672x65861003(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SpellCheckChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.this.f71507xe6b00a49 == null) {
                    io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.TAG, "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                java.lang.Object obj = c28687x4bb242ff.f71609x86ac7956;
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.TAG, "Received '" + str + "' message.");
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    result.mo65719xbc9fa82f();
                    return;
                }
                try {
                    java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.this.f71507xe6b00a49.mo138350xde4e3039((java.lang.String) arrayList.get(0), (java.lang.String) arrayList.get(1), result);
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", e17.getMessage(), null);
                }
            }
        };
        this.f71506xf115c659 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/spellcheck", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71505x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: setSpellCheckMethodHandler */
    public void m138349xcce05787(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.SpellCheckMethodHandler spellCheckMethodHandler) {
        this.f71507xe6b00a49 = spellCheckMethodHandler;
    }
}
