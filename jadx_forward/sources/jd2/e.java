package jd2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.SpannableString f380679a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f380680b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc f380681c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f380682d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f380683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f380684f;

    public e(android.text.SpannableString nickname, java.lang.String timeString, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc, boolean z17, boolean z18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeString, "timeString");
        this.f380679a = nickname;
        this.f380680b = timeString;
        this.f380681c = c19780xceb4c4dc;
        this.f380682d = z17;
        this.f380683e = z18;
        this.f380684f = i17;
    }

    /* renamed from: equals */
    public boolean m140758xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd2.e)) {
            return false;
        }
        jd2.e eVar = (jd2.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380679a, eVar.f380679a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380680b, eVar.f380680b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380681c, eVar.f380681c) && this.f380682d == eVar.f380682d && this.f380683e == eVar.f380683e && this.f380684f == eVar.f380684f;
    }

    /* renamed from: hashCode */
    public int m140759x8cdac1b() {
        int hashCode = ((this.f380679a.hashCode() * 31) + this.f380680b.hashCode()) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = this.f380681c;
        return ((((((hashCode + (c19780xceb4c4dc == null ? 0 : c19780xceb4c4dc.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f380682d)) * 31) + java.lang.Boolean.hashCode(this.f380683e)) * 31) + java.lang.Integer.hashCode(this.f380684f);
    }

    /* renamed from: toString */
    public java.lang.String m140760x9616526c() {
        return "FinderLiveMentionTitleData(nickname=" + ((java.lang.Object) this.f380679a) + ", timeString=" + this.f380680b + ", authInfo=" + this.f380681c + ", showFinderLogo=" + this.f380682d + ", showFollowBtn=" + this.f380683e + ", mentionType=" + this.f380684f + ')';
    }
}
