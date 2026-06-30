package e33;

/* loaded from: classes10.dex */
public class c4 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f328722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328724c;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561, android.content.Intent intent, java.lang.String str) {
        this.f328724c = activityC15656x6f26b561;
        this.f328722a = intent;
        this.f328723b = str;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return j33.d0.d(this.f328723b, null, -1);
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f328724c.getMainLooper()).mo50293x3498a0(new e33.b4(this, str));
        t23.p0.h().h(this);
    }

    /* renamed from: toString */
    public java.lang.String m126853x9616526c() {
        return "fileKey:" + this.f328723b + " this: " + super.toString();
    }
}
