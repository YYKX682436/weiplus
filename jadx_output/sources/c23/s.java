package c23;

/* loaded from: classes.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c23.t f38052a;

    public s(c23.t tVar) {
        this.f38052a = tVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        c23.t tVar = this.f38052a;
        com.tencent.mars.xlog.Log.i(tVar.f38053d, "OnPreSearchSceneEnd " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c + " pardusCacheExpireTime:" + tVar.f38055f);
        return jz5.f0.f302826a;
    }
}
