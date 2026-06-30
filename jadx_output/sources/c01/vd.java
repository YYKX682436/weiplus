package c01;

/* loaded from: classes11.dex */
public class vd implements r.a {
    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.f9 f9Var = (com.tencent.mm.sdk.platformtools.f9) obj;
        int intValue = c01.yd.f37575a.containsKey(f9Var.f192710e) ? ((java.lang.Integer) c01.yd.f37575a.get(f9Var.f192710e)).intValue() : f9Var.f192709d;
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.f9.p(intValue) || com.tencent.mm.sdk.platformtools.f9.i(intValue));
    }
}
