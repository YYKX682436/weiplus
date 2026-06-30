package bg2;

/* loaded from: classes.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final bg2.t2 f20519a = new bg2.t2();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("LiveConvertSearchComponentController", "cgi report expose, success");
        } else {
            com.tencent.mars.xlog.Log.i("LiveConvertSearchComponentController", "cgi report expose, failed, errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
