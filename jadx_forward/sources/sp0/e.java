package sp0;

/* loaded from: classes7.dex */
public final class e extends tp0.c {
    @Override // lc3.c0
    public java.lang.String f() {
        return "insertFrameSet";
    }

    @Override // tp0.c
    public void z(org.json.JSONObject data, jc3.m coverViewDelegate, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverViewDelegate, "coverViewDelegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f149537o.mo20599xaaa148a0();
        int v17 = v(data);
        mo20599xaaa148a0.f149529d |= 1;
        mo20599xaaa148a0.f149530e = v17;
        mo20599xaaa148a0.m20881x7bb163d5();
        java.lang.String optString = data.optString("frameSetName");
        optString.getClass();
        mo20599xaaa148a0.f149529d |= 2;
        mo20599xaaa148a0.f149531f = optString;
        mo20599xaaa148a0.m20881x7bb163d5();
        java.lang.String optString2 = data.optString("frameSetRootId");
        optString2.getClass();
        mo20599xaaa148a0.f149529d |= 32;
        mo20599xaaa148a0.f149536n = optString2;
        mo20599xaaa148a0.m20881x7bb163d5();
        java.lang.String optString3 = data.optString("containerTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        mo20599xaaa148a0.f149529d |= 4;
        mo20599xaaa148a0.f149532g = optString3;
        mo20599xaaa148a0.m20881x7bb163d5();
        boolean z17 = data.optInt("hide") > 1;
        mo20599xaaa148a0.f149529d |= 16;
        mo20599xaaa148a0.f149535m = z17;
        mo20599xaaa148a0.m20881x7bb163d5();
        callback.mo146xb9724478(new sp0.d(mo20599xaaa148a0, null));
    }
}
