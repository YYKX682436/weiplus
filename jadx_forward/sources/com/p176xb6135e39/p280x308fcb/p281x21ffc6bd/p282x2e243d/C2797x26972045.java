package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.gson.internal.bind.TypeAdapters$32 */
/* loaded from: classes16.dex */
public class C2797x26972045 implements com.p176xb6135e39.p280x308fcb.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f126276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p280x308fcb.v f126277e;

    public C2797x26972045(java.lang.Class cls, com.p176xb6135e39.p280x308fcb.v vVar) {
        this.f126276d = cls;
        this.f126277e = vVar;
    }

    @Override // com.p176xb6135e39.p280x308fcb.w
    public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
        if (aVar.f371554a == this.f126276d) {
            return this.f126277e;
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m20485x9616526c() {
        return "Factory[type=" + this.f126276d.getName() + ",adapter=" + this.f126277e + "]";
    }
}
