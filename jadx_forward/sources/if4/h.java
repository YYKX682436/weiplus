package if4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f372786a;

    /* renamed from: b, reason: collision with root package name */
    public final long f372787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f372788c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f372789d;

    /* renamed from: e, reason: collision with root package name */
    public final if4.i f372790e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xe6 f372791f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f372792g;

    public h(int i17, long j17, int i18, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f372786a = i17;
        this.f372787b = j17;
        this.f372788c = i18;
        this.f372789d = username;
        this.f372790e = if4.i.f372795f;
        r45.xe6 xe6Var = new r45.xe6();
        xe6Var.f471556f = "";
        xe6Var.f471558h = "";
        xe6Var.f471554d = "";
        this.f372791f = xe6Var;
        this.f372792g = "";
    }

    public final boolean a() {
        return this.f372790e == if4.i.f372794e;
    }

    public final boolean b() {
        a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryVideoItem", "item" + this.f372792g + " is not fake isVLogFakeVideo");
        return false;
    }

    /* renamed from: equals */
    public boolean m135230xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof if4.h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if4.i iVar = if4.i.f372793d;
        if4.i iVar2 = this.f372790e;
        if (iVar2 == iVar && ((if4.h) obj).f372790e == iVar) {
            return true;
        }
        if (a()) {
            if4.h hVar = (if4.h) obj;
            if (hVar.a() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f372792g, hVar.f372792g)) {
                return true;
            }
        }
        if4.i iVar3 = if4.i.f372795f;
        if (iVar2 == iVar3) {
            if4.h hVar2 = (if4.h) obj;
            hVar2.getClass();
            if ((hVar2.f372790e == iVar3) && this.f372786a == hVar2.f372786a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m135231x8cdac1b() {
        return super.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m135232x9616526c() {
        return "[VideoItem=" + super.hashCode() + ",localId=:" + this.f372786a + ",storyId=" + this.f372787b + ",videoType:=" + this.f372790e + ", username=" + this.f372789d + ", url=" + this.f372791f.f471556f + ']';
    }
}
