package e33;

/* loaded from: classes10.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f329075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f329076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f329077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f329078g;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561, android.content.Intent intent, boolean z17, boolean z18) {
        this.f329078g = activityC15656x6f26b561;
        this.f329075d = intent;
        this.f329076e = z17;
        this.f329077f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.f220105k2;
        this.f329078g.V6(this.f329075d, this.f329076e, this.f329077f);
    }

    /* renamed from: toString */
    public java.lang.String m126864x9616526c() {
        return super.toString() + "|addTextOptionMenu";
    }
}
