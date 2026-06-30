package il;

/* loaded from: classes12.dex */
public class c implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il.e f373513a;

    public c(il.e eVar) {
        this.f373513a = eVar;
    }

    @Override // jl.e
    public void a() {
        il.e eVar = this.f373513a;
        synchronized (eVar) {
            if (eVar.f373516a.isEmpty()) {
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "data is empty", null);
                return;
            }
            try {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(eVar.f373518c);
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!a17.f294812f.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a()) {
                    m17.f294799a.d(m17.f294800b);
                }
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new com.p314xaae8f345.mm.vfs.a7(eVar.b()));
                java.util.Iterator it = eVar.f373516a.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    bufferedWriter.newLine();
                    bufferedWriter.write(str2);
                }
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(eVar.f373516a.size())};
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "line count:%s", objArr);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (java.io.IOException e17) {
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioCachePathMgr", e17, "asyncRead", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "save end", null);
        }
    }

    @Override // jl.e
    public void end() {
    }
}
