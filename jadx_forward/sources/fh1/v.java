package fh1;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fh1.z zVar, java.lang.String str) {
        super(0);
        this.f344140d = zVar;
        this.f344141e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh1.z zVar = this.f344140d;
        java.lang.String str = zVar.f344164e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRemoveFrameSet name:");
        java.lang.String frameSetName = this.f344141e;
        sb6.append(frameSetName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        fh1.x0 a17 = zVar.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        fq0.x xVar = (fq0.x) a17.C.remove(frameSetName);
        if (xVar != null) {
            xVar.i();
        }
        return jz5.f0.f384359a;
    }
}
