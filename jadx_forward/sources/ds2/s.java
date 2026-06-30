package ds2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f324429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324430g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ds2.b0 b0Var, java.lang.String str, boolean z17, java.lang.String str2) {
        super(0);
        this.f324427d = b0Var;
        this.f324428e = str;
        this.f324429f = z17;
        this.f324430g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ds2.b0 b0Var = this.f324427d;
        java.util.HashMap hashMap = b0Var.f324388c;
        java.lang.String mediaId = this.f324428e;
        cs2.p pVar = (cs2.p) hashMap.remove(mediaId);
        boolean z17 = this.f324429f;
        if (pVar == null) {
            if (z17) {
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().h(mediaId, null);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
            }
            return (cs2.p) kz5.n0.Z((java.util.LinkedList) b0Var.f("cancelWaitingTask", new ds2.u(b0Var, mediaId)));
        }
        java.lang.String str = b0Var.f324392g;
        java.lang.String str2 = b0Var.f324390e;
        java.lang.String str3 = this.f324430g;
        if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mediaId, str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancel] ");
            sb6.append(str3);
            sb6.append(" is not ignore Playing[");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            if (mediaId.length() == 0) {
                mediaId = "";
            } else if (mediaId.length() > 13) {
                int length = mediaId.length();
                mediaId = mediaId.substring(13, length <= 24 ? length : 24);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "substring(...)");
            }
            sb6.append(mediaId);
            sb6.append("], but you plan to cancel it. just return");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
            return pVar;
        }
        if (((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Ni()) {
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().j(mediaId, new ds2.r(b0Var, str3, mediaId));
        } else {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().h(mediaId, null);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[cancel] ");
        sb7.append(str3);
        sb7.append(" [");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (mediaId.length() == 0) {
            mediaId = "";
        } else if (mediaId.length() > 13) {
            int length2 = mediaId.length();
            mediaId = mediaId.substring(13, length2 <= 24 ? length2 : 24);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "substring(...)");
        }
        sb7.append(mediaId);
        sb7.append("] from loadingMap, isIgnorePlaying=");
        sb7.append(z17);
        sb7.append(" focusedMediaId=");
        sb7.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        return pVar;
    }
}
