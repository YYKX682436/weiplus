package fn4;

/* loaded from: classes.dex */
public class x0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f346151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f346152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f346153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346154d;

    public x0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean[] zArr, r45.xn6 xn6Var, android.content.Context context) {
        this.f346151a = u3Var;
        this.f346152b = zArr;
        this.f346153c = xn6Var;
        this.f346154d = context;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        this.f346151a.dismiss();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean[] zArr = this.f346152b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile getNow:%s, isCancel:%s", valueOf, java.lang.Boolean.valueOf(zArr[0]));
        if (!zArr[0] && z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", this.f346153c.Z);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(this.f346154d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }
}
