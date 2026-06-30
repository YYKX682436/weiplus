package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f70615a;

    /* renamed from: b, reason: collision with root package name */
    public int f70616b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f70617c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f70618d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f70619e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f70620f;

    public static com.tencent.mm.modelbase.f a(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.modelbase.i iVar) {
        com.tencent.mm.modelbase.f fVar2 = new com.tencent.mm.modelbase.f();
        fVar2.f70615a = i17;
        fVar2.f70616b = i18;
        fVar2.f70617c = str;
        fVar2.f70618d = fVar;
        fVar2.f70619e = m1Var;
        fVar2.f70620f = iVar;
        if (iVar != null) {
            iVar.k(i17, i18, str, fVar, m1Var);
        }
        return fVar2;
    }

    public boolean b() {
        return this.f70615a == 0 && this.f70616b == 0;
    }

    public java.lang.String toString() {
        return "CgiBack{errType=" + this.f70615a + ", errCode=" + this.f70616b + ", errMsg='" + this.f70617c + "', cgiFunId=" + this.f70620f.f70646f.f70710a.f70686c + ", cgiUri=" + this.f70620f.f70646f.f70712c + '}';
    }
}
