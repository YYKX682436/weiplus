package so4;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f492301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f492302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f492303f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Object obj) {
        super(2);
        this.f492301d = i1Var;
        this.f492302e = h0Var;
        this.f492303f = obj;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFrames finish, timeMs:");
        sb6.append(longValue);
        sb6.append(", bitmap:");
        sb6.append(bitmap);
        sb6.append(", size:[");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append(", ");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append("], source size:[");
        sb6.append(this.f492301d.f257160l.f479042k);
        sb6.append(", ");
        sb6.append(this.f492301d.f257160l.f479043l);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", sb6.toString());
        this.f492302e.f391656d = bitmap;
        java.lang.Object obj3 = this.f492303f;
        synchronized (obj3) {
            try {
                obj3.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocalEffectManager", e17, "", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
