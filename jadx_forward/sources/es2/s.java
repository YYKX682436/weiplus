package es2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(es2.h0 h0Var, long j17, java.lang.String str) {
        super(0);
        this.f337934d = h0Var;
        this.f337935e = j17;
        this.f337936f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        es2.h0 h0Var = this.f337934d;
        java.util.HashMap hashMap = h0Var.f337904d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = this.f337935e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((cs2.p) entry.getValue()).f303622f2 == j17) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it6 = linkedHashMap.values().iterator();
        while (it6.hasNext()) {
            java.lang.String field_mediaId = ((cs2.p) it6.next()).f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            h0Var.a(field_mediaId, false, this.f337936f);
        }
        return java.lang.Boolean.valueOf(pm0.v.d0(h0Var.f337905e, new es2.r(j17, h0Var)));
    }
}
