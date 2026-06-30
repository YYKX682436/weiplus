package fh1;

/* loaded from: classes7.dex */
public class j0 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2 f344088a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f344089b;

    public j0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String uin = kk.v.a(gm0.m.i());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        if (str == null || str.length() == 0) {
            j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.h(uin, "magicbrushframedata"), "wxfile://magicbrushframedata");
            j3Var.f157760f = 10485760L;
        } else {
            j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3((java.lang.String) new dh1.a(uin, str).mo152xb9724478(), "wxfile://magicbrushframedata");
            j3Var.f157760f = 10485760L;
        }
        linkedList.add(j3Var);
        this.f344088a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2(linkedList);
        this.f344089b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) java.lang.reflect.Proxy.newProxyInstance(fh1.j0.class.getClassLoader(), new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (objArr != null && objArr.length >= 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.lang.String) {
                java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i((java.lang.String) obj2);
                if (!i17.startsWith("wxfile://")) {
                    objArr[0] = "wxfile://magicbrushframedata/".concat(i17);
                }
            }
        }
        return method.invoke(this.f344088a, objArr);
    }
}
