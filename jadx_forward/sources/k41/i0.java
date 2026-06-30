package k41;

/* loaded from: classes11.dex */
public final class i0 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f385545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f385546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385547c;

    public i0(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, yz5.l lVar, java.lang.String str, java.lang.String str2) {
        this.f385545a = c19762x487075a;
        this.f385546b = lVar;
        this.f385547c = str2;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        java.lang.String str;
        j41.u uVar = i0Var != null ? i0Var.f379176d : null;
        yz5.l lVar = this.f385546b;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f385545a;
        if (uVar == null) {
            c19762x487075a.f38859x6ac9171 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuContactCardContent", "kefuCard getShareCardMsgContent contact invalid");
            lVar.mo146xb9724478(null);
            return;
        }
        k41.g0 g0Var = (k41.g0) uVar;
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(g0Var.f68607xd03b1ae9, g0Var.f68608x1223b30f);
        if (g0Var.f68596xef220f70 == 2) {
            str = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(g0Var.f68607xd03b1ae9, "openim_desc_icon", j41.a0.TYPE_URL, 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppIDString(...)");
        } else {
            str = "";
        }
        java.lang.String format = java.lang.String.format("<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g0Var.f68592x6b8eb508), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g0Var.f68609x68aa51e1), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g0Var.f68613xdec927b), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g0Var.f68604x21f9b213), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g0Var.f68607xd03b1ae9), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(fj6), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str)}, 7));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuContactCardContent", "getShareCardMsgContent toSendUsername: %s, msgContent: %s", this.f385547c, format);
        lVar.mo146xb9724478(format);
        c19762x487075a.f38859x6ac9171 = true;
    }

    @Override // j41.w
    public void b(java.lang.String str) {
    }
}
