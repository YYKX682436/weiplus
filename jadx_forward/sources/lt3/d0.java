package lt3;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f402741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(lt3.f0 f0Var) {
        super(0);
        this.f402741d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[start] mixThread=");
        lt3.f0 f0Var2 = this.f402741d;
        sb6.append(f0Var2.f402770z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
        try {
            f0Var2.g();
            lt3.f0.c(f0Var2);
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.VideoMixer", e17, "error on startVideoMixer", new java.lang.Object[0]);
            yz5.r rVar = f0Var2.f402746b;
            if (rVar == null) {
                return null;
            }
            mt3.a aVar = f0Var2.f402745a;
            rVar.C(aVar.f412826e, aVar.f412827f, java.lang.Boolean.FALSE, -1);
            return f0Var;
        }
    }
}
