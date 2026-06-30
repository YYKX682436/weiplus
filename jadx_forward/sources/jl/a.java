package jl;

/* loaded from: classes13.dex */
public class a implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f381721a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f381722b;

    public a(java.lang.String str, java.lang.String str2) {
        this.f381721a = str;
        this.f381722b = str2;
    }

    @Override // jl.e
    public void a() {
        java.util.ArrayList arrayList;
        java.lang.String str = this.f381721a;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "runTask, appId:%s", str);
        java.lang.String str2 = this.f381722b;
        if (!android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", str2, java.lang.Integer.valueOf(il.j.a().c(str2)));
            hl.d b17 = il.j.a().b(str2);
            if (!b17.f363552b || b17.f363559i) {
                return;
            }
            b17.j(str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file task", null);
        il.j a17 = il.j.a();
        synchronized (a17.f373538c) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(a17.f373536a);
        }
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            java.lang.String str3 = "";
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                hl.d b18 = il.j.a().b(str4);
                if (!b18.f363552b || !b18.f363559i) {
                    int c17 = il.j.a().c(str4);
                    if (c17 >= i18) {
                        str3 = str4;
                        i18 = c17;
                    }
                }
            }
            hl.d b19 = il.j.a().b(str3);
            if (b19.f363552b && !b19.f363559i) {
                b19.j(str);
            }
            java.lang.Object[] objArr = {str3, java.lang.Integer.valueOf(i18)};
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", objArr);
        }
    }

    @Override // jl.e
    public void end() {
    }
}
