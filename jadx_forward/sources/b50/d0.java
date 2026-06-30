package b50;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99468f;

    public d0(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, int i17, java.util.List list) {
        this.f99466d = c10601x91d05935;
        this.f99467e = i17;
        this.f99468f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935 = this.f99466d;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = c10601x91d05935.f148595e;
        if (c23413x332f291 != null) {
            int i17 = this.f99467e;
            c23413x332f291.m86241x98f37bd(i17, this.f99468f, new b50.c0(c10601x91d05935, i17));
        }
    }
}
