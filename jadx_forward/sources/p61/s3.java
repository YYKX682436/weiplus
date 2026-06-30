package p61;

/* loaded from: classes8.dex */
public class s3 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f433904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r61.s0 f433905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b f433906c;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b, java.util.ArrayList arrayList, r61.s0 s0Var) {
        this.f433906c = activityC11369x8a612b2b;
        this.f433904a = arrayList;
        this.f433905b = s0Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            r61.s0 s0Var = (r61.s0) this.f433904a.get(i18);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b.f154600u;
            this.f433906c.U6(s0Var, this.f433905b);
        }
    }
}
