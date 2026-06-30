package il;

/* loaded from: classes12.dex */
public class d implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il.e f373514a;

    public d(il.e eVar) {
        this.f373514a = eVar;
    }

    @Override // jl.e
    public void a() {
        il.e eVar = this.f373514a;
        synchronized (eVar) {
            try {
                eVar.f373516a.clear();
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new com.p314xaae8f345.mm.vfs.z6(eVar.b()));
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!android.text.TextUtils.isEmpty(readLine)) {
                        eVar.f373516a.add(readLine);
                    }
                }
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(eVar.f373516a.size())};
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "line count:%s", objArr);
                bufferedReader.close();
            } catch (java.io.IOException e17) {
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioCachePathMgr", e17, "asyncRead", new java.lang.Object[0]);
            }
        }
    }

    @Override // jl.e
    public void end() {
    }
}
