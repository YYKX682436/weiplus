package bg2;

/* loaded from: classes.dex */
public final class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final bg2.s2 f102027a = new bg2.s2();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if ((fVar != null && fVar.f152148a == 0) && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertSearchComponentController", "cgi report click, success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertSearchComponentController", "cgi report click, failed, errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
