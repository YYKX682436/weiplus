package gx0;

/* loaded from: classes5.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 f358680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 c10955x675e70c1) {
        super(0);
        this.f358680d = c10955x675e70c1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f358680d.f150881m;
        if (c16993xacc19624 == null) {
            return null;
        }
        android.os.Bundle bundle = c16993xacc19624.M;
        java.lang.String string = bundle != null ? bundle.getString("KEY_ORIGIN_MUSIC_PATH") : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            android.os.Bundle bundle2 = c16993xacc19624.M;
            if (bundle2 != null) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) bundle2.getParcelable("KEY_SELECT_AUDIO_INFO");
            }
            return null;
        }
        android.os.Bundle bundle3 = c16993xacc19624.M;
        int i17 = bundle3 != null ? bundle3.getInt("KEY_ORIGIN_MUSIC_PLAY_DURATION", 0) : 0;
        if (i17 <= 0) {
            i17 = 1;
        }
        android.os.Bundle bundle4 = c16993xacc19624.M;
        if (bundle4 == null || (str = bundle4.getString("KEY_ORIGIN_MUSIC_AUTHOR")) == null) {
            str = "";
        }
        java.util.ArrayList d17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "") ? kz5.c0.d(str) : new java.util.ArrayList();
        android.os.Bundle bundle5 = c16993xacc19624.M;
        if (bundle5 == null || (str2 = bundle5.getString("KEY_ORIGIN_MUSIC_COVER_URL")) == null) {
            str2 = "";
        }
        android.os.Bundle bundle6 = c16993xacc19624.M;
        if (bundle6 == null || (str3 = bundle6.getString("KEY_ORIGIN_MUSIC_NAME")) == null) {
            str3 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
        java.lang.String string2 = c16993xacc19624.M.getString("KEY_FINDER_POST_MUSIC_FEEDID");
        c16997xb0aa383a.C = string2 != null ? string2 : "";
        c16997xb0aa383a.f237244e = (int) java.lang.System.currentTimeMillis();
        android.os.Bundle bundle7 = c16993xacc19624.M;
        c16997xb0aa383a.f237252p = bundle7 != null ? bundle7.getBoolean("KEY_BGM_IF_ORIGIN") : false ? 1 : 2;
        c16997xb0aa383a.f237249m = true;
        c16997xb0aa383a.f237255s = true;
        c16997xb0aa383a.f237248i = string;
        c16997xb0aa383a.f237256t = str3;
        c16997xb0aa383a.f237253q = i17;
        c16997xb0aa383a.f237258v = str2;
        c16997xb0aa383a.f237247h = d17;
        c16997xb0aa383a.I = 10000;
        return c16997xb0aa383a;
    }
}
