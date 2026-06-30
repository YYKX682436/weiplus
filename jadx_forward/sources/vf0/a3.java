package vf0;

/* loaded from: classes12.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f517656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(t21.v2 v2Var) {
        super(1);
        this.f517656d = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zz.b bVar = (zz.b) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check video dup origin, fileName = ");
        sb6.append(this.f517656d.d());
        sb6.append(" result = ");
        sb6.append(bVar != null ? bVar.m180095x9616526c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.video.VideoSendFileOpFSC", sb6.toString());
        return jz5.f0.f384359a;
    }
}
