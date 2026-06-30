package zd3;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd3.k f553151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, int i17, zd3.k kVar) {
        super(2);
        this.f553149d = str;
        this.f553150e = i17;
        this.f553151f = kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.Surface surface = (android.view.Surface) obj;
        org.json.JSONObject updatedExtraData = (org.json.JSONObject) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updatedExtraData, "updatedExtraData");
        updatedExtraData.put("type", this.f553149d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478(ve3.u.f517640f, this.f553150e, this.f553149d, updatedExtraData.toString(), surface), xd3.e.class, new zd3.h(this.f553151f));
        return jz5.f0.f384359a;
    }
}
