package jt0;

/* loaded from: classes15.dex */
public class f implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jt0.i f383133a;

    public f(jt0.i iVar) {
        this.f383133a = iVar;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kt0.a aVar = (kt0.a) obj2;
        kt0.a aVar2 = (kt0.a) obj3;
        if (aVar != null && aVar2 != null && aVar.m144319xb2c87fbf(aVar2)) {
            lt0.a aVar3 = lt0.a.f402695c;
            return;
        }
        if (aVar2 != null && aVar != null && aVar2.f393436a.equals(aVar.f393436a)) {
            lt0.a aVar4 = lt0.a.f402695c;
            return;
        }
        lt0.a aVar5 = lt0.a.f402695c;
        java.lang.String str = aVar.f393436a;
        if (str != null) {
            this.f383133a.f402700b.mo141381xc84af884(str);
        }
    }
}
