package b63;

/* loaded from: classes11.dex */
public class l implements com.tencent.mm.pluginsdk.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f18156d = {"@gamelife", "@gamelifesess"};

    /* renamed from: e, reason: collision with root package name */
    public b63.k f18157e;

    @Override // com.tencent.mm.pluginsdk.ui.m1
    public com.tencent.mm.pluginsdk.ui.j1 get(java.lang.String str) {
        for (java.lang.String str2 : this.f18156d) {
            if (str.endsWith(str2)) {
                if (this.f18157e == null) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
                    if (c17 instanceof com.tencent.mm.pluginsdk.ui.w) {
                        this.f18157e = new b63.k(c17);
                    }
                }
                return this.f18157e;
            }
        }
        return null;
    }
}
