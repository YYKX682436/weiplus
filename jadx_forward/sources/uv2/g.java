package uv2;

/* loaded from: classes10.dex */
public final class g implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.k f512920d;

    public g() {
        if (!dn.k.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(dn.k.class.getClassLoader(), new java.lang.Class[]{dn.k.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.cdn.keep_TaskInfo.TaskCallback");
        }
        this.f512920d = (dn.k) newProxyInstance;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        this.f512920d.O(str, byteArrayOutputStream);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preUploadCallback] mediaId:");
        sb6.append(str);
        sb6.append(" startRet:");
        sb6.append(i17);
        sb6.append(" sceneResult:");
        sb6.append(hVar != null ? hVar.m125799x9616526c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaUploadManager", sb6.toString());
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return this.f512920d.w(str, bArr);
    }
}
