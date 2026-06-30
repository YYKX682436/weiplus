package zl2;

/* loaded from: classes2.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f555507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ff0.z zVar, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f555507d = zVar;
        this.f555508e = str;
        this.f555509f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPickImageColorFinished pickColorResult: ");
        ff0.z zVar = this.f555507d;
        sb6.append(zVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        if (zVar != null) {
            ff0.z zVar2 = new ff0.z(zVar.f343128a | (-16777216), zVar.f343129b | (-16777216), zVar.f343130c | (-16777216));
            ((java.util.HashMap) zl2.r4.f555492j).put(this.f555508e, zVar2);
            this.f555509f.mo146xb9724478(zVar2);
        }
        return jz5.f0.f384359a;
    }
}
