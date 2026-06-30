package r53;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f474180a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f474181b = false;

    /* renamed from: c, reason: collision with root package name */
    public final r53.c f474182c = new r53.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f474183d = new java.util.concurrent.ConcurrentHashMap();

    public d(r53.a aVar) {
    }

    public synchronized java.util.Map a() {
        b();
        return this.f474180a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public synchronized void b() {
        if (this.f474180a == null) {
            this.f474180a = new java.util.LinkedHashMap();
        }
        if (this.f474180a.size() <= 0) {
            java.lang.String str = "";
            java.io.InputStream inputStream = null;
            java.io.InputStream inputStream2 = null;
            try {
                try {
                    inputStream2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("game_region_data.txt");
                    byte[] bArr = new byte[inputStream2.available()];
                    inputStream2.read(bArr);
                    java.lang.String str2 = new java.lang.String(bArr);
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCacheUtil", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                    str = str2;
                } finally {
                }
            } catch (java.io.IOException e18) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCacheUtil", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCacheUtil", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                    }
                }
            }
            java.lang.String[] split = str.trim().split("\n|\r\n|\r");
            inputStream = null;
            for (?? r37 = inputStream; r37 < split.length; r37++) {
                java.lang.String[] split2 = split[r37].trim().split("\\|");
                if (split2.length < 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCacheUtil", "this GameRegion item has problem %s", split[r37]);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5();
                    p5Var.f223245a = split2[0];
                    p5Var.f223246b = split2[1];
                    p5Var.f223247c = split2[2];
                    java.lang.String str3 = split2[3];
                    p5Var.f223248d = str3;
                    p5Var.f223249e = false;
                    p5Var.f223250f = false;
                    this.f474180a.put(str3, p5Var);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) this.f474180a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.b());
            if (p5Var2 != null) {
                java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.b();
                r53.d dVar = r53.b.f474173a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) dVar.a().get(b17);
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                if (p5Var3 != null) {
                    stringBuffer.append(p5Var3.f223245a);
                    stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.c("zh_CN"));
                }
                p5Var2.f223245a = stringBuffer.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) dVar.a().get(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.b());
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                if (p5Var4 != null) {
                    stringBuffer2.append(p5Var4.f223246b);
                    stringBuffer2.append(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.c("zh_TW"));
                }
                p5Var2.f223246b = stringBuffer2.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) dVar.a().get(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.b());
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                if (p5Var5 != null) {
                    stringBuffer3.append(p5Var5.f223247c);
                    stringBuffer3.append(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.c("en"));
                }
                p5Var2.f223247c = stringBuffer3.toString();
                p5Var2.f223250f = true;
            }
        }
    }
}
