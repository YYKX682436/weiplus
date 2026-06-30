package com.p176xb6135e39.p280x308fcb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.gson.TypeAdapter$1 */
/* loaded from: classes16.dex */
public class C2759x754051e2 extends com.p176xb6135e39.p280x308fcb.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p280x308fcb.v f126204a;

    public C2759x754051e2(com.p176xb6135e39.p280x308fcb.v vVar) {
        this.f126204a = vVar;
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public java.lang.Object b(jb.b bVar) {
        if (bVar.K() != jb.c.NULL) {
            return this.f126204a.b(bVar);
        }
        bVar.D();
        return null;
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public void c(jb.d dVar, java.lang.Object obj) {
        if (obj == null) {
            dVar.p();
        } else {
            this.f126204a.c(dVar, obj);
        }
    }
}
