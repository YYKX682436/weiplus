package er;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.b f337457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(er.b bVar) {
        super(1);
        this.f337457d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run: ");
        er.b bVar = this.f337457d;
        sb6.append(bVar.f337458q);
        sb6.append(", ");
        sb6.append(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverTask", sb6.toString());
        bVar.f(booleanValue);
        return jz5.f0.f384359a;
    }
}
