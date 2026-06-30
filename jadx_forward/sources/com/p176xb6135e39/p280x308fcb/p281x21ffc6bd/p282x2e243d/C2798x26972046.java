package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.gson.internal.bind.TypeAdapters$33 */
/* loaded from: classes16.dex */
public class C2798x26972046 implements com.p176xb6135e39.p280x308fcb.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f126278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f126279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p280x308fcb.v f126280f;

    public C2798x26972046(java.lang.Class cls, java.lang.Class cls2, com.p176xb6135e39.p280x308fcb.v vVar) {
        this.f126278d = cls;
        this.f126279e = cls2;
        this.f126280f = vVar;
    }

    @Override // com.p176xb6135e39.p280x308fcb.w
    public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
        java.lang.Class cls = aVar.f371554a;
        if (cls == this.f126278d || cls == this.f126279e) {
            return this.f126280f;
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m20486x9616526c() {
        return "Factory[type=" + this.f126279e.getName() + "+" + this.f126278d.getName() + ",adapter=" + this.f126280f + "]";
    }
}
