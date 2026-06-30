package ud2;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.o f508162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ud2.o oVar) {
        super(2);
        this.f508162d = oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("width", java.lang.Integer.valueOf(intValue));
        hashMap.put("height", java.lang.Integer.valueOf(intValue2));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("size", hashMap);
        this.f508162d.e("playChangeSize", hashMap2);
        return jz5.f0.f384359a;
    }
}
