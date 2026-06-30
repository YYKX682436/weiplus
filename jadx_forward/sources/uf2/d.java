package uf2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf2.f f508704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.b f508705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uf2.f fVar, xh2.b bVar) {
        super(0);
        this.f508704d = fVar;
        this.f508705e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map map;
        uf2.f fVar = this.f508704d;
        ((java.util.LinkedHashMap) fVar.f508713o).clear();
        java.util.Map map2 = fVar.f508713o;
        map2.putAll(this.f508705e.f536055a);
        java.util.Map map3 = fVar.f508711m;
        java.util.Iterator it = ((java.util.LinkedHashMap) map3).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = fVar.f508712n;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            jz5.o oVar = (jz5.o) ((java.util.LinkedHashMap) map).get(entry.getKey());
            if (!map2.containsKey(entry.getKey()) || oVar == null) {
                fVar.c7((uf2.a) entry.getValue());
                it.remove();
            } else {
                ((uf2.a) entry.getValue()).f508697c = (android.graphics.Rect) ((java.util.LinkedHashMap) map2).get(entry.getKey());
                uf2.f.Z6(fVar, (uf2.a) entry.getValue(), ((java.lang.Number) oVar.f384375e).intValue());
            }
        }
        for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) map).entrySet()) {
            if (!map3.containsKey(entry2.getKey())) {
                fVar.e7((java.lang.String) entry2.getKey(), (java.lang.String) ((jz5.o) entry2.getValue()).f384374d, ((java.lang.Number) ((jz5.o) entry2.getValue()).f384375e).intValue());
            }
        }
        return jz5.f0.f384359a;
    }
}
