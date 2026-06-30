package lx;

/* loaded from: classes4.dex */
public final class l5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f403390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403391b;

    public l5(lx.m5 m5Var, yz5.l lVar) {
        this.f403390a = m5Var;
        this.f403391b = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.String obj2;
        lx.m5.a(this.f403390a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp onDispatch: actionName=" + str + ", data=" + obj);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RedEnvelopeCoverSelector/select");
        java.lang.String str2 = "";
        yz5.l lVar = this.f403391b;
        if (!b17) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RedEnvelopeCoverSelector/close")) {
                return false;
            }
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
            return false;
        }
        if (obj instanceof org.json.JSONObject) {
            str2 = obj.toString();
        } else if (obj instanceof java.lang.String) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            str2 = (java.lang.String) obj;
        } else if (obj != null && (obj2 = obj.toString()) != null) {
            str2 = obj2;
        }
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str2)));
        return false;
    }
}
