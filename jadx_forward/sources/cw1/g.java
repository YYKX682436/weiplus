package cw1;

/* loaded from: classes12.dex */
public final class g implements pm5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f304473a;

    public g(java.util.HashSet hashSet) {
        this.f304473a = hashSet;
    }

    @Override // pm5.d
    public boolean b(java.lang.Object obj) {
        ot1.h hVar = (ot1.h) obj;
        if (!this.f304473a.contains(new jz5.l(hVar.f68230xdec927b, java.lang.Long.valueOf(hVar.f68223x297eb4f7)))) {
            return false;
        }
        hVar.f68220x2918cf02 |= 1;
        return false;
    }
}
