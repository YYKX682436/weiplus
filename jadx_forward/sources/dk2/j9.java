package dk2;

/* loaded from: classes3.dex */
public final class j9 implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f315184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e f315185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f315186c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315187d;

    public j9(dk2.x4 x4Var, com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e, android.content.Intent intent, android.content.Context context) {
        this.f315184a = x4Var;
        this.f315185b = c10828x8f239b6e;
        this.f315186c = intent;
        this.f315187d = context;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        r45.nw1 m59258xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(this.f315185b.f150082s);
        int m75939xb282bd08 = (h17 == null || (m59258xd0557130 = h17.m59258xd0557130()) == null) ? -1 : m59258xd0557130.m75939xb282bd08(21);
        dk2.x4 x4Var = this.f315184a;
        x4Var.f315852m = m75939xb282bd08;
        if (x4Var.f315852m != -1) {
            dk2.r9.j(x4Var, this.f315186c, this.f315187d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "config.secondaryDeviceFlag is not legal: " + x4Var.f315852m + " after getCommentDatail");
    }
}
