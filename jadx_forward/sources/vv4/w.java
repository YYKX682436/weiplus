package vv4;

/* loaded from: classes11.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        super(0);
        this.f522049d = activityC19216xc2476b75;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522049d;
        java.lang.Object obj = activityC19216xc2476b75.a7().get("parentSearchId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            return str;
        }
        int X6 = activityC19216xc2476b75.X6();
        if (X6 == 1) {
            str2 = "106:::";
        } else if (X6 == 2) {
            str2 = "107:::";
        } else if (X6 == 5) {
            str2 = "114:::";
        } else if (X6 == 6) {
            str2 = "115:::";
        } else if (X6 == 7) {
            str2 = "116:::";
        } else if (X6 == 8) {
            str2 = "117:::";
        }
        return str2;
    }
}
