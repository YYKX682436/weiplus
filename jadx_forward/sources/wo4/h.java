package wo4;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f529800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wo4.l lVar) {
        super(2);
        this.f529800d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        yz5.p pVar = this.f529800d.f529806b;
        if (pVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
            wo4.l lVar = this.f529800d;
            int i17 = lVar.f529809e;
            lVar.f529809e = i17 + 1;
            pVar.mo149xb9724478(valueOf, java.lang.Integer.valueOf(i17));
        }
        wo4.l lVar2 = this.f529800d;
        vo4.i.a(lVar2.f529808d, (android.graphics.Bitmap) ((wo4.j) lVar2.f529814j).mo146xb9724478(java.lang.Long.valueOf(longValue)), this.f529800d.f529813i, null, 4, null);
        return jz5.f0.f384359a;
    }
}
