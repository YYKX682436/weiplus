package p012xc85e97e9.p098xc4a6178c.p099x38a77192;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p098xc4a6178c.p099x38a77192.e f93257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f93258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p098xc4a6178c.p099x38a77192.e eVar, yz5.p pVar) {
        super(1);
        this.f93257d = eVar;
        this.f93258e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Object obj2 = ((g4.u0) ((n0.q4) this.f93257d.f93250b).mo128745x754a37bb()).get(intValue);
        return obj2 == null ? new p012xc85e97e9.p098xc4a6178c.p099x38a77192.C1136xecbebab8(intValue) : this.f93258e.mo149xb9724478(java.lang.Integer.valueOf(intValue), obj2);
    }
}
