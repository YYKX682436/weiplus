package dw;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f325609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(0);
        this.f325609d = f9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map a17 = uw.f.f513023a.a(uw.e.f513019d, this.f325609d);
        if (a17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) a17.get(".msg.appmsg.mmreader.notify_msg.act"))) {
            return "";
        }
        java.lang.String str = (java.lang.String) a17.get(".msg.appmsg.mmreader.notify_msg.title");
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        java.lang.String str2 = "";
        while (i17 < 11) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.notify_msg.msg.item");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            sb6.append(".content");
            java.lang.String str3 = (java.lang.String) a17.get(sb6.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                break;
            }
            str2 = str2 + str3;
            i17++;
        }
        return str.concat(":") + str2;
    }
}
